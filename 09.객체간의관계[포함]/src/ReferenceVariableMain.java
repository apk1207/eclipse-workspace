
public class ReferenceVariableMain {

	public static void main(String[] args) {
		System.out.println("---------reference variable assignment----------");
		Account account1=new Account(1234, "김경미", 56000, 3.5);
		Account account2=account1;
		Account account3=new Account(9090, "김수미", 89000, 5.9);
		
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		account1.print();
		account2.print();
		account1.setOwner("김선미");
		account1.print();
		account2.print();
		
		System.out.println("--------------reference variable compare(== ,!=)-----------");
		if(account1==account2) {
			System.out.println("주소값이동일하다-->"+account1+"=="+account2);
		}
		if(account1!=account3) {
			System.out.println("주소값이동일안하다-->"+account1+"!="+account3);
		}
		System.out.println("-------------reference variable swap[주소값교환]------------");
		Account a1=new Account(1000,"일천님", 3000, 3.0);
		Account a2=new Account(2000,"이천님", 8000, 8.8);
		System.out.println("--swap전--");
		a1.print();
		a2.print();
		
		Account tempAccount =a1;
		a1=a2;
		a2=tempAccount;
		
		System.out.println("--swap후--");
		a1.print();
		a2.print();
		
		
		System.out.println("--------reference variable null valie---------------");
		/*
		 * null : 객체주소 리터럴
		 * 		- 객체주소 초기화의 용도로 사용
		 * 		- null주소를 사용해서 멤버에 접근시에는 NullPointerException 예외가 발생하고 프로그램이 종료된다.
		 */
		
		Account account = null;
		
		if(account == null) {
			account = new Account(9000, "구천이", 99000,  9.9);
		}
		account.print();
		
		
	}

}