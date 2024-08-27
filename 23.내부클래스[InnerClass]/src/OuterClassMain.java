
class OuterClass{
	/********OuterClass에서 InnerClass 객체르 멤버필드로사용*******/
	private  InnerClass ic=new InnerClass();
	/*
	 * 인스턴스 멤버 필드
	 */
	public int outer_member_field=8888;
	
	/*
	 * 인스턴스 멤버 메쏘드
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
	}
	/***************외부클래스에서내부클래스객체생성사용***********/
	public void outer_inner_class_use() {
		//OuterClass.InnerClass ic=this.new InnerClass();
		InnerClass ic=new InnerClass();
		ic.inner_member_field=9090;
		ic.inner_member_method();
	}
	
	/*
	 * 인스턴스 멤버 클래스
	 *   - 작성이유 : 내부클래스에서 외부클래스의 멤버변수(메쏘드)접근을 손쉽게하기위해서 
	 */
	public class InnerClass{
		public int inner_member_field=3333;
		
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		/********내부클래스에서 외부클래스의 멤버접근************/
		public void inner_outer_member_access() {
			//OuterClass.this.outer_member_field=2321321;
			//OuterClass.this.outer_member_method();
			//InnerClass.this.inner_member_field=9090;
			//InnerClass.this.inner_member_method();
			outer_member_field=2321321;
			outer_member_method();
		}
	}
	
	
}
public class OuterClassMain {
	public static void main(String[] args) {
		OuterClass outerClass=new OuterClass();
		outerClass.outer_member_field=2345;
		outerClass.outer_member_method();
		System.out.println(outerClass);
		OuterClass.InnerClass innerClass= outerClass.new InnerClass();
		System.out.println(innerClass);
		
	}
}