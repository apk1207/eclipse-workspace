package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PanelFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelFrame frame = new PanelFrame();
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
	public PanelFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 192));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(15);
		
		JButton selectButton = new JButton("검색");
		panel.add(selectButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 0));
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"신짱구", "김철수", "홍길동", "김영희"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel_1.add(list, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 255, 255));
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		textField_2 = new JTextField();
		textField_2.setBounds(163, 32, 116, 21);
		textField_2.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("로그인");
		btnNewButton_4.setBounds(76, 131, 69, 23);
		
		JButton btnNewButton_5 = new JButton("가입");
		btnNewButton_5.setBounds(190, 131, 57, 23);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(89, 35, 36, 15);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(77, 69, 48, 15);
		panel_2.add(lblNewLabel_1);
		panel_2.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 66, 116, 21);
		textField_1.setColumns(10);
		panel_2.add(textField_1);
		panel_2.add(btnNewButton_4);
		panel_2.add(btnNewButton_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 128, 255));
		contentPane.add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 128, 255));
		contentPane.add(panel_4, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("회원가입");
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("로그인");
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("회원리스트");
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("회원삭제");
		panel_4.add(btnNewButton_3);
	}

}
