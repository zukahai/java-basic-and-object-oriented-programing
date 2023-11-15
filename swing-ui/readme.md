<div align="center">

# Thiết kế giao diện bằng java swing

</div>

### Ví dụ 1

Thiết kế giao diện cho một **JButton** click, khi bấm vào thì sẽ in ra chữ "Hello World" ở màn hình console.

<div align="center"><img src="./images/ui.png"></div>

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
			}
		});
		btnNewButton.setBounds(90, 85, 256, 67);
		contentPane.add(btnNewButton);
	}
}

```

</details>
<br>


### Ví dụ 2

Thiết kế giao diện cho một **JButton** click và một **JLabel** label, khi bấm vào button thì giá trị ở lable tăng lên 1 đơn vị

<div align="center"><img src="./images/ui2.png"></div>

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java

```

</details>
<br>


### Ví dụ 3

Thiết kế giao diện cho một **JButton** click và một **JtextField** text, khi bấm vào button thì in ra giá trị đã nhập ở text

<div align="center"><img src="./images/ui3.png"></div>


<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(69, 37, 291, 67);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				System.out.println("Content: " + text);
			}
		});
		btnNewButton.setBounds(90, 140, 256, 67);
		contentPane.add(btnNewButton);
		
		
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

```

</details>
<br>

### Ví dụ 4

Thiết kế giao diện như hình bên dưới, cho phép nhập vào 2 số nguyên và tính kết quả của từng phép tính tương ứng khi bấm nút +, -, *, /

<div align="center"><img src="./images/ui5.png"></div>


<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Test extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton nutton1;
	private JTextField text1;
	private JTextField text2;
	private JLabel lblNumber;
	private JTextField text3;
	private JLabel lblResult;
	private JButton button2;
	private JButton button3;
	private JButton button4;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Number 1");
		lblNewLabel.setBounds(45, 38, 78, 14);
		contentPane.add(lblNewLabel);
		
		nutton1 = new JButton("+");
		nutton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String text_1 = text1.getText();
					String text_2 = text2.getText();
					int number1 = Integer.parseInt(text_1);
					int number2 = Integer.parseInt(text_2);
					int result = number1 + number2;
					text3.setText(result + "");
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		});
		nutton1.setBounds(45, 182, 52, 50);
		contentPane.add(nutton1);
		
		text1 = new JTextField();
		text1.setBounds(159, 29, 221, 32);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setColumns(10);
		text2.setBounds(159, 72, 221, 32);
		contentPane.add(text2);
		
		lblNumber = new JLabel("Number 2");
		lblNumber.setBounds(45, 81, 78, 14);
		contentPane.add(lblNumber);
		
		text3 = new JTextField();
		text3.setColumns(10);
		text3.setBounds(159, 120, 221, 32);
		contentPane.add(text3);
		
		lblResult = new JLabel("Result");
		lblResult.setBounds(45, 129, 78, 14);
		contentPane.add(lblResult);
		
		button2 = new JButton("-");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String text_1 = text1.getText();
					String text_2 = text2.getText();
					int number1 = Integer.parseInt(text_1);
					int number2 = Integer.parseInt(text_2);
					int result = number1 - number2;
					text3.setText(result + "");
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		});
		button2.setBounds(142, 182, 52, 50);
		contentPane.add(button2);
		
		button3 = new JButton("x");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String text_1 = text1.getText();
					String text_2 = text2.getText();
					int number1 = Integer.parseInt(text_1);
					int number2 = Integer.parseInt(text_2);
					int result = number1 * number2;
					text3.setText(result + "");
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		});
		button3.setBounds(239, 182, 52, 50);
		contentPane.add(button3);
		
		button4 = new JButton("/");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String text_1 = text1.getText();
					String text_2 = text2.getText();
					int number1 = Integer.parseInt(text_1);
					int number2 = Integer.parseInt(text_2);
					float result = (float)number1 / number2;
					text3.setText(result + "");
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		});
		button4.setBounds(336, 182, 52, 50);
		contentPane.add(button4);
	}
}

```

</details>
<br>

### Ví dụ 5

Thiết kế giao diện như hình bên dưới cho phép được chọn. Mặc định ban đầu chọn 'Nữ', chỉ cho phép chọn 1 trong 3 lựa chọn. Bấm submit sẽ hiện giới tính đã chọn ở màn hình console.

Gợi ý: Dùng **JRadioButton** để tạo các lựa chọn và dùng **ButtonGroup** để nhóm 3 radio thành 1 nhóm, lúc này chỉ cho phép chọn 1 trong 3 radio.

<div align="center"><img src="./images/ui7.png"></div>

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex5 frame = new Ex5();
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
	public Ex5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rd1 = new JRadioButton("Nam");
		rd1.setBounds(26, 75, 109, 23);
		contentPane.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("Nữ");
		rd2.setBounds(161, 75, 109, 23);
		contentPane.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("Khác");
		rd3.setBounds(296, 75, 109, 23);
		contentPane.add(rd3);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rd1);
		buttonGroup.add(rd2);
		buttonGroup.add(rd3);
		
		rd2.setSelected(true);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd1.isSelected())
					System.out.println(rd1.getText());
				if (rd2.isSelected())
					System.out.println(rd2.getText());
				if (rd3.isSelected())
					System.out.println(rd3.getText());
			}
		});
		btnNewButton.setBounds(164, 129, 89, 23);
		contentPane.add(btnNewButton);
	}
}
```

</details>
<br>

### Ví dụ 6

Thiết kế giao diện như hình bên dưới, Chú ý password nên để là **JPasswordField**. Khi login thì in ra thông tin đăng nhập ra màn hình console.

<div align="center"><img src="./images/ui4.png"></div>

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex6 extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex6 frame = new Ex6();
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
	public Ex6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(40, 58, 98, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(40, 120, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBounds(157, 44, 283, 44);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(157, 118, 283, 44);
		contentPane.add(password);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Username:\t" + username.getText());
				System.out.println("Password:\t" + password.getText());
			}
		});
		btnNewButton.setBounds(167, 188, 174, 44);
		contentPane.add(btnNewButton);
	}
}
```

</details>
<br>



### Ví dụ 7

Tạo class **Student** dùng để biểu diễn những sinh viên.<br>Bao gồm:
- Các thuộc tính:
    -   **masv**: String, đại diện cho mã sinh viên, nó là duy nhất.
    -   **name**: String, đại diện cho tên của sinh viên.
    -   **age**: int, đại diện cho tuổi của sinh viên.
    -   **gender**: String, đại diện cho giới tính
- Các phương thức:
    -   Các hàm khởi tạo: Khởi tạo mặc định, khởi tạo có thuộc tính.
    - Các hàm getter(), setter(), toString()

Tạo interface **IManager** gồm các phương thức:
- void **add(Student s)**;
- ArrayList\<Student> **findAll()**

Tạo class **StudentManager** implement interface **IManager** dùng để quản li sinh viên

Thiết kế giao diện như hình bên dưới, cho phép nhập dữ liệu và hiện thị tất cả dữ liệu đã nhập bên table (Dùng JTable để thiết kế)


<div align="center"><img src="./images/ui6.png"></div>


<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Tải code ví dụ 7 [Tại đây](./UI_StudentManager.zip)

</details>
<br>