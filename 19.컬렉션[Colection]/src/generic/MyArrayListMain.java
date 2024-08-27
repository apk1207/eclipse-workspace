package generic;
import java.util.ArrayList;
import java.util.List;
public class MyArrayListMain {
	public static void main(String[] args) {
		Account acc1 = new Account(1111, "KIM", 56000, 0.9);
		Account acc2 = new Account(2222, "LEE", 58900, 0.5);
		Account acc3 = new Account(3333, "PARK", 78000, 0.4);
		Account acc4 = new Account(4444, "CHOI", 34000, 0.3);
		Account acc5 = new Account(5555, "SIM", 66000, 0.7);
		Account acc6 = new Account(6666, "HONG", 99000, 1.4);
		Account acc7 = new Account(7777, "KIM", 87600, 0.6);
		Account acc8 = new Account(8888, "KIM", 12300, 2.3);
		Account acc9 = new Account(9999, "MIN", 41200, 4.1);
		
		MyArrayList<Account> accountList=new MyArrayList<Account>();
		System.out.println("#size:"+accountList.size());
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size:"+accountList.size());
		Account getAccount=accountList.get(3);
		getAccount.print();
		
		Account removeAccount=
				(Account)accountList.remove(3);
		System.out.println("#size:"+accountList.size());
		removeAccount.print();
		Account.headerPrint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			tempAccount.print();
		}
		
		MyArrayList<String> nameList = new MyArrayList<String>();
		nameList.add("김");
		nameList.add("이");
		nameList.add("박");
		nameList.add("최");
		System.err.println("#size: "+nameList.size());
		String getName = nameList.get(3);
		System.out.println(getName);
		String removeName = nameList.remove(3);
		System.out.println("#size: "+nameList.size());
		System.out.println(removeName);
		
		
	}
}