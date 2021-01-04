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
	
	// QuizStaticGuest 클래스는 손님ID, 손님이 가진 돈을 멤버 변수로 가진다.
	// 매장에서 구매, 현재 가진 돈을 메서드로 가진다.
	public QuizStaticGuest(String GuestID, int GuestMoney) { // 생성자
		this.GuestID = GuestID;
		this.GuestMoney = GuestMoney;
	} 
	
	public void takeStore(QuizStaticStore QuizStaticstore) {
		QuizStaticstore.take(500000);
		this.GuestMoney -= 500000;
	} // 손님이 매장에서 5000000원을 지불하는 기능을 구현한 메서드
		
	public void showInfo() { 
		System.out.println(GuestID + "님의 남은 돈은" +
	                        GuestMoney + "입니다");
		
	} // 손님이 지불한 금액을 출력
	
	
    
	

	
} //end of QuizStaticGuest
