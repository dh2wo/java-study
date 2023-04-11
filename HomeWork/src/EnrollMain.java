import java.util.Scanner;

public class EnrollMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		int choice;
		int userCnt = 2;
		int size = 0;

		Speakable[] user = new Speakable[userCnt];

		System.out.println("Speaker 등록 메인 메뉴입니다. 단 " + userCnt + "명만 등록할 수 있습니다.");

		for(int i = 0; i < userCnt; i++) {
			System.out.println("어떤 Speaker를 등록하는지 선택하세요.");
			System.out.println("1. Reader 등록");
			System.out.println("2. Worker 등록");
			choice = sc.nextInt();

			if(choice == 1) {
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				user[size] = new Reader(name);
				size++;

			}

			if(choice == 2) {
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				user[size] = new Worker(name);
				size++;
			}

		}

		System.out.println(userCnt + "명 Speaker의 등록이 완료되었습니다.");
		System.out.println("이제 Speaker들의 speak 실행 결과입니다.");

		for(Speakable s : user) {
			System.out.println(s.speak());
		}

	}

}


