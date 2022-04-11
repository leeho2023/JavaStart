package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company = Company.getInstance();
		Car car1 = company.createCar();
		Car car2 = company.createCar();
		System.out.println(car1.getCarNum());
		System.out.println(car2.getCarNum());
		
		
//			Company myCompany1 = Company.getInstance();
//			Company myCompany2 = Company.getInstance();
//			
//			System.out.println(myCompany1 == myCompany2);
	}

}
