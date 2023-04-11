
public class Operator2 {
	public static void main(String[] args) {
		//증가 감소 연산자
		//++, --
		int num = 10;
		num++;
		num--;
		++num;
		--num;
		System.out.println(num);
		
		int num2 = num++;
		System.out.println(num2);
		System.out.println(num);
		
		int num3 = ++num;
		System.out.println(num3);
				
	}
}
