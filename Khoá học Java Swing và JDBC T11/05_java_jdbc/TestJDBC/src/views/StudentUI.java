package views;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import models.Student;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StudentUI extends JFrame {

	private JPanel contentPane;
	private JTextField maSvTextField;
	private JTextField nameTextField;
	private JTable table;
	private JRadioButton namRdio;
	private JRadioButton nuRadio;
	private JSpinner tuoiSpinner;
	private JButton addButton;
	private JButton editButton;
	private JButton deleteButton;
	private JButton searchButton;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	public Vector vTittle;


	public StudentUI() {
		setTitle("Quản lý sinh viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 282, 241);
		contentPane.add(panel);
		panel.setLayout(null);
		
		maSvTextField = new JTextField();
		maSvTextField.setBounds(109, 21, 163, 31);
		panel.add(maSvTextField);
		maSvTextField.setColumns(10);
		
		maSvTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == 'q') {
					System.out.println("Đã bấm phím Q");
				}
			}
		});
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		nameTextField.setBounds(109, 74, 163, 31);
		panel.add(nameTextField);
		
		namRdio = new JRadioButton("Nam");
		namRdio.setBounds(112, 132, 63, 23);
		panel.add(namRdio);
		
		nuRadio = new JRadioButton("Nữ");
		nuRadio.setBounds(196, 132, 63, 23);
		panel.add(nuRadio);
		
		ButtonGroup group = new ButtonGroup();
		group.add(nuRadio);
		group.add(namRdio);
		namRdio.setSelected(true);
		
		SpinnerNumberModel modelSpinner = new SpinnerNumberModel(18, 1, 120, 1);
		tuoiSpinner = new JSpinner(modelSpinner);
		tuoiSpinner.setBounds(112, 177, 160, 31);
		panel.add(tuoiSpinner);
		
		JLabel lblNewLabel = new JLabel("Mã sinh viên");
		lblNewLabel.setBounds(10, 29, 89, 14);
		panel.add(lblNewLabel);
		
		JLabel lblTn = new JLabel("Tên");
		lblTn.setBounds(10, 82, 89, 14);
		panel.add(lblTn);
		
		JLabel lblGiiTnh = new JLabel("Giới tính");
		lblGiiTnh.setBounds(10, 136, 89, 14);
		panel.add(lblGiiTnh);
		
		JLabel lblTui = new JLabel("Tuổi");
		lblTui.setBounds(13, 185, 89, 14);
		panel.add(lblTui);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(312, 11, 434, 241);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 434, 241);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		vTittle = new Vector<>();
		vTittle.add("ID");
		vTittle.add("Mã sinh viên");
		vTittle.add("Tên");
		vTittle.add("Tuổi");
		vTittle.add("Giới tính");
		
		Vector vData = new Vector<>();
		model = new DefaultTableModel(vData, vTittle);
		table.setModel(model);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(9, 263, 737, 58);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		addButton = new JButton("Thêm");
		addButton.setBounds(43, 17, 130, 23);
		panel_2.add(addButton);
		
		editButton = new JButton("Sửa");
		editButton.setBounds(216, 17, 130, 23);
		panel_2.add(editButton);
		
		deleteButton = new JButton("Xoá");
		deleteButton.setBounds(389, 17, 130, 23);
		panel_2.add(deleteButton);
		
		searchButton = new JButton("Tìm kiếm");
		searchButton.setBounds(562, 17, 130, 23);
		panel_2.add(searchButton);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	public void clearFormData() {
		maSvTextField.setText("");
		nameTextField.setText("");
		tuoiSpinner.setValue(0);
		namRdio.setSelected(true);
	}
	
	public void loadFormData(Student s) {
		maSvTextField.setText(s.getMasv());
		nameTextField.setText(s.getName());
		tuoiSpinner.setValue(s.getAge());
		namRdio.setSelected(true);
		if (s.getGender().equals("Nữ"))
			nuRadio.setSelected(true);
	}
	
	public void setDataModelTable(Vector data) {
		model.setDataVector(data, vTittle);
	}

	public JTextField getMaSvTextField() {
		return maSvTextField;
	}

	public void setMaSvTextField(JTextField maSvTextField) {
		this.maSvTextField = maSvTextField;
	}

	public JTextField getNameTextField() {
		return nameTextField;
	}

	public void setNameTextField(JTextField nameTextField) {
		this.nameTextField = nameTextField;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JRadioButton getNamRdio() {
		return namRdio;
	}

	public void setNamRdio(JRadioButton namRdio) {
		this.namRdio = namRdio;
	}

	public JRadioButton getNuRadio() {
		return nuRadio;
	}

	public void setNuRadio(JRadioButton nuRadio) {
		this.nuRadio = nuRadio;
	}

	public JSpinner getTuoiSpinner() {
		return tuoiSpinner;
	}

	public void setTuoiSpinner(JSpinner tuoiSpinner) {
		this.tuoiSpinner = tuoiSpinner;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}

	public JButton getEidtButton() {
		return editButton;
	}

	public void setEidtButton(JButton eidtButton) {
		this.editButton = eidtButton;
	}

	public JButton getDeleteButton() {
		return deleteButton;
	}

	public void setDeleteButton(JButton deleteButton) {
		this.deleteButton = deleteButton;
	}
	public static void main(String[] args) {
		new StudentUI();
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public Vector getvTittle() {
		return vTittle;
	}

	public void setvTittle(Vector vTittle) {
		this.vTittle = vTittle;
	}

	public JButton getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(JButton searchButton) {
		this.searchButton = searchButton;
	}
	
	
}
