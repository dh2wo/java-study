
public class IC {
	public static void main(String[] args) {
		//자동형변환(묵시적 형변환)
		int n = 10;
		double dnum = n;
		System.out.println(dnum);
		
		//1번
		byte bNum = 10;
		int iNum = bNum;
		
		//2번(정수 -> 실수)
		int iNum2 = 20;
		float fNum = iNum2;
		//연산
		double dNum;
		dNum = fNum + iNum2;
		System.out.println(dNum);
	
		//명시적형변환 (강제형변환)
		int iNum3 = 10;
		byte bNum2 = (byte)iNum3;
		System.out.println(bNum2);
		
		double dNum2 = 3.14;
		iNum3 = (int)dNum2;
		System.out.println(iNum3);
		
		
	}
	
}
