import java.util.ArrayList;

public class ComputerTest {
	public static void main(String[] args) {
		//Computer c1 = new Computer(); //추상클래스
		Computer c2 = new DeskTop();  //일반클래스
		//Computer c3 = new NoteBook(); //추상클래스
		Computer c4 = new MyNoteBook(); //일반클래스
		//추상클래스는 객체 생성(new)을 못한다.

		c2.display();
		c2.typing();

		c4.display();
		c4.typing();
		c4.turnOn();
		
		//final 상수 -> 변화X, 대문자
		final int NUM; 
		NUM = 10;
		
		System.out.println(Define.GOOD_MORNIG);
		System.out.println(Define.MAX);
		System.out.println(Define.MIN);
		System.out.println(Define.PI);

	}
	
}
