package com.itwill00.variable;

public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언 - 번호, 이름, 국어, 영어, 수학, 총점, 평균,
		 * 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int no1, no2;
		String name1, name2;
		int kor1, eng1, math1;
		int kor2, eng2, math2;
		int tot1,tot2;
		double avg1, avg2;
		char grade1, grade2;
		int rank1,rank2;

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */
		no1=1;
		name1="김경호";
		kor1=90;
		eng1=87;
		math1=86;
		
		no2=2;
		name2="김경수";
		kor2=67;
		eng2=56;
		math2=79;
		
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크 
		 * - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if( (kor1<0 || kor1>100)||
			(kor2<0 || kor2>100)||
			(eng1<0 || eng1>100)||
			(eng2<0 || eng2>100)||
			(math1<0 || math1>100)||
			(math2<0 || math2>100)) {
			System.out.println("유효하지 않은점수입니다.");
			return;
		}
		
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		tot1 = kor1+eng1+math1;
		tot2 = kor2+eng2+math2;
		avg1=tot1/3.0;
		avg2=tot2/3.0;
		rank1=1;
		rank2=1;
		
		if(avg1>=90) {
			grade1='A';
		}else if(avg1>=80) {
			grade1='B';
		}else if(avg1>=70) {
			grade1='C';
		}else if(avg1>=60) {
			grade1='D';
		}else {
			grade1='F';
		}
		
		if(avg2>=90) {
			grade2='A';
		}else if(avg2>=80) {
			grade2='B';
		}else if(avg2>=70) {
			grade2='C';
		}else if(avg2>=60) {
			grade2='D';
		}else {
			grade2='F';
		}
		System.out.println("--------------학생 성적출력------------------");
		System.out.println("학번  이름  국어 영어 수학  총점  평균  평점");
		System.out.println("----------------------------------------------");
		System.out.printf("%d  %5s  %d %4d %4d %6d %5.1f %4s\n",no1,name1,kor1,eng1,math1,tot1,avg1,grade1);
		System.out.printf("%d  %5s  %d %4d %4d %6d %5.1f %4s\n",no2,name2,kor2,eng2,math2,tot2,avg2,grade2);
		System.out.println("----------------------------------------------");
		/*
		 * - 출력포맷 
		 * - 평균은 소수점이하 첫째자리까지출력(반올림) 
		 * - 석차,평점 구하지마세요 
		 * --------------학생성적출력--------------------- 
		 * 학번 이름 국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------- 
		 * 	1  김경호 42   56   78 	334  34.8   A 	3 
		 * 	2  김경수 45   53   76 	334  34.8   A 	2 
		 * -----------------------------------------------
		 */
	}

}