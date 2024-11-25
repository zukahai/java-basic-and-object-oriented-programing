package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class TestJavaSwing extends JFrame {

	private JPanel contentPane;
	private JTextField textTf;
	private JButton addBt;
	private JLabel nameLb;
	private JTextField text2Tf;
	private JLabel nameLb_1;

	public TestJavaSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nameLb = new JLabel("Hải");
		nameLb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nameLb.setForeground(new Color(255, 0, 0));
		nameLb.setBackground(new Color(51, 255, 255));
		nameLb.setBounds(97, 113, 148, 41);
		nameLb.setText("Chào các bạn");
		contentPane.add(nameLb);
		
		addBt = new JButton("Thêm");
		addBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameLb.setText( textTf.getText() );
				addBt.setText("Đã bấm");
				
				String t = textTf.getText();
				int leng = t.length();
				text2Tf.setText(leng + "");
			}
		});
		addBt.setForeground(Color.RED);
		addBt.setBackground(new Color(0, 255, 255));
		addBt.setBounds(86, 194, 148, 49);
		contentPane.add(addBt);
		
		textTf = new JTextField();
		textTf.setBackground(Color.LIGHT_GRAY);
		textTf.setBounds(296, 48, 243, 41);
		contentPane.add(textTf);
		textTf.setColumns(10);
		
		text2Tf = new JTextField();
		text2Tf.setBounds(296, 116, 243, 41);
		contentPane.add(text2Tf);
		text2Tf.setColumns(10);
		
		nameLb_1 = new JLabel("Chào các bạn");
		nameLb_1.setForeground(Color.RED);
		nameLb_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nameLb_1.setBackground(new Color(51, 255, 255));
		nameLb_1.setBounds(97, 48, 148, 41);
		contentPane.add(nameLb_1);
		
		
		Vector v = new Vector();
		v.add("Cam");
		v.add("Bưởi");
		v.add("Nho");
		JComboBox comboBox = new JComboBox(v);
		comboBox.setBounds(387, 198, 141, 41);
		contentPane.add(comboBox);
		
		setVisible(true);
		setTitle("Ứng dụng quản lý");
	}
}
