
public class CarEngineFactoryMain {

	public static void main(String[] args) {
		/*
		 * 자동차공장
		 */
		/*
		Engine x6Engine=new Engine();
		x6Engine.type="A";
		x6Engine.cc=5000;
		
		Car car1=new Car();
		car1.no=1234;
		car1.model="X6";
		car1.engine=x6Engine;
		
		System.out.println(car1.no+"\t"+
		                   car1.model+"\t"+
						   car1.engine.type+"\t"+
		                   car1.engine.cc);
		*/
		
		Engine x6Engine=new Engine("A",3000);
		Car car1=new Car();
		car1.setNo(1234);
		car1.setModel("X6");
		car1.setEngine(x6Engine);
		car1.print();
		
		System.out.println("-----------차량엔진검사--------");
		Car gumsaCar = car1;
		Engine returnEngine = gumsaCar.getEngine();
		returnEngine.print();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		Car car2=new Car(5678, "MUSTANG", new Engine("M",5500));
		car2.print();
		System.out.println("-----------차량엔진검사--------");
		car2.getEngine().print();
		
		
	}

}