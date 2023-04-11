
public class Operator1 {
	public static void main(String[] args) {
		
		int num = 10;
		//부호연산자(+, -)
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		
		num = -num;
		System.out.println(num);	
		System.out.println(-num);
		
		//산술연산자(+, -, *, /, %)
		int num2 = 10 % 3;
		System.out.println(num2);
		
		double num3 = 10 / 3.0;
		System.out.println(num3);
		
		//
		int mathScore = 90;
		int engScore = 70;
		int korScore = 85;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);

	}
}
