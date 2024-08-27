package basic;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * GUI프로그래밍 방법
 *   1.  컨테이너클래스준비(JFrame)상속
 *   2.  컨테이너클래스(JFrame)객체생성
 *   3.  컨테이너(JFrame)객체의 크기설정
 *   4.  컴포넌트생성(컨테이너(JFrame)의 멤버필드)
 *   5.  컨테이너(JFrame)에 컴포넌트 부치기(add) 
 *   6.  컨테이너객체 보여주기
 */

//1.  컨테이너클래스준비(JFrame)상속
public class ChildJFrame extends JFrame {
	/*
	 * 컴포넌트를 멤버필드로선언
	 */
	private JPanel contentPane;
	private JButton loginButton;
	private JButton JoinButton;
	
	public ChildJFrame() {
		contentPane=new JPanel();
		contentPane.setBackground(Color.GRAY);
		this.setContentPane(contentPane);
		// 3.  컨테이너(JFrame)객체의 크기설정
		this.setSize(300,400);
		//4.  컴포넌트생성(컨테이너(JFrame)의 멤버필드)
		loginButton=new JButton("로그인");
		JoinButton=new JButton("회원가입");
		
		/*
		 * contentPane배치관리자제거
		 */
		contentPane.setLayout(null);
		
		// 5.  컨테이너(JFrame)에 컴포넌트 부치기(add) 
		loginButton.setBounds(40,160,90,40);
		JoinButton.setBounds(150,160,90,40);
		
		contentPane.add(loginButton);
		contentPane.add(JoinButton);
		
	}
	public static void main(String[] args) {
		// 2.  컨테이너클래스(JFrame)객체생성
		ChildJFrame childFrame= new ChildJFrame();
		childFrame.setVisible(true);
		System.out.println("main thread end and jvm return");
		return;
	}
	
}