package net.kdigital.vo;
//★
public class Student extends Object{ //extends Object는 평소에 생략되어 있다.
	//멤버변수
	private static int serialNum = 1000;
	private int studentID;
	private String studentName;
	private int grade;
	private String adress;
	private int cardNo;

	//생성자 
	public Student(String studentName, int grade, String adress) {
		serialNum++;
		this.studentID = serialNum;
		this.cardNo = studentID + 100;
		this.studentName = studentName;
		this.grade = grade;
		this.adress = adress;
	}

	//Getter/Setter -> Alt + Shift + S
	public int getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCardNo() {
		return cardNo;
	}
	//바뀔 수 없는것은 set X (StudentID, CardNo)


	@Override // toString() -> Alt + Shift + S (상속)
	public String toString() {
		return "학번 : " + studentID + ", 이름 : " + studentName + ", 학년 : " + grade + ", 주소 : "
				+ adress + ", 카드번호 : " + cardNo;
	}
	
	public String studentInfo() {
		return "학번 : " + studentID + ", 이름 : " + studentName ;
	}
	
}
