package telran.util.test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.util.ArraysInt.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArraysTest {

	int[] array = {10, 25, 30, 40, 100};

	@Test
	void addNumberTest() {
		int[] arrayExpected = {10, 25, 30, 40, 100, -2};
		
		int[] arrayActual = addNumber(array, -2);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	
	@Test
	void insertNumberTest() {

		int[] arrayExpectedFirst =  {25, 10, 25, 30, 40, 100};
		int[] arrayExpectedMiddle = {10, 25, 30, 25, 40, 100};
		int[] arrayExpectedLast =   {10, 25, 30, 40, 100, 25};

		int[] arrayActualFirst =  insertNumber(array, 0, 25);
		int[] arrayActualMiddle = insertNumber(array, 3, 25);
		int[] arrayActualLast =   insertNumber(array, 5, 25);
		
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
		assertArrayEquals(arrayExpectedMiddle, arrayActualMiddle);
		assertArrayEquals(arrayExpectedLast, arrayActualLast);

	}
	
	@Test 
	void removeNumberTest() {
				
		int[] arrayExpectedFirst = {25, 30, 40, 100};
		int[] arrayExpectedMiddle = {10, 25, 30, 100};
		int[] arrayExpectedLast = {10, 25, 30, 40};
		
		int[] arrayActualFirst = removeNumber(array, 0);
		int[] arrayActualMiddle = removeNumber(array, 3);
		int[] arrayActualLast = removeNumber(array, array.length - 1);
		
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
		assertArrayEquals(arrayExpectedMiddle, arrayActualMiddle);
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
		
		
	}
	
	@Test
	void insertSortedTest() {
		
		int[] arrayExpectedLast = {10, 25, 30, 40, 100, 150};
		int[] arrayExpectedFirst = {10, 10, 25, 30, 40, 100};
		int[] arrayExpectedMiddle = {10, 25, 30, 35, 40, 100};
		
		int[] arrayActualLast = insertSorted(array, 150);
		int[] arrayActualFirst = insertSorted(array, 10);
		int[] arrayActualMiddle = insertSorted(array, 35);
		
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
		assertArrayEquals(arrayExpectedMiddle, arrayActualMiddle);
		
	}
	
	@Test
	void copyOfTest() {
		
		int[] arrayExpectedSameLength = {10, 25, 30, 40, 100};
		int[] arrayExpectedLessLength = {10, 25, 30};
		int[] arrayExpectedGreaterLength = {10, 25, 30, 40, 100, 0};
		
		int[] arrayActualSameLength = Arrays.copyOf(array, array.length);
		int[] arrayActualLessLength = Arrays.copyOf(array, array.length - 2);
		int[] arrayActualGreaterLength = Arrays.copyOf(array, array.length + 1);

		assertArrayEquals(arrayExpectedSameLength, arrayActualSameLength);
		assertArrayEquals(arrayExpectedLessLength, arrayActualLessLength);
		assertArrayEquals(arrayExpectedGreaterLength, arrayActualGreaterLength);
	}
	
	@Test 
	void arrayCopyTest() {
		int[] array1 = {3, 10, 20, 15};
		int[] expected = {10, 25, 10, 20, 100};
		int[] arrayCopy = Arrays.copyOf(array, array.length);
		System.arraycopy(array1, 1, arrayCopy, 2, 2);
		
		assertArrayEquals(expected, arrayCopy);
	}
	
	@Test 
	void binarySearchTest() {
		
//		{10, 25, 30, 40, 100};
		assertEquals(0, Arrays.binarySearch(array, 10));
		assertEquals(-3, Arrays.binarySearch(array, 28));
		assertEquals(-6, Arrays.binarySearch(array, 1010));
		assertEquals(array.length - 1, Arrays.binarySearch(array, 100));

		
	}

}
