import java.util.Date;

public class ClockThread extends Thread {
	
	
	@Override
	public void run() {
		while(true) {
			try {
				Date now =new Date();
				//clockFrame.timeDisplayLB.setText(now.toLocaleString());
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}