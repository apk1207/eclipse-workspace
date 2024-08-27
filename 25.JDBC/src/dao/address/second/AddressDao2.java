package dao.address.second;
/*
Dao(Data Access Object)클래스
  - address 테이블에 CRUD(Create,Read,Update,Delete) 작업을하는 
    단위메쏘드를 가지고있는 클래스
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressDao2 {
	/*
	 * 데이타베이스 접속정보를 이용해서 Connection객체를 생성해서
	 * 반환하는 메소드
	 */
	private Connection getConnection() throws Exception {
		/************ 데이타베이스 접속정보[124.198.47.195] *************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@124.198.47.195:1521:xe";
		String user = "jdeveloper13";
		String password = "jdeveloper13";
		/**************************************************************/
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		return con;
	}
	
	/*
	 * 사용한 Connection객체를 close하는 메소드
	 */
	private void close(Connection con) throws Exception {
		con.close();
	}
	
	
	public void insert(String name,String phone,String address) throws Exception {
		
		String insertSql = "insert into address values(address_no_seq.nextval,'"+name+"','"+phone+"','"+address+"')";
		Connection con = this.getConnection();
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> insert row count:" + rowCount);
		stmt.close();

		this.close(con);

	}

	public void deleteByNo(int no) throws Exception {
	
		String deleteSql = "delete from address where no="+no;
		Connection con = this.getConnection();
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> delete row count:" + rowCount);
		stmt.close();
		
		this.close(con);
	}

	public void updateByNo(int no,String name,String phone,String address) throws Exception {
		
		String updateSql = 
				"update address set name='"+name+"',phone='"+phone+"',address='"+address+"' where no="+no;
		
		Connection con = this.getConnection();
		Statement stmt = con.createStatement();
		
		int rowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> update row count:" + rowCount);
		stmt.close();
		this.close(con);
	}

	public void selectByNo(int no) throws Exception {
		
		String selectSql = "select * from address where no="+no;

		Connection con = this.getConnection();
		Statement stmt = con.createStatement();
		
		/*
		 이름      널?       유형            
		------- -------- ------------- 
		NO      NOT NULL NUMBER(10)    
		NAME    NOT NULL VARCHAR2(50)  
		PHONE   NOT NULL VARCHAR2(50)  
		ADDRESS          VARCHAR2(200) 
		*/
		ResultSet rs = stmt.executeQuery(selectSql);
		if (rs.next()) {
			/* --------------------------------
			 * DB타입 		| 자바타입
			 * --------------------------------
			 * number		| int,double(float)
			 * varchar2,char| String
			 * Date			| Date
			 * --------------------------------
			 */
			int number = rs.getInt("no");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(number + "\t" + name + "\t" + phone + "\t" + address);

		} else {
			System.out.println(">>>주소록 친구없다.");
		}
		rs.close();
		stmt.close();
		this.close(con);

	}

	public void selectAll() throws Exception {
		
		String selectSql = "select * from address";

		Connection con = this.getConnection();
		Statement stmt = con.createStatement();
		
		/*
		 이름      널?       유형            
		------- -------- ------------- 
		NO      NOT NULL NUMBER(10)    
		NAME    NOT NULL VARCHAR2(50)  
		PHONE   NOT NULL VARCHAR2(50)  
		ADDRESS          VARCHAR2(200) 
		*/
		ResultSet rs = stmt.executeQuery(selectSql);
		if (rs.next()) {
			do {
				/* --------------------------------
				 * DB타입 		| 자바타입
				 * --------------------------------
				 * number		| int,double(float)
				 * varchar2,char| String
				 * Date			| Date
				 * --------------------------------
				 */
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				System.out.println(no + "\t" + name + "\t" + phone + "\t" + address);
			} while (rs.next());
		}
		rs.close();
		stmt.close();
		this.close(con);
	}
}