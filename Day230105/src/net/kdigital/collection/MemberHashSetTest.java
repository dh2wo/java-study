//p.424
package net.kdigital.collection;

public class MemberHashSetTest {
	public static void main(String[] args) {
		
		MemberHashSet mhs = new MemberHashSet();
		
		//멤버추가
		Member lee = new Member(1001, "이지원");
		Member son = new Member(1002, "손민국");
		Member park = new Member(1003, "박서훤");
		
		mhs.addMember(lee);
		mhs.addMember(son);
		mhs.addMember(park);
		
		mhs.showAllMember();
		
		//아이디 중복 회원 추가
		Member hong = new Member(1003, "홍길동");
		mhs.addMember(hong);
		mhs.showAllMember();

		mhs.removeMember(hong.getMemberId());
		mhs.showAllMember();
	}

}
