package net.kdigital.interfaceTest;

//interface p.314
public interface Calc { //final처럼 정해진 값, 변경X, 설계도 역할
	double PI = 3.14;
	int ERROR = -99999999;

	//어기서는 구현X
	int add(int num1, int num2);
	int subsract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	void showInfo();

	default void desc() {
		System.out.println("정수 계산기를 구현");
	}

}
