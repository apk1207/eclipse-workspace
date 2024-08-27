
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("--------------car1----------------");
		Car car1 = new Car();
		car1.setIpChaData("1234", 12);
		car1.setOutTime(14);
		car1.calculateFee();
		car1.headerPrint();
		car1.print();
		
		System.out.println("--------------car2----------------");
		Car car2 = new Car("4567", 13);
		car2.setOutTime(15);
		car2.calculateFee();
		car2.headerPrint();
		car2.print();
		
		System.out.println("--------------오늘 주차장 이용차량 출력------------");
		Car cara = new Car("1234", 12, 13, 1000);
		Car carb = new Car("3425", 4, 5, 1000);
		Car carc = new Car("121", 3, 6, 3000);
		Car card = new Car("4467", 14, 16, 2000);
		Car care = new Car("8980", 1, 9, 9000);
		cara.headerPrint();
		cara.print();
		carb.print();
		carc.print();
		card.print();
		care.print();
		
		
		
		
	}

}
