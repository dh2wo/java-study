
public class WhileTest {
	public static void main(String[] args) {
		//1부터 10까지 더하자
		int num = 1; //더할 수
		int result = 0; //더한 결과
		
		while(num <= 10) {
			result += num;
			num++;
		}
		System.out.println(result);
	}
}
