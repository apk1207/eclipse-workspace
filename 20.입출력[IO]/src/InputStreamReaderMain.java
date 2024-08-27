import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class InputStreamReaderMain {

	public static void main(String[] args) throws Exception {
		InputStream consoleIn = System.in;
		InputStreamReader isr = new InputStreamReader(consoleIn);
		BufferedReader br = new BufferedReader(isr);
		/*
		 This method blocks until input data is available
		 */
		while(true) {
			System.out.println("콘솔(키보드)로부터 데이터를 읽기 위해 쓰레드가(실행흐름이) 대기(블록킹)됨");
			System.out.print("이름을 입력하세요: ");
			String readByte = br.readLine();
			if(readByte.equals("x")) break;
			System.out.println(readByte);			
		}
		System.out.println("프로그램 종료");
		
		
	}

}
