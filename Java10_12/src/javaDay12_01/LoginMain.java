package javaDay12_01;
import java.util.*;
public class LoginMain {

	public static void main(String[] args) {

		
		List<Login> loginList = new ArrayList<>();
		
		Login login = new Login("phl1021","Çý¸°",1234);
		Login login2 = new Login();
		
		loginList.add(login);
		
		loginList.add(login2);
		
		login2.setName("¹ÎÁ¤");
		login2.setId("eowjs269");
		login2.setPassword(1111);
		
		
		System.out.println(loginList.get(0));
		System.out.println(loginList.get(1));
		
		login.setName("¹Ú¾¾");
		System.out.println(loginList.get(0));
		
		for(int i=0; i<loginList.size(); i++) {
			System.out.println(loginList.get(i));
			System.out.println(loginList.get(i).getPassword());
			System.out.println(loginList.get(i).toString());
		
		}
		
		for(Login l: loginList) {
			System.out.println(l);
			System.out.println(l.getId());
			System.out.println(l.toString());
		}
		
//		loginList.remove(0);
		System.out.println(loginList.get(0));
		
		
		
		
		
			
			
			
			
			
		
		
		
		
		
		
		
	}

}
