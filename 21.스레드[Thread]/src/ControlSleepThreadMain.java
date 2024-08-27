import java.util.Date;

class ControlSleepThread extends Thread{
	@Override
	public void run() {
		
		while(true) {
			try {
				Date now=new Date();
				System.out.println(now.toLocaleString());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
}

public class ControlSleepThreadMain {
	public static void main(String[] args) throws Exception{
		System.out.println("1.main");
		System.out.println("2.main thread 3초간 sleep");
		/*
		 * 현재코드를 실행하는 쓰레드를 3000ms동안 실행중지
		 */
		Thread.sleep(3000);
		ControlSleepThread controlSleepThread=new ControlSleepThread();
		controlSleepThread.start();
		System.out.println("3.main join호출후대기");
		controlSleepThread.join();
		System.out.println("4.main thread jvm return");
		return;
	}

}