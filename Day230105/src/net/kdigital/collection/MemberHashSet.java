package net.kdigital.collection;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;

	public MemberHashSet(){
		hashSet = new HashSet<Member>();
	}

	public void addMember(Member member) {
		hashSet.add(member);
	}

	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();

		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showMemberById(int memberId) {		
		for(Member m : hashSet) {
			if(m.getMemberId() == memberId) {
				System.out.println(m);
				return;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
