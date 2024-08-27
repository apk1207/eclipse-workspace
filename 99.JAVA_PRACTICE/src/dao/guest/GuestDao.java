package dao.guest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import dao.common.DataSource;

public class GuestDao {
	
	private DataSource dataSource;
	
	public GuestDao() throws Exception {
		this.dataSource = new DataSource();
	}
	
	
	public int insert(Guest guest) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_INSERT);
		
		pstmt.setString(1, guest.getName());
		pstmt.setDate(2, new Date(guest.getDate().getTime()));
		pstmt.setString(3, guest.getEmail());
		pstmt.setString(4, guest.getHomepage());
		pstmt.setString(5, guest.getTitle());
		pstmt.setString(6, guest.getContent());
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}
}
