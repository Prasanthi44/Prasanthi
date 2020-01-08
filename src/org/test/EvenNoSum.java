package org.test;

public class EvenNoSum {
	public static void main(String[] args) {
		int i,sum=0;
		for(i=1;i<=10;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			//System.out.println("The sum of even numbers are "+sum);
		}
	System.out.println("The sum of even numbers are "+sum);
	}

}
