/*
		논리연산자
		   - 형태:   ||(Logical OR) , && (Logical AND) ( |,& )
		   - 좌우측의항이 논리형변수(데이타)이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false

*/
public class OperatorLogical {

	public static void main(String[] args) {
		boolean b1,b2,b3,b4;
		boolean result;
		
		b1=true;
		b2=true;
		b3=false;
		b4=false;
		
		/*
		 * 논리합(logical or) || --> false || false 인경우에만 false를 반환
		 */
		
		result = b1 || b2;
		System.out.println("true || true --> "+result);
		result = b1 || b3;
		System.out.println("true || false --> "+result);
		result = b3 || b1;
		System.out.println("false || true --> "+result);
		result = b3 || b4;
		System.out.println("false || false --> "+result);
		
		/*
		 * 논리곱(logical and) && --> true && true 인 경우에만 true를 반환
		 */
		
		result = b1 && b2;
		System.out.println("true && true --> "+result);
		result = b1 && b3;
		System.out.println("true && false --> "+result);
		result = b3 && b1;
		System.out.println("false && true --> "+result);
		result = b3 && b4;
		System.out.println("false && false --> "+result);
		
		
		/*
		 * 점수의 유효성 체크
		 */
		
		int kor = 78;
		int eng = 90;
		
		boolean condition1 = kor >= 0;
		boolean condition2 = kor <= 100;
		
		boolean isValidScore = condition1 && condition2;
		System.out.println("국어점수 유효성 체크 : "+isValidScore);
		
		System.out.println("A대학: 국어,영어 점수 중에 하나라도 90점 이상이면 합격");
		System.out.println("B대학: 국어,영어 점수 모두 90점 이상이면 합격");
		
		boolean isPass1 = (kor >= 90) || (eng >= 90);
		boolean isPass2 = (kor >= 90) && (eng >= 90);
		System.out.println("\tA대학 합격여부: "+isPass1);
		System.out.println("\tB대학 합격여부: "+isPass2);
		
		
		System.out.println("----배수판별----");
		int number=12;
		boolean isMuitiple3 = (number%3) == 0;
		System.out.println("3의배수여부:"+isMuitiple3);
		boolean isMuitiple4 = (number%4) == 0;
		System.out.println("4의배수여부:"+isMuitiple4);
		System.out.println("3과4의 공통배수여부:"+(isMuitiple3 && isMuitiple4));
		
		/*
		 * Quiz: 윤년여부판단 
		 * - 4의배수(4로나누어떨어지는수)이면서 
		 *   100의배수가아닌수(100로나누어떨어지는않는수) 이거나
		 *   400의배수(400로나누어떨어지는수)가 윤년
		 */
		
		int year = 1980;
		boolean isLeapYear = (year%4==0)&&(year%100!=0)||(year%400==0);
		System.out.println("윤년여부: "+isLeapYear);
		
		/*
		 * Quiz. 한글 여부 판단
		 * '가' ~ '힣' 
		 */
		
		char c = '꿈';
		boolean isHangul = (c >= '가') && (c <= '힣');
		System.out.println("한글여부: "+isHangul);
		
		/*
		 * Quiz. 아이디의 첫 글자는 영문 대문자나 소문자이어야 한다.
		 * 'A' ~ 'Z', 'a' ~ 'z'
		 */
		
		char idFirstLetter = '1';
		boolean isValidId = (idFirstLetter>='A' && idFirstLetter<='Z') || 
				 (idFirstLetter>='a' && idFirstLetter<='z');
		System.out.println("아이디의 적합성 여부: "+isValidId);
		
		
		
	}

}