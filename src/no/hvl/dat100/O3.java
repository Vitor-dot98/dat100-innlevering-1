package no.hvl.dat100;

import java.util.Scanner;

public class O3 {
	
	public static void main (String[]args) {
	
	Scanner scanner = new Scanner (System.in); 
	
	int n = scanner.nextInt();
	System.out.println("skriv inn heltall n > 0:" );
	
	if (n <= 0) {
		System.out.println( "tallet må være større enn null.");
		return;
	}
	
	long factorial = 1;
	for (int index = 1; index <= n;index ++) {
	factorial *= index;
	}
	
	System.out.println("verdien av" + n + "!er" + factorial);
	
	scanner.close();
	
	}
}

