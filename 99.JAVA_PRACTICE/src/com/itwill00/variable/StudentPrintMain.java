// 2일차 과제 01
package com.itwill00.variable;

public class StudentPrintMain {

	public static void main(String[] args) {
		
		/*
		 * 1.변수선언
		 */
		
		int number, number2;
		String name, name2;
		int kor, kor2;
		int eng, eng2;
		int math, math2;
		int total, total2;
		double avg, avg2;
		char grade, grade2;
		int rank, rank2;
		
		
		/*
		 * 2.변수에 데이타(리터럴)대입
		 */
		
		number = 1;
		name = "김경호";
		kor = 42;
		eng = 56;
		math = 78;
		total = 334;
		avg = 34.78;
		grade = 'A';
		rank = 3;
		
		number2 = 2;
		name2 = "김경수";
		kor2 = 45;
		eng2 = 53;
		math2 = 76;
		total2 = 334;
		avg2 = 34.78;
		grade2 = 'A';
		rank2 = 2;
		
		/*
		 * 3.변수 데이타 출력
		 */
		
		
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.printf(" %d %4s %5d %4d %4d %4d %5.1f %3c %3d %n",
				   number, name, kor, eng, math, total, avg, grade, rank);
		System.out.printf(" %d %4s %5d %4d %4d %4d %5.1f %3c %3d %n",
				   number2, name2, kor2, eng2, math2, total2, avg2, grade2, rank2);
		System.out.println("-----------------------------------------------");
		
		
		
		/*
		출력예시
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		 */
		
		
	}

}