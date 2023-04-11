import java.util.Scanner;

public class SwitchTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String floor;
		
		System.out.print("몇층?: ");
		floor = sc.next();
		
		switch(floor) {
		case "1" :
			System.out.println("1층 약국입니다.");
			break;
		case "2" :
			System.out.println("2층 정형외과입니다.");
			break;
		case "3" :
			System.out.println("3층 피부과입니다.");
			break;
		case "4" :
			System.out.println("4층 치과입니다.");
			break;
		case "5" :
			System.out.println("5층 헬스 클럽입니다.");
			break;
		default :
			System.out.println("없는 층입니다.");
		}
	}
}
