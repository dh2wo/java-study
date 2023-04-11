
public class ContinueTest {
	public static void main(String[] args) {
		int total = 0; //더한 결과

		//1~100까지 더하는데 홀수만 더하기
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				continue;
//			}
//			total += i;
//		}
//		System.out.println(total);	
		
		//3의 배수만 출력
		for(int a = 1; a <= 100; a++) {
			if(a % 3 != 0) {
				continue;
			}
			System.out.println(a);
		}
		
	}
}
