0. 테이블설계(create drop) 			-->guest_table_create_drop.sql 파일생성
1. sql문작성(insert,update,delete,select)	-->guest_insert_update_delete_select.sql 파일생성
2. Dto(VO)클래스작성
3. Dao클래스작성
 	- 테이블에 insert,deleteByPk,updatePk,selectByPk,selectAll 단위메쏘드만들기
    - 단위메쏘드(인자 반환타입정의)생성
    
4.<<< 반드시 테스트 되어야합니다.>>>
```java
	public class GuestDaoTestMain{
		public static void main(String[] args){
		  GuestDao guestDao=new GuestDao();
		  guestDao.insert();
		} 
	}    
```
