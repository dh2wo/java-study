import java.util.Scanner;

public class IfTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("집에서 놉니다.");
		}
		
		//국어점수가 80점 이상이면 우수 아니면 보통
		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		
		if (kor >= 80) {
			System.out.println("우수");
		}
		else {
			System.out.print("보통");
		}
		
		//조건연산자(삼항연산자)
		String msg = (kor >= 80) ? "우수" : "보통";
		System.out.println(msg);
	}
}
