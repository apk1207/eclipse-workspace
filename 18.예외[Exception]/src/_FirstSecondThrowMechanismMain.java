import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

public class _FirstSecondThrowMechanismMain {

	public static void main(String[] args) throws 	RuntimeException,
													FileNotFoundException,
													IOException,
													UnknownHostException{
		System.out.println("1.main실행흐름 start");
		_First first=new _First();
		System.out.println("2.main실행흐름 first.method1()호출전");
		first.method1();
		System.out.println("3.main실행흐름 first.method1()호출후 JVM에반환");
		return;
	}

}