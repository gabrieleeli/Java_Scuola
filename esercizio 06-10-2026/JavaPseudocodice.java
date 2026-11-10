/*
 * JavaPseudocodice.java
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

public class JavaPseudocodice {
	
	public static void main (String[] args) {
		
		String str; int i; int j;
		str = "ciao a tutti";
		
		i = 3;
		j = 6;
		
		String first = str.substring(0, i);
		String charI = str.substring(i, i + 1);
		String middle = str.substring(i + 1, j);
		String charJ = str.substring(j, j + 1);
		String last = str.substring(j + 1);
		
		String result = first + charJ + middle + charI + last;
		
		System.out.println("Stringa prima di substring: " + str);
		System.out.println("Stringa dopo substring: " + str );
	}
}

