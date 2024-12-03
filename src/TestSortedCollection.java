
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import edu.uwm.cs351.SortedCollection;


public class TestSortedCollection extends TestCollection<Integer> {

	static Comparator<Integer> intComparator = new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
			return o1 - o2;
		}
	};
	static <E extends Comparable<E>> Comparator<E> revComparator() {
		return new Comparator<E>() {
			public int compare(E o1, E o2) {
				return o2.compareTo(o1);
			}
		};
	}
	
	static Comparator<Integer> printComparator = new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return (""+o1).compareTo(""+o2);
		}
	};
	static Comparator<Integer> magComparator = new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
			return Double.compare(Math.abs(o1+0.0),	Math.abs(o2+0.0));
		}
	};

	private SortedCollection<Integer> sc;
	private SortedCollection<String> ss;
	
	@Override
	protected void initCollections() {
		c = sc = new SortedCollection<>(printComparator);
		ss = new SortedCollection<>(String.CASE_INSENSITIVE_ORDER);
		e = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 93, 99 };
	    permitNulls = false; 
	    permitDuplicates = true; 
	    preserveOrder = false;
	    failFast = true;
	    hasRemove = true;
	}

	@SafeVarargs
	private final <T> Collection<T> toCol(T... contents) {
		Collection<T> result = new ArrayList<>();
		for (T e : contents) {
			result.add(e);
		}
		return result;
	}

	
	/// Locked tests
	
	public void test() {
		sc.clear();
		// sc is ordered by the printComparator (dictionary order, not numeric order)
		sc.add(3);
		sc.add(20);
		sc.add(3);
		// Lists print with a space after each comma: e.g. [1, 2, 3]
		assertEquals(Ts(532029746),sc.toString());
		// making a new c with non-discrimination: "everyone is equal"
		sc = new SortedCollection<>((a,b) -> 0);
		sc.add(3);
		sc.add(20);
		sc.add(4);
		sc.add(3);
		assertEquals(Ts(2111914463),sc.toString());
	}

	
	/// test08-09: testing add errors
	
	public void test07() {
		assertException(IllegalArgumentException.class, () -> c.add(null));
	}
	
	public void test08() {
		c.add(99);
		assertException(IllegalArgumentException.class, () -> c.add(null));
	}

	public void test09() {
		c = new SortedCollection<>((a,b) -> 0);
		c.add(45);
		c.add(6);
		assertException(IllegalArgumentException.class, () -> c.add(null));		
	}
	

	// test35-39: testing sorting, assuming iterators are working
	
	public void test35() {
		sc.add(3);
		sc.add(5);
		assertEquals("[3, 5]", sc.toString());
	}
	
	public void test36() {
		sc.add(6);
		sc.add(3);
		assertEquals("[3, 6]", sc.toString());
	}
	
	public void test37() {
		sc.add(3);
		sc.add(7);
		sc.add(37);
		assertEquals("[3, 37, 7]", sc.toString());
	}
	
	public void test38() {
		sc.add(3);
		sc.add(38);
		sc.add(8);
		assertEquals("[3, 38, 8]", sc.toString());
	}
	
	public void test39() {
		sc.add(3);
		sc.add(9);
		sc.add(0);
		sc.add(39);
		assertEquals("[0, 3, 39, 9]", sc.toString());
	}
	
	
	///: test6x: testing remove with sorting
	
	public void test60() {
		sc.add(0);
		sc.add(6);
		sc.add(10);
		sc.add(7);
		sc.add(1);
		sc.add(60);
		it = sc.iterator();
		it.next();
		it.remove();
		assertEquals("[1, 10, 6, 60, 7]", sc.toString());
	}
	
	public void test61() {
		sc.add(6);
		sc.add(61);
		sc.add(1);
		sc.add(16);
		sc.add(60);
		sc.add(0);
		it = sc.iterator();
		it.next();
		it.next();
		it.remove();
		assertEquals("[0, 16, 6, 60, 61]", sc.toString());
	}
	
	public void test62() {
		sc.add(2);
		sc.add(6);
		sc.add(26);
		sc.add(62);
		sc.add(620);
		sc.add(622);
		it = sc.iterator();
		it.next();
		it.next();
		it.next();
		it.remove();
		assertEquals("[2, 26, 62, 620, 622]", sc.toString());
	}
	
	public void test63() {
		sc.add(63);
		sc.add(0);
		sc.add(3);
		sc.add(6);
		sc.add(36);
		sc.add(9);
		it = sc.iterator();
		it.next();
		it.next();
		it.next();
		it.next();
		it.remove();
		assertEquals("[0, 3, 36, 63, 9]", sc.toString());
	}
	
	public void test64() {
		sc.add(2);
		sc.add(64);
		sc.add(16);
		sc.add(8);
		sc.add(32);
		sc.add(4);
		it = sc.iterator();
		it.next();
		it.next();
		it.next();
		it.next();
		it.next();
		it.remove();
		assertEquals("[16, 2, 32, 4, 8]", sc.toString());
	}
	
	public void test65() {
		sc.add(6);
		sc.add(5);
		sc.add(65);
		sc.add(56);
		sc.add(65);
		sc.add(60);
		it = sc.iterator();
		it.next();
		it.next();
		it.next();
		it.next();
		it.next();
		it.next();
		it.remove();
		assertEquals("[5, 56, 6, 60, 65]", sc.toString());
	}
	
	
	/// test9x: testing addAll
	
	public void test90() {
		ss.addAll(toCol());
		assertEquals("[]", sc.toString());
	}
	
	public void test91() {
		ss.addAll(toCol("bread"));
		assertEquals("[bread]", ss.toString());
	}
	
	public void test92() {
		ss.addAll(toCol("apple", "Bread"));
		assertEquals("[apple, Bread]", ss.toString());;
	}
	
	public void test93() {
		ss.add("Bread");
		ss.addAll(toCol());
		assertEquals("[Bread]", ss.toString());
	}
	
	public void test94() {
		ss.add("Bread");
		ss.addAll(toCol("apple"));
		assertEquals("[apple, Bread]", ss.toString());
	}
	
	public void test95() {
		ss.add("grapes");
		ss.addAll(toCol("peas","carrots"));
		assertEquals("[carrots, grapes, peas]", ss.toString());
	}
	
	public void test96() {
		ss.add("eggs");
		ss.add("tea");
		ss.addAll(toCol("lemon"));
		assertEquals("[eggs, lemon, tea]", ss.toString());
	}
	
	public void test97() {
		ss.add("bananas");
		ss.add("oranges");
		ss.addAll(toCol("apples","pears"));
		assertEquals("[apples, bananas, oranges, pears]", ss.toString());
	}
	
	public void test98() {
		ss.add("celery");
		ss.add("carrots");
		ss.addAll(toCol("oranges", "grapes"));
		assertEquals("[carrots, celery, grapes, oranges]", ss.toString());
	}
	
	public void test99() {
		ss.add("pears");
		ss.add("grapes");
		ss.add("apples");
		ss.add("lemons");
		ss.add("strawberries");
		ss.addAll(toCol("bananas","oranges","lemons","cherries"));
		assertEquals("[apples, bananas, cherries, grapes, lemons, lemons, oranges, pears, strawberries]", ss.toString());
	}
		
}
