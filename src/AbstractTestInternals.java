import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import edu.uwm.cs351.SortedCollection;
import edu.uwm.cs351.SortedCollection.Spy.Node;
import junit.framework.TestCase;

public class AbstractTestInternals extends TestCase {
	protected SortedCollection.Spy spy;
	
	public void setUp() {
		spy = new SortedCollection.Spy();
	}
	
	/**
	 * Create a CLL from the elements in the given collection in the same order.
	 * @param dummy dummy node to use, if null, a new dummy will be created
	 * @param coll collection to use, must not be null, but may be empty
	 * @return CLL of elements in same order
	 */
	protected <E> Node<E> toCLL(Node<E> dummy, Collection<? extends E> coll) {
		if (dummy == null) dummy = new Node<E>(null,null);
		dummy.setNext(dummy);
		SortedCollection.Spy.Node<E> t = dummy;
		for (E e : coll) {
			Node<E> n = new Node<E>(e,dummy);
			t.setNext(n);
			t = n;
		}
		return t;
	}
	
	/**
	 * Convert a checked CLL into a collection.
	 * @param E> element type
	 * @param l list to convert back,must be checked before hand
	 * @return collection
	 */
	@SuppressWarnings("unchecked")
	protected <E> Collection<E> fromCLL(Node<E> l) {
		Collection<E> result = new ArrayList<>();
		Node<E> dummy = (Node<E>)l.getNext();
		for (Node<E> p = (Node<E>)dummy.getNext(); p != dummy; p = (Node<E>)p.getNext()) {
			result.add(p.getData());
		}
		return result;
	}

	/**
	 * Check a CLL returned from the SUT that should reuse nodes created here.
	 * @param message used for error messages
	 * @param obj result of the SUT to check
	 */
	protected void checkCLL(String message, Object obj) {
		assertFalse(message + " is null!", obj == null);
		assertTrue(message + " is a new node; should reuse nodes",obj instanceof Node<?>);
		Node<?> n = (Node<?>)obj;
		Object d = n.getNext();
		assertFalse(message + ": dummy is null!", d == null);
		assertTrue(message + ": dummy is a new node; should reuse nodes",d instanceof Node<?>);
		Node<?> dummy = (Node<?>)d;
		assertNull(message + ": dummy's data is not null!", dummy.getData());
		Object f = dummy.getNext();
		int i = 0;
		Node<?> slow = dummy;
		while (f != dummy) {
			assertFalse(message + ": node #" + i + " is null!", f == null);
			assertTrue(message + ": node #" + i + " is a new node; should reuse nodes", f instanceof Node<?>);
			Node<?> fast = (Node<?>)f;
			assertFalse(message + ": node #" + i + " has null data", fast.getData() == null);
			assertEquals(message + ": node #" + i + " has changed data", fast.getCopy(), fast.getData());
			f = fast.getNext();
			if (i % 2 == 1) {
				slow = (Node<?>)slow.getNext();
				assertFalse(message + ": CLL has bad loop", slow == fast);
			}
			++i;
		}
	}

	@SuppressWarnings("unchecked")
	public <T> Collection<T> testMerge(Collection<T> c1, Collection<T> c2, Comparator<T> comp) {
		SortedCollection<T> self = spy.newInstance(comp);
		Node<T> l1 = toCLL(null,c1);
		Node<T> l2 = toCLL(null,c2);
		Node<T> d2 = (Node<T>) l2.getNext();
		Object res = spy.merge(self,l1,l2); 
		String message = "merge of " + c1 + " and " + c2;
		checkCLL(message,res);
		assertEquals (message + ": List #2 not emptied!", d2, d2.getNext());
		return fromCLL((Node<T>)res);
	}

	@SuppressWarnings("unchecked")
	protected <T> Collection<T> testPartition(Collection<T> c, Comparator<T> comp) {
		SortedCollection<T> self = spy.newInstance(comp);
		Node<T> l = toCLL(null,c);
		String message = "partition of " + c;
		Object res = spy.partition(self,l);
		checkCLL(message,res);
		return fromCLL((Node<T>)res);
	}

	@SuppressWarnings("unchecked")
	protected <T> Collection<T> testQuicksort(Collection<T> col, Comparator<T> comp) {
		SortedCollection<T> self = spy.newInstance(comp);
		Node<T> l = toCLL(null,col);
		String message = "quicksort of " + col;
		Object res = spy.quicksort(self,l);
		checkCLL(message,res);
		return fromCLL((Node<T>)res);
	}

}
