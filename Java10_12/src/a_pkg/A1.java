package a_pkg;

import b_pkg.B1;

//소속 : a_pkg
//접근제한자 : public
//서로 다른 패키지에 소속 : import를 해준다
public class A1 {
	public static void main(String[] args) {
	
	B1 b1 = new B1();
	
	b1.b = "aa";
	//not visiable : 보이지 않는다 = 접근이 불가능하다 
//	b1.a = "bbb";
	
	//다른 패키지 A1 클래스가 default B3를 사용 할수 있는지
	// 같은 패키지에서만 접근 가능
	B3 b3 = new B3();
	
	
	
}
}