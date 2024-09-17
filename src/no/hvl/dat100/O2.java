package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

    public static void main(String[] args) {

	String Tallstreng = showInputDialog("bruttoinntekt: ");  
		
		int bruttoinntekt = parseInt(Tallstreng);
		double trinnskatt;
		
		
		// Inntekten mellom 0 – 208 050 kroner 	Ingen trinnskatt
		if (bruttoinntekt>=0 && bruttoinntekt <= 208050) {
			trinnskatt = 0;
			System.out.println("Ingen trinnskatt");
		}else if (bruttoinntekt>=208051 && bruttoinntekt <= 292850) {
			// Inntekten mellom 208 051 – 292 850 kroner 	1,7 % trinnskatt
			trinnskatt = bruttoinntekt*0.017;
			System.out.println("Trinnskatt blir " + trinnskatt);
		}else if (bruttoinntekt>=292851 && bruttoinntekt <= 670000) {
			// Inntekten mellom 292 851 – 670 000 kroner 	4,0 %  trinnskatt
			trinnskatt = bruttoinntekt*0.04;
			System.out.println("Trinnskatt blir " + trinnskatt);
		}else if (bruttoinntekt>=670001 && bruttoinntekt <= 937900) {
			// Inntekten mellom 670 001 – 937 900 kroner 	13,6 % trinnskatt 
			trinnskatt = bruttoinntekt*0.136;
			System.out.println("Trinnskatt blir " + trinnskatt);
		}else if (bruttoinntekt>= 937901 && bruttoinntekt <= 1350000 ) {
			// Inntekten mellom 937901 - 1350000 kroner 16,6 % trinnskatt
			trinnskatt = bruttoinntekt*0.166;
			System.out.println("Trinnskatt blir " + trinnskatt);
		}else if (bruttoinntekt >= 1350001) {
			// Inntekten fra og med 1 350 001 kroner 	17,6 %  trinnskatt
			trinnskatt = bruttoinntekt*0.176;
			System.out.println("Trinnskatt blir " + trinnskatt);
	}else {
		System.out.println("ugyldig inntekt");
	}
    }
}
