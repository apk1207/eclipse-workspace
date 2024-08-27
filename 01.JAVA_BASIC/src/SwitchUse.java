
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 *  짝수, 홀수 판멸 후 출력
		 */
		int num = 34;
		
		switch (num%2) {
		case 0:
			System.out.println(num+ " 은 짝수입니다.");
			break;
		case 1:
			System.out.println(num+ " 은 홀수입니다.");
			break;
		}

		/*
		 * 입력되는 문자열에 따라 게임캐릭터 이동
		 */
		char direction = 's';
		switch(direction) {
		case 's':
			System.out.println("stop");
			break;
		case 'a':
			System.out.println("move left~~");
			break;
		case 'd':
			System.out.println("move right~~");
			break;
		case 'w':
			System.out.println("move up~~");
			break;
		case 'z':
			System.out.println("move down~~");
			break;
		default:
			System.out.println("nothing~~");
			break;
		}
		/*
		 * Quiz. 대소문자 구분없이 실행되도록 작성해보자
		 */
		
		char direction2 = 'D';
		switch(direction2) {
		case 'S':
		case 's':
			System.out.println("stop");
			break;
		case 'A':
		case 'a':
			System.out.println("move left~~");
			break;
		case 'D':
		case 'd':
			System.out.println("move right~~");
			break;
		case 'W':
		case 'w':
			System.out.println("move up~~");
			break;
		case 'Z':
		case 'z':
			System.out.println("move down~~");
			break;
		default:
			System.out.println("nothing~~");
			break;
		}
		
	}

}
