package edu.depaul.se433;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;
import static org.junit.Assert.*;
import org.junit.*;

import static edu.depaul.se433.BinarySearch.*;

public class BinarySearchTest{

  @Test
  public void testSearch1() {

	 int[] a = { 1, 3, 5, 7};
	assertTrue(search(a, 3) == 1);

  }

  @Test
  public void testSearch2() {
	int[] a = { 1, 3, 5, 7};
	assertTrue(search(a, 2) == -1);
  }

  @Test
  public void testCheckedSearch1() {
	int[] a = { 1, 3, 5, 7};
	assertTrue(checkedSearch(a, 3) == 1);
  }

  @Test(expected=IllegalArgumentException.class)
  public void testCheckedSearch2() {
	checkedSearch(null, 1);
  }

  @Test
  public void testCheckedSearch3() {
	try {
	  checkedSearch(null, 1);
	  fail("Exception should have occurred");
	} catch (IllegalArgumentException exception) {
	  assertEquals(exception.getMessage(), "Null or empty array.");
	}
  }
}