package org.test;

public class Fibonacci {
	public static void main(String[] args) {
		
	/*	int sum=0;
		//int n=0;
		for (int i = 0; i < 5; i++) {
	       for (int j = 1; j <=i+1; j++) {
	    	   System.out.println(j);
	    	  // i++;
	    	   sum=j+1;
	    	 //  System.out.print("*");
		}
		//System.out.println();
		}


		//n=sum+1;
	}*/

	        int n = 5, t1 = 0, t2 = 1;
	      //  System.out.print("First " + n + " terms: ");
	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(t1+ "+");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	        System.out.println();
	    }


}
