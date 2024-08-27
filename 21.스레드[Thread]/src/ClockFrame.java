import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import javax.swing.ImageIcon;

public class ClockFrame extends JFrame {
	
	JPanel contentPane;
	JLabel timeDisplayLB;
	private JLabel imageLB;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockFrame frame = new ClockFrame();
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
	public ClockFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 148);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		timeDisplayLB = new JLabel("12:00");
		timeDisplayLB.setFont(new Font("굴림체", Font.BOLD, 17));
		timeDisplayLB.setForeground(new Color(0, 0, 255));
		timeDisplayLB.setBounds(93, 20, 259, 69);
		contentPane.add(timeDisplayLB);
		
		imageLB = new JLabel("");
		imageLB.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\01.JAVA_FUNDMENTAL-master\\01.JAVA_FUNDMENTAL-master\\image\\penguin\\penguin1.gif"));
		imageLB.setBounds(12, 20, 60, 69);
		contentPane.add(imageLB);
		
		ClockThread clockThread=new ClockThread();
		clockThread.start();
		ImageThread imageThread=new ImageThread();
		imageThread.start();
		
	}//생성자끝
	
	private int imageIndex = 0;
	
	/****************ClockThread[멤버클래스]****************/
	public class ClockThread extends Thread {
		
		@Override
		public void run() {
			while(true) {
				try {
					Date now =new Date();
					timeDisplayLB.setText(now.toLocaleString());
					Thread.sleep(1000);
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*******************************************************/
	/****************ImageThread[멤버클래스]****************/
	public class ImageThread extends Thread {
		
		@Override
		public void run() {
			while(true) {
				try {
					imageIndex = imageIndex%3;
					imageIndex++;
					imageLB.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\01.JAVA_FUNDMENTAL-master\\01.JAVA_FUNDMENTAL-master\\image\\penguin\\penguin"+imageIndex+".gif"));
					Thread.sleep(100);
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*******************************************************/
}