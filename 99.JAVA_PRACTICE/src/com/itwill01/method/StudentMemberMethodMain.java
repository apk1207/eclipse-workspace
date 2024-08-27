package com.itwill01.method;



public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 대입메쏘드호출(3명)
		 */
		stu1.setMember(1, "김경호", 89, 95, 97);
		stu2.setMember(2, "김경수", 84, 97, 92);
		stu3.setMember(3, "박철수", 81, 90, 90);
		
		
		/*
		 학생총점,평균,평점 계산 메쏘드 호출(3명)
		 */
		stu1.setTot();
		stu2.setTot();
		stu3.setTot();
		
		stu1.setAvg();
		stu2.setAvg();
		stu3.setAvg();
		
		stu1.setGrade();
		stu2.setGrade();
		stu3.setGrade();
		
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stu1.start();
		
		stu1.print();
		stu2.print();
		stu3.print();
		
		stu1.end();
		
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		
		
	}

}