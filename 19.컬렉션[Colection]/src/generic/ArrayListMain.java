package generic;

import java.util.ArrayList;



public class ArrayListMain {

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
		/*
		public class ArrayList<E>{
		}
		 */
		ArrayList<Account> accountList=
				new ArrayList<Account>();
		System.out.println("#size:"+accountList.size());
		System.out.println("-------------1.add(element)[맨마지막 index에객체저장]--------");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList.toString());
		accountList.add(acc5);
		accountList.add(acc6);
		accountList.add(acc7);
		accountList.add(acc8);
		accountList.add(acc9);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("-------------2.add(index,element)[지정된 index에객체저장]--------");
		accountList.add(1,new Account(1112, "NEW", 3000, 3.3) );
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("-------------3.set(index,element)[지정된 index에객체저장]--------");
		accountList.set(accountList.size()-1, new Account(9000, "LAST", 90000, 9.9));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("-------------3.remove(index)[지정된 index의 객체 ArrayList에서 삭제]--------");
		Account removeAccount=accountList.remove(1);
		removeAccount.print();
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("-------------4.get(index)[지정된 index의객체반환]--------");
		Account getAccount=accountList.get(2);
		getAccount.print();
		System.out.println("%%%%%%%%%%%%%%%% 업무실행 %%%%%%%%%%%%%%%%%%%");
		System.out.println("--------------1.계좌전체출력------------");
		Account.headerPrint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			tempAccount.print();
		}
		
		
		System.out.println("---------2.계좌번호 6666번 한개찾기-------------");
		for (Account tempAccount : accountList) {
			if(tempAccount.getNo()==6666) {
				tempAccount.print();
				break;
			}
		}
		
		
		System.out.println("---------3.계좌주이름 KIM인계좌 여러개찾기------");
		for (Account tempAccount : accountList) {
			if(tempAccount.getOwner().equals("KIM")) {
				tempAccount.print();
			}
		}
		
		
		System.out.println("---------4.계좌번호 6666번 계좌한개삭제---------");
		for (Account tempAccount : accountList) {
			if(tempAccount.getNo() == 6666) {
				System.out.println(">>삭제 전 size: "+accountList.size());
				boolean isDeleted = accountList.remove(tempAccount);	// 매개변수에 index를 넣으면 객체를 반환하지만 객체를 넣으면 삭제완료 여부만 boolean타입으로 반환된다.
				System.out.println("삭제여부: "+isDeleted);
				System.out.println(">>삭제 후 size: "+accountList.size());
				break;
			}
		}
		
		// 여러개 삭제할 때는 인덱스를 사용해야 해서 inhance for문 사용불가
		System.out.println("---------5.계좌주이름 KIM인계좌 여러개삭제------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getOwner().equals("KIM")) {
				Account removeAcc = accountList.remove(i);
				removeAcc.print();
				i--;
			}
		}
		
		
		System.out.println("--------------1.계좌전체출력------------");
		Account.headerPrint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			tempAccount.print();
		}
		
		
		
		
		
		
		
		
		
		
	}

}