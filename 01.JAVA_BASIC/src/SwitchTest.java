
public class SwitchTest {

	public static void main(String[] args) {
		int level = 2; // 게임 레벨 1~5 사이의 정수
		
		switch (level) {
		case 1:
			/* 명령문 기술 위치 */
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			/*
			 * break --> switch blocak을 빠져나간다.
			 */
			break;
		case 2:
			System.out.println("중수");
			break;
		case 3:
			System.out.println("고수");
			break;
		case 4:
			System.out.println("고수");		
			break;
		case 5:
			System.out.println("고수");
			break;

		default:
			System.out.println("게임 레벨은 1~5 사이의 정수입니다.");
			break;
		}
		
	}

}
