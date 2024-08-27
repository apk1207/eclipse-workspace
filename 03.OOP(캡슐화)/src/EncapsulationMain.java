
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		
		/*
		 * encapsulation객체 멤버 필드에 데이타 대입
		 */
		
		/*
		encapsulation.memberField1 = 1;
		encapsulation.memberField2 = true;
		encapsulation.memberField3 = '김';
		encapsulation.memberField4 = 3.14159;
		*/
		
		encapsulation.setMemberField1(1);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('김');
		encapsulation.setMemberField4(3.14159);
		
		/*
		 * encapsulation객체 멤버 필드 내용 출력
		 */
		/*
		System.out.println(encapsulation.memberField1);
		System.out.println(encapsulation.memberField2);
		System.out.println(encapsulation.memberField3);
		System.out.println(encapsulation.memberField4);
		*/
		
		System.out.println(encapsulation.getMemberField1());
		System.out.println(encapsulation.isMemberField2());
		System.out.println(encapsulation.getMemberField3());
		System.out.println(encapsulation.getMemberField4());
		System.out.println("-----------------------------");
		encapsulation.print();
		

		
		
		
	}

}
