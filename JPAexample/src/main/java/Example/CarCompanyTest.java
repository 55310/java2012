package Example;

public class CarCompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarCompany hyundai = CarCompany.getInstance();
		hyundai.showInfo();
		
		CarFactory cheongju = new CarFactory("청주");
		cheongju.prduceCar(1000);
		cheongju.showInfo();
		hyundai.showInfo();
		
		CarCompany usahyundai = CarCompany.getInstance();
		CarFactory usa = new CarFactory("미국");
		usa.prduceCar(500);
		usa.showInfo();
		usahyundai.showInfo();

	}

}
