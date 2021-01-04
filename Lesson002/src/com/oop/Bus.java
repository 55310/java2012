package com.oop;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
	this.money += money;
	this.passengerCount++;
	}
	
	public void takeOffBus() {
		this.passengerCount--;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 승객 수 : " + passengerCount + 
				 " 버스 수입금액 : " + money);
	} //end of showInfo()
} //end of class Bus
