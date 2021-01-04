package com.oop;
/*
 * static, 객체간 협조 연습 예제
 */
public class CarFactory {
	private String factoryName;
	private int productCounts;
	
	CarFactory(String factoryName){
		this.factoryName = factoryName;
	} // 생성자
	
	public void produceCar(int produceNumber ) {
		productCounts += produceNumber;
		CarCompany.carCompanyProducts += produceNumber;
	} // 입력받을 생산 대 수
	
	public void showInfo( ) {
		System.out.println(factoryName + " 공장 : " 
	      + "현재까지 생산량 : " + productCounts);
	}
}
