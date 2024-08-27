package dao.guest;

public class GuestSQL {
	public static final String GUEST_INSERT = "insert into guest values(guest_no_seq.nextval ,?, ?, ?, ?, ?, ?)";
	public static final String GUEST_UPDATE = "update guest set guest_name=?,\r\n"
			+ "                 guest_email=?,\r\n"
			+ "                 guest_homepage=?,\r\n"
			+ "                 guest_title=?,\r\n"
			+ "                 guest_content=?\r\n"
			+ "where guest_no = ?;";
	public static final String GUEST_DELETE = "delete from guest where guest_no = ?";
	public static final String GUEST_SELECT_BY_NO = "select * from guest where guest_no = ?";
	public static final String GUEST_SELECT_ALL = "select * from guest";
	
	
	
}
