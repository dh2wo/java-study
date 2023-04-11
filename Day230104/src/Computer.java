
public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	public final void turnOn() { //final로 다른 클래스에서 재정의 X, 자식 X
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
}
