package net.kdigital.test;

import net.kdigital.vo.Student; 

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 3, "광주시");
//		String info = s1.toString();
//		System.out.println(info);
		System.out.println(s1); //(s1.toString) -> toString 생략
		
		//학생 2명 등록해서 화면에 출력
		Student s2 = new Student("둘리", 1, "서울시");
		System.out.println(s2);
		Student s3 = new Student("짱구", 2, "부산시");
		System.out.println(s3);
		System.out.println(s3.studentInfo());
		
	}

}
