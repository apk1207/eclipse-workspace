
public class PrintMain {

	public static void main(String[] args) {
		
		Print p = new Print();
		p.print("하하");
		p.print('하');
		p.print(1);
		p.print(0.23);
		p.print(1.15);
		p.print(2);
		p.print(false);
		p.print(3);
		System.out.println("-------------");
		p.print(10);
		p.print(10,20);
		p.print(10,20,30);
		System.out.println("-------------");
		
		System.out.println("문자열");
		System.out.println(123);
		System.out.println("햏");
		System.out.println(3.1);
		
		
	}

}
