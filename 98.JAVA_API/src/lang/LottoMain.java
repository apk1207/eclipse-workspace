package lang;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("------------- 로또번호 6개생성[증복번호]");
		int[] lottoNumber = {0,0,0,0,0,0};
		
		for(int i =0; i < lottoNumber.length; i++) {
			lottoNumber[i] = (int)(Math.random()*45)+1;
		}
		System.out.println();
		/*
		 * 번호출력
		 */
		for(int no:lottoNumber) {
			System.out.print(no+" ");
		}
		System.out.println();
		
		
	}

}
