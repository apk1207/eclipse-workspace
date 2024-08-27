
class OuterClassOverridingInnerClass{
	private int outer_member_field;
	public void outer_member_method() {
		System.out.println("OuterClassOverridingInnerClass.outer_member_method()");
	}
	/*
	 * OuterClass에서 InnerClass객체를 생성해서 재정의된 메쏘드사용
	 */
	public void outer_inner_class_use() {
		/****************member inner class[CASE1]*****************/
		System.out.println("-------------member inner class[CASE1]----------------");
		Object oc1=new ObjectChild();
		System.out.println(oc1.toString());
		ParentConcreteClass parentConcreteClass= new ChildParentConcreteClass();
		parentConcreteClass.method();
		ParentAbstractClass parentAbstractClass= new ChildParentAbstractClass();
		parentAbstractClass.method();
		ParentInterface parentInterface=new ChildParentInterface();
		parentInterface.method();
		
		/****************anonymous local inner class[CASE2]*****************/
		System.out.println("-------------anonymous local inner class[CASE2]----------------");
		
		Object oc2 =new Object() {
			@Override
			public String toString() {
				return "Object를 상속받는 이름없는로칼내부클래스(OuterClassOverridingInnerClass$1.class)에서 재정의한 toString()메쏘드 ";
			}
		}; 
		System.out.println(oc2.toString());
		ParentConcreteClass parentConcreteClass2=new ParentConcreteClass() {
			@Override
			public void method() {
				System.out.println("ParentConcreteClass를 상속받는이름없는로칼내부클래스(OuterClassOverridingInnerClass$2.class)에서 재정의한method()");
			}
		};
		parentConcreteClass2.method();
		
		ParentAbstractClass parentAbstractClass2=new ParentAbstractClass() {
			@Override
			public void method() {
				System.out.println("ParentSecondAbstractClass를 상속받는 " + "이름없는로칼내부클래스(OuterClassOverridingInnerClass$3.class)에서 재정의한 method()");System.out.println("ParentAbstractClass를 상속받는 이름없는로칼내부클래스(OuterClassOverridingInnerClass$3.class)에서 재정의한 method()");
			}
			/***호출불가능**/
			private void test() {
				System.out.println("------------------");
			}
		};
		parentAbstractClass2.method();
		ParentInterface parentInterface2=new ParentInterface() {
			@Override
			public void method() {
				System.out.println("ParentInterface를 상속(구현)받는 이름없는 로칼내부클래스(OuterClassOverridingInnerClass$4.class)에서 재정의한 method()");
			}
		};
		parentInterface2.method();
	}
	
	
	/*
	 member inner class[CASE1]
	   - 특정클래스 상속후에 메쏘드를재정의한 클래스
	 */
	public class ObjectChild extends Object{
		@Override
		public String toString() {
			return "Object를 상속받는 ObjectChild에서 재정의한 toString()메쏘드";
		}
	}
	
	public class ChildParentConcreteClass extends ParentConcreteClass{
		@Override
		public void method() {
			System.out.println(
					"ChildParentConcreteClass.method()[ ParentConcreteClass.method()를재정의한메쏘드 ]");
		}
	}
	public class ChildParentAbstractClass extends ParentAbstractClass{

		@Override
		public void method() {
			System.out.println(
					"ChildParentAbstractClass.method()[ ParentAbstractClass.method()를구현(재정의)한메쏘드 ]");
			
		}
		
	}
	public class ChildParentInterface implements ParentInterface{

		@Override
		public void method() {
			System.out.println(
					"ChildParentInterface.method()[ ParentInterface.method()를구현(재정의)한메쏘드 ]");
			
		}
		
	}
	
	
}

public class OuterClassOverridingInnerClassMain {

	public static void main(String[] args) {
		OuterClassOverridingInnerClass ouerClassOverridingInnerClass=
				new OuterClassOverridingInnerClass();
		ouerClassOverridingInnerClass.outer_inner_class_use();

		Object o=new Object();
		System.out.println(o.toString());
		Object oc=new Object() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "죄정의~~~~";
			}
		};
		System.out.println(oc.toString());
		
	}

}