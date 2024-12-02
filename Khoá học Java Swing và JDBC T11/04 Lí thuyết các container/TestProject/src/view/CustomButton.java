package view;

import java.awt.Color;

import javax.swing.JButton;

public class CustomButton extends JButton {
	public CustomButton() {
		super();
	}
	
	public CustomButton(String text) {
		super(text);
		setBackground(Color.cyan);
	}
}
