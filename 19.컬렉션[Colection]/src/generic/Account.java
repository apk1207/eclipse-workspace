package generic;

public class Account implements Comparable<Account> {
	private int no;			//계좌번호
	private String owner;	//계좌주이름
	private int balance;	//계좌잔고
	private double iyul;	//계좌이율
	@Override
	public int compareTo(Account nextAccount) {
		/*
		 * << 오름차순 >>
		 *  - Collection.sort(accountList) 메쏘드가 이메쏘드를 호출한후 반환된결과를 받아서정렬(교환)한다
		 *  - 현재Account객체와 다음Account객체를 잔고를비교해서 앞의것이 더크다면 교환을해서 뒤로보내야한다.
		 *  - 그래서 현재Account객체의 잔고가 다음Account객체의 잔고보다 크다면 양수1 을 반환해준다.
		 *  - 양수1을 반환받은 Collection.sort()메쏘드는 현재Account객체와 다음Account객체의 주소교환작업을할것이다. 
		 */
		/*
		 * << 내림차순 >>
		 *  - Collection.sort(accountList) 메쏘드가 이메쏘드를 호출한후 반환된결과를 받아서정렬한다
		 *  - 현재Account객체와 다음Account객체를 비교해서 앞의것이 더작다면 교환을해서 뒤로보내야한다.
		 *  - 그래서 현재Account객체의 잔고가 다음Account객체의 잔고보다 작다면 양수1 을 반환해준다.
		 *  - 양수1을 반환받은 Collection.sort()메쏘드는 현재Account객체와 다음Account객체의 주소교환작업을할것이다. 
		 */
		/*
		 * 잔고오름차순
		 */
		if(this.balance > nextAccount.getBalance()) {
			return 1;
		}else {
			return -1;
		}
	}
	
	/**
	 * 기본값으로 초기화된계좌객체생성
	 */
	public Account() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 인자값으로 초기화된객체생성
	 * @param no 		계좌번호
	 * @param owner 	계좌주
	 * @param balance	잔고
	 * @param iyul		이율
	 */
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	/*
	 * 계좌데이타 대입
	 */
	public void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	/*
	 * 입금
	 */
	public void deposit(int money) {
		//balance=balance+money;
		balance+=money;
	}
	/*
	 * 출금
	 */
	public void withDraw(int money) {
		//balance=balance-money;
		balance-=money;
	}
	/*
	 * 계좌헤더출력
	 */
	public static void headerPrint() {
		System.out.println("------------------------");
		System.out.printf("%s %4s %4s %3s\n","번호","이름","잔고","이율");
		System.out.println("------------------------");
	}
	/*
	 * 계좌정보출력
	 */
	public void print() {
		System.out.printf("%d %5s %7d %5.2f\n",no,owner,balance,iyul);
	}
	
	/*
	 * << getter,setter메쏘드생성단축키 >>
	 * 
	 * alt+shift + s --> r
	 */
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	@Override
	public String toString() {
		return "\nAccount [no=" + no + ", owner=" + owner + ", balance=" + balance + ", iyul=" + iyul + "]";
	}
	
}