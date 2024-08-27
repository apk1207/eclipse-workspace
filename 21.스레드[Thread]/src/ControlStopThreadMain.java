import java.util.Arrays;

class DownloadThread extends Thread{
	@Override
	public void run() {
		try {
			for(int i=1;i<=100;i++) {
				System.out.println("downloading...["+i+" %]");
				Thread.sleep(10);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+ " thread가 jvm return thread end");
		return;
	}
}
class GameThread extends Thread{
	private boolean isPlay;
	public GameThread() {
		isPlay=true;
	}
	
	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}

	@Override
	public void run() {
		while(isPlay) {
			try {
				System.out.println("-------------------------------");
				System.out.println("1.game move["+isPlay+"]");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("2.game fight["+isPlay+"]");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("3.game get scoe!["+isPlay+"]");
				Thread.sleep((int)(Math.random()*1000)+1);
				
				System.out.println("4.game power up["+isPlay+"]");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("5.game score update["+isPlay+"]");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("-------------------------------");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ControlStopThreadMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1.main");
		System.out.println("------Download-------");
		DownloadThread downloadThread=new DownloadThread();
		downloadThread.setName("<< download thread>>");
		downloadThread.start();
		Thread.sleep(3000);
		
		System.out.println("------Game   -------");
		
		GameThread gameThread=new GameThread();
		gameThread.start();
		Thread.sleep(5000);
		gameThread.setPlay(false);
		
		
		//downloadThread.join();
		//gameThread.join();
		System.out.println("9.main thread jvm return end");

		
	}

}