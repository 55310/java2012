package Example;

public class CarCompany {

	private static CarCompany instance = new CarCompany();
	public static int carCompanyProducts = 0;
		
	//Step 1.
	private CarCompany() { 
	}
	
	//Step 3.
	public static CarCompany getInstance() {
		if( instance == null) {
			instance = new CarCompany();
		}
		return instance;
	}
	
	// 
	public void showInfo() {
		System.out.println("회사 총 생산량 : " + carCompanyProducts);
	}

	
	
}
