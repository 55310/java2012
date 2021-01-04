package com.oop;
// singestone design pattern
public class CarCompany {
	//step 2. 
	private static CarCompany instance = new CarCompany();
	public static int carCompanyProducts = 0;
		
	//step 1. 생성자를 private 으로 만들기
	private CarCompany() {}
	
	//step 3.
	public static CarCompany getInstance() {
		if(instance == null) {
			instance = new CarCompany();
		}
		return instance;
	}
	
	public void showInfo() {
		System.out.println("회사 총 생산량 : " + carCompanyProducts);
	}

	
	
}
