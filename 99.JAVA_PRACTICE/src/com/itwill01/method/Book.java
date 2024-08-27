package com.itwill01.method;

public class Book {
	/*
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 */
	private int no;
	private String name, bookClass ,comment;

	 /* 
	 * <<기능>>
	 *   
	 *   - 책정보출력
	 *   - 책정보대입
	 *   
	 */
	// 책정보 대입 
	public void setBookInfo(int no, String name, String bookClass ,String comment) {
		this.no = no;
		this.name = name;
		this.bookClass = bookClass;
		this.comment = comment;
	}
	
	public void print() {
		System.out.println("-----요청하신 책 정보 안내드립니다.--------");
		System.out.println("번호: "+no);
		System.out.println("제목: "+name);
		System.out.println("분류: "+bookClass);
		System.out.println("책설명: "+comment);
		System.out.println("-------------------------------------------");
		
		
	}
	
	
	
	
	
}