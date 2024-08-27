/*
 * 관계(비교)연산자
 *   - 형태 : > , < , >= , <= , == , !=
 *   - 관계연산의 결과값은 논리형데이터(true, false)
 */
public class OpratorRelational {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean result = a > b;
		System.out.println(" 10 > 20 --> "+result);
		
		result = a >= b;
		System.out.println(" 10 >= 20 --> "+result);
		
		result = a < b;
		System.out.println(" 10 < 20 --> "+result);
		
		result = a <= b;
		System.out.println(" 10 <= 20 --> "+result);
		
		result = a == b;
		System.out.println(" 10 == 20 --> "+result);
		
		result = a != b;
		System.out.println(" 10 != 20 --> "+result);
		
		System.out.println("---문자비교---");
		char ca = 'a';
		char cb = 'b';
		result = ca > cb;
		System.out.println("'a' > 'b' --> "+result);
		
		result = (ca-cb) > 0;
		System.out.println("('a'-'b') > 0 --> "+result);
		
		result = '가'>'나';
		System.out.println("'가'>'나' --> "+result);
		
		result = ('가'-'나') > 0;
		System.out.println("('가'-'나') > 0 --> "+result);
		

	}

}