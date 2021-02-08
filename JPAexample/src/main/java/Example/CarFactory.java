package Example;

public class CarFactory {
	
	private String factoryName;
	private int productCounts;
	
	CarFactory(String factoryName){
		this.factoryName = factoryName;
	}
	
	public void prduceCar(int produceNumber) {
		productCounts += produceNumber;
		CarCompany.carCompanyProducts += produceNumber;
	}
	
	public void showInfo() {
		System.out.println(factoryName + " 공장 : " 
	     + "현재까지 생산량 : " + productCounts);
	}
}
