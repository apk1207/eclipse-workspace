package lang;

public class MathMain {

	public static void main(String[] args) {
			/*
			 * Math클래스
				- 수학계산함수를 가지고있는 클래스
		    	- 모든메쏘드 static
		    	- 객체생성이 불가능(생성자 접근제 *   - 수학계산함수를 가지고있는 클래스
		 *   - 모든메쏘드 static
		 *   - 객체생성이 불가능(생성자 접근제한자 private)한자 private)
			 */
		
		
			/*
			 The constructor Math() is not visible
			 Math m=new Math();
			*/
			double r=Math.abs(-127.9);
			System.out.println(r);
			System.out.println(Math.max(999, 888));
			System.out.println(Math.min(999, 888));
			System.out.println(Math.round(35.5555));
			System.out.println(Math.round(35.5555*100)/100.0);
			System.out.println(Math.sqrt(2));
			System.out.println(Math.sqrt(3));
			System.out.println(Math.sqrt(4));
			System.out.println(Math.pow(2,12));
			System.out.println("----------Math.random()---------");
			/*
			public static double random()
			
				Returns a double value with a positive sign, 
					greater than or equal to 0.0 and less than 1.0.
			 */
			System.out.println(Math.random());
			System.out.println(Math.random());
			System.out.println(Math.random());
			System.out.println("1~10사이의 정수5개 랜덤생성");
			System.out.println((int)(Math.random()*10)+1);
			System.out.println((int)(Math.random()*10)+1);
			System.out.println((int)(Math.random()*10)+1);
			System.out.println((int)(Math.random()*10)+1);
			System.out.println((int)(Math.random()*10)+1);
			System.out.println("1~45사이의 정수6개 랜덤생성");
			System.out.println((int)(Math.random()*45)+1);
			System.out.println((int)(Math.random()*45)+1);
			System.out.println((int)(Math.random()*45)+1);
			System.out.println((int)(Math.random()*45)+1);
			System.out.println((int)(Math.random()*45)+1);
			System.out.println((int)(Math.random()*45)+1);
			
			
			
			
			
	}

}