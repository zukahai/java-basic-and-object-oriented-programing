package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import models.Student;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JPasswordField;

public class StudentUI extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField classTextField;
	private JTable table;
	private DefaultTableModel modelTable;
	private JSpinner ageSpinner;
	private JRadioButton nuRadioButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentUI frame = new StudentUI();
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
	public StudentUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1069, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SpinnerModel model = new SpinnerNumberModel(18, 1, 100, 1);
		
		ButtonGroup group = new ButtonGroup();
		
		JButton addButton = new CustomButton("Thêm");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameTextField.getText();
				String classString = classTextField.getText();
				int age = (int) ageSpinner.getValue();
				String gender = "Nam";
				if (nuRadioButton.isSelected())
					gender = "Nữ";
				
				Student s = new Student(name, classString, age, gender);
				modelTable.addRow(s.convertVector());
				
			}
		});
		addButton.setBounds(22, 294, 89, 23);
		contentPane.add(addButton);
		
		Vector vTitle = new Vector<>();
		vTitle.add("Tên");
		vTitle.add("Lớp");
		vTitle.add("Tuổi");
		vTitle.add("Giới tính");
		
		Vector vData = new Vector<>();
		
		Vector t = new Vector<>();
		t.add("Hải");
		t.add("18IT");
		t.add(18);
		t.add("Nam");
		
		modelTable = new DefaultTableModel(vData, vTitle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(294, 28, 387, 270);
		contentPane.add(scrollPane);
		
		table = new JTable(modelTable);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(10, 28, 270, 252);
		contentPane.add(panel);
		panel.setLayout(null);
		
		nameTextField = new CustomTextField();
		nameTextField.setBounds(86, 31, 148, 29);
		panel.add(nameTextField);
		nameTextField.setColumns(10);
		
		classTextField = new CustomTextField();
		classTextField.setBounds(86, 91, 148, 29);
		panel.add(classTextField);
		classTextField.setColumns(10);
		ageSpinner = new JSpinner(model);
		ageSpinner.setBounds(86, 146, 148, 29);
		panel.add(ageSpinner);
		
		JRadioButton namRadioButton = new JRadioButton("Nam");
		namRadioButton.setBounds(87, 202, 60, 23);
		panel.add(namRadioButton);
		group.add(namRadioButton);
		namRadioButton.setSelected(true);
		
		nuRadioButton = new JRadioButton("Nữ");
		nuRadioButton.setBounds(163, 202, 109, 23);
		panel.add(nuRadioButton);
		group.add(nuRadioButton);
		
		JLabel lblNewLabel = new JLabel("Tên");
		lblNewLabel.setBounds(0, 38, 76, 14);
		panel.add(lblNewLabel);
		
		JLabel lblLp = new JLabel("Lớp");
		lblLp.setBounds(0, 98, 76, 14);
		panel.add(lblLp);
		
		JLabel lblTui = new JLabel("Tuổi");
		lblTui.setBounds(0, 153, 76, 14);
		panel.add(lblTui);
		
		JLabel lblGiiTnh = new JLabel("Giới tính");
		lblGiiTnh.setBounds(0, 206, 76, 14);
		panel.add(lblGiiTnh);
		
		JButton btnNewButton = new JButton("Ẩn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
			}
		});
		btnNewButton.setBounds(139, 295, 89, 23);
		contentPane.add(btnNewButton);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerLocation(100);
		splitPane.setBounds(101, 376, 305, 233);
		contentPane.add(splitPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(218, 112, 214));
		splitPane.setLeftComponent(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(10, 79, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(64, 224, 208));
		splitPane.setRightComponent(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 168, 209);
		panel_2.add(textArea);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(423, 332, 237, 55);
		contentPane.add(toolBar);
		
		JButton btnNewButton_2 = new JButton("New button");
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		toolBar.add(btnNewButton_3);
		
		textField = new JTextField();
		toolBar.add(textField);
		textField.setColumns(10);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(478, 449, 511, 215);
		contentPane.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Quản lí sinh viên", null, panel_3, null);
		panel_3.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(22, 33, 163, 33);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(32, 77, 163, 43);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(178, 34, 34));
		panel_6.setBounds(252, 33, 212, 120);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton_5 = new CustomButton("New button");
		btnNewButton_5.setBounds(21, 31, 144, 48);
		panel_6.add(btnNewButton_5);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Quản lí điểm", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnNewButton_4 = new CustomButton("New button");
		btnNewButton_4.setBounds(51, 43, 175, 113);
		panel_4.add(btnNewButton_4);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(88, 42, 184, 39);
		panel_5.add(passwordField);
		setLocationRelativeTo(null);
	}
}
