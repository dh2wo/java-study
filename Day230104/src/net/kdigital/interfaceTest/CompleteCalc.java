package net.kdigital.interfaceTest;

public class CompleteCalc extends Calculator {

	//Calculator에서도 구현하지 않은 것 상속으로 구현
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		else {
			return Calc.ERROR;
		}

	}
	
	@Override
	public int square(int num) {
		return num * num;
	}
	
	
	@Override
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

}
