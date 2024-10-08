import java.util.ArrayList;
import java.util.Vector;

class Bank {
	private int balance = 0;

	public synchronized void addBalance(int won) {
		System.out.println("-----------"+Thread.currentThread().getName()+" addBalance start ---------------------");
		/*
		* 총잔고멤버필드를 총잔고임시변수대입
		*/
		int tempBalance = balance;
		System.out.println("3.[" + Thread.currentThread().getName() + "]" + "현재잔고 = " + tempBalance + " 입금액=" + won
				+ " 합계액=" + (tempBalance + won));
		/*
		총잔고임시변수값과 입금액을 더해서 총잔고계산후 총잔고 임시변수값에대입(누적)
		*/
		tempBalance += won;
		/*
		총잔고 임시변수값을 총잔고멤버필드에대입	
		*/
		this.balance = tempBalance;
		System.out.println("-----------"+Thread.currentThread().getName()+" addBalance end ---------------------");
		System.out.println();
	}

	public int getBalance() {
		return balance;
	}

}

 
class User extends Thread {
	Bank bank;
	public User(String name, Bank bank) {
		super(name);
		this.bank = bank;
	}

	public void run() {
		for (int i = 1; i <= 30; i++)
			try {
				Thread.sleep((int)(Math.random()*10)+1);
				bank.addBalance(1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}

public class SynchronizedBankThreadMain {
	public static void main(String args[]) {
		Bank bank = new Bank();
		User user1 = new User("KIM 님쓰레드", bank);
		User user2 = new User("LEE 님쓰레드", bank);
		User user3 = new User("HIM 님쓰레드", bank);
		User user4 = new User("DIM 님쓰레드", bank);
		User user5 = new User("SIM 님쓰레드", bank);
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		try {
			user1.join();
			user2.join();
			user3.join();
			user4.join();
			user5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("최종 잔액=" + bank.getBalance());
	}
}