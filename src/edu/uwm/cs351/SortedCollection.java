package edu.uwm.cs351;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SortedCollection<E> extends AbstractCollection<E> {

	private static class Node<E> {
		E data;
		Node<E> next;
		Node(E d, Node<E> n) { data = d; next = n; }
	}
	
	private Comparator<E> comparator;
	private Node<E> tail;
	private int size;
	private int version;

	
	
	/// private helper methods:
	
	/*
	 * These methods work with CLLs.
	 * An CLL is cyclic singly-linked lists with a dummy node.
	 * An CLL is identified by its TAIL (not the head or dummy!)
	 * An CLL is never null, even if empty. 
	 */

	/**
	 * Create a CLL from the elements in the given collection in the same order.
	 * @param dummy dummy node to use, if null, a new dummy will be created
	 * @param coll collection to use, must not be null, but may be empty
	 * @return CLL of elements in same order
	 */
	private Node<E> toCLL(Node<E> dummy, Collection<? extends E> coll) {
		if (dummy == null) dummy = new Node<E>(null,null);
		dummy.next = dummy;
		Node<E> t = dummy;
		for (E e : coll) {
			t = t.next = new Node<E>(e,dummy);
		}
		return t;
	}
	
	/**
	 * Convert a CLL to a string.  
	 * A problem is signified by a string without a proper ending paren.
	 * Use this for debugging.
	 * @param tail CLL
	 * @return string picture of a CLL
	 */
	private static <E> String CLLtoString(Node<E> tail) {
		if (tail == null) return "<NULL>";
		Node<E> dummy = tail.next;
		if (dummy == tail) return "()";
		if (dummy == null) return "<NO DUMMY>";
		if (dummy.data != null) return "<DUMMY " + dummy.data + ">";
		Node<E> head = dummy.next;
		StringBuilder sb = new StringBuilder();
		Node<E> fast = head.next;
		while (head != dummy) {
			if (head == null) return sb.toString(); // no closing paren
			if (head == fast) {
				System.out.println("...");
				return sb.toString();
			}
			if (sb.length() == 0) sb.append("(");
			else sb.append(",");
			sb.append(head.data);
			head = head.next;
			if (fast != dummy && fast != null) fast = fast.next;
			if (fast != dummy && fast != null) fast = fast.next;
		}
		sb.append(")"); // clean close
		return sb.toString();
	}
	
	/**
	 * Merge two sorted CLLs, or rather, merge the elements
	 * of the second list into the first list.
	 * This method should not create any new nodes!
	 * The lists may have duplicates (according to the comparator)
	 * but will be in non-decreasing order w.r.t. the comparator.
	 * The result should include the dummy from the first CLL
	 * and the second CLL should be left empty (dummy points to itself).
	 * @note This method does not efficiently handle when the second list
	 * contains a single element that belongs at the end of the first list.
	 * In other words, this method does not do the work of insertion sort. 
	 * @param t1 tail of first CLL
	 * @param t2 tail of second CLL
	 * @return tail of merged list (first CLL with nodes of second CLL merged in)
	 */
	private Node<E> merge(Node<E> t1, Node<E> t2) {
		// TODO
	    Node<E> d1 = t1.next;
	    Node<E> d2 = t2.next;
	    if (d2.next == d2) return t1;
	    if (d1.next == d1) {
	        d1.next = d2.next;
	        Node<E> ln;
	        for (ln = d2.next; ln.next != d2; ln = ln.next);
	        ln.next = d1;
	        t1 = ln;
	        d2.next = d2;
	        return t1;
	    }
	    Node<E> l = d1;
	    Node<E> p1 = d1.next;
	    Node<E> p2 = d2.next;
	    for (; p1 != d1 || p2 != d2; ) {
	        if (p1 != d1 && (p2 == d2 || comparator.compare(p1.data, p2.data) <= 0)) {
	            l.next = p1;
	            l = p1;
	            p1 = p1.next;
	        } else {
	            l.next = p2;
	            l = p2;
	            p2 = p2.next;
	        }
	    }
	    l.next = d1;
	    d2.next = d2;
	    t1 = l;
	    return t1;
	}
	
	/**
	 * Partition a CLL w.r.t. the first element in the list.
	 * The list elements are rearranged so that those which
	 * are less that the pivot are placed before it, and those
	 * that are greater are placed after them.  Equal elements
	 * will be placed in the "after" list right after the pivot.  
	 * The elements may be rearranged arbitrarily otherwise.
	 * @param tail the last element of the CLL. 
	 * There must be at least one element in this list
	 * @return new tail
	 */
	private Node<E> partition(Node<E> tail) {
		// TODO
		return tail;
	}
	
	/**
	 * Destructively sort a CLL using quicksort, and return it.
	 * The pivot chose should always be the first element.
	 * @param l CLL identified by its tail
	 */
	private Node<E> quicksort(Node<E> tail) {
		// TODO
		return tail;
	}
	
	private boolean report(String message) {
		System.out.println("Invariant error: " + message);
		return false;
	}
	
	private boolean wellFormed() {
		if (comparator == null) return report("null comparator");
		if (tail == null) return report("no dummy");
		Node<E> dummy = tail.next;
		if (dummy == null) return report("null dummy");
		if (dummy.data != null) return report("dummy has real data");
		int count = 0;
		for (Node<E> p = dummy.next; p != tail.next; p = p.next) {
			if (p == null || p.next == null) return report("found null (not cyclic)");
			if (p.data == null) return report("found null data");
			if (++count > size) {
				return report("too many nodes (bad cycle?)");
			}
			if (p != tail && comparator.compare(p.data, p.next.data) > 0) {
				return report("found out of order: " + p.data + " and " + p.next.data);
			}
		}
		if (count != size) return report("size wrong: claimed " + size + " but has " + count + " elements.");
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public SortedCollection() {
		this((o1,o2) -> ((Comparable<E>)o1).compareTo(o2));
		assert wellFormed() : "invariant failed at end of constructor";
	}
	
	/**
	 * Create a sorted collection using the given comparator.
	 * @param comp comparator to use, must not be null
	 */
	public SortedCollection(Comparator<E> comp) {
		if (comp == null) throw new IllegalArgumentException("comparator cannot be null");
		// TODO set up data structure for an empty list.
		this.comparator = comp;
		tail = new Node<E>(null, null); 
		tail.next = tail;
	    size = 0;
	    version = 0;
		assert wellFormed() : "invariant failed at end of constructor";
	}
	
	/**
	 * Create a sorted collection with the natural comparator,
	 * and with all the elements from the given collection
	 * @param from collection to get elements from, must not be null
	 */
	public SortedCollection(Collection<? extends E> from) {
		this();
		addAll(from);
		assert wellFormed() : "invariant failed at end of constructor";
	}
	
	@Override // required
	public int size() {
		assert wellFormed() : "invariant false at start of size";
		return size;
	}

	@Override // implementation
	public boolean add(E element) {
		assert wellFormed() : "invariant false at start of add";
		if (element == null) throw new IllegalArgumentException("cannot add null");
		if(size > 0 && comparator.compare(element, tail.data) < 0) { 
			// TODO: When do we NOT want to add at end?
			Node<E> dummy = tail.next;
	        Node<E> prev = dummy;
	        Node<E> c = dummy.next;
	        while (c != dummy && comparator.compare(c.data, element) < 0) {
	            prev = c;
	            c = c.next;
	        }
	        Node<E> newNode = new Node<E>(element, c);
	        prev.next = newNode;
			// TODO: insert in place
		} else { // add at end
			tail = tail.next = new Node<E>(element,tail.next);
		}
		++size;
		++version;
		assert wellFormed() : "invariant false at end of add";
		return true;
	}
	
	/*
	 * Write addAll when ready to pass efficiency tests.
	 * TODO
	 */
	
	@Override // required
	public Iterator<E> iterator() {
		return new MyIterator();
	}
		
	private class MyIterator implements Iterator<E> {
		private int myVersion = version;
		private Node<E> precursor = tail.next, cursor = precursor;
		
		private boolean wellFormed() {
			// 0. The outer invariant holds
			// 1. cursor is not null
			// 2. precursor is equal to cursor or is the node before cursor
			// 3. precursor is in the list
			// We don't check 1,2,3 unless the version matches.
			
			// 0.
			if (!SortedCollection.this.wellFormed()) return false;
			if (myVersion == version) {
				// 1.
				if (cursor == null && tail != null) return report("cursor is null");
				
				// 2.
				if (precursor != cursor && precursor.next != cursor)
					return report("precursor is bad");
				
				// 3.
				Node<E> p;
				for (p = tail.next; p != precursor && p != tail; p = p.next) {
					// nothing
				}
				if (p != precursor) return report("precursor not in list");

			}
			return true;
		}
		
		public MyIterator() {
			assert wellFormed() : "invariant fails in iterator constructor";
		}
		
		private void checkVersion() {
			if (version != myVersion) {
				throw new ConcurrentModificationException("iterator stale");
			}
		}
		
		public boolean hasNext() {
			assert wellFormed() : "invariant fails at start of hasNext()";
			checkVersion();
			return cursor != tail; 
		}

		public E next() {
			assert wellFormed() : "invariant fails at start of next()";
			checkVersion();
			if (!hasNext()) {
				throw new NoSuchElementException("no more elements");
			}
			precursor = cursor;
			cursor = cursor.next;
			assert wellFormed() : "invariant fails at end of next()";
			return cursor.data;
		}

		public void remove() {
			assert wellFormed() : "invariant fails at start of remove()";
			checkVersion();
			if (precursor == cursor) {
				throw new IllegalStateException("cannot remove until next() is called (again)");
			}
			boolean removingTail = cursor == tail;
			precursor.next = cursor.next;
			cursor = precursor;
			if (removingTail) tail = cursor;
			--size;
			myVersion = ++version;
			assert wellFormed() : "invariant fails at end of remove()";
		}
	}
	
	/// TEST code (do not change)
	
	private SortedCollection(boolean ignored) {}

	public static class Spy {
		public static class Node<T> extends SortedCollection.Node<T> {
			T copy;
			public Node(T d, Node<T> n) {
				super(d,n);
				data = d;
				next = n;
				copy = d;
			}
			
			public T getData() {
				return data;
			}
			
			public T getCopy() {
				return copy;
			}
			
			public Object getNext() {
				return next;
			}
			
			@SuppressWarnings("unchecked")
			public void setNext(Object n) {
				next = (SortedCollection.Node<T>)n;
			}
		}
		
		/**
		 * Create a debugging instance with the given comparator
		 * @param T element type
		 * @param c comparator
		 * @return new debugging instance
		 */
		public <T> SortedCollection<T> newInstance(Comparator<T> c) {
			SortedCollection<T> result = new SortedCollection<>(false);
			result.comparator = c;
			return result;
		}
		
		/**
		 * Return the string picture of a CLL.
		 * @param l CLL to print
		 * @return string representation
		 */
		public String toString(Node<?> l) {
			return CLLtoString(l);
		}
		
		/**
		 * Run the private merge method on the arguments
		 * @param T element type
		 * @param c ADT especially for the comparator, must not be null
		 * @param l1 CLL for first list
		 * @param l2 CLL for second list
		 * @return resulting CLL
		 */
		public <T> Object merge(SortedCollection<T> c, Node<T> l1, Node<T> l2) {
			return c.merge(l1, l2);
		}
		
		/**
		 * Run the private partition method on the argument
		 * @param T element type
		 * @param c ADT especially for the comparator
		 * @param l CLL to partition
		 * @return resulting CLL
		 */
		public <T> Object partition(SortedCollection<T> c, Node<T> l) {
			return c.partition(l);
		}
		
		/**
		 * Run the private quicksort method on the argument
		 * @param T element type
		 * @param c ADT instance for the comparator
		 * @param l CLL to quicksort
		 * @return return CLL
		 */
		public <T> Object quicksort(SortedCollection<T> c, Node<T> l) {
			return c.quicksort(l);
		}
	}
	
}