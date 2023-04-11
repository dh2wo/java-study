//p.441
package net.kdigital.collection;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap mhm = new MemberHashMap();

		//멤버추가
		Member lee = new Member(1001, "이지원");
		Member son = new Member(1002, "손민국");
		Member park = new Member(1003, "박서훤");
		Member hong = new Member(1004, "홍길동");
		
		mhm.addMember(lee);
		mhm.addMember(son);
		mhm.addMember(park);
		mhm.addMember(hong);
		
		mhm.showAllMember();
		
		//회원삭제
		mhm.removeMember(1004);
		mhm.showAllMember();
	}

}
