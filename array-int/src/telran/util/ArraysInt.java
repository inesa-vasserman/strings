package telran.util;

import java.util.Arrays;

public class ArraysInt {
	
	public static int[] addNumber(int[] array, int number) {
			
		int[] arrRes = Arrays.copyOf(array, array.length + 1);
		arrRes[arrRes.length - 1] = number;
		
		return arrRes;
		
	}
	
	public static int[] insertNumber(int[] array, int index, int number) {
		
	    int[] ar = new int[array.length + 1];
	    System.arraycopy(array, 0, ar, 0, index);
	    ar[index] = number;
	    System.arraycopy(array, index, ar, index + 1, array.length - index);
	    
	    return ar;
	}

	
	public static int[] removeNumber(int[] array, int index) {
		
	    int[] ar = new int[array.length - 1];
	    System.arraycopy(array, 0, ar, 0, index);
	    System.arraycopy(array, index + 1, ar, index, array.length - index - 1);

	    return ar;
	}

	
	public static int[] insertSorted(int[] sortedArray, int number) {
	    Arrays.sort(sortedArray);
	    int index = Arrays.binarySearch(sortedArray, number);
	    if (index < 0) {
	        index = -index - 1;
	    }
	    return insertNumber(sortedArray, index, number);
	}
}
