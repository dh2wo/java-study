import java.util.Scanner;

public class IfTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " : 짝수입니다.");
		}
		else {
			System.out.println(num + " : 홀수입니다.");
		}
	}
}
