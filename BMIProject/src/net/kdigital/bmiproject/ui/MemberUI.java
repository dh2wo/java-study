package net.kdigital.bmiproject.ui;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import net.kdigital.bmiproject.service.MemberService;
import net.kdigital.bmiproject.vo.MemberVO;

public class MemberUI {
	Scanner sc = new Scanner(System.in);
	MemberService service = new MemberService();
	private String id;

	public MemberUI(){
		String choice;

		while(true){
			menu();
			choice = sc.next();

			switch(choice) {
			case "1": //회원 등록
				memberAdd();
				break;
			case "2": //회원정보 조회(1명)
				selectByID();
				break;
			case "3": //회원정보 수정
				updateMember();
				break;
			case "4": //회원전체조회
				selectAll();
				break;
			case "5": //회원탈퇴
				removeMember();
				break;
			case "0": //프로그램 종료
				System.out.println("** 프로그램 종료");
				return;
			default:
				System.out.println("** 다시 선택하세요.");
				break;
			}
		}
	}

	//1. 회원 등록
	private void memberAdd() {
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		System.out.println("** 등록완료!");

		MemberVO member = new MemberVO(id, name, height, weight);
		boolean result = service.memberAdd(member);
	}

	//2. 회원정보 조회
	private void selectByID() {
		System.out.print(">> 검색할 회원의 ID : ");
		String id = sc.next();
		MemberVO member = service.selectByID(id);
		if(member != null) {
			System.out.println(member);
			return;
		}
		System.out.println("** 해당 ID의 회원은 존재하지 않습니다.");
	}

	//3. 회원정보 수정
	private void updateMember() {
		System.out.print(">> 수정할 회원의 ID : ");
		String id = sc.next();
		//해당 id가 존재하는지
		MemberVO member = service.selectByID(id);
		if(member == null) {
			System.out.println("** 해당 ID의 회원은 존재하지 않습니다.");
			return;
		}
		//존재한다면 그 회원정보를 출력
		System.out.println(member);

		System.out.print("키 : " );
		double height = sc.nextDouble();
		System.out.print("몸무게 : " );
		double weight = sc.nextDouble();
		int result = service.updateMember(id, height, weight);
		if (result == 0){
			System.out.println("** 해당 멤버 수정에 실패하였습니다.");
			return;
		}
		System.out.println("** 해당 멤버 수정에 성공하였습니다.ㅉ");
	}

	//4. 회원전체조회
	private void selectAll() {
		List<MemberVO> list = service.selectAll();
		if(list.isEmpty()) {
			System.out.println("** 회원이 존재하지 않습니다.");
			return;
		}
		Iterator<MemberVO> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	//5. 회원탈퇴
	private void removeMember() {
		System.out.print(">> 탈퇴할 회원의 ID : ");
		String id = sc.next();
		//해당 id가 존재하는지
		MemberVO member = service.selectByID(id);
		if(member == null) {
			System.out.println("** 해당 ID의 회원은 존재하지 않습니다.");
			return;
		}
		//존재한다면 그 회원정보를 화면에 출력
		System.out.println(member);
		System.out.print("탈퇴하시겠습니까? (Y/N) ");
		String yorn = sc.next();
		//Y를 입력하면 탈퇴진행
		if(yorn.equals("Y") || yorn.equals("y")) {
			//탈퇴작업
			service.removeMember(member);
			System.out.println("** 탈퇴 되었습니다.");
			return;
		}
		System.out.println("** 탈퇴 취소 되었습니다.");
	}

	public void menu() {
		System.out.println("   << BMI 회원관리 >>");
		System.out.println("    1. 회원 등록");
		System.out.println("    2. 회원정보 조회(1명)");
		System.out.println("    3. 회원정보 수정");
		System.out.println("    4. 회원전체조회");
		System.out.println("    5. 회원탈퇴");
		System.out.println("    0. 프로그램 종료");
		System.out.println("=====================");
		System.out.print("     선택 > ");
	}
}
