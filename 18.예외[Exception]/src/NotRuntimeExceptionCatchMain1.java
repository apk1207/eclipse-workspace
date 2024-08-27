import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NotRuntimeExceptionCatchMain1 {

	public static void main(String[] args)  {
		try {
			System.out.println("stmt1");
			
			/*
			예외발생예상코드(IOException)
			  1.예외발생시 IOException객체생성 
			IOException객체가 던져짐
			  2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 IOException객체대입)  
			  3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			
			Socket socket=new Socket("www.daum.net",80);
			System.out.println(socket);
			
			System.out.println("stmt2");
			
			/*
			 예외발생예상코드(ClassNotFoundException)
			  1.예외발생시 ClassNotFoundException객체생성 
				ClassNotFoundException객체가 던져짐
			  2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 ClassNotFoundException객체대입)  
			  3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			
			Class bClass = Class.forName("BClass"); 
			System.out.println(bClass);
			
			
			/*
			 예외발생예상코드(ArithmeticException[RuntimeException])
				1.예외발생시 ArithmeticException객체생성 
				ArithmeticException객체가 던져짐
			  	2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 ArithmeticException객체대입)  
			  	3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */

			int result = 3/(int)(Math.random()*2);
			System.out.println(result);
			System.out.println("stmt3");
		
		}catch(UnknownHostException e) {
			System.err.println("\t catch UnknownHostException:"+e.getMessage());
			try {
				Socket socket = new Socket("www.daum.net",80);
				System.out.println("\t catch:"+socket);
			}catch (Exception e1) {
				System.out.println("catch-->catch Exception:"+e1.getMessage());
			} 
		}catch (IOException e) {
			System.err.println("catch IOException:"+e.getMessage());
		}catch (ClassNotFoundException e) {
			System.err.println("catch ClassNotFoundException:"+e.getMessage());
			try {
				Class aClass=Class.forName("AClass");
				System.out.println("catch :"+aClass);
			}catch (ClassNotFoundException e1) {
				System.out.println("catch --> catch:"+e1.getMessage());
			}
		}catch (Exception e) {
			System.err.println("catch Exception:"+e.getMessage());
		}
		System.out.println("메인실행흐름 JVM return");
		return;
	}
}