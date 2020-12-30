package com.oop;

public class FunctionTest {
/*
 * 137p.함수 구현하고 호출하기
 * 함수의 정의와 호출을 디버깅을 통해 확인한다.
 * 변수의 영향 범위 scope 
 * local variable 지역변수
 * global variable 전역변수(자바에서는 class variable 클래스 변수)
  class변수 선언시 static 키워드를 사용한다.
 */
	public static void main(String[] args) {

		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2); // 메인메서드에서 add라는 메서드를 불러야함
		System.out.println(sum);
		
	} //end of mail
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}

} //end of class
