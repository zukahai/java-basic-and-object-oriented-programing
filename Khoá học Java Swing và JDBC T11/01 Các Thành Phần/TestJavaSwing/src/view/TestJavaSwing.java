package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractCellEditor;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;

public class TestJavaSwing extends JFrame {

	private JPanel contentPane;
	private JTextField textTf;
	private JButton addBt;
	private JLabel nameLb;
	private JTextField text2Tf;
	private JLabel nameLb_1;
	private JRadioButton namRd;
	private JRadioButton nuRd;
	private JTextArea textArea;
	private JPasswordField passwordField;
	private JScrollPane scrollPane_1;
	private JList list_1;
	private JList list;
	private JScrollPane scrollPane_2;
	private JTable table;
	private JScrollPane scrollPane_3;

	public TestJavaSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 700);
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
		addBt.setBounds(86, 168, 148, 49);
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
		comboBox.setBounds(603, 48, 141, 41);
		contentPane.add(comboBox);
		
		JCheckBox savePasswordCb = new JCheckBox("Lưu tài khoản");
		savePasswordCb.setBounds(763, 57, 156, 23);
		contentPane.add(savePasswordCb);
		
		JButton checkBt = new JButton("Kiểm tra");
		checkBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(passwordField.getText());
			}
		});
		checkBt.setBounds(110, 265, 89, 23);
		contentPane.add(checkBt);
		
		namRd = new JRadioButton("Nam");
		namRd.setBounds(603, 125, 109, 23);
		contentPane.add(namRd);
		
		nuRd = new JRadioButton("Nữ");
		nuRd.setBounds(770, 125, 109, 23);
		contentPane.add(nuRd);
		
		ButtonGroup group = new ButtonGroup();
		group.add(namRd);
		group.add(nuRd);
		namRd.setSelected(true);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(745, 172, 162, 41);
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_1.setBounds(603, 181, 121, 23);
		contentPane.add(tglbtnNewToggleButton_1);
		
		ButtonGroup group2 = new ButtonGroup();
		group.add(tglbtnNewToggleButton);
		group.add(tglbtnNewToggleButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(288, 235, 226, 179);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(296, 172, 243, 41);
		contentPane.add(passwordField);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-DD");
		NumberFormat numberFormat = NumberFormat.getInstance();
		JFormattedTextField formattedTextField = new JFormattedTextField(numberFormat);
		formattedTextField.setBounds(603, 238, 206, 49);
		contentPane.add(formattedTextField);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(54, 333, 145, 118);
		contentPane.add(scrollPane_1);
		
		JEditorPane editorPane = new JEditorPane();
		scrollPane_1.setViewportView(editorPane);
		editorPane.setContentType("text/html");
		editorPane.setText("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<h1>Heading 1</h1>\r\n"
				+ "<h2>Heading 2</h2>\r\n"
				+ "<h3>Heading 3</h3>\r\n"
				+ "<h4>Heading 4</h4>\r\n"
				+ "<h5>Heading 5</h5>\r\n"
				+ "<h6>Heading 6</h6>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "\r\n"
				+ "");
		
		// JSpinner
		SpinnerNumberModel model = new SpinnerNumberModel(10, 0, 100, 1); // value, min, max, step
		JSpinner spinner = new JSpinner(model);
		spinner.setBounds(537, 303, 79, 49);
		contentPane.add(spinner);
		
		
		Vector v2 = new Vector<>();
		v2.add("ABC");
		v2.add("ZYA");
		v2.add("#$$");
		v2.add("444");
		v2.add("AB444C");
		v2.add("4444");
		v2.add("ABC");
		v2.add("ZYA");
		v2.add("#$$");
		v2.add("444");
		v2.add("AB444C");
		v2.add("4444");
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(666, 319, 121, 89);
		contentPane.add(scrollPane_2);
		list = new JList(v2);
		scrollPane_2.setViewportView(list);
		
		
		
		Vector vTitle = new Vector<>();
		Vector vData = new Vector<>();
		
		vTitle.add("Mã sinh viên");
		vTitle.add("Họ tên");
		vTitle.add("Ngày sinh");
		vTitle.add("Quê quán");
		
		Vector data1 = new Vector<>();
		data1.add("24IT213");
		data1.add("Hải");
		data1.add("23-21-2000");
		data1.add("Hà Tĩnh");
		
		Vector data2 = new Vector<>();
		data2.add("18IT999");
		data2.add("Hùng");
		data2.add("23-21-2007");
		data2.add("Hà Nội");
		
		vData.add(data1);
		vData.add(data2);
		vData.add(data1);
		vData.add(data2);
		vData.add(data1);
		vData.add(data2);
		vData.add(data1);
		vData.add(data2);
		vData.add(data1);
		vData.add(data2);
		vData.add(data1);
		vData.add(data2);
		vData.add(data1);
		vData.add(data2);
		vData.add(data1);
		vData.add(data2);
		vData.add(data2);
		vData.add(data1);
		vData.add(data2);
		vData.add(data1);
		vData.add(data2);
		vData.add(data1);
		vData.add(data2);
		vData.add(data1);
		vData.add(data2);
		
		
		DefaultTableModel tableModel = new DefaultTableModel(vData, vTitle);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(928, 140, 417, 325);
		contentPane.add(scrollPane_3);
		table = new JTable(tableModel);
		scrollPane_3.setViewportView(table);
//		table.setModel(tableModel);
		
		
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(0, 638, 1370, 23);
		progressBar.setMaximum(100);
		progressBar.setMinimum(0);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		contentPane.add(progressBar);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(805, 455, 61, 103);
		contentPane.add(scrollBar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(54, 591, 757, 13);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(928, 127, 411, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Danh sách sinh viên");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(928, 102, 375, 14);
		contentPane.add(lblNewLabel);
		
		JSlider slider = new JSlider();
		slider.setBounds(247, 455, 200, 70);
		slider.setMaximum(100);
		slider.setMinimum(10);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		contentPane.add(slider);

		
		setVisible(true);
		setTitle("Ứng dụng quản lý");
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		Timer timer = new Timer(5, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int value = progressBar.getValue();
				progressBar.setValue(value + 1);
				if (value == 100)
					progressBar.setVisible(false);
			}
		});
		timer.start();
	}
}
