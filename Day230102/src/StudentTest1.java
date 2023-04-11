
public class StudentTest1 {

	public static void main(String[] args) {
		//Student 객체 생성
		Student student1 = new Student();
		student1.studentID = 123;
		student1.studentName = "홍길동";
		student1.grade = 3;
		student1.adress = "광주시 우산동";
		
		Student student2 = new Student();
		student2.studentID = 321;
		student2.studentName = "손오공";
		student2.grade = 2;
		student2.adress = "서울시 강남구";
		
		System.out.println(student1);
		student1.showStudentInfo();
		String name = student1.getStudentName();
		System.out.println(name);
		
		student1.setStudentName("홍동길"); //아래줄과 같다
		student1.studentName = "홍동길";
		student1.showStudentInfo();
		System.out.println();
		
//		student2.showStudentInfo();
//		String name2 = student2.getStudentName();
//		System.out.println(name2);
		
	}

}
