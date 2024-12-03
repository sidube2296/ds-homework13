import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class TestMerge extends AbstractTestInternals {
  private Comparator<String> comp = (s1,s2) -> s1.compareTo(s2);

  private String p1 = "A";
  private String p2 = "B";
  private String p3 = "C";
  private String p4 = "D";
  private String p5 = "E";
  private String p6 = "F";

  public void test0000() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertFalse(it.hasNext());
  }

  public void test1000() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
  }

  public void test1001() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
  }

  public void test2000() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test2001() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test2002() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test2003() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test2004() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test2005() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test2006() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test3000() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test3001() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test3002() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test3003() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test3004() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test3005() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test3006() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test3007() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test3008() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test3009() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test3010() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test3011() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test3012() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test3013() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test3014() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test3015() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test3016() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test3017() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test3018() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test3019() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test3020() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test3021() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test3022() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test3023() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4000() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test4001() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test4002() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test4003() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test4004() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test4005() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test4006() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test4007() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test4008() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test4009() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test4010() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test4011() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test4012() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test4013() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4014() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4015() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4016() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4017() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4018() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4019() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4020() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4021() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4022() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4023() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4024() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4025() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4026() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4027() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4028() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4029() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4030() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4031() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4032() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4033() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4034() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4035() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4036() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4037() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4038() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4039() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4040() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4041() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test4042() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4043() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4044() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4045() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4046() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4047() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4048() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4049() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4050() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4051() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4052() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4053() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test4054() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4055() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4056() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4057() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4058() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4059() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4060() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4061() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4062() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4063() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4064() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4065() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test4066() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4067() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4068() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4069() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4070() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4071() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4072() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4073() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4074() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4075() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4076() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4077() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4078() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4079() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4080() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test4081() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5000() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test5001() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test5002() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test5003() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test5004() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test5005() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p1);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test5006() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test5007() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test5008() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test5009() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test5010() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test5011() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test5012() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test5013() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test5014() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test5015() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test5016() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5017() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5018() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5019() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5020() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5021() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5022() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5023() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5024() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5025() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5026() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5027() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5028() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5029() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5030() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5031() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5032() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5033() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5034() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5035() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5036() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5037() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5038() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5039() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5040() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5041() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5042() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5043() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5044() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5045() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5046() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5047() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5048() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5049() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5050() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5051() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5052() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5053() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5054() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5055() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5056() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5057() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5058() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5059() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5060() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5061() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5062() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5063() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5064() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5065() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5066() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5067() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5068() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5069() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5070() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5071() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5072() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5073() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5074() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5075() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5076() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5077() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5078() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5079() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5080() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5081() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5082() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5083() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5084() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5085() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5086() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5087() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5088() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5089() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5090() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5091() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5092() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5093() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5094() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5095() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5096() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5097() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5098() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5099() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5100() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5101() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5102() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5103() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5104() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5105() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5106() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5107() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5108() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5109() {
    Collection<String> source1 = Arrays.asList(p1,p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5110() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5111() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5112() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5113() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5114() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5115() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5116() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5117() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5118() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5119() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5120() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5121() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5122() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5123() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5124() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5125() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test5126() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5127() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5128() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5129() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5130() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5131() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5132() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5133() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5134() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5135() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5136() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5137() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5138() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5139() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5140() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5141() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test5142() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5143() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5144() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5145() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5146() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5147() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5148() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5149() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5150() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5151() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5152() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5153() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5154() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5155() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5156() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5157() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5158() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5159() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5160() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5161() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5162() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5163() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5164() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5165() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5166() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5167() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5168() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5169() {
    Collection<String> source1 = Arrays.asList(p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5170() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5171() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5172() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5173() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5174() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5175() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5176() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5177() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5178() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5179() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5180() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5181() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5182() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5183() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5184() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5185() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5186() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5187() {
    Collection<String> source1 = Arrays.asList(p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5188() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5189() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5190() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5191() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5192() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5193() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5194() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5195() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5196() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5197() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5198() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5199() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test5200() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5201() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5202() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5203() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5204() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5205() {
    Collection<String> source1 = Arrays.asList(p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5206() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5207() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5208() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5209() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5210() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5211() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5212() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5213() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5214() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5215() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5216() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5217() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5218() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5219() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5220() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5221() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5222() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5223() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test5224() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5225() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5226() {
    Collection<String> source1 = Arrays.asList(p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5227() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5228() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5229() {
    Collection<String> source1 = Arrays.asList(p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5230() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5231() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5232() {
    Collection<String> source1 = Arrays.asList(p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5233() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5234() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5235() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5236() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5237() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5238() {
    Collection<String> source1 = Arrays.asList(p1,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5239() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5240() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5241() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5242() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5243() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5244() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5245() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5246() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5247() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test5248() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5249() {
    Collection<String> source1 = Arrays.asList(p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5250() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5251() {
    Collection<String> source1 = Arrays.asList(p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5252() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5253() {
    Collection<String> source1 = Arrays.asList(p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5254() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5255() {
    Collection<String> source1 = Arrays.asList(p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5256() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5257() {
    Collection<String> source1 = Arrays.asList(p2,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5258() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5259() {
    Collection<String> source1 = Arrays.asList(p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5260() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5261() {
    Collection<String> source1 = Arrays.asList(p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5262() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5263() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5264() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5265() {
    Collection<String> source1 = Arrays.asList(p1,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5266() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5267() {
    Collection<String> source1 = Arrays.asList(p1,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5268() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5269() {
    Collection<String> source1 = Arrays.asList(p1,p3,p5);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5270() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5271() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5272() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5273() {
    Collection<String> source1 = Arrays.asList(p1,p2,p5);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5274() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5275() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5276() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5277() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5278() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test5279() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6000() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test6001() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test6002() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test6003() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test6004() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test6005() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test6006() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p1,p1);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
  }

  public void test6007() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6008() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6009() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6010() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6011() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6012() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6013() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6014() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6015() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6016() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6017() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6018() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
  }

  public void test6019() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6020() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6021() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6022() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6023() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6024() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6025() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6026() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6027() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6028() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6029() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6030() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6031() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6032() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6033() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6034() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6035() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6036() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6037() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6038() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6039() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6040() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6041() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6042() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6043() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6044() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6045() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6046() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6047() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6048() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6049() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6050() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6051() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6052() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6053() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6054() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6055() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6056() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6057() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6058() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6059() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6060() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6061() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6062() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6063() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6064() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6065() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6066() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6067() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6068() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6069() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6070() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6071() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6072() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6073() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6074() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6075() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6076() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6077() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6078() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6079() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6080() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6081() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6082() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6083() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6084() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6085() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6086() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6087() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6088() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6089() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6090() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6091() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6092() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6093() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6094() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6095() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6096() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6097() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6098() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6099() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6100() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6101() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6102() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6103() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6104() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6105() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6106() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6107() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6108() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6109() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6110() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6111() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6112() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6113() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6114() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6115() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6116() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6117() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6118() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6119() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6120() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6121() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6122() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6123() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6124() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6125() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6126() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6127() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6128() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6129() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6130() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6131() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6132() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6133() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6134() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6135() {
    Collection<String> source1 = Arrays.asList(p1,p1,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6136() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6137() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6138() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6139() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6140() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6141() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6142() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6143() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6144() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6145() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6146() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6147() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6148() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6149() {
    Collection<String> source1 = Arrays.asList(p1,p1,p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6150() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6151() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6152() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6153() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6154() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6155() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6156() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6157() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6158() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6159() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6160() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6161() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6162() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6163() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6164() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p2,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6165() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6166() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6167() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6168() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6169() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6170() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6171() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6172() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6173() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6174() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6175() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6176() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6177() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6178() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6179() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6180() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6181() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6182() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6183() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6184() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6185() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6186() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6187() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6188() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6189() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6190() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6191() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6192() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6193() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6194() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6195() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6196() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6197() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6198() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6199() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6200() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6201() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6202() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6203() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6204() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6205() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6206() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6207() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6208() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6209() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6210() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6211() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6212() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6213() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6214() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6215() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6216() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6217() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6218() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6219() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6220() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6221() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6222() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6223() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6224() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6225() {
    Collection<String> source1 = Arrays.asList(p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6226() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6227() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6228() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6229() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6230() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6231() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6232() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6233() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6234() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6235() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6236() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6237() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6238() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6239() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6240() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6241() {
    Collection<String> source1 = Arrays.asList(p1,p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6242() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6243() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6244() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6245() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6246() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6247() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6248() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6249() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6250() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6251() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6252() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6253() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6254() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6255() {
    Collection<String> source1 = Arrays.asList(p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6256() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6257() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6258() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6259() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6260() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6261() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6262() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6263() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6264() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6265() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6266() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6267() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6268() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6269() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6270() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6271() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6272() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6273() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6274() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6275() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6276() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6277() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6278() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6279() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6280() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6281() {
    Collection<String> source1 = Arrays.asList(p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6282() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6283() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6284() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6285() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6286() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6287() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6288() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6289() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6290() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6291() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6292() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6293() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6294() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6295() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6296() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6297() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6298() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6299() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6300() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6301() {
    Collection<String> source1 = Arrays.asList(p1,p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6302() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6303() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6304() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6305() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6306() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6307() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6308() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6309() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6310() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6311() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6312() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6313() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6314() {
    Collection<String> source1 = Arrays.asList(p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6315() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6316() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6317() {
    Collection<String> source1 = Arrays.asList(p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6318() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6319() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6320() {
    Collection<String> source1 = Arrays.asList(p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6321() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6322() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6323() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6324() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6325() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6326() {
    Collection<String> source1 = Arrays.asList(p1,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6327() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6328() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6329() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6330() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6331() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6332() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6333() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6334() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6335() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6336() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6337() {
    Collection<String> source1 = Arrays.asList(p1,p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6338() {
    Collection<String> source1 = Arrays.asList(p1,p1,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6339() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6340() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6341() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6342() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6343() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6344() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6345() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6346() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6347() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6348() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6349() {
    Collection<String> source1 = Arrays.asList(p5);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6350() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6351() {
    Collection<String> source1 = Arrays.asList(p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6352() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6353() {
    Collection<String> source1 = Arrays.asList(p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6354() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6355() {
    Collection<String> source1 = Arrays.asList(p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6356() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6357() {
    Collection<String> source1 = Arrays.asList(p2,p5);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6358() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6359() {
    Collection<String> source1 = Arrays.asList(p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6360() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p1,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6361() {
    Collection<String> source1 = Arrays.asList(p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6362() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p1,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6363() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6364() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6365() {
    Collection<String> source1 = Arrays.asList(p1,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6366() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6367() {
    Collection<String> source1 = Arrays.asList(p1,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6368() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6369() {
    Collection<String> source1 = Arrays.asList(p1,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6370() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6371() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6372() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6373() {
    Collection<String> source1 = Arrays.asList(p1,p2,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6374() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6375() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6376() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6377() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6378() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6379() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6380() {
    Collection<String> source1 = Arrays.asList(p1,p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6381() {
    Collection<String> source1 = Arrays.asList(p1,p1,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6382() {
    Collection<String> source1 = Arrays.asList(p1,p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6383() {
    Collection<String> source1 = Arrays.asList(p1,p1,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6384() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6385() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p5);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6386() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6387() {
    Collection<String> source1 = Arrays.asList(p1,p1,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6388() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6389() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p5);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6390() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6391() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6392() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6393() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6394() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6395() {
    Collection<String> source1 = Arrays.asList(p1,p1,p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6396() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6397() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6398() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6399() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6400() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6401() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6402() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6403() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6404() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6405() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6406() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6407() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p2,p2);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
  }

  public void test6408() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6409() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6410() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6411() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6412() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6413() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6414() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6415() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6416() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6417() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6418() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6419() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6420() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6421() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6422() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6423() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6424() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6425() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6426() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6427() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
  }

  public void test6428() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6429() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6430() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6431() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6432() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6433() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6434() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6435() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6436() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6437() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6438() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6439() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6440() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6441() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6442() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6443() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6444() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6445() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6446() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6447() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6448() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6449() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6450() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6451() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6452() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6453() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6454() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6455() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6456() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6457() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6458() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6459() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6460() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6461() {
    Collection<String> source1 = Arrays.asList(p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6462() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6463() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6464() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6465() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6466() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6467() {
    Collection<String> source1 = Arrays.asList(p2,p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6468() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6469() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6470() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6471() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6472() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6473() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6474() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6475() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6476() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6477() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6478() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6479() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6480() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6481() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6482() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6483() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6484() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6485() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6486() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6487() {
    Collection<String> source1 = Arrays.asList(p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6488() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6489() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6490() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6491() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6492() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6493() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6494() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6495() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6496() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6497() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6498() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6499() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6500() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6501() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6502() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6503() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6504() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6505() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6506() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6507() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6508() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6509() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6510() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6511() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6512() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6513() {
    Collection<String> source1 = Arrays.asList(p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6514() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6515() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6516() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6517() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6518() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6519() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6520() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6521() {
    Collection<String> source1 = Arrays.asList(p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6522() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6523() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6524() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6525() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6526() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6527() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6528() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6529() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6530() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6531() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6532() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6533() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6534() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6535() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6536() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6537() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6538() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6539() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6540() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6541() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6542() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6543() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6544() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6545() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6546() {
    Collection<String> source1 = Arrays.asList(p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6547() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6548() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6549() {
    Collection<String> source1 = Arrays.asList(p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6550() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6551() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6552() {
    Collection<String> source1 = Arrays.asList(p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6553() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6554() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6555() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6556() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6557() {
    Collection<String> source1 = Arrays.asList(p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6558() {
    Collection<String> source1 = Arrays.asList(p2,p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6559() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6560() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6561() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6562() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6563() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6564() {
    Collection<String> source1 = Arrays.asList(p1,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6565() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6566() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6567() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6568() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6569() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6570() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6571() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6572() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6573() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6574() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6575() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6576() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6577() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6578() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6579() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6580() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6581() {
    Collection<String> source1 = Arrays.asList(p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6582() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6583() {
    Collection<String> source1 = Arrays.asList(p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6584() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6585() {
    Collection<String> source1 = Arrays.asList(p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6586() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6587() {
    Collection<String> source1 = Arrays.asList(p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6588() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6589() {
    Collection<String> source1 = Arrays.asList(p2,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6590() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6591() {
    Collection<String> source1 = Arrays.asList(p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6592() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6593() {
    Collection<String> source1 = Arrays.asList(p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6594() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6595() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6596() {
    Collection<String> source1 = Arrays.asList(p2,p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6597() {
    Collection<String> source1 = Arrays.asList(p2,p2,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6598() {
    Collection<String> source1 = Arrays.asList(p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6599() {
    Collection<String> source1 = Arrays.asList(p2,p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6600() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6601() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6602() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6603() {
    Collection<String> source1 = Arrays.asList(p2,p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6604() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6605() {
    Collection<String> source1 = Arrays.asList(p1,p5);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6606() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6607() {
    Collection<String> source1 = Arrays.asList(p1,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6608() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6609() {
    Collection<String> source1 = Arrays.asList(p1,p3,p5);
    Collection<String> source2 = Arrays.asList(p2,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6610() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6611() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6612() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6613() {
    Collection<String> source1 = Arrays.asList(p1,p2,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6614() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6615() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6616() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6617() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6618() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6619() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6620() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2);
    Collection<String> source2 = Arrays.asList(p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6621() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p5);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6622() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6623() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6624() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3);
    Collection<String> source2 = Arrays.asList(p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6625() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6626() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6627() {
    Collection<String> source1 = Arrays.asList(p1,p2,p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6628() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6629() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6630() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6631() {
    Collection<String> source1 = Arrays.asList(p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6632() {
    Collection<String> source1 = Arrays.asList(p3,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6633() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6634() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6635() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6636() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6637() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6638() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6639() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6640() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6641() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6642() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6643() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6644() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6645() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6646() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6647() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p3,p3);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
  }

  public void test6648() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6649() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6650() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6651() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6652() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6653() {
    Collection<String> source1 = Arrays.asList(p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6654() {
    Collection<String> source1 = Arrays.asList(p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6655() {
    Collection<String> source1 = Arrays.asList(p3,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6656() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6657() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6658() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6659() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6660() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6661() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6662() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6663() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6664() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6665() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6666() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6667() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6668() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6669() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6670() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6671() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6672() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6673() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6674() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6675() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6676() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6677() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6678() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p3);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6679() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p3,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
  }

  public void test6680() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6681() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6682() {
    Collection<String> source1 = Arrays.asList(p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6683() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6684() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6685() {
    Collection<String> source1 = Arrays.asList(p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6686() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6687() {
    Collection<String> source1 = Arrays.asList(p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6688() {
    Collection<String> source1 = Arrays.asList(p3,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6689() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6690() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6691() {
    Collection<String> source1 = Arrays.asList(p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6692() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6693() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6694() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6695() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6696() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6697() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6698() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6699() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6700() {
    Collection<String> source1 = Arrays.asList(p1,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6701() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6702() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6703() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6704() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6705() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6706() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6707() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6708() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6709() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6710() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6711() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6712() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6713() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6714() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6715() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p4,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6716() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6717() {
    Collection<String> source1 = Arrays.asList(p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6718() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6719() {
    Collection<String> source1 = Arrays.asList(p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6720() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6721() {
    Collection<String> source1 = Arrays.asList(p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6722() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6723() {
    Collection<String> source1 = Arrays.asList(p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6724() {
    Collection<String> source1 = Arrays.asList(p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6725() {
    Collection<String> source1 = Arrays.asList(p3,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6726() {
    Collection<String> source1 = Arrays.asList(p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6727() {
    Collection<String> source1 = Arrays.asList(p3,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6728() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6729() {
    Collection<String> source1 = Arrays.asList(p2,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6730() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6731() {
    Collection<String> source1 = Arrays.asList(p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6732() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6733() {
    Collection<String> source1 = Arrays.asList(p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6734() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6735() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6736() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6737() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6738() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6739() {
    Collection<String> source1 = Arrays.asList(p2,p3,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6740() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6741() {
    Collection<String> source1 = Arrays.asList(p1,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6742() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6743() {
    Collection<String> source1 = Arrays.asList(p1,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6744() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6745() {
    Collection<String> source1 = Arrays.asList(p1,p3,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6746() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6747() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6748() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6749() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p5);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6750() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6751() {
    Collection<String> source1 = Arrays.asList(p1,p3,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6752() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6753() {
    Collection<String> source1 = Arrays.asList(p1,p2,p5);
    Collection<String> source2 = Arrays.asList(p3,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6754() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6755() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p3,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6756() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6757() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6758() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6759() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6760() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3);
    Collection<String> source2 = Arrays.asList(p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6761() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p5);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6762() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p4);
    Collection<String> source2 = Arrays.asList(p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6763() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p3,p4,p5);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6764() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6765() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6766() {
    Collection<String> source1 = Arrays.asList(p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6767() {
    Collection<String> source1 = Arrays.asList(p4,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6768() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6769() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6770() {
    Collection<String> source1 = Arrays.asList(p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6771() {
    Collection<String> source1 = Arrays.asList(p3,p4,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6772() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6773() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6774() {
    Collection<String> source1 = Arrays.asList(p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6775() {
    Collection<String> source1 = Arrays.asList(p2,p4,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6776() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6777() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6778() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6779() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p4,p4);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6780() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6781() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6782() {
    Collection<String> source1 = Arrays.asList(p1,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6783() {
    Collection<String> source1 = Arrays.asList(p1,p4,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6784() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6785() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6786() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6787() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p4,p4);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6788() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p4,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6789() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6790() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6791() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p4,p4);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6792() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p4,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6793() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6794() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6795() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p4,p4);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
  }

  public void test6796() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6797() {
    Collection<String> source1 = Arrays.asList(p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6798() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6799() {
    Collection<String> source1 = Arrays.asList(p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6800() {
    Collection<String> source1 = Arrays.asList(p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6801() {
    Collection<String> source1 = Arrays.asList(p4,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6802() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6803() {
    Collection<String> source1 = Arrays.asList(p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6804() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6805() {
    Collection<String> source1 = Arrays.asList(p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6806() {
    Collection<String> source1 = Arrays.asList(p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6807() {
    Collection<String> source1 = Arrays.asList(p3,p4,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6808() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6809() {
    Collection<String> source1 = Arrays.asList(p2,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6810() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6811() {
    Collection<String> source1 = Arrays.asList(p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6812() {
    Collection<String> source1 = Arrays.asList(p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6813() {
    Collection<String> source1 = Arrays.asList(p2,p4,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6814() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6815() {
    Collection<String> source1 = Arrays.asList(p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6816() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6817() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6818() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p1,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6819() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p4,p5);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6820() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6821() {
    Collection<String> source1 = Arrays.asList(p1,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6822() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6823() {
    Collection<String> source1 = Arrays.asList(p1,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6824() {
    Collection<String> source1 = Arrays.asList(p1,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6825() {
    Collection<String> source1 = Arrays.asList(p1,p4,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6826() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6827() {
    Collection<String> source1 = Arrays.asList(p1,p3,p5);
    Collection<String> source2 = Arrays.asList(p2,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6828() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6829() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6830() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6831() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p4,p5);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6832() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p4,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6833() {
    Collection<String> source1 = Arrays.asList(p1,p2,p5);
    Collection<String> source2 = Arrays.asList(p3,p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6834() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6835() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6836() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p4);
    Collection<String> source2 = Arrays.asList(p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6837() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p4,p5);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6838() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p4,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6839() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p4,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6840() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6841() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6842() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p4);
    Collection<String> source2 = Arrays.asList(p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6843() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p4,p5);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
  }

  public void test6844() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6845() {
    Collection<String> source1 = Arrays.asList(p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6846() {
    Collection<String> source1 = Arrays.asList(p5,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6847() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6848() {
    Collection<String> source1 = Arrays.asList(p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6849() {
    Collection<String> source1 = Arrays.asList(p4,p5,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6850() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6851() {
    Collection<String> source1 = Arrays.asList(p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6852() {
    Collection<String> source1 = Arrays.asList(p3,p5,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6853() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6854() {
    Collection<String> source1 = Arrays.asList(p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6855() {
    Collection<String> source1 = Arrays.asList(p3,p4,p5,p5);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6856() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6857() {
    Collection<String> source1 = Arrays.asList(p2,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6858() {
    Collection<String> source1 = Arrays.asList(p2,p5,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6859() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6860() {
    Collection<String> source1 = Arrays.asList(p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6861() {
    Collection<String> source1 = Arrays.asList(p2,p4,p5,p5);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6862() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6863() {
    Collection<String> source1 = Arrays.asList(p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6864() {
    Collection<String> source1 = Arrays.asList(p2,p3,p5,p5);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6865() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6866() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6867() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p5,p5);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6868() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6869() {
    Collection<String> source1 = Arrays.asList(p1,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6870() {
    Collection<String> source1 = Arrays.asList(p1,p5,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6871() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6872() {
    Collection<String> source1 = Arrays.asList(p1,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6873() {
    Collection<String> source1 = Arrays.asList(p1,p4,p5,p5);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6874() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6875() {
    Collection<String> source1 = Arrays.asList(p1,p3,p5);
    Collection<String> source2 = Arrays.asList(p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6876() {
    Collection<String> source1 = Arrays.asList(p1,p3,p5,p5);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6877() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6878() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6879() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p5,p5);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6880() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p4,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6881() {
    Collection<String> source1 = Arrays.asList(p1,p2,p5);
    Collection<String> source2 = Arrays.asList(p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6882() {
    Collection<String> source1 = Arrays.asList(p1,p2,p5,p5);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6883() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6884() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6885() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p5,p5);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6886() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p4,p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6887() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6888() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p5,p5);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6889() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p5,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6890() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6891() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p5,p5);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p5,it.next());
  }

  public void test6892() {
    Collection<String> source1 = Arrays.asList();
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6893() {
    Collection<String> source1 = Arrays.asList(p6);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6894() {
    Collection<String> source1 = Arrays.asList(p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6895() {
    Collection<String> source1 = Arrays.asList(p5,p6);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6896() {
    Collection<String> source1 = Arrays.asList(p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6897() {
    Collection<String> source1 = Arrays.asList(p4,p6);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6898() {
    Collection<String> source1 = Arrays.asList(p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p3,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6899() {
    Collection<String> source1 = Arrays.asList(p4,p5,p6);
    Collection<String> source2 = Arrays.asList(p1,p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6900() {
    Collection<String> source1 = Arrays.asList(p3);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6901() {
    Collection<String> source1 = Arrays.asList(p3,p6);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6902() {
    Collection<String> source1 = Arrays.asList(p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p4,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6903() {
    Collection<String> source1 = Arrays.asList(p3,p5,p6);
    Collection<String> source2 = Arrays.asList(p1,p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6904() {
    Collection<String> source1 = Arrays.asList(p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p2,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6905() {
    Collection<String> source1 = Arrays.asList(p3,p4,p6);
    Collection<String> source2 = Arrays.asList(p1,p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6906() {
    Collection<String> source1 = Arrays.asList(p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p2,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6907() {
    Collection<String> source1 = Arrays.asList(p3,p4,p5,p6);
    Collection<String> source2 = Arrays.asList(p1,p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6908() {
    Collection<String> source1 = Arrays.asList(p2);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6909() {
    Collection<String> source1 = Arrays.asList(p2,p6);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6910() {
    Collection<String> source1 = Arrays.asList(p2,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p4,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6911() {
    Collection<String> source1 = Arrays.asList(p2,p5,p6);
    Collection<String> source2 = Arrays.asList(p1,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6912() {
    Collection<String> source1 = Arrays.asList(p2,p4);
    Collection<String> source2 = Arrays.asList(p1,p3,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6913() {
    Collection<String> source1 = Arrays.asList(p2,p4,p6);
    Collection<String> source2 = Arrays.asList(p1,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6914() {
    Collection<String> source1 = Arrays.asList(p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p3,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6915() {
    Collection<String> source1 = Arrays.asList(p2,p4,p5,p6);
    Collection<String> source2 = Arrays.asList(p1,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6916() {
    Collection<String> source1 = Arrays.asList(p2,p3);
    Collection<String> source2 = Arrays.asList(p1,p4,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6917() {
    Collection<String> source1 = Arrays.asList(p2,p3,p6);
    Collection<String> source2 = Arrays.asList(p1,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6918() {
    Collection<String> source1 = Arrays.asList(p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p1,p4,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6919() {
    Collection<String> source1 = Arrays.asList(p2,p3,p5,p6);
    Collection<String> source2 = Arrays.asList(p1,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6920() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p1,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6921() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p6);
    Collection<String> source2 = Arrays.asList(p1,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6922() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p1,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6923() {
    Collection<String> source1 = Arrays.asList(p2,p3,p4,p5,p6);
    Collection<String> source2 = Arrays.asList(p1);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6924() {
    Collection<String> source1 = Arrays.asList(p1);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6925() {
    Collection<String> source1 = Arrays.asList(p1,p6);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6926() {
    Collection<String> source1 = Arrays.asList(p1,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p4,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6927() {
    Collection<String> source1 = Arrays.asList(p1,p5,p6);
    Collection<String> source2 = Arrays.asList(p2,p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6928() {
    Collection<String> source1 = Arrays.asList(p1,p4);
    Collection<String> source2 = Arrays.asList(p2,p3,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6929() {
    Collection<String> source1 = Arrays.asList(p1,p4,p6);
    Collection<String> source2 = Arrays.asList(p2,p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6930() {
    Collection<String> source1 = Arrays.asList(p1,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p3,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6931() {
    Collection<String> source1 = Arrays.asList(p1,p4,p5,p6);
    Collection<String> source2 = Arrays.asList(p2,p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6932() {
    Collection<String> source1 = Arrays.asList(p1,p3);
    Collection<String> source2 = Arrays.asList(p2,p4,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6933() {
    Collection<String> source1 = Arrays.asList(p1,p3,p6);
    Collection<String> source2 = Arrays.asList(p2,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6934() {
    Collection<String> source1 = Arrays.asList(p1,p3,p5);
    Collection<String> source2 = Arrays.asList(p2,p4,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6935() {
    Collection<String> source1 = Arrays.asList(p1,p3,p5,p6);
    Collection<String> source2 = Arrays.asList(p2,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6936() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4);
    Collection<String> source2 = Arrays.asList(p2,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6937() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p6);
    Collection<String> source2 = Arrays.asList(p2,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6938() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p2,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6939() {
    Collection<String> source1 = Arrays.asList(p1,p3,p4,p5,p6);
    Collection<String> source2 = Arrays.asList(p2);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6940() {
    Collection<String> source1 = Arrays.asList(p1,p2);
    Collection<String> source2 = Arrays.asList(p3,p4,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6941() {
    Collection<String> source1 = Arrays.asList(p1,p2,p6);
    Collection<String> source2 = Arrays.asList(p3,p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6942() {
    Collection<String> source1 = Arrays.asList(p1,p2,p5);
    Collection<String> source2 = Arrays.asList(p3,p4,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6943() {
    Collection<String> source1 = Arrays.asList(p1,p2,p5,p6);
    Collection<String> source2 = Arrays.asList(p3,p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6944() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4);
    Collection<String> source2 = Arrays.asList(p3,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6945() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p6);
    Collection<String> source2 = Arrays.asList(p3,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6946() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p5);
    Collection<String> source2 = Arrays.asList(p3,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6947() {
    Collection<String> source1 = Arrays.asList(p1,p2,p4,p5,p6);
    Collection<String> source2 = Arrays.asList(p3);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6948() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3);
    Collection<String> source2 = Arrays.asList(p4,p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6949() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p6);
    Collection<String> source2 = Arrays.asList(p4,p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6950() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p5);
    Collection<String> source2 = Arrays.asList(p4,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6951() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p5,p6);
    Collection<String> source2 = Arrays.asList(p4);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6952() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4);
    Collection<String> source2 = Arrays.asList(p5,p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6953() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p6);
    Collection<String> source2 = Arrays.asList(p5);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6954() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p5);
    Collection<String> source2 = Arrays.asList(p6);
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

  public void test6955() {
    Collection<String> source1 = Arrays.asList(p1,p2,p3,p4,p5,p6);
    Collection<String> source2 = Arrays.asList();
    Collection<String> result = testMerge(source1,source2,comp);
    Iterator<String> it = result.iterator();
    assertEquals(p1,it.next());
    assertEquals(p2,it.next());
    assertEquals(p3,it.next());
    assertEquals(p4,it.next());
    assertEquals(p5,it.next());
    assertEquals(p6,it.next());
  }

}
