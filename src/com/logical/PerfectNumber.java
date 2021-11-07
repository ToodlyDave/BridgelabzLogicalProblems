package com.logical;

import java.util.Scanner;

public class PerfectNumber {

	public void perfect() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		System.out.print(" Please enter the number: ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
				System.out.println(i + " " + sum);
			}
		}
		
		if (sum == n) 
			System.out.println(" It is a perfect number!!");
		else
			System.out.println(" It is NOT a perfect number");
		scan.close();
	}
}
