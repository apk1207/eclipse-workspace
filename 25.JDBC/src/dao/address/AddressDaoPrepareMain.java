package dao.address;

public class AddressDaoPrepareMain {

	public static void main(String[] args) throws Exception {
		AddressDaoPrepare addressDao = new AddressDaoPrepare();
		System.out.println("1.insert");
		System.out.println(">> insert row count:" +
				addressDao.insert(new Address(1001,"김우미","000-0000","대구")));
		System.out.println(">> insert row count:" +
				addressDao.insert(new Address(1002,"김지미","111-1111","전주")));
		
		System.out.println("2.updateByNo");
		System.out.println(">> update row count:"+
				addressDao.updateByNo(new Address(1002,"사삼변경", "444-3333","제주")));
		
		System.out.println("3.deleteByNo");
		System.out.println(">> delete row count:"+addressDao.deleteByNo(1001));
		System.out.println(">> delete row count:"+addressDao.deleteByNo(1002));
		
		System.out.println("4.selectByNo");
		System.out.println(addressDao.selectByNo(10));
		
		System.out.println("5.selectAll");
		System.out.println(addressDao.selectAll());
		
		
		
		
		
		
	
	
	}

}
