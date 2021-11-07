package com.logical;

import java.util.Scanner;

public class Reverse {

	public void reverse() {
		Scanner scan = new Scanner(System.in);
		int rev = 0;
		
		System.out.print(" Please enter the number: ");
		int n = scan.nextInt();
		
		while (n != 0) {
			rev = rev*10 + n%10;
			n /= 10;
		}
		
		System.out.println(" The reverse number is: " + rev);
		scan.close();
	}
}
