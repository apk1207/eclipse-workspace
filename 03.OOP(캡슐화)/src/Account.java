/**
 은행에서 계좌객체를 생성할클래스
 @author 김수한무
 @version 0.001
 */
public class Account {
	private int no;			//계좌번호
	private String owner;	//계좌주이름
	private int balance;	//계좌잔고
	private double iyul;	//계좌이율
	
	/*
	 * 계좌데이타 대입
	 */
	/**
	 * 계좌데이타대입메쏘드
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 잔고
	 * @param iyul 이율(%)
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
	/**
	 * 입금메쏘드
	 * @param money 입금할돈
	 */
	public void deposit(int money) {
		//balance=balance+money;
		balance+=money;
	}
	/*
	 * 출금
	 */
	/**
	 * 출금메쏘드
	 * @param money 출금할돈
	 */
	public void withDraw(int money) {
		//balance=balance-money;
		balance-=money;
	}
	/*
	 * 계좌헤더출력
	 */
	public void headerPrint() {
		System.out.println("----------------------");
		System.out.printf("%s %s %4s %3s\n","번호","이름","잔고","이율");
		System.out.println("---------------------");
	}
	/*
	 * 계좌정보출력
	 */
	public void print() {
		System.out.printf("%d %s %8d %.2f\n",no,owner,balance,iyul);
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
	/**
	 * 계좌주대입
	 * @param owner 계좌주
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * 잔고반환메쏘드
	 * @return  잔고
	 */
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
	
	
	
}