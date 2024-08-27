package chap04;
/*
 * 주사위를 2개 굴려(1~6범위)
 * 두 눈의 합이 5가 되면 종료되는 while문
 */
public class quiz_2_03 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		while(sum!=5) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println("첫번째 주사위: "+num1);
			System.out.println("두번째 주사위: "+num2);
			sum = num1 + num2;
			System.out.println("주사위 합: "+sum);
		}
	}
	
}
