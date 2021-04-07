package com.devlabs.Assignment2;

public class SumOfDigits {

	public static void main(String[] args) {

		int n=1234;
		int sum=0;

	    while(n > 0 || sum > 9)
	    {
	        if(n == 0)
	        {
	            n = sum;
	            sum = 0;
	        }
	        sum += n % 10;
	        n = (int)n / 10;
	    }
	    System.out.println(sum);
	    
// Need to fix the code	    
	    
	  
	}

}
