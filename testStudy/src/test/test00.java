package test;

public class test00 {

	public static void main(String[] args) {
		System.out.println("-------로또번호 6개생성(중복불가)--------");
		int[] lottoNumber = {0,0,0,0,0,0};
		/*
		 * 번호생성
		 */
		for(int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i]  = (int) (Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(lottoNumber[i] == lottoNumber[j]) {
					i--;
					break;
				} 
			}
		}
		System.out.println();
		for(int i = 0; i < lottoNumber.length; i++) {
			System.out.printf(lottoNumber[i]+" ");
		}
	}

}
