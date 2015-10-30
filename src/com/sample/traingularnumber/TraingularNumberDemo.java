/**
 * @autor pathmasri
 * Oct 28, 2015 7:18:17 AM
 */
package com.sample.traingularnumber;

public class TraingularNumberDemo {
	
	public static void main(String[] args){
		
		System.out.println(getTraingularNumber(6));
	}
	
	
	
	  private static int getTraingularNumber(int number){		  
		  if(number==1){
			  return 1;
		  } else {
			  return number + getTraingularNumber(number-1);
		  }		  
	  }
}


