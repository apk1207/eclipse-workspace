package bytestream.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputInputStreamMain {

	public static void main(String[] args) throws Exception {
		// 파일 쓰기
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bufferedOut.dat"));
		bos.write(65);
		bos.write(66);
		bos.write(67);
		bos.write(251);	// 256을 넣으면 범위초과로 00000000이 입력된다 255까지 정수입력가능
		for (int i = 0; i < 256; i++) {
			bos.write(i);
		}
		bos.close();
		System.out.println("BufferedOutputStream.write--> bufferedOut.dat");
		
		// 파일 읽기
		/**********BufferedInputStream입력*************/
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bufferedOut.dat"));
		
		while(true) {
			int readByte = bis.read();
			if(readByte == 0) {
				break;
			}
			System.out.println(Integer.toBinaryString(readByte));	// 정수형데이터를 이진문자열데이터로 변환
		}
		bis.close();
		System.out.println();
		System.out.println("BufferedInputStream.read <---bufferedOut.dat");
			
	}		
}


