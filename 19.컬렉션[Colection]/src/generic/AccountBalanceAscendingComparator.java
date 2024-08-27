package generic;

import java.util.Comparator;

public class AccountBalanceAscendingComparator 
		implements Comparator<Account> {

	@Override
	public int compare(Account a1, Account a2) {
		if(a1.getBalance()>a2.getBalance()) {
			return 1;
		}else {
			return -1;
		}
	}

}