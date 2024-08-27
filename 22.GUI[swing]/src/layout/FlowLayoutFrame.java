package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayoutFrame frame = new FlowLayoutFrame();
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
	public FlowLayoutFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 159);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton_3 = new JButton("FIRST");
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("SECOND");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("THIRD");
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("FOURTH");
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("FIFTH");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("SIXTH");
		contentPane.add(btnNewButton_5);
	}

}