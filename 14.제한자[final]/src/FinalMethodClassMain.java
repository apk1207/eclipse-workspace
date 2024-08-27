
class FinalMethodParentClass{
	public void method1() {
		System.out.println("FinalMethodParentClass.method1()");
	}
	public final void method2() {
		System.out.println("FinalMethodParentClass.method2() 난 final메쏘드 재정의금지");
	}
}

class FinalMethodChildClass extends FinalMethodParentClass{
	@Override
	public void method1() {
		System.out.println("FinalMethodChildClass에서 FinalMethodParentClass.method1()재정의");
	}
	/*
	<< Cannot override the final method from FinalMethodParentClass >>
	public void method2() {
		
	}
	*/
	
}


public class FinalMethodClassMain {

	public static void main(String[] args) {
		FinalMethodChildClass fmcc1=new FinalMethodChildClass();
		fmcc1.method1();
		fmcc1.method2();
		FinalMethodParentClass fmpc1=new FinalMethodChildClass();
		fmpc1.method1();
		fmpc1.method2();
	}

}