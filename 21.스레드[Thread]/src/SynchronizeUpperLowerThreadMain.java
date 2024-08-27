
class PrintShareObject{
	public  void printUpper() {
		synchronized (this) {
			System.out.print("A");
			System.out.print("B");
			System.out.print("C");
			System.out.print("D");
			System.out.print("E");
			System.out.print("F");
			System.out.print("G");
			System.out.print("H");
			System.out.print("I");
			System.out.print("J");
			System.out.print("K");
			System.out.print("L");
			System.out.print("M");
			System.out.print("N");
			System.out.print("O");
			System.out.print("P");
			System.out.print("Q");
			System.out.print("R");
			System.out.print("S");
			System.out.print("T");
			System.out.print("U");
			System.out.print("V");
			System.out.print("W");
			System.out.print("X");
			System.out.print("Y");
			System.out.print("Z");
		}
	}
	public synchronized void printLower() {
		synchronized (this) {
			System.out.print("a");
			System.out.print("b");
			System.out.print("c");
			System.out.print("d");
			System.out.print("e");
			System.out.print("f");
			System.out.print("g");
			System.out.print("h");
			System.out.print("i");
			System.out.print("j");
			System.out.print("k");
			System.out.print("l");
			System.out.print("m");
			System.out.print("n");
			System.out.print("o");
			System.out.print("p");
			System.out.print("q");
			System.out.print("r");
			System.out.print("s");
			System.out.print("t");
			System.out.print("u");
			System.out.print("v");
			System.out.print("w");
			System.out.print("x");
			System.out.print("y");
			System.out.print("z");
		}
		
	}
}


class UpperPrintThread extends Thread{
	private PrintShareObject printShareObject;
	public UpperPrintThread(PrintShareObject printShareObject ) {
		this.printShareObject=printShareObject;
	}
	@Override
	public void run() {
		while(true) {
			printShareObject.printUpper();
		}
	}
}
class LowerPrintThread extends Thread{
	private PrintShareObject printShareObject;
	public LowerPrintThread(PrintShareObject printShareObject) {
		this.printShareObject=printShareObject;
	}
	@Override
	public void run() {
		while(true) {
			printShareObject.printLower();
		}
	}
}
/*
 * 콘솔에서 실행하는방법
 *   
 *   윈도우시작메뉴 --> 검색창에 cmd 입력후  오른쪽패널 관리자권한으로 실행
 *   
 *   콘솔실행 
 *   
 Microsoft Windows [Version 10.0.22631.3880]
 (c) Microsoft Corporation. All rights reserved.

C:\Windows\System32> cd C:\2024-07-JAVA-DEVELOPER\eclipse-workspace\21.쓰레드[Thread]\bin

C:\2024-07-JAVA-DEVELOPER\eclipse-workspace\21.쓰레드[Thread]\bin>dir
 
 C:\2024-07-JAVA-DEVELOPER\eclipse-workspace\21.쓰레드[Thread]\bin 디렉터리

2024-08-02  오후 03:54    <DIR>          .
2024-07-26  오전 09:39    <DIR>          ..
2024-08-02  오후 02:17               729 ControlJoinThread.class
2024-08-02  오후 02:17             1,549 ControlJoinThreadMain.class
2024-08-02  오전 11:37             1,378 ControlPriorityThread.class
2024-08-02  오전 11:37               660 ControlPriorityThreadMain.class
2024-08-02  오후 02:12               825 ControlSleepThread.class
2024-08-02  오후 02:12               955 ControlSleepThreadMain.class
2024-08-02  오후 03:48             1,102 ControlStopThreadMain.class
2024-08-02  오전 11:22             1,155 CreateCustomThread.class
2024-08-02  오전 11:22               971 CreateCustomThreadMain.class
2024-08-02  오후 03:48             1,383 DownloadThread.class
2024-08-02  오후 03:48             1,672 GameThread.class
2024-08-02  오후 04:32               516 LowerPrintThread.class
2024-08-02  오전 10:56             1,148 MainThreadCalled.class
2024-08-02  오전 10:56             1,483 MainThreadMain.class
2024-08-02  오후 04:32             1,545 PrintShareObject.class
2024-08-02  오후 04:32               653 SynchronizeUpperLowerThreadMain.class
2024-08-02  오후 04:32               516 UpperPrintThread.class
              17개 파일              18,240 바이트
               2개 디렉터리  64,071,471,104 바이트 남음 
    
C:\2024-07-JAVA-DEVELOPER\eclipse-workspace\21.쓰레드[Thread]\bin>java  SynchronizeUpperLowerThreadMain  
 */

public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		PrintShareObject printShareObject=new PrintShareObject();
		UpperPrintThread upperPrintThread=new UpperPrintThread(printShareObject);
		LowerPrintThread lowerPrintThread=new LowerPrintThread(printShareObject);
		upperPrintThread.start();
		lowerPrintThread.start();
		
	}

}