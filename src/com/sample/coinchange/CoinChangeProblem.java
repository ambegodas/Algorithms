/**
 * @autor pathmasri
 * Oct 28, 2015 6:54:43 AM
 */
package com.sample.coinchange;

public class CoinChangeProblem {
	
	public static void main(String[] args){
		
		int[] coinArr = {1,2,3};
		
		int ans = getCoin(coinArr,5);
		System.out.println(ans);
		
	}

	
	private static int getCoin(int[] arr, int total){
		
		if(total==0){
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		int length = 0;
		
		for(int a: arr){
			
			if(a<=total){
			length = 1 + getCoin(arr, total-a);
			} else {
				continue;
			}			
			if (length < min){
				min = length;
			}			
		}		
		return min;		
	}
	

}
