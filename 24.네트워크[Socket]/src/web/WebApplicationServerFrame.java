package web;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class WebApplicationServerFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea logTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WebApplicationServerFrame frame = new WebApplicationServerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void displayLog(String log) {
		logTextArea.append(log + "\n");

	}

	/**
	 * Create the frame.
	 */
	public WebApplicationServerFrame() {
		setTitle("웹서버");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		logTextArea = new JTextArea();
		logTextArea.setFont(new Font("나눔고딕", Font.BOLD, 17));
		logTextArea.setEditable(false);
		scrollPane.setViewportView(logTextArea);
		new WebServerThread().start();

	}// 생성자끝

	/************** WebServerThread *****************/
	public class WebServerThread extends Thread {

		@Override
		public void run() {
			try {
				ServerSocket serverSocket = new ServerSocket(81);
				while (true) {
					displayLog("1.WebServerThread:클라이언트연결요청대기(쓰레드대기)");
					Socket socket = serverSocket.accept();
					displayLog("2.WebServerThread:클라이언트와연결된 서버쪽소켓생성:" + socket);
					displayLog("3.WebServerThread:소켓으로부터 InputStream생성");
					BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					OutputStream out = new BufferedOutputStream(socket.getOutputStream());
					String requestFileName = "";
					String readLine = in.readLine();
					if (readLine == null) {
						break;
					}
					if (readLine.startsWith("GET")) {
						String[] requestLines = readLine.split(" ");
						System.out.println(requestLines[1]);
						requestFileName = requestLines[1];
						if(requestFileName.equals("/"))requestFileName="/index.html";
					}
					displayLog(readLine);

					InputStream fis = new BufferedInputStream(new FileInputStream("./webserverRoot" + requestFileName));
					while (true) {
						int readByte = fis.read();
						if (readByte == -1)
							break;
						out.write(readByte);

					}
					fis.close();
					out.close();
					socket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/**********************************************/

}