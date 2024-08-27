/*
제한자(final)
	1. 클래스앞에 붙일경우
	   상속금지 
       ex> public final class Test{}
    2. 멤버메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
    3. 멤버변수 앞에붙일경우--> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
*/
class FinalFieldClass{
	public final int PORT_NUMBER=80;
	public final double INCENTIVE_RATE;
	public static final double PI=3.14;
	public static final int EARTH_RADIUS=6400;

	public FinalFieldClass(double INCENTIVE_RATE ){
		this.INCENTIVE_RATE=INCENTIVE_RATE;
		
	}
	
	public FinalFieldClass() {
		this.INCENTIVE_RATE=0.1;
		/*
		<< The final field FinalFieldClass.PORT_NUMBER cannot be assigned >>
		this.PORT_NUMBER=90;
		this.INCENTIVE_RATE=0.3;
		this.PI=3.15;
		this.EARTH_RADIUS=1200;
		*/
		System.out.println(this.PORT_NUMBER);
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
	}
	
}


public class FinalFieldClassMain {

	public static void main(String[] args) {
		System.out.println("------------FinalFieldClass 객체1----------");
		FinalFieldClass ffc1=new FinalFieldClass(0.1);
		/*
		<< The final field FinalFieldClass.PORT_NUMBER cannot be assigned >>
		ffc1.PORT_NUMBER=9090;
		ffc1.INCENTIVE_RATE=9.0;
		FinalFieldClass.PI=3.3;
		FinalFieldClass.EARTH_RADIUS=9000;
		*/
		System.out.println(ffc1.PORT_NUMBER);
		System.out.println(ffc1.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		
		System.out.println("------------FinalFieldClass 객체2----------");
		FinalFieldClass ffc2=new FinalFieldClass(0.9);
		/*
		<< The final field FinalFieldClass.PORT_NUMBER cannot be assigned >>
		ffc2.PORT_NUMBER=9090;
		ffc2.INCENTIVE_RATE=9.0;
		FinalFieldClass.PI=3.3;
		FinalFieldClass.EARTH_RADIUS=9000;
		*/
		System.out.println(ffc2.PORT_NUMBER);
		System.out.println(ffc2.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);

	}

}