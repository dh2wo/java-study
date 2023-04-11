
public class LoopTest1 {
	public static void main(String[] args) {
		int i = 0;
		
		//0~9
		for(i = 0; i <= 9; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		while(i <= 9) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		//1~10
		for(i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		//홀수
		for(i = 1; i <= 9; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		while(i <= 9) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		//짝수
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		while(i <= 10) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
			i++;
		}
		
	}
}
