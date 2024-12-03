
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import edu.uwm.cs351.SortedCollection;
import junit.framework.TestCase;


public class TestEfficiency extends TestCase {
	
	private static final int POWER = 20;
	private static final int BIG = (1<<POWER);
	private static final int RANDOM_MAX = 1<<(POWER-2); // will have duplicates!
	private static final int TRIALS = 5;

	private List<Integer> unsorted;
	private SortedCollection<Integer> big;
	private Random r = new Random();
	

	public void setUp() {
		try {
			assert false;
			assertTrue(true);
		} catch (AssertionError ex) {
			System.out.println("Assertions enabled. Turn them off for efficiency tests efficiency tests only.");
			System.out.println("  (To run other tests, add -ea to VM Args Pane in Arguments tab of Run Configuration)");
			assertTrue(false);
		}
		big = new SortedCollection<Integer>();
		unsorted = new ArrayList<>();
		for(int j = 0; j < BIG; ++j){
			unsorted.add(r.nextInt(RANDOM_MAX));
		}				
	}

	static Comparator<Integer> intComparator = new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
			return o1 - o2;
		}
	};
	static Comparator<Integer> reverseComparator = new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	};
	
	private <T> void testIsSorted(Iterable<T> itb, Comparator<T> comp){
		boolean first = true;
		T prev, curr = null;
		Iterator<T> it = itb.iterator();
		while(it.hasNext()){
			prev = curr;
			curr = it.next();
			if(!first) {
				boolean condition = comp.compare(prev, curr) <= 0;
				if (!condition) {
					assertTrue(prev + " should precede " + curr, condition);
				}
			} else first = false;
		}
	}
	
	public void testA() {
		for (int i=0; i < BIG; ++i) {
			big.add(i);
		}
		assertEquals(BIG, big.size());
	}
	
	public void testB() {
		big = new SortedCollection<Integer>(reverseComparator);
		for (int i=0; i < BIG; ++i) {
			big.add(i);
		}
		assertEquals(BIG, big.size());
	}
	
	public void testC() {
		for (int i=0; i < BIG; ++i) {
			big.add(i);
		}
		for (int i=0; i < BIG; ++i) {
			big.clear();
		}
		assertTrue(big.isEmpty());
	}
	
	public void testD() {
		List<Integer> l = Collections.emptyList();
		big.addAll(unsorted);
		for (int i = 0; i < BIG; ++i) {
			big.addAll(l);
		}
	}
	
	public void testE() {
		Collections.sort(unsorted);
		for (Integer x : unsorted) {
			big.addAll(Arrays.asList(x));
		}
		assertEquals(unsorted.size(),big.size());
	}
	
	public void testF() {
		big.addAll(unsorted);
		unsorted.remove(unsorted.size()-1);
		big.addAll(unsorted);
		assertEquals(unsorted.size()*2+1,big.size());
	}

	public void testG(){
		for (int p=0; p < 21; ++p) {
			int size = 1 << p;
			long startTime = System.currentTimeMillis();
			big.clear();
			big.addAll(unsorted.subList(0, size));
			System.out.println("Time to sort 2^" + p + " elements = " + (System.currentTimeMillis()-startTime));
		}
		for(int i = 0; i < TRIALS; ++i){
			big.clear();
			long startTime = System.currentTimeMillis();
			big.addAll(unsorted);
			assertEquals(BIG,big.size());
			testIsSorted(big, intComparator);
			System.out.println("Time to sort and check 2^" + POWER + " elements = " + (System.currentTimeMillis()-startTime));
			big.clear();
		}
	}
}
