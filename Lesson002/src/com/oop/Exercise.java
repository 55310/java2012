package com.oop;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {

		// 구구단1
		/*
		 * int i;
		 * 
		 * int j;
		 * 
		 * for(i = 1; i <= 9; i++) { for(j = 1; j <=9; j++) { System.out.println(i + "*"
		 * + j +" = " + i * j); } }
		 */

		// 구구단2

		int i;
		int j;

		Scanner sc = new Scanner(System.in);
		System.out.println(" 몇 단 ? : ");

		i = sc.nextInt();

		sc.close();

		if (i <= 9) {
			for (j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			// }
		} else {
			System.out.println("9단까지");
		}

	} // end of main

} // end of class
