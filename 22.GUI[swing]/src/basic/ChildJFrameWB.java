package basic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.Toolkit;

public class ChildJFrameWB extends JFrame {

	private JPanel contentPane;
	private JButton loginButton;
	private JButton joinButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		ChildJFrameWB frame = new ChildJFrameWB();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public ChildJFrameWB() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\2024-07-JAVA-DEVELOPER\\01.JAVA_FUNDMENTAL\\image\\w.png"));
		setResizable(false);
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 221);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		loginButton = new JButton("로그인");
		loginButton.setBounds(22, 127, 122, 36);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> 로그인");
			}
		});
		contentPane.setLayout(null);
		contentPane.add(loginButton);
		
		joinButton = new JButton("회원가입");
		joinButton.setBounds(186, 125, 114, 38);
		joinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> 회원가입");
			}
		});
		contentPane.add(joinButton);
	}
}