package java1021;

import java.util.*;

public class MemberService {
	Scanner scan = new Scanner(System.in);

	// 회원가입 메서드
	/*
	 * 주석 꼭 쓰기! 메서드 이름 : memberJoin (데이터를 추가)리턴 타입 : list <MemberDTO> 매개 변수 : list
	 * <memberDTO>
	 */
	List<MemberDTO> memberJoin(List<MemberDTO> memberList) {

		System.out.print("ID : ");
		String id = scan.nextLine();
		System.out.print("Password : ");
		String password = scan.nextLine();
		System.out.print("Name : ");
		String name = scan.nextLine();
		System.out.print("Email : ");
		String email = scan.nextLine();

		int num = memberList.size() + 1;
		MemberDTO m = new MemberDTO(num, id, password, name, email);
		memberList.add(m);

		m.setNum(memberList.size());
		System.out.println("회원가입 완료");

		return memberList;
	}

	// 회원정보 조회
	/*
	 * 메서드 이름 : memberListView 리턴 x : void 매개변수 : List<MemberDTO>
	 */
	void memberListView(List<MemberDTO> memberList) {

		for (MemberDTO m : memberList) {
			System.out.println(m.toString());
		}
	}

	// 로그인
	/*
	 * 메서드 이름 : memberLogin 리턴 x : void 매개변수 : List<MemberDTO>
	 */
	void memberLogin(List<MemberDTO> memberList) {

		System.out.print("아이디 : ");
		String id = scan.nextLine();

		System.out.print("비밀번호 : ");
		String password = scan.nextLine();

		for (int i = 0; i < memberList.size(); i++) {

			if (memberList.get(i).getId().equals(id) && memberList.get(i).getPassword().equals(password)) {
				System.out.println(id + "님 환영합니다");

			} else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			}
		}
	}

	// 회원 정보 변경
	/*
	 * 메서드 이름 : memberUpdate (데이터를 추가)리턴 타입 : list <MemberDTO> 매개 변수 : list
	 * <memberDTO>
	 */
	List<MemberDTO> memberUpdate(List<MemberDTO> memberList) {

		System.out.print("아이디 : ");
		String id = scan.nextLine();

		System.out.print("비밀번호 : ");
		String password = scan.nextLine();

		for (int i = 0; i < memberList.size(); i++) {

			if (memberList.get(i).getId().equals(id) && memberList.get(i).getPassword().equals(password)) {
				System.out.print("변경하실 이메일주소를 입력하세요 : ");
				String email = scan.nextLine();
				memberList.get(i).setEmail(email);

				System.out.println("이메일 변경 완료");

			} else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			}

		}
		return memberList;
	}

}
