
public class Student {
	static int serialNum = 1000;
	int studentID;
	int grade;
	int cardNo;
	String studentName;
	String adress;
	
	public Student() {
		serialNum++;
		this.studentID = serialNum;
		this.cardNo = studentID + 100;
	}
	
	public static void showSerialNum() {
		System.out.println(serialNum);
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + adress);
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

}
