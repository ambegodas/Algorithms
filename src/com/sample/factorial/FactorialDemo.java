/**
 * @autor pathmasri
 * Oct 28, 2015 7:32:41 AM
 */
package com.sample.factorial;

public class FactorialDemo {
	
	public static void main(String[] args){
		
		System.out.println(getFactorial(4));
	}
	
	private static int getFactorial(int number){
		
		if(number==0){
			return 1 ;
		} else {
			return number * getFactorial(number-1);
		}
		
	}

}
