package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class CustomButton extends JButton {
	
	public CustomButton() {
		super();
		custom();
	}
	
	public CustomButton(String text) {
		super(text);
		custom();
	}
	
	public void custom() {
		setFont(new Font("Roboto", Font.BOLD, 15));
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(0, 0, 0));
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(Color.red);
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(new Color(0, 0, 0));
			}
		});
	}

}
