
public class DeskTop extends Computer { 
	
	//Computer 클래스에서 미구현된 display, typing 구현
	@Override
	public void display() {
		System.out.println("모니터로 출력");
	}

	@Override
	public void typing() {
		System.out.println("기계식 키보드로 타이핑");

	}

//	public void void turnOn() { //Computer 클래스의 final로 오류
//		System.out.println("본체 전원을 켭니다.");
//	}

}
