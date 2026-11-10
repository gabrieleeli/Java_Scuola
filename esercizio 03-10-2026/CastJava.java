/*
 * CastJava.java
 * 
 * Copyright 2026 gastaldello12303 <gastaldello12303@INF1-22>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.Scanner;
public class CastJava {
	
	public static void main (String[] args) {
		
		double balance = 67.67; // definisco la variabile in float 
		System.out.println ("Balance in intero è pari a: " + balance);
		
		long round = Math.round(balance); //valore intero più grande di integer quindi non serve che forzo il valore in int, ma devo arrotondare la parte decimale per renderlo intero
		System.out.println ("Balance in intero è pari a: " + round);
		
		int rounded = (int) Math.round(balance); // valore sempre intero ma più piccolo di long quindi devo forzare l'inserimento in un valore integer perdendo assieme la parte decimale
		System.out.println ("Balance in intero è pari a: " + rounded);
		
		Scanner in = new Scanner(System.in);
		
		int x; int y; int z; double risultato;
		System.out.println("Inserire X: ");
		x = Integer.parseInt(in.nextLine());
		
		System.out.println("Inserire Y: ");
		y = Integer.parseInt(in.nextLine());
		
		System.out.println("Inserire Z: ");
		z = Integer.parseInt(in.nextLine());
		
		risultato = (x+y)/2;
		System.out.println("(x+y)/2: " + risultato);
		
		risultato = x * y / 2;
		System.out.println("x * y / 2: " + risultato);
		
		risultato = Math.pow(1 + x / 100, y);
		System.out.println("1 + x / 100, y: " + risultato);
		
		risultato = Math.sqrt(x * x + y * y);
		System.out.println("Math.sqrt(x * x + y * y): " + risultato);
		
		risultato = (x + y + z)/3.0;
		System.out.println("(x + y + z)/3.0: " + risultato);
		
		risultato = Math.pow(1 + x / 100, y);
		System.out.println("1 + x / 100, y: " + risultato);
		
		risultato = Math.PI;
		System.out.println("Math.PI: " + risultato);
		
		
		int score1 = 10;
		int score2 = 4;
		int score3 = 9;
		double average = (score1 + score2 + score3) / 3;
		System.out.println("Average score: " + average);
		
		
		double total = score1 + score2 + score3;
		double average2 = total / 3;
		System.out.println("Average score: " + average2);
		
		
	}
}

