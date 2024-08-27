package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayoutFrame frame = new BorderLayoutFrame();
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
	public BorderLayoutFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton northBtn = new JButton("NORTH");
		contentPane.add(northBtn, BorderLayout.NORTH);
		
		JButton westBtn = new JButton("WEST");
		contentPane.add(westBtn, BorderLayout.WEST);
		
		JButton centerBtn = new JButton("CENTER");
		contentPane.add(centerBtn, BorderLayout.CENTER);
		
		JButton eastBtn = new JButton("EAST");
		contentPane.add(eastBtn, BorderLayout.EAST);
		
		JButton southBtn = new JButton("SOUTH");
		contentPane.add(southBtn, BorderLayout.SOUTH);
	}

}