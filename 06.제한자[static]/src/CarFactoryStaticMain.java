
public class CarFactoryStaticMain {

	public static void main(String[] args) {
		Car.count = 0;
		
		Car c1=new Car(1, "MUSTANG", "RED");
		Car c2=new Car(2, "TESLAR", "WHITE");
		Car c3=new Car(3, "GRANDEUR", "BLACK");
		System.out.println("차량 총 생산대수: "+Car.count);
		Car.headerPrint();
		c1.print();
		c2.print();
		c3.print();
		
	}

}
