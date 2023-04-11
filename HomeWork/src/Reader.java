
public class Reader extends Man implements Speakable {
	
	//생성자
	public Reader(String name) {
		super(name);
	}

	//인스턴스 메소드
	@Override
	public String speak() {
		return super.getName() + " 독자는 자바를 잘하고 싶다!!";
	}
}
