package com.swcodingschool.hello;

import java.util.Scanner;

public class Quizcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		System.out.println("점수 : ");
			int s = sc.nextInt();
			
			
		if( s >=90 ) {
			System.out.println("A");			
		}
		else if ( s>=80) {
			System.out.println("B");
		}
		else if ( s>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("Other");
		} 
		
		
		
		
		
		
	}

}
