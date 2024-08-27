
public class MemberMethodReturn {
	/*
	 * 멤버필드
	 *   - 멤버필드 선언시 값을 대입할수 있다(초기화라고 표현)
	 */
	
	public int memberField1 = 10;
	public int memberField2 = 20;
	public int memberField3 = 30;
	
	/*******setter method*************/
	/*
	 * 멤버 필드에 데이터를 대입(set)하는 메쏘드
	 */
	public void setMemberField1(int memberField1) {
		/*
		 * this
		 *   - self 참조변수
		 *   - public void setMemberField1(int memberField1)
		 *      메쏘드가 호출될 때 호출한 주체 객체의 주소값울 가지는 변수
		 *   - this는 생략이 가능하다.
		 */
		this.memberField1 = memberField1;
	}
	
	
	public void setMemberField2(int memberField2) {
		this.memberField2 = memberField2;
	}


	public void setMemberField3(int memberField3) {
		this.memberField3 = memberField3;
	}
	
	/****** getter method ***********/
	public int getMemberField1() {
		return this.memberField1;
	}
	
	public int getMemberField2() {
		return this.memberField2;
	}

	public int getMemberField3() {
		return this.memberField3;
	}


	public int method1() {
		System.out.println("\t-- int method1() 실행-- ");
		int result = 23432 + 3423423;
		System.out.println("\t-- int method1() 실행 종료 후 int 데이터 반환-- ");
		/*
		 return <<호출한 클래스(객체)에게 반환할값(변수,리터럴,연산의결과)>>;
		    - 호출한곳으로 실행흐름반환
		    - 호출한곳으로 데이타반환
		    - 반환할 데이타가 없는경우에는(void)    return문생략이 가능하다.
		    - 반환할 데이타가 있는경우에는(int,...) return문 반드시 기술하여야한다.
		 
		 */
		return result;
	}
	
	
	public boolean method2() {
		System.out.println("\t---boolean method()--실행");
		boolean isMarried = false;
		System.out.println("\t---boolean method()--실행종료 후 boolean 타입 데이터 반환");
		return isMarried;
	}
	
	
	/*
	 * 2개의 정수를 파라미터로 받아서 더한 결과를 반환하는 메쏘드
	 */
	public int add(int a, int b) {
		System.out.println("\t--int add(int a, int b)실행--");
		System.out.println("\t--int add(int a, int b)실행종료 후 int 데이터 반환--");
		return a+b;
	}
	
	
	public String hello(String name) {
		return name+" 님 안녕하세요!!";
	}
	
}
