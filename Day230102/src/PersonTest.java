
public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
//		p.setAge(40);
//		System.out.println(p.getAge());
		System.out.println(p.getAge());
		p.showPersonInfo();

//		p.age = 40;
//		p.name = "James";
//		p.isMarried = true;
//		p.childrenCnt = 3;
//		p.showPersonInfo();
				
//		Person p2 = new Person(50);
//		p2.name = "Tom";
//		p2.isMarried = false;
//		p2.childrenCnt = 0;
//		p2.showPersonInfo();
		
		Person p3 = new Person(30, "홍길동", true, 0); //private일 때 접근가능 / + get(), set() 2가지가 있다.
		p3.showPersonInfo();
		
	}

}
