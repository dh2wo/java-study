package net.kdigital.vo;

public class VIPCustomer extends Customer{
	//Customer에서 상속받아서 쓸 필요X
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {
		super(); //Customer(부모) 생성자 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public VIPCustomer(int customerID, String customerName, int bonusPoint) {
		super(customerID, customerName, bonusPoint);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
	}

	@Override 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	//Getter
	public double getSaleRatio() {
		return saleRatio;
	}//

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "나는 VIP이다.";
	}
}
