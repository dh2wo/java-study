import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		//3개의 정수를 입력받아서 가장 큰 수 구하기
		System.out.print("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
		System.out.print("세 번째 정수 입력 : ");
		num3 = sc.nextInt();
		
		// 가장 큰 수 판별
		int max = num1;
		
		if(max < num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		
		//가장 큰 수 출력
//		System.out.print(num1 + ", ");
//		System.out.print(num2 + ", ");
//		System.out.print(num3 + " ");
//		System.out.print("중 가장 큰 수는 " + max + "입니다.");
		
		System.out.printf("%d, %d, %d 중 가장 큰 수는 %d입니다.", num1, num2, num3, max);
	}
}
