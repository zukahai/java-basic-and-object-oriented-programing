package views;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;
import javax.swing.JFormattedTextField;

import java.text.*;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// combobox
		Vector items = new Vector<>();
		items.add("Xoài");
		items.add("Cam");
		items.add("Bưởi");
		JComboBox comboBox = new JComboBox<>(items);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem());
			}
		});
		comboBox.setBounds(267, 11, 124, 30);
		contentPane.add(comboBox);
		
		// radio
		
		JRadioButton namCb = new JRadioButton("Nam");
		namCb.setBounds(341, 89, 109, 23);
		contentPane.add(namCb);
		
		JRadioButton nuCb = new JRadioButton("Nữ");
		nuCb.setBounds(460, 89, 109, 23);
		contentPane.add(nuCb);
		
		ButtonGroup group = new ButtonGroup();
		group.add(nuCb);
		group.add(namCb);
		
		nuCb.setSelected(true);
		
		// JToggleButton
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(33, 68, 121, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_1.setBounds(33, 102, 121, 23);
		contentPane.add(tglbtnNewToggleButton_1);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(tglbtnNewToggleButton);
		group2.add(tglbtnNewToggleButton_1);
		
		tglbtnNewToggleButton.setSelected(true);
		
		// JFormattedTextField
		JFormattedTextField formattedTextField = new JFormattedTextField(java.text.NumberFormat.getNumberInstance());
		formattedTextField.setBounds(86, 169, 196, 20);
		contentPane.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
		formattedTextField_1.setBounds(86, 206, 198, 23);
		contentPane.add(formattedTextField_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(447, 167, 128, 113);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(75, 290, 310, 123);
		contentPane.add(scrollPane_1);
		
		// JEditorPane
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String text = editorPane.getText();
				editorPane.setText(text);
			}
		});
		editorPane.setContentType("text/html");
		editorPane.setText("<h1>xin chào</h1> <h2> các bạn </h2>");
		scrollPane_1.setViewportView(editorPane);
		
		SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100, 11); // Giá trị bắt đầu, giá trị min, giá trị max, bước nhảy
		JSpinner spinner = new JSpinner(model);
		spinner.setBounds(524, 344, 45, 44);
		contentPane.add(spinner);

		// JList
		
		JList list = new JList(items);
		list.setBounds(666, 71, 128, 118);
		contentPane.add(list);
		
		// JTree
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");

	    root.add(node1);
	    root.add(node2);
		
		JTree tree = new JTree(root);
		tree.setBounds(652, 258, 84, 155);
		contentPane.add(tree);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(75, 441, 310, 34);
		contentPane.add(progressBar);
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);
		progressBar.setValue(30);
		progressBar.setStringPainted(true);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(418, 301, 66, 155);
		scrollBar.setMinimum(0);
        scrollBar.setMaximum(100);
        scrollBar.setValue(50);  // Giá trị mặc định
        scrollBar.setUnitIncrement(10); // Bước cuộn mỗi lần
		contentPane.add(scrollBar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(539, 454, 185, 21);
		contentPane.add(separator);
		
		JSlider slider = new JSlider();
		slider.setBounds(476, 30, 200, 52);
		contentPane.add(slider);
		slider.setMaximum(100);
		slider.setMinimum(0);
		slider.setMajorTickSpacing(20); // Khoảng cách giữa các dấu lớn
        slider.setMinorTickSpacing(5);  // Khoảng cách giữa các dấu nhỏ
        slider.setPaintTicks(true); // Vẽ các dấu phân cách
        slider.setPaintLabels(true); // Hiển thị nhãn số trên thanh trượt
		

		
	
		
		//
		
		Timer timer = new Timer(30, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int value = progressBar.getValue();
				progressBar.setValue(value + 1);
			}
		});
		timer.start();
		
		
		
	}
}
