
public class DoWhileTest {
	public static void main(String[] args) {
		//1부터 10까지 더하자
		int num = 1;
		int result = 0;
		
		do {
			result += num;
			num++;
		} while(num <= 10);
		System.out.println(result);
	}
}
