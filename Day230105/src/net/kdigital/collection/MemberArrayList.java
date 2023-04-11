//p.410
package net.kdigital.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	private ArrayList<Member> list;

	public MemberArrayList() {
		list = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		list.add(member);
	}

	public boolean removeMember(int memberId) {
		for(int i = 0; i <list.size(); i++) {
			Member member = list.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				list.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
//		for(Member m : list) {
//			System.out.println(m);
//		}
//		System.out.println();
		
		//Collection : iterator
		Iterator<Member> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public void showMemberById(int memberId) {		
		for(Member m : list) {
			if(m.getMemberId() == memberId) {
				System.out.println(m);
				return;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
	}
}
