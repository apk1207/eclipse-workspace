package com.itwill03.포함;


public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	private int no;
	private String name;
	private String phoneNum;
	private Book book;
	
	
	public BookMember() {
	}
	
	public BookMember(int no, String name, String phoneNum, Book book) {
		this.no = no;
		this.name = name;
		this.phoneNum = phoneNum;
		this.book = book;
	}
	
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	/*
	<<기능>>
	  회원정보출력 
	 */

	public void print() {
		System.out.print(this.no+"\t"+this.name+"\t"+this.phoneNum+"\t");
		this.book.print();
	}
	
	
	
	
	
}