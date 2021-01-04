package com.oop;

// 매장 : 손님Count, money 

public class QuizStaticStore {
	int GuestCount; // 매장 손님 수
	int StoreMoney; // 매장 수입
	
	public QuizStaticStore(int GuestCount, int StoreMoney) {
		this.GuestCount = GuestCount;
		this.StoreMoney = StoreMoney;
	} // 손님수와 매장 수입을 매개 변수로 받는 생성자
	
	public void take(int StoreMoney) {
		this.StoreMoney += StoreMoney;
		GuestCount++;
	} 
	
	public void showInfo() {
		System.out.println("매장 손님 수 : " + GuestCount + 
				"매장 수입 : " + StoreMoney);
	}

	
} // end of class
