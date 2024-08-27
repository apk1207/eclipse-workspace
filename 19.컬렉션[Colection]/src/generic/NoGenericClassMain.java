package generic;

import nogeneric.Account;
import nogeneric.Student;

public class NoGenericClassMain {

	public static void main(String[] args) {
		NoGenericClass noGenericClass=
				new NoGenericClass();
		noGenericClass.setMember(new Account(11,"일일",1000,1.0));
		/*
		noGenericClass.setMember("문자");
		noGenericClass.setMember(new Integer(11));
		noGenericClass.setMember(new Student());
		*/
		Account getAcccount=(Account)noGenericClass.getMember();
		getAcccount.print();
	}

}