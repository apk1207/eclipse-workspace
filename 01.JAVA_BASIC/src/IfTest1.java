
public class IfTest1 {
	/*
	 * 들여쓰기 정렬 단축키 ctrl + shft + f
	 */

	public static void main(String[] args) {
		System.out.println("main block start");
		System.out.println("stmt1");
		boolean condition = false;
		if (condition) {
			/*
			 * condition변수의 값이 true일때 실행되는 코드
			 */
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");
		}
		System.out.println("stmt5");
		if (condition) {
			/*
			 * condition변수의 값이 true일때 실행되는 코드
			 */
			System.out.println("stmt6");
			System.out.println("stmt7");
		} else {
			/*
			 * condition변수의 값이 false일때 실행되는 코드
			 */
			System.out.println("stmt8");
			System.out.println("stmt9");
		}
		System.out.println("stmt10");
		
		if (condition)
			System.out.println("stmt11");	
		
		System.out.println("stmt12");
		
		if (condition)
			System.out.println("stmt13");
		else
			System.out.println("stmt14");
		
		System.out.println("stmt15");
		System.out.println("main block end");
		
		
		/*
		 * return 문
		 *   - 현재 return문을 실행하는 실행흐름을 해당 main블럭을 호출한곳(JVM)으로 반환한다.
		 *   - 생략가능하다.
		 */

		return;

		
	}

}
