package com.logical;

import java.util.Scanner;

public class Stopwatch {

	public void stopWatch() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Enter some input to start: ");
		scan.next();
		
		long start = System.nanoTime();
		
		System.out.print(" Enter some input to end: ");
		scan.next();
		
		long end = System.nanoTime();
		
		System.out.println(" The total time is: " + ((end - start) * Math.pow(10, -9)) );
		scan.close();
	}
}
