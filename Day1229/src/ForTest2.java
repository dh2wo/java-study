
public class ForTest2 {
	public static void main(String[] args) {

//		for(int i = 1; i <= 10; i++) {
//			System.out.println("안녕하세요" + i);
//		}
		
		int dan, times;
		
		//구구단 출력
		for(dan = 1; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + (dan * times));
			}
			System.out.println();
		}
		
		//짝수 단만 출력
		for(dan = 1; dan <= 9; dan++) {
			if(dan %2 != 0) {
				continue;
			}
			for (times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + (dan * times));
			}
			System.out.println();
		}
	}
}

