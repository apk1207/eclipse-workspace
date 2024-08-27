
public class IfTest2 {

	public static void main(String[] args) {
		int x = 21;
		int y = 30;
		
		if(x > y) {
			System.out.println("21 > 30 --> true");
		} else {
			System.out.println("21 > 30 --> false");			
		}
		
		if(x < y) {
			System.out.println("21 < 30 --> true");
		} else {
			System.out.println("21 < 30 --> false");			
		}
		
		if(x != y) {
			System.out.println("21 != 30 --> true");
		}
		
		/*
		 지역변수(local variable)
		   - 클래스 블록을 제외한 블록안에 선언된 변수
		   - 지역변수의 범위(선언된 블록 안에서만 사용가능하다.) 
		 */
		
		int kor = 98;
		if(kor>=90) {
			char grade = 'A';
			String msg = "참 잘했어요~~";
			System.out.println("kor --> "+kor);
			System.out.println("grade --> "+grade);
			System.out.println("msg --> "+msg);
		}
		// System.out.println("kor --> "+kor);
		// System.out.println("grade --> "+grade);
		// System.out.println("msg --> "+msg);
		
		
		
	}

}
