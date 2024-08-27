package com.itwill00.variable;
public class DuoMemberInfoPrint{
	public static void main(String[] args) {
		
		/*
		 * 1.변수선언
		 */
		int no;
		String name;
		String socialSecurityNumber;
		char gender;
		int numberOfMarriges;
		boolean smoking;
		double height;
		char grade;
		String face;
		
		
		/*
		 * 2.변수에 데이타(리터럴)대입
		 */
		
		no=1;
		name="김경호";
		socialSecurityNumber="123456-1234567";
		gender='M';
		numberOfMarriges=0;
		smoking=true;
		height=178.23;
		grade='A';
		face="중";
		
		/*
		 3.변수 데이타 출력
		*************************
		회원번호 : 236514   
		이    름 : 홍길동   
		주민번호 : 201212-3495039   
		성    별 : 남   
		결혼횟수 : 0   
		흡연여부 : true   
		키       : 178.3   
		학    점 : A   
		용    모 : 상(중)   
		**************************
		*/
		System.out.println("*************************");
		System.out.println("회원번호 : "+no);
		System.out.println("이    름 : "+ name);
		System.out.println("주민번호 : "+socialSecurityNumber);
		System.out.println("성    별 : "+gender);
		System.out.println("결혼횟수 : "+numberOfMarriges);
		System.out.println("흡연여부 : "+smoking);
		System.out.println("키       : "+height);
		System.out.println("학    점 : "+grade);
		System.out.println("용    모 : "+face);
		System.out.println("*************************");
		
	}
}