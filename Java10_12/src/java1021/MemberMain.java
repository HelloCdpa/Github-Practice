package java1021;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int check;
		List<MemberDTO> memberList = new ArrayList<>();
		MemberService m = new MemberService();

		// 회원가입, 회원조회, 로그인, 회원정보 변경을 위한 메서드 있음.
		// DTO - 데이터 저장 
		// Main 메서드 - 최종데이터 리스트를 관리
		// Service - 메서드 관리
		// 리스트에 있는 데이터가 변경됐을 때 리턴을 넘겨주자

		while (run) {
			System.out.println("1.회원가입 2.회원조회 3.로그인 4.회원정보 변경 5.종료");
			check = scan.nextInt();

			switch (check) {

			case 1:
				memberList = m.memberJoin(memberList);
				break;
			case 2:
				m.memberListView(memberList);
				break;
			case 3:
				m.memberLogin(memberList);
				break;
			case 4:
				memberList = m.memberUpdate(memberList);
				break;
			case 5:
				run = false;
				break;
			}

		}

	}

}
