package net.kdigital.bmiproject.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.kdigital.bmiproject.vo.MemberVO;

public class MemberService {

	List<MemberVO> list = new ArrayList<>();
	
	public void add() {

	}

	public boolean memberAdd(MemberVO member) {
		return list.add(member);
	}

	public List<MemberVO> selectAll() {
		return list;
	}

	public MemberVO selectByID(String id) {
		for(MemberVO m : list) {
			if(id.equals(m.getID())) {
				return m;
			}
		}
		return null;
	}

	public void removeMember(MemberVO member) {
		list.remove(member);
	}

	public int updateMember(String id, double height, double weight) {
		for(MemberVO m : list) {
			if(id.equals(m.getID())) {
				m.setHeight(height);
				m.setWeight(weight);
			}
		}
		return 0;
	}

}
