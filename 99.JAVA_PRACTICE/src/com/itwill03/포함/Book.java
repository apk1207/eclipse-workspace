package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 */
	/*
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 */
	private int no;
	private String title;
	private String genre;
	private String detail;
	
	/*
	 * - 생성자를 정의하세요
	 */
	public Book() {
	}

	public Book(int no, String title, String genre, String detail) {
		this.no = no;
		this.title = title;
		this.genre = genre;
		this.detail = detail;
	}

	// getter, setter 메쏘드 선언
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	/*
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	public static void headerPrint() {
		System.out.println("번호\t이름\t전화번호\t책번호\t책제목\t책분류\t책설명");
		System.out.println("------------------------------------------------------------------");
	}
	
	public void print() {
		System.out.println(this.no +"\t"+this.title+"\t"+this.genre+"\t"+this.detail);
	}
	
	
	
}