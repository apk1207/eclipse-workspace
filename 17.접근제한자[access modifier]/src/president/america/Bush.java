package president.america;

public class Bush {
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("Bush public method1()");
	}
	protected void method2() {
		System.out.println("Bush protected method2()");
	}
	void method3() {
		System.out.println("Bush (default) method3()");
	}
	private void method4() {
		System.out.println("Bush private method4()");
	}
}
