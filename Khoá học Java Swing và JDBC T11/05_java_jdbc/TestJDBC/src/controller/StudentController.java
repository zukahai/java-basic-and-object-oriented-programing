package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import models.Student;
import models.StudentManager;
import views.StudentUI;

public class StudentController {
	private StudentManager studentManager; // models
	private StudentUI studentUI; // views
	
	public StudentController() {
		studentManager = new StudentManager();
		studentUI = new StudentUI();
		
		loadDada();
		solveActionListener();
		
	}
	
	public void loadDada() {
		Vector vData = studentManager.convertToVector();
		studentUI.setDataModelTable(vData);
	}
	
	public void solveActionListener() {
		studentUI.getAddButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Lấy thông tin từ giao diện
				String masv = studentUI.getMaSvTextField().getText();
				String name = studentUI.getNameTextField().getText();
				int age = (int) studentUI.getTuoiSpinner().getValue();
				String gender = "Nam";
				if (studentUI.getNuRadio().isSelected())
					gender = "Nữ";
				// Tạo 1 đối tượng
				Student student = new Student(age, masv, name, age, gender);
				// Thêm đối tượng vào database
				studentManager.create(student);
				// Load lại thông tin
				loadDada();
				
			}
		});
		
	}
}
