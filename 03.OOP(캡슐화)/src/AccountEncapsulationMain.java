
public class AccountEncapsulationMain {

	public static void main(String[] args) {
		/*
		 * 계좌객체생성
		 */
		Account account1 = new Account();
		
		/*
		 * 계좌데이타대입
		 */
		account1.setAccountData(1111, "KIM", 50000, 0.5);
		
		/*
		 * account1 8000원입급
		 */
		account1.deposit(8000);
		account1.headerPrint();
		account1.print();
		
		/*
		 * account1의 잔고받기
		 */
		int account1Balance = account1.getBalance();
		System.out.println("account1 잔고: "+account1Balance);
		
		/*
		 * account1계좌의 이율 1%증가
		 */
		account1.setIyul(account1.getIyul()+1.0);
		account1.print();
		System.out.println("------------------------------");
		System.out.println(">>은행 전체계좌 잔고 50원 증가");
		
		/*
		 * 은행계좌 전체생성
		 */
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();
		
		/*
		 * 은행계좌 데이타 초기화
		 */
		acc1.setAccountData(1111, "KIM", 89000, 3.5);
		acc2.setAccountData(2222, "LIM", 34000, 2.5);
		acc3.setAccountData(3333, "SIM", 12320, 1.9);
		
		/*
		 * 모든계좌잔고 50원 증가
		 */
		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);
		
		/*
		 * 모든계좌 출력
		 */
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		
		
		
	}

}
