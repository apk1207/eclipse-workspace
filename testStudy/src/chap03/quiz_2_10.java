package chap03;
/*
 * 문자열덧셈
 * var2와 문자열 '.', var3을 합쳐 원주율을 만든후 원의 넓이 계산
 */
public class quiz_2_10 {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble((var2 + "." + var3));
		System.out.println("원의 넓이:"+ var4);
		
	}

}
