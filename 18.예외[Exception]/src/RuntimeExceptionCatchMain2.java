import javax.swing.JOptionPane;

public class RuntimeExceptionCatchMain2  {
	/*
	* 모든메쏘드는 throws RuntimeException구문이생략되어있다
	*/
	public static void main(String[] args) /*throws RuntimeException*/ {
		try {
			System.out.println("stmt1");
			String str=null;
			if((int)(Math.random()*2)==0) {
				str="예외";
			}
			/*
			 예외발생예상코드
			 */
			int length = str.length();
			System.out.println("length:"+length);
			/*
			 1. 예외상황발생하면  NullPointerException객체생성한후 
			    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
			 2. 던져진 예외객체는 catch block에 선언된 변수의 타입을검사해서 타입에일치하는 
			    변수에 대입된다.   
			 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
			 */
			
			System.out.println("stmt2");
			int [] intArray=new int[3];
			/*
			 예외발생예상코드
			 */
			intArray[(int)(Math.random()*5)]=9999;
			/*
			 1. 예외상황발생하면  ArrayIndexOutOfBoundsException객체생성한후 
			예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
			 2. 던져진 예외객체는 catch block에 선언된 변수의 타입을검사해서 타입에일치하는 
			변수에 대입된다.   
			 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
			 */
			System.out.print(intArray[0]+" ");
			System.out.print(intArray[1]+" ");
			System.out.print(intArray[2]+" ");
			System.out.println();
			
		}catch (Exception e) {
			System.err.println("--------catch start[Exception]---------------");
			System.err.println("Exception:"+e.getMessage());
			System.err.println("--------catch end  [Exception]---------------");
		    JOptionPane.showMessageDialog(null, "호갱님 죄송합니다. 프로그램을종료합니다.");
		    /*
		     * Terminates the currently running Java Virtual Machine.
		     */
		    System.exit(0);
		    
		}
		System.out.println("jvm 실행흐름 return");
		return;
	}

}