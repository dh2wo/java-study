package net.kdigital.test;

import net.kdigital.vo.Customer;
import net.kdigital.vo.VIPCustomer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer(10010, "이순신", 1000);
//		c1.setCustomerID(10010);
//		c1.setCustomerName("이순신");
//		c1.setBonusPoint(1000);
		System.out.println(c1.showCustomerInfo());
		
		VIPCustomer v1 = new VIPCustomer(10020, "김유신", 10000);
//		v1.setCustomerID(10020);
//		v1.setCustomerName("김유신");
//		v1.setBonusPoint(10000);
		System.out.println(v1.showCustomerInfo());
		
		Customer c2 = new VIPCustomer(10030, "임꺽정", 1000);
		System.out.println(c2.showCustomerInfo());
		System.out.println(c2.calcPrice(10000));
		
		
	}
}
