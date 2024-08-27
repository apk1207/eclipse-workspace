package bytestream.filter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputInputStreamMain {

	public static void main(String[] args) throws Exception {
		/*
		 * 자바기본데이타를 출력스트림에 쉽게쓸수있도록하는 필터(보조)스트림클래스
		 */
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataOut.dat"));
		int intData = 2147483647;
		dos.writeInt(intData);
		dos.writeByte(127);
		dos.writeBoolean(false);
		dos.writeDouble(3.14159);
		dos.writeChar('가');
		dos.writeUTF("오늘은자바입출력을 공부합니다!!!!");
		dos.close();
		System.err.println("DataOutputStream.writeXXX()-->dataOut.dat");
		/*
		 * 자바 기본데이터를 입력스트림으로부터 쉽게 읽을수 있도록 하는 필터(보조)스트림클래스
		 */
		DataInputStream dis = new DataInputStream(new FileInputStream("dataOut.dat"));
		int readInt = dis.readInt();
		System.out.println("int: "+readInt);
		System.out.println("byte: "+dis.readByte());
		System.out.println("boolean: "+dis.readBoolean());;
		System.out.println("double: "+dis.readDouble());
		System.out.println("char: "+dis.readChar());
		System.out.println("String: "+dis.readUTF());
		dis.close();
		
		
		
	}

}
