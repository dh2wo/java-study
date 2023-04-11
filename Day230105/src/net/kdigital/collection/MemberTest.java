package net.kdigital.collection;


public class MemberTest {
	public static void main(String[] args) {
		
		MemberArrayList mal = new MemberArrayList();
		
		//멤버추가
		Member lee = new Member(1001, "이지원");
		mal.addMember(lee);
		Member son = new Member(1002, "손민국");
		mal.addMember(son);
		Member park = new Member(1003, "박서훤");
		mal.addMember(park);
		
		mal.showAllMember();
		
		//멤버 한명 삭제
		mal.removeMember(lee.getMemberId());
//		mal.removeMember(1002);
		
		//멤버 한명 출력
		mal.showMemberById(son.getMemberId());
		
		//멤버 전체 출력
		mal.showAllMember();
		
		
		//존재하지 않는 아이디 삭제
		mal.removeMember(lee.getMemberId()); 
		
	
	}

}