import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NotRuntimeExceptionThrowMain {

	public static void main(String[] args) throws UnknownHostException, IOException,ClassNotFoundException /* ,RunTimeException */ {
		
		System.out.println("stmt1");
		/*
		 * 예외발생예상코드(IOException)
		 */
		Socket socket=new Socket("www.daum.net",80);
		System.out.println(socket);
		
		System.out.println("stmt2");
		/*
		 * 예외발생예상코드(ClassNotFoundException)
		 */
		Class aClass =Class.forName("AClass"); 
		System.out.println(aClass);
		
		/*
		 * 예외발생예상코드(ArithmaticException[RuntimeException])
		 */
		int result = 3/(int)(Math.random()*2);
		System.out.println("stmt3");
		

	}

}