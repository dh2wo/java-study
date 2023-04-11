
public class Operator3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		//관계연산자
		boolean bool = (a > b);
		System.out.println(bool);
		bool = (a < b);
		System.out.println(bool);
		bool = (a >= b);
		System.out.println(bool);
		bool = (a <= b);
		System.out.println(bool);
		bool = (a == b);
		System.out.println(bool);
		bool = (a != b);
		System.out.println(bool);

		//논리연산자
		//&&, ||, !
		//(조건식) 논리연산자 (조건식)
		int c = 3;
		bool = (a > b) && (b < c);
		System.out.println(bool);
		bool = (a > b) || (b < c);
		System.out.println(bool);
		bool = !(a > b);
		System.out.println(bool);
		
	}
}
