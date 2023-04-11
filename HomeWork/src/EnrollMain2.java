import java.util.Scanner;

//Reader 클래스를 Main에 넣을 경우
//class Reader extends Man implements Speakable {
//
//	public Reader(String name) {
//		super(name);
//	}
//
//	@Override
//	public String speak() {
//		return super.getName() + " 독자는 자바를 잘하고 싶다!!";
//	}
//}


public class EnrollMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = null;
		String choice = sc.next();

		Speakable[] speakable = new Speakable[2];

		System.out.println("Speaker 등록 메인 메뉴입니다. 단 2명만 등록할 수 있습니다.");

		for(int i = 0; i < speakable.length; i++) {
			System.out.println("어떤 Speaker를 등록하는지 선택하세요.");
			System.out.println("1. Reader 등록");
			System.out.println("2. Worker 등록");
			choice = sc.next();

			System.out.println("이름을 입력하세요.");
			name = sc.next();

			switch(choice) {
			case "1":
				speakable[i] = new Reader(name);
				break;
			case "2":
				speakable[i] = new Worker(name);
				break;
			default:
				System.out.println("다시 입력하세요.");

			}

		}

		System.out.println("두 명 Speaker의 등록이 완료되었습니다.");
		System.out.println("이제 Speaker들의 speak 실행 결과입니다.");

		for(Speakable s : speakable) {
			System.out.println(s.speak());
		}

	}

}