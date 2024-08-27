
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main stmt1");
		MemberMethod mm1=new MemberMethod();
		mm1.member1=88;
		mm1.member2=99;
		/*
		 * 멤버메쏘드 실행(호출)
		 *   - 형식: 참조(주소)변수.메쏘드이름();
		 *   - main실행흐름을 mm1주소에있는객체의 
		 *     method1이라는 이름의 메쏘드(실행코드블록)로보낸다.
		 *      
		 */
		mm1.method1();
		
		System.out.println("main stmt2");
		mm1.method2(2);
		
		System.out.println("main stmt3");
		mm1.method2(30);
		
		System.out.println("main stmt4");
		mm1.method3("안녕하세요!!", 2);
		
		System.out.println("main stmt5");
		mm1.method3("넌누구세요!!", 5);
		
		System.out.println("main stmt6");
		String name="이효리";
		String msg="안녕하세요!!";
		int count=3;
		mm1.method4(name,msg,count);
		
		System.out.println("main stmt7");
		mm1.method4("제임스","멋져요",10);
		
		
		return;
	}

}