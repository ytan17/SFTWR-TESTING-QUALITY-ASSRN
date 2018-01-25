package edu.depaul.se433;

/*
 * Implementing simple binary search on an array.  
 */
public class BinarySearch {
  public static final int NOT_FOUND = -1;
    
  /**
   * Performs a binary search to search for x in array a[] 
   * Precondition: array a[] is sorted 
   *
   * @return      index where x is found, or NOT_FOUND.
   */
  public static int search(int[] a, int x) {
	int low = 0;
	int high = a.length - 1;
	while (low <= high) {
	  int mid = low + (high - low) / 2;
	  if (a[mid] < x)
		low = mid + 1;
	  else if (a[mid] > x)
		high = mid - 1;
	  else
		return mid;
	}
	return NOT_FOUND;     
  }

  /**
   * Performs a binary search to search for x in array a[] 
   * Precondition: array a[] is sorted 
   *
   * @return      index where x is found, or NOT_FOUND.
   */
  public static int checkedSearch(int[] a, int x) {
	if (a == null || a.length == 0) { 
	  throw new IllegalArgumentException("Null or empty array.");
	}
	int low = 0;
	int high = a.length - 1;
	while (low <= high) {
	  int mid = low + (high - low) / 2;
	  if (a[mid] < x)
		low = mid + 1;
	  else if (a[mid] > x)
		high = mid - 1;
	  else
		return mid;
	}
	return NOT_FOUND;     
  }

  public static void main( String [ ] args ) {
	int[] intArray = { 1, 2, 4, 8, 16 }; 
	for (int i = 0; i < 16; i++)
	  System.out.println( "Found " + i + " at " + search(intArray, i)); 	  
  }

}
