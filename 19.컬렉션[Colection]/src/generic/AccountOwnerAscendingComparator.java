package generic;

import java.util.Comparator;

public class AccountOwnerAscendingComparator implements Comparator<Account> {

	@Override
	public int compare(Account acc1, Account acc2) {
		return acc1.getOwner().compareTo(acc2.getOwner());
	}

}