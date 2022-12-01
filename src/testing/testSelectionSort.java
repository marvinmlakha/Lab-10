package testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {

	@Test

	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
	}

	public void testPositive() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;

		int[] sortedArr = new int[5];
		sortedArr[0] = 2;
		sortedArr[1] = 7;
		sortedArr[2] = 8;
		sortedArr[3] = 9;
		sortedArr[4] = 10;

		SelectionSort sort = new SelectionSort();
		int[] selectionArr = sort.basicSelectionSort(arr);

		Assert.assertArrayEquals(selectionArr, sortedArr);
	}

	public void testNegative() {
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;

		int[] sortedArr = new int[5];
		sortedArr[0] = -10;
		sortedArr[1] = -9;
		sortedArr[2] = -8;
		sortedArr[3] = -7;
		sortedArr[4] = -2;

		SelectionSort sort = new SelectionSort();
		int[] selectionArr = sort.basicSelectionSort(arr);

		Assert.assertArrayEquals(selectionArr, sortedArr);
	}

	public void testMixed() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = -9;
		arr[2] = 7;
		arr[3] = -10;
		arr[4] = 2;

		int[] sortedArr = new int[5];
		sortedArr[0] = -10;
		sortedArr[1] = -9;
		sortedArr[2] = 2;
		sortedArr[3] = 7;
		sortedArr[4] = 8;

		SelectionSort sort = new SelectionSort();
		int[] selectionArr = sort.basicSelectionSort(arr);

		Assert.assertArrayEquals(selectionArr, sortedArr);
	}

	public void testDuplicates() {
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -8;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 10;

		int[] sortedArr = new int[5];
		sortedArr[0] = -8;
		sortedArr[1] = -8;
		sortedArr[2] = 7;
		sortedArr[3] = 10;
		sortedArr[4] = 10;

		SelectionSort sort = new SelectionSort();
		int[] selectionArr = sort.basicSelectionSort(arr);

		Assert.assertArrayEquals(selectionArr, sortedArr);
	}
}
