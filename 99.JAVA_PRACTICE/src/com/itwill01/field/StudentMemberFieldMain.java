package com.itwill01.field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		Student stu1, stu2;
		// 학생 객체의 데이터 저장을 위해 Student 타입의 변수 stu1,sut2 선언
		
		stu1 = new Student();	// 선언된 stu1 변수에 Student클래스를 이용하여 생성한 객체데이터 대입
		stu2 = new Student();	// 선언된 stu2 변수에 Student클래스를 이용하여 생성한 객체데이터 대입
		
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		
		// stu1 객체 데이터 대입
		stu1.no = 1;
		stu1.name = "김경호";
		stu1.kor = 97;
		stu1.eng = 99;
		stu1.math = 89;
		stu1.rank = 0;
		
		// stu2 객체 데이터 대입
		stu2.no = 2;
		stu2.name = "김경수";
		stu2.kor = 87;
		stu2.eng = 92;
		stu2.math = 81;
		stu2.rank = 0;
		
		
		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		
		// stu1 객체 데이터를 사용해 계산
		stu1.tot = stu1.kor + stu1.eng + stu1.math;
		stu1.avg = stu1.tot / 3.0;
		
		if(stu1.avg>=90) {
			stu1.grade = 'A';
		} else if(stu1.avg>=80) {
			stu1.grade = 'B';
		} else if(stu1.avg>=70) {
			stu1.grade = 'C';
		}  else if(stu1.avg>=60) {
			stu1.grade = 'D';
		} else {
			stu1.grade = 'F';
		}
		
		
		// stu2 객체 데이터를 사용해 계산
		stu2.tot = stu2.kor + stu2.eng + stu2.math;
		stu2.avg = stu2.tot / 3.0;
		
		if(stu2.avg>=90) {
			stu2.grade = 'A';
		} else if(stu2.avg>=80) {
			stu2.grade = 'B';
		} else if(stu2.avg>=70) {
			stu2.grade = 'C';
		}  else if(stu2.avg>=60) {
			stu2.grade = 'D';
		} else {
			stu2.grade = 'F';
		}
		
		
		
		/*
		 * 학생 데이타를 출력 2명
		 */
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
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",
				stu1.no, stu1.name, stu1.kor, stu1.eng, stu1.math, stu1.tot, stu1.avg, stu1.grade, stu1.rank);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",
				stu2.no, stu2.name, stu2.kor, stu2.eng, stu2.math, stu2.tot, stu2.avg, stu2.grade, stu2.rank );
		System.out.printf("-----------------------------------------------%n");
	}

}