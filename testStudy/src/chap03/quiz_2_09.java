package chap03;

/*
 * scanner문제
 * 2개의 수를 입력받아 나눗셈 계산
 * 2번쨰 수가 0 또는 0.0이면 결과값 무한대출력
 */
import java.util.Scanner;

public class quiz_2_09 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("첫번째 수: ");			
		double num1 = Double.parseDouble(scan.next());
		
		System.out.printf("두번째 수: ");			
		double num2 = Double.parseDouble(scan.next());
		
		System.out.println("--------------");
		
		if(num2 == 0.0) {
			System.out.println("결과: 무한대");
		} else {		
			System.out.println("결과: "+num1/num2);
		}
		
		
			
	}

}
