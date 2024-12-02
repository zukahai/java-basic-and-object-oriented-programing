package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class CustomTextField extends JTextField{
	public CustomTextField() {
		super();
		custom();
	}
	
	public CustomTextField(String text) {
		super(text);
		custom();
	}
	
	public void custom() {
		setFont(new Font("Roboto", Font.PLAIN, 15));
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(0, 0, 0));
	}
}
