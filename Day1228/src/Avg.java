import java.util.Scanner;

public class Avg {
	public static void main(String[] args) {
		//평균 구하기
		//국어, 영어, 수학
		//총점, 평균 구해서 결과 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수: ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수: ");
		int mat = sc.nextInt();
		
		int totalscore = kor + eng + mat;
		double avg = totalscore / 3.0;
		
		System.out.println("총점: " + totalscore);
		System.out.println("평균: " + avg);
		
		//평균을 기준으로 등급
		char grade;
		
		if (avg >= 90) {
			grade = 'A';
		}
		else if (avg >= 80) {
			grade = 'B';
		}
		else if (avg >= 70) {
			grade = 'C';
		}
		else if (avg >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("등급: " + grade);
	}
}
