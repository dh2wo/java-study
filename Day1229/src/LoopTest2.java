
public class LoopTest2 {
	public static void main(String[] args) {
		//for
		for(int i = 10; i <= 100; i += 10) {
			System.out.print(i + " ");
		}
		System.out.println();

		for(int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		for(int i = 10000; i >= 1; i /= 10) {
			System.out.print(i + " ");
		}
		System.out.println();

		//while
		int j = 10;
		while(j <= 100) {
			System.out.print(j + " ");
			j += 10;
		}
		System.out.println();

		int k = 5;
		while(k >= 1) {
			System.out.print(k + " ");
			k--;
		}
		System.out.println();

		int n = 10000;
		while(n >= 1) {
			System.out.print(n + " ");
			n /= 10;
		}
	}
}
