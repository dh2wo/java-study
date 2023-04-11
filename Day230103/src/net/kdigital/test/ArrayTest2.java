package net.kdigital.test;

import java.util.Scanner;

import net.kdigital.vo.Student;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 학생 수 : " );
		int StudentCnt = sc.nextInt();
		Student[] sArray = new Student[StudentCnt];
		
		String name, adress;
		int grade, size = 0; //학생등록 수

		while(size < StudentCnt) {
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("학년 : ");
			grade = sc.nextInt();
			sc.nextLine(); //버퍼에 있는 엔터키 제거
			System.out.print("주소 : ");
			adress = sc.nextLine();
			
			sArray[size] = new Student(name, grade, adress);
			size++;
			System.out.println(size + "명 등록완료!");
			
		}
		
//		for(int i = 0; i < sArray.length; i++) {
//			System.out.println(sArray[i]);
//		}
		
		//향상된 for문과 배열, 배열만 가능
		for(Student s : sArray) {
			System.out.println(s);
		}
		
	}
}
