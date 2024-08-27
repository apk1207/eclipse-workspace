package president.korea;

public class DJ {
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("DJ public method1()");
	}
	protected void method2() {
		System.out.println("DJ protected method2()");
	}
	void method3() {
		System.out.println("DJ (default) method3()");
	}
	private void method4() {
		System.out.println("DJ private method4()");
	}
}
