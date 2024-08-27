
public class MemberFieldInitializationMain {

	public static void main(String[] args) {
		System.out.println("----------------memberFieldInitialization1------------------------");
		System.out.println("1-1.인스턴스 멤버필드는 객체생성시 기본값으로 자동 초기화");
		
		MemberFieldInitialization memberFieldInitialization1=
				new MemberFieldInitialization();
		System.out.println(memberFieldInitialization1.member1);
		System.out.println(memberFieldInitialization1.member2);
		System.out.println(memberFieldInitialization1.member3);
		System.out.println(memberFieldInitialization1.member4);
		System.out.println(memberFieldInitialization1.member5);
		System.out.println(memberFieldInitialization1.member6);
		System.out.println("1-2.인스턴스 멤버필드선언시 초기값으로 초기화할수있다.");
		System.out.println(memberFieldInitialization1.member11);
		System.out.println(memberFieldInitialization1.member22);
		System.out.println(memberFieldInitialization1.member33);
		System.out.println(memberFieldInitialization1.member44);
		System.out.println(memberFieldInitialization1.member55);
		System.out.println(memberFieldInitialization1.member66);
		System.out.println("----------------memberFieldInitialization2------------------------");
		MemberFieldInitialization memberFieldInitialization2=
				new MemberFieldInitialization(	1, 0.3,'하',true,null,null,
												2, 0.8, '꿈', false, "하하하",
												new Account(888,"팔팔팔",8000,8.0));
		System.out.println(memberFieldInitialization2.member1);
		System.out.println(memberFieldInitialization2.member2);
		System.out.println(memberFieldInitialization2.member3);
		System.out.println(memberFieldInitialization2.member4);
		System.out.println(memberFieldInitialization2.member5);
		System.out.println(memberFieldInitialization2.member6);
		System.out.println(memberFieldInitialization2.member11);
		System.out.println(memberFieldInitialization2.member22);
		System.out.println(memberFieldInitialization2.member33);
		System.out.println(memberFieldInitialization2.member44);
		System.out.println(memberFieldInitialization2.member55);
		System.out.println(memberFieldInitialization2.member66);
		
		
		
	}

}