package dao.address.fourth;
/*
VO(Value Object),DTO(Data Transfer Object)
  	- 회원관리를 위하여 필요한 도메인클래스(VO,DTO)
  	- 회원객체 한명의 데이타를가지고있다.(VO)
  	- 회원객체 한명의 데이타를 저장하기위한멤버변수를 가지고있다
  	- 회원 테이블과 동일한 속성을 멤버필드로가지는 객체
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*//다른방식 설명//
 * VO(Value Object),DTO(Data Transfer Object)
 * 	- address 테이블 1개 row의 데이타의 값을 가지는객체
 *  - address 테이블 1개 row의 데이타값을 전달(파라메타,리턴데이타)시키기위한객체
 *  - address 테이블의 컬럼과 동일한수의 멤버필드를 가지는객체
 */
/*
이름      널?       유형            
------- -------- ------------- 
NO      NOT NULL NUMBER(10)    
NAME    		 VARCHAR2(50)  
PHONE   		 VARCHAR2(50)  
ADDRESS          VARCHAR2(200) 
*/
	@Getter
	@Setter
	@ToString
	@NoArgsConstructor
	@AllArgsConstructor

public class Address {
	private int no;
	private String name;
	private String phone;
	private String address;
	
	
	
}