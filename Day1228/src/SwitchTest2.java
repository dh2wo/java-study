
public class SwitchTest2 {
	public static void main(String[] args) {
		int day = 0;
		int month = 7;
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			day = 31;
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			day = 30;
			break;
		case 2 :
			day = 28;
			break;
		}
		System.out.println(month + "월은 " + day + "일 까지입니다.");
	}
}
