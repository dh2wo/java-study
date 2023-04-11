
public class SwitchTest3 {
	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
		case "Gold" : 
			System.out.println("금메달입니다.");
			break;
		case "Sliver" : 
			System.out.println("은메달입니다.");
			break;
		case "Bronze" : 
			System.out.println("동메달입니다.");
			break;
		default : 
			System.out.println("메달이 없습니다.");
		}
		
		//if문 사용
//		if (medal.equals("Gold")) {
//			System.out.println("금메달입니다.");
//		}
//		else if (medal.equals("Sliver")) {
//			System.out.println("은메달입니다.");
//		}
		
	}
}
