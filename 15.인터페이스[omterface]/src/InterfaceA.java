
public interface InterfaceA {
	public static final int CONSTANT1=1;
	int CONSTANT2=2;
	/*
	interface 안에 정의되는 메쏘드는 추상메쏘드여야한다.
	 - Abstract methods do not specify a body
	 */
	void method1();
	public abstract void method2();
}