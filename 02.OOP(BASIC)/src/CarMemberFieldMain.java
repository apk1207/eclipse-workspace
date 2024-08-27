public class CarMemberFieldMain {
	public static void main(String[] args) {
		/*
		 * 1.차량번호 1234번차량 12시입차
		 */
		Car car1;
		//차객체의데이타를 저장할수있는 Car클래스타입의 변수 car1 선언
		car1 = new Car();
		//Car클래스를 사용해서 차객체를 생성한후 차객체데이타가 car1변수에 대입
		car1.no= "1234";
		//차객체(car1)의 멤버필드 no에 "1234"값대입
		car1.inTime=12;
		//차객체(car1)의 멤버필드inTime 에 12값대입
		
		/*
		 * 2.car1객체 16시출차
		 */
		/*
		 * 2-1.출차시간 대입
		 */
		car1.outTime=16;
		//차객체(car1)의 멤버필드 outTime에 16을 대입
		/*
		 * 2-2.주차요금계산
		 */
		car1.fee = (car1.outTime-car1.inTime)*1000;
		/*
		차객체(car1)의 멤버필드fee에 차객체(car1)의
		outTime,inTime멤버필드를 사용해서 주차요금을 계산한후대입
		*/
		/*
		 * 2-3.주차요금영수증출력
		 */
		System.out.printf("-----------------------------------\n");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.printf("-----------------------------------\n");
		System.out.printf("%6s %8d %8d    ₩ %4d" ,car1.no,car1.inTime,car1.outTime,car1.fee);
		
	}

}