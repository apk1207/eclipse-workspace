/*
type A:
	1. Thread 클래스를 상속받는다.
	2. Thread class의 run method를 overriding 한다.
		동사원형:public void run()
		- 쓰레드가 실행할 코드
	3. Thread 객체를 생성한다.
	4. Thread 객체를통해서 Thread를 시작시킨다.
*/	
class CreateCustomThread extends Thread{
	/*
	 * public void run()
	 *  - CreateCustomThread객체를 통해서생성된 쓰레드가 호출하는 메쏘드
	 */
	@Override
	public void run() {
		while(true) {
			System.out.println("가."+Thread.currentThread().getName()+" 쓰레드실행시작");
			System.out.println("나."+Thread.currentThread().getName()+" 쓰레드실행종료");
		}
	}
}


public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main thread start");
		System.out.println("2.main thread가 CreateCustomThread 쓰레드객체생성");
		CreateCustomThread createCustomThread=new CreateCustomThread();
		createCustomThread.setName("사용자정의쓰레드");
		System.out.println("3.main thread가 CreateCustomThread 쓰레드객체시작");
		createCustomThread.start();
		/*
		public void start()
			Causes this thread to begin execution;
			the Java Virtual Machine calls the run method of this thread.
			The result is that two threads are running concurrently: 
				- the current thread (which returns from the call to the start method) 
				   and the other thread (which executes its run method).

			It is never legal to start a thread more than once. In particular, 
			a thread may not be restarted once it has completed execution.
		 */
		while(true) {
			System.out.println("4.main thread");
		}
	}

}