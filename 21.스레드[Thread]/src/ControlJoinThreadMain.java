class ControlJoinThread extends Thread{
	private int start;
	private int end;
	private int total;
	
	public ControlJoinThread(int start,int end) {
		this.start=start;
		this.end=end;
	}
	
	@Override
	public void run() {
		for(int i=start;i<=end;i++) {
			total+=i;
		}
		return;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}


public class ControlJoinThreadMain {

	public static void main(String[] args) throws Exception{
		ControlJoinThread controlJoinThread1=new ControlJoinThread(1, 50);
		ControlJoinThread controlJoinThread2=new ControlJoinThread(51, 100);
		controlJoinThread1.start();
		controlJoinThread2.start();
		/*
		 * controlJoinThread1.join() 메쏘드를 호출한 메인쓰레드를 controlJoinThread1 쓰레드가 종료될때까지 중지시킨다.
		 * controlJoinThread2.join() 메쏘드를 호출한 메인쓰레드를 controlJoinThread2 쓰레드가 종료될때까지 중지시킨다.
		*/
		System.out.println(">> controlJoinThread1.join();");
		controlJoinThread1.join();
		System.out.println(">> controlJoinThread2.join();");
		controlJoinThread2.join();
		/***********************계산이끝난이후에 결과출력********************************/
		int lastTotal = controlJoinThread1.getTotal()+controlJoinThread2.getTotal();
		System.out.println("controlJoinThread1 total:"+controlJoinThread1.getTotal());
		System.out.println("controlJoinThread2 total:"+controlJoinThread2.getTotal());
		System.out.println("lastTotal="+lastTotal);
	}

}