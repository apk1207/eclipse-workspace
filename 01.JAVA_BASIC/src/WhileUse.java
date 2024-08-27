
public class WhileUse {

	public static void main(String[] args) {
		/*
		 * 10회 반복실행
		 */
		System.out.println("------------ i=0 -------------");
		int i = 0;
		while(i<10) {
			System.out.println("stmt i--> "+i);
			i++; // i = i+1;
		}
		System.out.println("------------ i=1 -------------");
		i = 1;
		while(i<10) {
			System.out.println("stmt i--> "+i);
			i++; // i = i+1;
		}
		
		System.out.println(">> 1~10 사이의 정수출력");
		i = 1;
		while(i<=10) {
			System.out.print(i+" ");
			i++; // i = i+1;
		}
		
		System.out.println(">> 1~10 사이의 정수 중 홀수만 출력");
		i = 1;
		while(i<=10) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
			i++; // i = i+1;
		}
		
		System.out.println(">> 1~100 사이의 정수 중 4의 배수만 출력");
		i = 1;
		while(i<=100) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
			i++; // i = i+1;
		}
		/*
		 * quiz. 1900년도부터 2024년까지 윤년인 연도를 출력하세요
		 */
		
		
		/*
		 * 누적
		 */
		System.out.println(">> 1~100사이의 정수의합[누적]");
		i=1;
		int tot=0;		//누적합
		int evenTot=0;	//짝수합
		int oddTot=0;	//홀수합
		while(i<=100) {
			//tot = tot+i;
			tot+=i;//연산후 대입연산자
			if(i%2==0) {
				evenTot+=i; // evenTot = evenTot + i;
			}else {
				oddTot+=i; // oddTot = oddTot + i;
			}
			i++;
		}
		System.out.println("1~100사이의 정수합: "+tot);
		System.out.println("1~100사이의 홀수합: "+oddTot);
		System.out.println("1~100사이의 짝수합: "+evenTot);
		
		
	}

}
