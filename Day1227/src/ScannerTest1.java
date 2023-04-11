import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		//키보드로 입력한 값을 대입시켜주는 것을 도와주는 클래스
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		System.out.println(num);
		
		System.out.print("실수 입력: ");
		double dNum = sc.nextDouble();
		System.out.println(dNum);
		
		System.out.print("이름: ");
		String name = sc.next();
		System.out.println(name);
		
		sc.nextLine(); //버퍼에서 엔터키 제거
		System.out.print("주소: ");
		String addr = sc.nextLine();
		System.out.println(addr);
								
	}
}
