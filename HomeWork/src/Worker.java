
public class Worker extends Man implements Speakable {

	//생성자
	public Worker(String name) {
		super(name);
	}

	//인스턴스 메소드
	@Override
	public String speak() {
		return super.getName() + " 일꾼은 자기가 맡은 일을 열심히 한다!!";
	}
}
