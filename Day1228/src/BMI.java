import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		//BMI : 체질량지수
		//몸무게 / (키(m)의 제곱)
		Scanner sc = new Scanner(System.in);
		
		//이름: 홍길동
		System.out.print("이름: ");
		String name = sc.next();
		
		//키: (소수점) (cm)
		System.out.print("키(cm): ");
		double height = sc.nextDouble();
		
		//몸무게: (소수점) (kg)
		System.out.print("몸무게(kg): ");
		double weight = sc.nextDouble();
		
		height /= 100; 
		
		double bmi = weight / (height * height);
		
		//BMI: (소수점)
		System.out.println("BMI: " + bmi);
		
		//BMI결과를 기준으로 정상, 저체중 등 결과 출력
		String result;
		
		if (bmi >= 25) {
			result = "비만";
		}
		else if (bmi >= 23) {
			result = "과체중";
		}
		else if (bmi >= 18.5) {
			result = "정상";
		}
		else {
			result = "저체중";
		}
		System.out.println("체질량 검사 결과: " + result);
		
		switch(result) {
		case "비만" :
			System.out.println(name + "님, 건강을 위해 조금 줄이세요.");
			break;
		case "과체중" :
			System.out.println(name + "님, 조금 줄이세요.");
			break;
		case "정상" :
			System.out.println(name + "님, 유지하세요.");
			break;
		case "저체중" :
			System.out.println(name + "님, 많이드세요.");
			break;
		}
	}
}
