package com.dp;

import java.util.*;

public class ChocolateDistribution {

	// arr[0..n-1] represents sizes of
	// packets. m is number of students.
	// Returns minimum difference between
	// maximum and minimum values of
	// distribution.
	static int findMinDiff(int arr[], int chocCount, int numberOfStudents) {
		// if there are no chocolates or
		// number of students is 0
		if (numberOfStudents == 0 || chocCount == 0)
			return 0;
		// Number of students cannot be
		// more than number of packets
		if (chocCount < numberOfStudents)
			return -1;
		// Sort the given packets
		Arrays.sort(arr);
				
		// Largest number of chocolates
		int min_diff = Integer.MAX_VALUE;

		// Find the subarray of size m
		// such that difference between
		// last (maximum in case of
		// sorted) and first (minimum in
		// case of sorted) elements of
		// subarray is minimum.
		int first = 0, last = 0;
		for (int i = 0; i + numberOfStudents - 1 < chocCount; i++) {
			int diff = arr[i + numberOfStudents - 1] - arr[i];
			if (diff < min_diff) {
				min_diff = diff;
				first = i;
				last = i + numberOfStudents - 1;
			}
		}
		return (arr[last] - arr[first]);
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
 // 2,4,7,9,12,23,25,28,30,40,41,42,43,44,48,50
		int m = 7; // Number of students

		int n = arr.length;
		System.out.println("Minimum difference is " + findMinDiff(arr, n, m));

	}
}
