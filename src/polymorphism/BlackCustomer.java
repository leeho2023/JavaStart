package polymorphism;
	
public class BlackCustomer extends Customer{
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected double bonusRatio;
		
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	public BlackCustomer() {
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "BLACK";
	}
	
	public BlackCustomer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	public int calcPrice(int price) {
		return price * 3;
	}
	
	public String showCustomerInfo() {
		return customerName + "님은 " + customerGrade + "LIST 이며 주의하시기 바랍니다.";
	}
	
	
	
}	
	