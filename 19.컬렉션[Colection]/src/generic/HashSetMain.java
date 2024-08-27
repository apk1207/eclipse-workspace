package generic;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		Car car1=new Car("1111", 1);
		Car car2=new Car("2222", 2);
		Car car3=new Car("3333", 3);
		Car car4=new Car("4444", 4);
		Car car5=new Car("5555", 5);
		HashSet<Car> carSet=new HashSet<Car>();
		System.out.println("#set size:"+carSet.size());
		System.out.println(carSet);
		System.out.println("----------------1.add-----------------");
		carSet.add(car1);
		carSet.add(car2);
		carSet.add(car3);
		carSet.add(car4);
		boolean isAdd = carSet.add(car5);
		System.out.println(">> 추가성공여부:"+isAdd);
		System.out.println("#set size:"+carSet.size());
		System.out.println(carSet);
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car3.hashCode());
		System.out.println(car4.hashCode());
		System.out.println(car5.hashCode());
		System.out.println("----------------2.add[중복]-----------------");
		/*
		 * Element 의 hashCode와 equals메쏘드호출해서 중복을체크한다.
		 */
		Car duplicateCar=new Car("5555",7);
		System.out.println("car5         hashCode:"+car5.hashCode());
		System.out.println("duplicateCar hashCode:"+duplicateCar.hashCode());
		System.out.println("equals:"+duplicateCar.equals(car5));
		/*
		 * Set객체는 hashCode값이동일하면 
		 * equals메쏘드를 호출해서 동일성여부판단.
		 */
		isAdd = carSet.add(duplicateCar);
		System.out.println(">>추가성공여부:"+isAdd);
		System.out.println("#set size:"+carSet.size());
		System.out.println(carSet);
		System.out.println(">>추가성공여부:"+carSet.add(new Car("5555",0)));
		
		System.out.println("----------------3.remove(element)-----------------");
		boolean isRemove = carSet.remove(new Car("3333",12));
		System.out.println("삭제여부:"+isRemove);
		System.out.println("#set size:"+carSet.size());
		System.out.println(carSet);
		
		System.out.println("--------전체출력---------");
		Car.headerPrint();
		for(Car car:carSet) {
			car.print();
		}
		
		
	}

}