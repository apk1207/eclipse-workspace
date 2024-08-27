
public class ReferenceTypeAccountArrayMain {

	public static void main(String[] args) {
		System.out.println("-----------{}를 이용한배열객체생성 초기화------");
		Account acc1=new Account(1111,"LEE",99999,2.8);
		Account[] accounts= {
				acc1,new Account(2222,"KIM",99000,3.5),new Account(3333,"PARK",78000,2.8),
				new Account(4444,"CHOI",34000,6.7),new Account(5555,"SIM",21000,5.5),new Account(6666,"JANG",89000,8.5),
				new Account(7777,"SOO",23000,1.8),new Account(8888,"MIN",12000,4.5),new Account(9999,"HONG",65000,1.5)
		};
		System.out.println("1.은행 총계좌수:"+accounts.length);
		
		System.out.println("2.은행계좌 전체출력");
		for (Account account : accounts) {
			account.print();
		}
		
		System.out.println("3.은행계좌 총잔고");
		int totBalance=0;
		for (Account account : accounts) {
			totBalance+=account.getBalance();
		}
		System.out.println(">> "+totBalance);

		System.out.println("4.은행 계좌들중에서 계좌번호 3333번계좌 한개 찾아서 출력(계좌번호는 중복되지않는다)");
		for (Account account : accounts) {
			if(account.getNo() == 3333) {
				account.print();
				break;
			}
		}
		
		System.out.println("5.은행 계좌들중에서 계좌잔고 50000원이상인 VIP계좌 여러개 찾아서 출력");
		for (Account account : accounts) {
			if(account.getBalance() >= 50000) {
				account.print();
			}
		}
		
		System.out.println("6.은행 계좌들중에서 계좌이율 5.0 이상인 계좌 여러개 찾아서 출력");
		for (Account account : accounts) {
			if(account.getIyul() >= 5.0) {
				account.print();
			}
		}
		
		System.out.println("6.은행 계좌들중에서 이름이 KIM인 계좌 여러개 찾아서 출력[String객체배우고난후에]");
		for (Account account : accounts) {
			if(account.getOwner().equals("KIM")) {
				account.print();
			}
		}
		
		System.out.println("7.6666번계좌 3000원입금");
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getNo()==6666) {
				System.out.println(">>입금전");
				accounts[i].print();
				accounts[i].deposit(3000);
				System.out.println(">>입금후");
				accounts[i].print();
				break;
			}
		}
		
		System.out.println("8.9999번계좌 3000원출금[Quiz]");
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getNo()==9999) {
				System.out.println(">>출금전");
				accounts[i].print();
				accounts[i].withDraw(3000);
				System.out.println(">>출금후");
				accounts[i].print();
				break;
			}
		}
		
		System.out.println("9.계좌잔고순으로 오름[내림]차순정렬");	

		System.out.println(">>>정렬전");
		for(int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			account.print();
		}
		
		// 1회 정렬--> 8번 실행
		for(int i = 0; i < accounts.length-1; i++) {
			for(int j = 0; j < accounts.length-1-i; j++) {
				if(accounts[j].getBalance() > accounts[j+1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
		}
			
		System.out.println(">>>정렬후");
		for(int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			account.print();
		}
		
		
		System.out.println("9.계좌번호순으로 오름(내림)차순정렬[Quiz]");
		System.out.println(">>>정렬전");
		for(int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			account.print();
		}
		
		// 1회 정렬--> 8번 실행
		for(int i = 0; i < accounts.length-1; i++) {
			for(int j = 0; j < accounts.length-1-i; j++) {
				if(accounts[j].getNo() > accounts[j+1].getNo()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
		}
			
		System.out.println(">>>정렬후");
		for(int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			account.print();
		}
		
		System.out.println("10.5555계좌한개 이율을 9.9으로변경");
		for (Account account : accounts) {
			if(account.getNo() == 5555) {
				account.print();
				account.setIyul(9.9);
				account.print();
				break;
			}
		}
		
		System.out.println("11.VIP계좌(잔고50000원이상)여러개 잔고 50원 증가");
		for ( int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance() >= 50000) {
				accounts[i].deposit(50);
				accounts[i].print();
			}
		}
		
	}

}