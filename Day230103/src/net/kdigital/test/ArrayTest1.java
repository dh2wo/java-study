package net.kdigital.test;

public class ArrayTest1 {
	public static void main(String[] args) {
		int length = 5;
		int[] studentIDs = new int[length];
		System.out.println(studentIDs.length);
		
		for(int i = 0, j = 1001; i < length; i++, j++) {
			studentIDs[i] = j;
		}
		
		for(int i = 0; i < studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}
		
		//
		int count = 0;
		
		String[] arrays = new String[5];
		arrays[0] = "안녕하세요."; count++;
		arrays[1] = "반갑습니다."; count++;

		for(int i = 0; i < count; i++) {
			System.out.println(arrays[i]);
		}
		
		//
		int[] ids = {1,2,3,4,5};
		for(int i = 0; i < ids.length; i++) {
			System.out.print(ids[i]);
		}
		//위와 같은 방법
//		int[] ids;
//		ids = new int[] {1,2,3,4,5};
	}
}