package no.hvl.dat100;

import java.util.Scanner;

public class O1 {

	public static void main (String [] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	for ( int index = 1; index <= 10; index ++) {
		
		int poengsum;
		while(true) {
		
	System.out.println( "Skriv inn poengsummen for student nr:" +index);
	
	 poengsum = scanner.nextInt();
	
	if( poengsum >=0 && poengsum <=100) {
		break;
	}
	char karakter;
	
	if (poengsum >=90 && poengsum <=100) {
	karakter = 'A';
	System.out.println( "karakter for student nr" +index+ "er:" + karakter);
	}else if (poengsum >= 80 && poengsum < 90) {
	karakter = 'B';
	System.out.println( "karakter for student nr" +index+ "er:" + karakter);
	}else if (poengsum >= 60 && poengsum < 80) {
	karakter = 'C';
	System.out.println( "karakter for student nr" +index+ "er:" + karakter);
	}else if (poengsum >=50 && poengsum < 60) {
	karakter = 'D';
	System.out.println( "karakter for student nr" +index+ "er:" + karakter);
	}else if (poengsum >= 40 && poengsum < 50) {
	karakter = 'E';
	System.out.println( "karakter for student nr" +index+ "er:" + karakter);
	}else if (poengsum >= 0 && poengsum < 40) {
	karakter = 'F';
	System.out.println("F");
	
	
	 
	}
	
	}
scanner.close();
	}
}
}
	
	
	
	
	

	
	

