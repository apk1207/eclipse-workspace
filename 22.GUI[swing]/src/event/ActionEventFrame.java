package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*
1. 이벤트 소스 결정 :하나의 윈도우에는 여러 개의 컴포넌트가 존재할 수 있으므로
					 실제로 이벤트가 발생되면 처리할 컴포넌트를 결정한다. 
2. 이벤트 핸들러(리스너) 클래스작성 : 
			이벤트를 실제적으로 처리할 수 있도록 
            해당 이벤트를 처리할 이벤트 리스너 인터페이스를 
            이용해서(구현) 이벤트 핸들러(리스너) 클래스를 작성한다. 

3. 이벤트 소스객체와 이벤트 핸들러(리스너)객체 연결 :
 				이벤트 리스너(핸들러)가 작성이되면 리스너(핸들러)와 이벤트 소스와 연결을 하여 
 				이벤트 소스에서 실제적으로 이벤트가 발생이 되면 처리할수 있도록 
				addXXListener()함수를 통해 연결을 시켜준다.  
				XX부분은 해당 컴포넌트에 붙일 수 있는 리스너 이름을 의미한다.
	 
	  ex>버튼에서발생하는 ActionEvent를 처리할 Handler(ActionListener구현)객체생성
	  
	  예를 들어 버튼에 ActionEvent을 처리하기 위하여 
	  버튼에다가 addActionListener를 붙이는 경우이다.
	  ex> 버튼객체.addActionListener(ActionListener구현한핸들러객체);
*/
public class ActionEventFrame extends JFrame {

	private JPanel contentPane;
	private JLabel imageDisplayLB;
	private JButton firstBtn;
	private JButton secondBtn;
	private JButton thirdBtn;
	private JButton fourthBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionEventFrame frame = new ActionEventFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ActionEventFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		firstBtn = new JButton("FIRST");
		firstBtn.addActionListener(new FirstButtonActionEventHandler());
		
		
		contentPane.add(firstBtn);
		
		secondBtn = new JButton("SECOND");
		secondBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imageDisplayLB.setIcon(new ImageIcon(ActionEventFrame.class.getResource("/event/image/car2.jpg")));
			}
		});
		contentPane.add(secondBtn);
		
		thirdBtn = new JButton("THIRD");
		thirdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imageDisplayLB.setIcon(new ImageIcon(ActionEventFrame.class.getResource("/event/image/car3.jpg")));
			}
		});
		contentPane.add(thirdBtn);
		
		fourthBtn = new JButton("FOURTH");
		fourthBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imageDisplayLB.setIcon(new ImageIcon(ActionEventFrame.class.getResource("/event/image/car4.jpg")));
			}
		});
		contentPane.add(fourthBtn);
		
		imageDisplayLB = new JLabel("");
		imageDisplayLB.setIcon(new ImageIcon(ActionEventFrame.class.getResource("/event/image/no_image.png")));
		contentPane.add(imageDisplayLB);
	}
	/********member inner class[FIRST BUTTON EVENT HANDLER]***********/
	public class FirstButtonActionEventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			imageDisplayLB.setIcon(new ImageIcon(ActionEventFrame.class.getResource("/event/image/car1.jpg")));
			
		}
		
	}
}