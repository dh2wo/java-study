
public class LoopTest3 {
	public static void main(String[] args) {
		//for
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 ==0) {
				System.out.println(i);
				break;
			}
		}

		for(int i = 1; i <= 20; i++) {
			if(i % 3 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		//while
		int i = 1;
		int cnt = 0; //발견 횟수

		while(true) {
			if((i % 5 == 0) && (i % 7 ==0)) {
				System.out.print(i + " ");
				cnt++;				
			}
			if(cnt == 3) break; {
				i++;
			}
		}

		while(i <= 20) {
			if(i % 3 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}

	}
}
