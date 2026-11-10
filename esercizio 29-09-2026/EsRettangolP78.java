/*
 * AreaTester
 * 
 * Copyright 2026 gastaldello12303 <gastaldello12303@INF1-21>
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

import java.awt.Rectangle;
import java.util.Scanner;
public class EsRettangolP78 {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double area; double perimeter; 
		int x; int y; int height; int width;
		
		System.out.println("Inserisci la posizione in x: ");
		x = Integer.parseInt(in.nextLine());
		System.out.println("Inserisci la posizione in y: ");
		y = Integer.parseInt(in.nextLine());
		System.out.println("Inserisci l'altezza del rettangolo: ");
		height = Integer.parseInt(in.nextLine()); 
		System.out.println("Inserisci la larghezza del rettangolo: ");
		width = Integer.parseInt(in.nextLine()); 
		
		Rectangle box = new Rectangle(x, y, height, width);
		
		System.out.println("L'altezza del rettangolo è: " + box.getHeight());
		System.out.println("La lunghezza del rettangolo è: " + box.getWidth());
		
		area = (box.getWidth() * box.getHeight());
		System.out.println("L'area del rettangolo è pari a: " + area);
		
		perimeter= (2 * (box.getWidth() + box.getHeight()));
		System.out.println("Il perimetro del rettangolo è pari a: " + perimeter);
	}
}

