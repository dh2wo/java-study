
public class Person {
	private int age;
	private String name;
	private boolean isMarried;
	private int childrenCnt;

	//생성자 위치
	//디폴드 생성자
	public Person() {
		this(80);
	}
	
	public Person(int age) {
		System.out.println("age를 매개변수로 하는 생성자");
		this.age = age;
	}
	
	public Person(int age, String name, boolean isMarried, int childrenCnt) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.childrenCnt = childrenCnt;
	}
	
	// alt + shift + s -> getter/setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public int getChildrenCnt() {
		return childrenCnt;
	}

	public void setChildrenCnt(int childrenCnt) {
		this.childrenCnt = childrenCnt;
	}

	public void showPersonInfo() {
		System.out.println("이 사람의 나이 : " + age);
		System.out.println("이 사람의 이름 : " + name);
		System.out.println("이 사람의 결혼 여부 : " + isMarried);
		System.out.println("이 사람의 자녀 수" + " : " + childrenCnt);
		System.out.println();

//		System.out.printf("나이 : %d%n이름 : %s%n", age, name);
	}
}
