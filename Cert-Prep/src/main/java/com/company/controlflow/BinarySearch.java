package com.company.controlflow;

import java.util.Arrays;

public class BinarySearch {

	
	int[] nums = {
			55,447,112,31,2,5,6,4,5,85,478,26,140,685,425,
			456,564,12325,1256,135,15616,2,551,18,32,45,52,
			415,215,1,52,1554,564,654,54,654,654,635,69,869
	};
	
	int searchArray(int[] arr, int search) {
		int max = arr.length-1;
		int min = 0;
		//sort the array
		Arrays.sort(arr);
		// while the max is greater than or equal to 0
		while(max >= 0) {
			// cut the array in half
			int arrHalf = (max+min)/2;
			int halfPoint = arr[arrHalf];
			// check if we found it
			if(search == halfPoint) {
				return arrHalf;
			}
			// if the number is less than the halfway point, search the lesser subarray
			if(search < halfPoint) {
				max = arrHalf-1;
				// otherwise, we need to search the greater subarray
			} else if (search > halfPoint){
				min = arrHalf+1;
			}
		}
		// if nothing is found, return -1 to tell the user the number does not exist
		return -1;
	}
	
	public static void main(String[] args) {
		BinarySearch b = new BinarySearch();
		int i = b.searchArray(b.nums, 1);
		System.out.println(i);
		System.out.println(Arrays.toString(b.nums));
	}
}
