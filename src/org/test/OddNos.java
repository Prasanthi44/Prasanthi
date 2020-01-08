package org.test;

public class OddNos {
    public static void main(String[] args) {
		int n=100;
		System.out.println("The odd numbers from 1 to 100 is ");
		for(int i=1;i<=n;i++) {
			if(i % 2 !=0) {
				System.out.println(i+" ");
			}
		}
	}
}

