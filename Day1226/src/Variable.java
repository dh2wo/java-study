
public class Variable {

	public static void main(String[] args) {
		//기본 자료형
		//byte, short, int, long (정수형)
		//float, double (실수형)
		//char (문자)
		//boolean (논리형)
		
		int level; //변수 선언
		level = 0; //변수에 값 대입
		System.out.println(level);
		level = 1;
		System.out.println(level);
		
		int age = 26;
		System.out.println(age);
		
		long longNumber = 2312312L;
		System.out.println(longNumber);
		float fNumber = 3.14f;
		System.out.println(fNumber);
	
		char ch = 'A';
		System.out.println(ch + 1);
		System.out.println((char)(ch + 1));

		ch = 'B';
		System.out.println(ch);
		System.out.println((int)ch);
		
		
		char ch1 = 'Z';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		int ch2 = 38;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 97;
		System.out.println(ch3);
		System.out.println((char)ch3);

		
		boolean bool = false;
		bool = true; 
		System.out.println(bool);
	}

}
