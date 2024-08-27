package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		
		Student st1 = new Student();
		st1.setStudentData(1,"신짱구", 97, 94, 99);
		
		Student st2 = new Student(2, "김철수", 67, 90, 92);
		Student st3 = new Student(3, "박양희", 93, 92, 85);
		
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.calculateTotal();
		st2.calculateTotal();
		st3.calculateTotal();
		
		st1.calculateAvg();
		st2.calculateAvg();
		st3.calculateAvg();
		
		st1.calculateGrade();
		st2.calculateGrade();
		st3.calculateGrade();
		
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
		
		
		/*
		 * 학생 student1 의 이름변경메쏘드호출후 student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		
		// 학생 st1 이름변경
		st1.reName("홍길동");
		System.out.println("---------------학생이름 변경 후 출력--------------");
		st1.print();
		
		System.out.printf("학생 %s의 총점: %d \n", st1.getName(), st1.getTot());
		System.out.printf("학생 %s의 학점: %c \n", st1.getName(), st1.getGrade());
		
		
	}

}