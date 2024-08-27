import java.io.InputStream;
import java.net.Socket;

public class JavaPackageImportMain {
	/*
	 * import 단축키
	 *  ctrl+ shift + o
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("---------java.lang package------------");
		java.lang.String str1 = "임포트";
		String str2 = "김경호";
		Object object = new Object();
		System.out.println(Math.random());
		System.out.println("---------java.lang이외 package------------");
		InputStream in;
		Socket socket = new Socket("www.naver.com", 80);
		System.out.println(socket);
		
		
		
		
		
		
		
		
		
		
	}

}
