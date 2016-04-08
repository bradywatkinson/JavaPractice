import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void test1() {
		ExtendedSet<Integer> mySet = new ExtendedSet<Integer>(10);
		mySet.add(1);
		mySet.add(2);
		assertTrue(mySet.contains(1)==true);
		assertTrue(mySet.contains(2)==true);
		assertTrue(mySet.size()==2);
		System.out.println(mySet.size() + " test1()");
	}
	
	@Test
	public void test2() {
		ExtendedSet<Integer> mySet = new ExtendedSet<Integer>(10);
		mySet.add(1);
		mySet.add(2);
		assertTrue(mySet.contains(3)==false);
		System.out.println("test2()");
	}
	
	@Test
	public void test3() {
		ExtendedSet<Integer> mySet = new ExtendedSet<Integer>(10);
		mySet.add(1);
		mySet.add(2);
		mySet.add(1);
		assertTrue(mySet.size()==2);
		System.out.println("test3()");
	}
	
	@Test
	public void test4() {
		ExtendedSet<Integer> mySet1 = new ExtendedSet<Integer>(10);
		mySet1.add(1);
		mySet1.add(2);
		assertTrue(mySet1.size()==2);
		
		ExtendedSet<Integer> mySet2 = new ExtendedSet<Integer>(10);
		mySet2.add(3);
		mySet2.add(4);
		assertTrue(mySet2.size()==2);
		
		ExtendedSet<Integer> mySet3 = mySet1.union(mySet2);
		assertTrue(mySet3.contains(1)==true);
		assertTrue(mySet3.contains(2)==true);
		assertTrue(mySet3.contains(3)==true);
		assertTrue(mySet3.contains(4)==true);
		
		System.out.println("test4()");
	}
	
	@Test
	public void test5() {
		ExtendedSet<Integer> mySet1 = new ExtendedSet<Integer>(10);
		mySet1.add(1);
		mySet1.add(2);
		assertTrue(mySet1.size()==2);
		
		ExtendedSet<Integer> mySet2 = new ExtendedSet<Integer>(10);
		mySet2.add(2);
		mySet2.add(3);
		assertTrue(mySet2.size()==2);
		
		ExtendedSet<Integer> mySet3 = mySet1.union(mySet2);
		assertTrue(mySet3.contains(1)==true);
		assertTrue(mySet3.contains(2)==true);
		assertTrue(mySet3.contains(3)==true);
		
		System.out.println("test5()");
	}
	
	@Test
	public void test6() {
		ExtendedSet<Integer> mySet1 = new ExtendedSet<Integer>(10);
		mySet1.add(1);
		mySet1.add(2);
		assertTrue(mySet1.size()==2);
		
		ExtendedSet<Integer> mySet2 = new ExtendedSet<Integer>(10);
		mySet2.add(2);
		mySet2.add(3);
		assertTrue(mySet2.size()==2);
		
		ExtendedSet<Integer> mySet3 = mySet1.symetricDifference(mySet2);
		System.out.println(mySet3.size());
		assertTrue(mySet3.size()==2);
		assertTrue(mySet3.contains(1)==true);
		assertTrue(mySet3.contains(2)==false);
		assertTrue(mySet3.contains(3)==true);
		
		System.out.println("test6()");
	
	}
	
	@Test
	public void test7() {
		ExtendedSet<Integer> mySet1 = new ExtendedSet<Integer>(10);
		mySet1.add(1);
		mySet1.add(2);
		assertTrue(mySet1.size()==2);
		
		ExtendedSet<Integer> mySet2 = new ExtendedSet<Integer>(10);
		mySet2.add(2);
		mySet2.add(3);
		assertTrue(mySet2.size()==2);
		
		ExtendedSet<Integer> mySet3 = mySet1.intersection(mySet2);
		System.out.println(mySet3.size());
		assertTrue(mySet3.size()==1);
		assertTrue(mySet3.contains(1)==false);
		assertTrue(mySet3.contains(2)==true);
		assertTrue(mySet3.contains(3)==false);
		
		System.out.println("test7()");
	}
	
	public void test8() {
		System.out.println("String tests:");
		ExtendedSet<String> mySet = new ExtendedSet<String>(10);
		mySet.add("a");
		mySet.add("b");
		assertTrue(mySet.contains("a")==true);
		assertTrue(mySet.contains("b")==true);
		assertTrue(mySet.size()==2);
		System.out.println(mySet.size() + " test8()");
	}
	
	@Test
	public void test9() {
		ExtendedSet<String> mySet = new ExtendedSet<String>(10);
		mySet.add("a");
		mySet.add("b");
		assertTrue(mySet.contains(3)==false);
		System.out.println("test2()");
	}
	
	@Test
	public void test10() {
		ExtendedSet<String> mySet = new ExtendedSet<String>(10);
		mySet.add("a");
		mySet.add("b");
		mySet.add("a");
		assertTrue(mySet.size()==2);
		System.out.println("test10()");
	}
	
	@Test
	public void test11() {
		ExtendedSet<String> mySet1 = new ExtendedSet<String>(10);
		mySet1.add("a");
		mySet1.add("b");
		assertTrue(mySet1.size()==2);
		
		ExtendedSet<String> mySet2 = new ExtendedSet<String>(10);
		mySet2.add("c");
		mySet2.add("d");
		assertTrue(mySet2.size()==2);
		
		ExtendedSet<String> mySet3 = mySet1.union(mySet2);
		assertTrue(mySet3.contains("a")==true);
		assertTrue(mySet3.contains("b")==true);
		assertTrue(mySet3.contains("c")==true);
		assertTrue(mySet3.contains("d")==true);
		
		System.out.println("test11()");
	}
	
	@Test
	public void test12() {
		ExtendedSet<String> mySet1 = new ExtendedSet<String>(10);
		mySet1.add("a");
		mySet1.add("b");
		assertTrue(mySet1.size()==2);
		
		ExtendedSet<String> mySet2 = new ExtendedSet<String>(10);
		mySet2.add("b");
		mySet2.add("c");
		assertTrue(mySet2.size()==2);
		
		ExtendedSet<String> mySet3 = mySet1.union(mySet2);
		assertTrue(mySet3.contains("a")==true);
		assertTrue(mySet3.contains("b")==true);
		assertTrue(mySet3.contains("c")==true);
		
		System.out.println("test12()");
	}
	
	public void test13() {
		ExtendedSet<String> mySet1 = new ExtendedSet<String>(10);
		mySet1.add("a");
		mySet1.add("b");
		assertTrue(mySet1.size()==2);
		
		ExtendedSet<String> mySet2 = new ExtendedSet<String>(10);
		mySet2.add("b");
		mySet2.add("c");
		assertTrue(mySet2.size()==2);
		
		ExtendedSet<String> mySet3 = mySet1.symetricDifference(mySet2);
		assertTrue(mySet3.contains("a")==true);
		assertTrue(mySet3.contains("b")==false);
		assertTrue(mySet3.contains("c")==true);
		
		System.out.println("test12()");
	}
	
	@Test
	public void test14() {
		ExtendedSet<String> mySet1 = new ExtendedSet<String>(10);
		mySet1.add("a");
		mySet1.add("b");
		assertTrue(mySet1.size()==2);
		
		ExtendedSet<String> mySet2 = new ExtendedSet<String>(10);
		mySet2.add("b");
		mySet2.add("c");
		assertTrue(mySet2.size()==2);
		
		ExtendedSet<String> mySet3 = mySet1.intersection(mySet2);
		assertTrue(mySet3.contains("a")==false);
		assertTrue(mySet3.contains("b")==true);
		assertTrue(mySet3.contains("c")==false);
		
		System.out.println("test14()");
	}
}





