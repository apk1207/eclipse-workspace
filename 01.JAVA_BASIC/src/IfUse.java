
public class IfUse {

	public static void main(String[] args) {
		int no1 = 11;
		if(no1%2 == 0) {
			System.out.println(no1 +"은 짝수");
		} else {
			System.out.println(no1 +"은 홀수");
		}
		
		int no2 = 565;
		if(no2%4 == 0) {
			System.out.printf("%d는 4의 배수\n", no2);
		} else {
			System.out.printf("%d는 4의 배수아님\n", no2);
		}
		
		int kor = -34;
		if(kor>=0 && kor<=100) {
			System.out.printf("%d는 유효한 점수\n", kor);
		} else {
			System.out.printf("%d는 안 유효한 점수\n", kor);			
		}
		
		int year = 2024;
		if( ((year%4 == 0) && (year%100 != 0)) || year%400 == 0) {
			System.out.printf("%d는 윤년입니다.\n", year);
		} else {
			System.out.printf("%d는 평년입니다.\n", year);
		}
		
		
		char c = '1';
		if(c>='a' && c<='z') {
			System.out.printf("%c 는 알파벳 소문자입니다.\n",c);
		}
		if(c>='A' && c<='Z') {
			System.out.printf("%c 는 알파벳 대문자입니다.\n",c);
		}
		if(c>='0' && c<='9') {
			System.out.printf("%c 는 숫자형태의문자입니다.\n",c);
		}
		
		/*
		 다음문자는 아이디의 첫글자입니다. 
		 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		   - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */
		
		char idFirstLetter='&';
		if((idFirstLetter>='A' && idFirstLetter<='Z')||(idFirstLetter>='a' && idFirstLetter<='z')) {
			System.out.printf("%c 는 유효한 아이디문자입니다.",idFirstLetter);
		}else {
			System.out.printf("%c 는 유효하지않은 아이디문자입니다.",idFirstLetter);
		}
		
		
	}

}
