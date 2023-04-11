import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		
		while(true) {
			menu();
			choice = sc.nextLine();
			switch(choice) {
			case "1":
				//등록메서드 호출
				break;
			case "2":
				//검색메서드 호출 search()
				break;
			case "0":
				System.out.println("프로그램 종료!");
				return;
			}

		}
	}

	public static void menu() {
		System.out.println("   << 헬스장 회원관리 >>");
		System.out.println("     1. 회원 등록");
		System.out.println("     2. 회원 검색");
		System.out.println("     3. 회원정보 수정");
		System.out.println("     4. 회원탈퇴");
		System.out.println("     0. 프로그램 종료");
		System.out.println("=====================");
		System.out.print("     선택 > ");
	}
}
