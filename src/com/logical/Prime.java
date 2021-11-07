package com.logical;

import java.util.Scanner;

public class Prime {

	public void prime() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Please enter the number: ");
		int n = scan.nextInt();
		
		if (n < 2) {
			System.out.println(" This is NOT a prime number");
			scan.close();
			return;
		}
		
		for (int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				System.out.println(" This is NOT a prime number");
				scan.close();
				return;
			}
		}
		System.out.println(" This is a prime number");
		scan.close();
	}
}
