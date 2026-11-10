/*
 * Divisione.java
 * 
 * Copyright 2026 gastaldello12303 <gastaldello12303@INFO3-06>
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

public class Divisione {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in); //creo l'oggetto in per effettuare input da tastiera
		
		double a; double b; double divisione;
		
		System.out.println("inserisci il primo addendo ");
		a = Integer.parseInt(in.nextLine());
		
		System.out.println("inserisci il secondo addendo ");
		b = Integer.parseInt(in.nextLine());
		
		divisione = a/b;
		System.out.println("la somma è " + divisione);
	}
}
