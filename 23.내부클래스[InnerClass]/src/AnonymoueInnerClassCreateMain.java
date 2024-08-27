import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymoueInnerClassCreateMain {

	public static void main(String[] args) {
		
		Object oc = new Object() {			// Object클래스를 자식클래스로 재정의			
			@Override
			public String toString() {		
				return super.toString();
			}
			public void test() {
				
			}
		};
		
		System.out.println(oc);
		
		ParentInterface parentInterface = new ParentInterface() {
			@Override
			public void method() {
			
			}
		};
		
		System.out.println(parentInterface);
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		};
		
		Car car1 = new Car();				// Car 클래스 객체(인스턴스) 생성
		System.out.println(car1);
		Car car2 = new Car() {};			// Car 클래스를 상속받는 익명 내부쿨래스의 인스턴스 생성
		System.out.println(car2);
		
		
	}

}
