package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class DayTimeClientFrame extends JFrame {

	private JPanel contentPane;
	private JLabel timeDisplayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayTimeClientFrame frame = new DayTimeClientFrame();
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
	public DayTimeClientFrame() {
		setTitle("DayTimeClient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton requestServerTimeButton = new JButton("서버 시간 요청");
		requestServerTimeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**********************************/
				try {
					/*
					 * 1.Socket생성
					 */
					Socket socket=new Socket("192.168.15.6",8000);
					/*
					 * 2.Socket으로부터 InputStream얻기
					 *    - InputStream얻기
					      - InputStream[byte stream] 을 Reader[character stream]로 변경하는
					 * 			브릿지스트림(InputStreamReader) 을사용해서 변경
					 */
					BufferedReader in=
							new BufferedReader(
									new InputStreamReader(
											socket.getInputStream()));
					String serverTime = in.readLine();
					timeDisplayLabel.setText(serverTime);
					in.close();
					socket.close();
					
				}catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
				/**********************************/
			}
		});
		contentPane.add(requestServerTimeButton, BorderLayout.SOUTH);
		
		timeDisplayLabel = new JLabel("12:00");
		timeDisplayLabel.setForeground(Color.BLUE);
		timeDisplayLabel.setFont(new Font("굴림", Font.BOLD, 30));
		timeDisplayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(timeDisplayLabel, BorderLayout.CENTER);
	}

}