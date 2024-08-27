package basic;

public class ChildJFrameMain {

	public static void main(String[] args) {
		// 2.  컨테이너클래스(JFrame)객체생성
		//ChildJFrame childJFrame=
		//		new ChildJFrame();
		
		// 3.  컨테이너(JFrame)객체의 크기설정
		//childJFrame.setSize(300,400);
		//childJFrame.setTitle("나의첫번째프레임~~~");
		
		//6.  컨테이너객체 보여주기
		//childJFrame.setVisible(true);
		/*
		 * Container.setVisible(true);
		 *   - 메인쓰레드가 호출하면 JVM 이 GUI쓰레드를 생성
		 *   - GUI쓰레드는 무한대기하면서 GUI의 이벤트와 그래픽처리를 담당
		 *   - Container(GUI)는 종료되지 않는다.(JVM이종료되지않는다.)
		 */
		//System.out.println("main thread end and jvm return");
		return;
	}

}