package chap04;
/*
 * 4x + 5y = 60의 해 구하기 (x,y)의 형태로 출력
 * (x,y는 10이하의 자연수)
 */
public class quiz_2_04 {

	public static void main(String[] args) {
		for(int x = 1; x<=10; x++) {
			for(int y = 1; y<=10; y++) {
				if( (4*x + 5*y) == 60) {
					System.out.println("("+x+","+y+")");
				}
			
			}
		}
		
	}

}
