/*
추상클래스
  1.정의: 
  	- 하나이상의 추상메소드가 정의되어있는 클래스
  		ex> public abstract class Test{
	         	//추상(abstract)메쏘드();
	         	public abstract int print(int i);
	         	//구현된(concrete)메쏘드();
	         	public void test(){
	         	}
         	}
         	==>추상메쏘드: 메쏘드의 구현부분(바디{})이 없고 선언부(signature)만 존재하는 메쏘드
            ex> public abstract int print(int i);
                
  	- 추상메쏘드가 존재하지 않으나 객체생성을 막기위해 만든 클래스
        ex> public abstract class AcademyMember{}
              
  2. 추상클래스는 불완전한 추상메쏘드를 가지므로 객체생성
      이 불가능하다.
      Test t=new Test();(X)
  3. 추상클래스는 추상클래스를 상속받아서 추상메쏘드를 
     구현(오버라이딩)하는 자식 클래스를 만들어 
     사용(자식객체생성)해야한다 
*/ 

abstract class  AbstarctParent{
	public void method1() {
		System.out.println("AbstarctParent.method1() 난 구상(concrete)메쏘드");
	}
	public abstract void method2();
	
	
}

class AbstarctChild extends AbstarctParent{
	@Override
	public void method2() {
		System.out.println("AbstarctChild에서 AbstractParent의 추상메쏘드 method2재정의 [implement(구현)]");
	}
	
}


public class AbstarctParentChildMain {

	public static void main(String[] args) {
		/*
		<< Cannot instantiate the type AbstarctParent >>
		AbstarctParent abstarctParent=new AbstarctParent();
		*/
		AbstarctChild abstarctChild1=new AbstarctChild();
		abstarctChild1.method1();
		abstarctChild1.method2();
		
		AbstarctParent abstarctParent2=new AbstarctChild();
		abstarctParent2.method1();
		abstarctParent2.method2();
		
		
	}

}