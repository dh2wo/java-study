package net.kdigital.test;

import java.util.ArrayList;
import java.util.Scanner;
import net.kdigital.vo.Student;

public class ArrayTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name, adress;
		int grade, size = 0;

		//ArrayList<자료형> 변수명 = new ArrayList<자료형(생략가능)>();
		ArrayList<Student> list = new ArrayList<>();
//		list.add(new Student("홍길동", 3, "광주시"));
//		System.out.println(list);
//		System.out.println(list.get(0));

		while(true) {
			//입력작업
			//add
			System.out.print("이름 : ");
			name = sc.nextLine();
			if(name.equals("exit")) break;
			System.out.print("학년 : ");
			grade = sc.nextInt();
			sc.nextLine();
			System.out.print("주소 : ");
			adress = sc.nextLine();
			
			list.add(new Student(name, grade, adress));
			size++;
			System.out.println(size + "명 등록완료!");
		}
		
		//
		System.out.println(list.size()); //n(명)
		System.out.println(list.isEmpty()); //false
		System.out.println(list.remove(0)); 

		for(Student s : list ) {
			System.out.println(s);
		}
	}
}
