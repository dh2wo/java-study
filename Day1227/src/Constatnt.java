
public class Constatnt {

	public static void main(String[] args) {
		//상수 (변하지 않는 값)
		//대입은 한번만 허용
		final int MAX_NUM = 100;
		//MAX_NUM = 120; 한번 더 대입하면 오류 
		System.out.println(MAX_NUM);
		
		final double PI = 3.14;
		System.out.println(PI);
		int radius = 4;
		System.out.println(radius * radius * PI);
	}
}
