
public class VariableRequire {

	public static void main(String[] args) {
		System.out.println("---------변수사용안함---------");
		System.out.println("<< 점수출력 >>");
		System.out.println(80);
		System.out.println(95);
		System.out.println(90);
		System.out.println("<< 총점출력 >>");
		System.out.println(80+95+90);
		System.out.println("<< 평균출력 >>");
		System.out.println((80+95+90)/3);
		
		System.out.println("---------변수사용함---------");
		int kor=80;
		int eng=95;
		int math=90;
		System.out.println("<< 점수출력 >>");
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println("<< 총점출력 >>");
		System.out.println(kor+eng+math);
		System.out.println("<< 평균출력 >>");
		System.out.println((kor+eng+math)/3);
		
	}

}
