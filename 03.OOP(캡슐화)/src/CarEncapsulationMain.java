

public class CarEncapsulationMain {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.setIpChaData("1234", 10);
		Car car2=new Car();
		car2.setIpChaData("5678", 11);
		Car car3=new Car();
		car3.setIpChaData("8989", 12);
		
		System.out.println(">> 전체차량출력");
		car1.headerPrint();
		car1.print();
		car2.print();
		car3.print();
		
		
		System.out.println("car1의 입차시간:"+car1.getInTime());

	}

}