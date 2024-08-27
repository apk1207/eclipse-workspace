package lang;

public class StringCreateComapreMain {

	public static void main(String[] args) {
		/*
		 * String객체의생성
		 *    1. 생성자호출(명시적)
		 *    2. ""으로생성(암시적)
		 */
		String name1=new String("KIM");
		String name2=new String("KIM");
		String name3="KIM";
		String name4="KIM";
		
		/****String 객체주소비교****/
		if(name1 != name2) {
			System.out.println(">> name1과 name2의 주소는 다르다.");
		}
		if(name2 != name3) {
			System.out.println(">> name2과 name3의 주소는 다르다.");
		}
		if(name3 == name4) {
			System.out.println(">> name3과 name4의 주소는 같다.");
		}
		if(name1 != "KIM") {
			System.out.println(">> name1과 \"KIM\"의 주소는 다르다");
		}
		if(name3 == "KIM") {
			System.out.println(">> name3과 \"KIM\" 의 주소는 같다");
		}
		System.out.println("-----------String 객체의 값비교는 반드시 재정의된 equals메쏘드를 사용하여야합니다.------------");
		/*
		public boolean equals(Object anObject)
			Compares this string to the specified object. 
			The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.
		Overrides:
			equals in class Object
		 */
		if(name1.equals(name2)) {
			System.out.println("name1객체의 멤버필드문자열과  name2객체의 멤버필드 문자열이동일하다.");
		}
		if(name1.equals(name3)) {
			System.out.println("name1객체의 멤버필드문자열과  name3객체의 멤버필드 문자열이동일하다.");
		}
		if(name1.equals(name4)) {
			System.out.println("name1객체의 멤버필드문자열과  name4객체의 멤버필드 문자열이동일하다.");
		}
		if(name1.equals("KIM")) {
			System.out.println("name1객체의 멤버필드문자열과 \"KIM\" 객체의 멤버필드 문자열이동일하다.");
		}
		
		System.out.println("KIM".charAt(0));
		/*
		 public int compareTo(String anotherString)
		 		- Compares two strings lexicographically. 
				- The comparison is based on the Unicode value of each character in the strings. 
				- The result is a negative integer 
				   if this String object lexicographically precedes the argument string. 
				- The result is a positive integer 
				   if this String object lexicographically follows the argument string. 
			    - The result is zero if the strings are equal; compareTo returns 0 
			       exactly when the equals(Object) method would return true.
			       
		 */
		int unicodeGap = "aaa".compareTo("aaa");
		System.out.println(unicodeGap);
		unicodeGap = "aaa".compareTo("aab");
		System.out.println(unicodeGap);
		unicodeGap = "aab".compareTo("aaa");
		System.out.println(unicodeGap);
		
		String irum1="홍경호";
		String irum2="김경호";
		if(irum1.compareTo(irum2) > 0) {
			System.out.println("irum1 과 irum2교환[오름차순]");
		}
		
		
	
	}

}