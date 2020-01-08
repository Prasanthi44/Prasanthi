package org.test;

public class OddNoSum {
	public static void main(String[] args) {
		int n=100,sum=0;
				for(int i=1;i<=n;i++) {
					
			if(i % 2 !=0) {
				sum= sum+i;
				
			}
		}
				System.out.println("The sum of Odd nos are "+sum);
	}
}



