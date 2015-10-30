/**
 * @autor pathmasri
 * Oct 30, 2015 1:26:44 PM
 */
package com.sample.knapsack;

public class KnapSackDemo {

	public static void main(String args[]) {

		int[][] arr = new int[4][2];
		arr[0][0] = 1;
		arr[0][1] = 1;

		arr[1][0] = 3;
		arr[1][1] = 4;

		arr[2][0] = 4;
		arr[2][1] = 5;

		arr[3][0] = 5;
		arr[3][1] = 5;
		
		int ans = getMax(arr, 7);
		System.out.println(ans);

	}

	private static int getMax(int[][] arr, int total) {

		int max = 0;
		
		if (total == 0) {
			return 0;
		} else {

			for (int[] ar : arr) {
				int weight = ar[0];
				int value = ar[1];			

				if (total - weight >= 0) {
					value = value + getMax(removeFirstElemementOfArray(arr), total-weight);
				} 
				else {
					continue;
				}
				if(value>max){
				  max = value;	
				}
			}
		}

		return max;
	}

	private static int[][] removeFirstElemementOfArray(int[][] arr) {

		int[][] temp = new int[arr.length - 1][2];
		for(int i=1;i<arr.length;i++){
			temp[i-1][0] = arr[i][0];
			temp[i-1][1] = arr[i][1];
		}
		return temp;
	}
}
