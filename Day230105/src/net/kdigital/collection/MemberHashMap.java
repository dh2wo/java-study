//p.440 많이 사용
package net.kdigital.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>(); //<key, value> 
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
//		Set<Integer> kSet = map.keySet();
//		Iterator<Integer> iter = kSet.iterator(); 아래를 두 줄로 쪼갠 것
		Iterator<Integer> iter = hashMap.keySet().iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			Member m = hashMap.get(key);
		}
		System.out.println();
	}
}
