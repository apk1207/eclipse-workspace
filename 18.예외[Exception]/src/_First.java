import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

public class _First {
	private _Second second;
	public _First() {
		second=new _Second();
	}
	public void method1() throws 	RuntimeException,
									FileNotFoundException,
									IOException,
									UnknownHostException{
		System.out.println("\t First.method1()실행");
		second.method2();
		System.out.println("\t First.method1()반환");
		return;
	}

}