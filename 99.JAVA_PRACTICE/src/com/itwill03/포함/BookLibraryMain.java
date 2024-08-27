package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember[] members = { 
				new BookMember(1, "KIM", "010-1111-1111",null),
				new BookMember(2, "LIM", "010-2222-2222",null),
				new BookMember(3, "JIM", "010-3333-3333",null),
				new BookMember(4, "KANG", "010-4444-4444",null),
				new BookMember(5, "CHOI", "010-5555-5555",null),
				new BookMember(6, "LEE", "010-6666-6666",null),
				new BookMember(7, "SONG", "010-7777-7777",null),
				new BookMember(8, "PARK", "010-8888-8888",null),
				new BookMember(9, "YANG", "010-9999-9999",null),
				new BookMember(10, "SHIN", "010-1010-1010",null)
				};
		
		
		/*
		 * 책객체생성
		 */
	
		Book[] books = {
				new Book(1, "1번책", "추리", "추리입니다"),
				new Book(2, "2번책", "판타지", "판타지입니다"),
				new Book(3, "3번책", "공포", "공포입니다"),
				new Book(4, "4번책", "과학", "과학입니다"),
				new Book(5, "5번책", "게임", "게임입니다"),
				new Book(6, "6번책", "무협", "무협입니다"),
				new Book(7, "7번책", "추리", "추리입니다"),
				new Book(8, "8번책", "판타지", "판타지입니다"),
				new Book(9, "9번책", "판타지", "판타지입니다"),
				new Book(10, "10번책", "게임", "게임입니다")
		};
		
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 * 회원데이터에 같은번호를 가진 책 객체 데이터 대입
		 */
		
		for (int i = 0; i < members.length; i++) {
			for (int j = 0; j < books.length; j++) {
				if(i == j) {
					members[i].setBook(books[j]);
					continue;
				}
			}
		}
		

		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		
		Book.headerPrint();
		for(BookMember member: members) {
			member.print();
		}
		
	}
}