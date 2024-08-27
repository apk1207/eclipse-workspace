package president.america;

public class Trump {
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("Trump public method1()");
	}
	protected void method2() {
		System.out.println("Trump protected method2()");
	}
	void method3() {
		System.out.println("Trump (default) method3()");
	}
	private void method4() {
		System.out.println("Trump private method4()");
	}
}
