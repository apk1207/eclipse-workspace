package dao.address.first;

public class AddressDao1TestMain {

	public static void main(String[] args) throws Exception {
		AddressDao1 addressDao1 = new AddressDao1();
		
		addressDao1.insert();
		addressDao1.deleteByNo();
		addressDao1.updateByNo();
		addressDao1.selectByNo();
		addressDao1.selectAll();
		
	}

}
