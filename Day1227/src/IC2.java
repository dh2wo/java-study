
public class IC2 {
	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum;
		System.out.println(bNum);
		
		double dNum = 3.14;
		int iNum2 = (int)dNum;
		System.out.println(iNum2);
		
		char ch1 = 'A';
		System.out.println((int)ch1);
		
		int ch2 = 67;
		System.out.println((char)ch2);
		
		
		double dNum1 = 1.2;
		float fNum = 0.9f;
		
		int iNum3 = (int)dNum1 + (int)fNum;
		System.out.println(iNum3);

		int iNum4 = (int)(dNum1 + fNum);
		System.out.println(iNum4);
		 
		
	}
}
