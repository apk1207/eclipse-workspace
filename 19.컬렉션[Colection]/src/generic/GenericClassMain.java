package generic;

import java.util.ArrayList;

import nogeneric.Account;

public class GenericClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Account> genericClass=
				new GenericClass<Account>();
		
		genericClass.setMember(new Account(11, "일일", 1000, 1.1));
		/*
		genericClass.setMember("문자");
		genericClass.setMember(new Integer(11));
		genericClass.setMember(new Student());
		*/
		Account getAccount = genericClass.getMember();
		getAccount.print();
	}

}