
public class IfScorePrintReturn {

	public static void main(String[] args) {
		
		int kor = -90;
		/*
		 * 1. 입력되는 점수의 유효성 체크
		 	 - 100점이 넘는 수나 음수가 입력되면 메세지를 출려하고 return(프로그램종료) 한다.
		 */
		
		if(kor< 0 || kor>100) {
			System.out.println(kor+"은 유효한 점수가 아닙니다.");
			/*
			 * 현재 실행흐름을 JVM에게 반환(return)한다.(프로그램 종료) 
			 */
			return;
		}
		
		/*
		 * 2.학점계산
		 */
		
		char hakjum = 'F';
		if(kor>=90 && kor<=100) {
			hakjum = 'A';
		} else if(kor>=80 && kor<=89) {
			hakjum = 'B';
		} else if(kor>=70 && kor<=79) {
			hakjum = 'c';
		}  else if(kor>=60 && kor<=69) {
			hakjum = 'd';
		} else {
			hakjum = 'F';
		}
		
		
		
		System.out.println("학점은 "+hakjum+"입니다.");
		return;
	}

}
