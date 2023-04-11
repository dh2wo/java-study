
public class StudentTest2 {
	public static void main(String[] args) {
		
//		System.out.println(Student.serialNum); //static
//		Student.showSerialNum();
		
		Student s1 = new Student();
		s1.studentName = "이지원";
		System.out.println(s1.studentName);
//		System.out.println(s1.studentID);
//		System.out.println(s1.serialNum);
		System.out.println(s1.cardNo);

		Student s2 = new Student();
		s2.studentName = "손수경";
		System.out.println(s2.studentName);
//		System.out.println(s2.studentID);
//		System.out.println(s2.serialNum); //static이 있어서 1000이 아니라 1001
		System.out.println(s2.cardNo);
		
	}

}
