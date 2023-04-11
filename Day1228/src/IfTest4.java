import java.util.Scanner;

public class IfTest4 {
	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적: ");
		score = sc.nextInt();
		
		if (score < 0 || score > 100) { //미리
			System.out.println("0~100까지의 정수로 입력하세요.");
			return;
		}
		
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		System.out.println("학점: " + grade);
	}
}
