package example;

public class AccountExceptionMain {

	public static void main(String[] args) {
		Account account=new Account(1111, "김수민", 80000, 3.0);
		
		/******case1[return]******************
		boolean isSuccess = account.withDraw(90000);
		if(isSuccess) {
			System.out.println(">> 출금성공");
			account.print();
		}else {
			System.out.println(">> 출금실패(잔고부족)");
			account.print();
		}
		*/
		account.print();
		try {
			account.withDraw(90000);
			System.out.println(">>출금성공");
			account.print();
		} catch (InsufficientBalanceException e) {
			System.err.println(">>출금실패:"+e.getMessage());
			account.print();
			
		}
	}

}