
public class Operator6 {
	public static void main(String[] args) {
		//조건연산자(삼항연산자)
		//조건식 ? 결과1 : 결과2;
		int num = (5 > 3) ? 10 : 20;
		System.out.println(num);
		
		//
		int fatherAge =	45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);
		
		//
		int num2 = 10;
		boolean isEven = (num % 2 == 0) ? true : false;
		System.out.println(isEven);
		
	}

}
