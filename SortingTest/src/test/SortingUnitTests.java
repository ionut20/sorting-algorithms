package test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import sorting.SortingUtils;

public class SortingUnitTests {
	@Test
	public void testSortingForNullInput() {
		Assert.assertTrue(Arrays.equals(new int[] {},
				SortingUtils.doInsertionSort(null)));
	}

	@Test
	public void testSortingForEmptyInput() {
		Assert.assertTrue(Arrays.equals(new int[] {},
				SortingUtils.doInsertionSort(new int[] {})));
	}

	@Test
	public void testSortingForAnUnorderedArray() {
		int[] input = { 5, 3, 1, 2, 4 };
		Assert.assertTrue(Arrays.equals(new int[] { 1, 2, 3, 4, 5 },
				SortingUtils.doInsertionSort(input)));
	}

	@Test
	public void testSortingForAnOrderedArray() {
		int[] input = { 1, 2, 3, 4, 5 };
		Assert.assertTrue(Arrays.equals(new int[] { 1, 2, 3, 4, 5 },
				SortingUtils.doInsertionSort(input)));
	}
}
