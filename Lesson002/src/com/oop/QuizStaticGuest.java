package com.oop;
/*
 * 매장이 하나 있고, 매장과 거래하는 손님들이 있다.
 * 매장은 싱글톤 패턴으로 구현하고, 다수의 손님들이 물건을 구매한다.
 * 이를 객체 지향 프로그램으로 시뮬레이션 해보자. 
 * 손님 : 손님ID, money
 * 매장 : 손님Count, money 
 */
public class QuizStaticGuest {
	public String GuestID;     // 손님ID
	public int GuestMoney;     // 손님이 가지고 있는 돈
	
	public QuizStaticGuest(String GuestID, int GuestMoney) { // 생성자
		this.GuestID = GuestID;
		this.GuestMoney = GuestMoney;
	}
	

	

	
}
