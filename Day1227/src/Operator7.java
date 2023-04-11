
public class Operator7 {

	public static void main(String[] args) {
		//Q3
		int num3 = 10;
		System.out.println(num3);
		System.out.println(num3++);
		System.out.println(num3);
		System.out.println(--num3);

		//Q4
		int num4 = 10;
		int num5 = 20;
		boolean result;

		result = ((num4 > 10) && (num5 > 10));
		System.out.println(result);
		result = ((num4 > 10) || (num5 > 10));
		System.out.println(result);
		System.out.println(!result);

		//Q7
		int num7 = 10;
		int num8 = 20;

		int result2 = (num7 >= 10) ? num8 + 10 : num8 - 10;
		System.out.println(result2);

	}

}
