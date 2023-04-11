
public class AddTest {

	public static void main(String[] args) {
		//정수 2개를 더한다.
		int result = 0;
		int num1 = 10;
		int num2 = 20;

		result = add(num1, num2);
		System.out.println(result);

		//1~10까지 더한값 메서드 호출해서 출력
		result = getTenTotal();
		System.out.println(result);
		
		//
		printNumber(1000);
	}

	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static int getTenTotal() {
		int total = 0;
		for(int i = 1; i <=10; i++) {
			total += i;
		}
		return total;
	}
	//
	public static void printNumber(int num) {
		System.err.println(num);	
	}

}