package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EchoClientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField echoTF;
	private JScrollPane echoScrollPane;
	private JTextArea echoTA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EchoClientFrame frame = new EchoClientFrame();
					frame.setVisible(true);
					frame.echoTF.requestFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EchoClientFrame() {
		setTitle("EchoClientFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 268);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		echoTF = new JTextField();
		echoTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String echoString = echoTF.getText();
					if(echoString.trim().equals("")) {
						echoTF.setText("");
						echoTF.requestFocus();
						return;
					}
					/*
					 1.Socket 생성
					 */
					Socket socket=new Socket("192.168.15.6",8000);
					/*
					 2.서버로 문자데이타쓰기
					  - OutputStream얻기
					  - OutputStream(byte)
					    -->Writer로변경(OutputStreamWriter)
					    -->PrintWriter로변경(PrintWriter)
					 */
					PrintWriter out=
							new PrintWriter(
									new OutputStreamWriter(
											socket.getOutputStream()));
					out.println(echoString);
					out.flush();
					
					echoTF.setText("");
					echoTF.requestFocus();
					/*
					 * 3.서버에서 전송되는 데이타읽기
					 *   - InputSteram얻기
					 *   - InputStream(byte)-->InputSteamReader-->BufferedReader
					 */
					BufferedReader in=
							new BufferedReader(
									new InputStreamReader(socket.getInputStream()));
					String serverEchoString = in.readLine();
					echoTA.append(serverEchoString+"\n");
					out.close();
					in.close();
					socket.close();
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(echoTF, BorderLayout.SOUTH);
		echoTF.setColumns(10);
		
		echoScrollPane = new JScrollPane();
		contentPane.add(echoScrollPane, BorderLayout.CENTER);
		
		echoTA = new JTextArea();
		echoTA.setEditable(false);
		echoScrollPane.setViewportView(echoTA);
	}

}