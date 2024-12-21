package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import models.Student;
import models.StudentManager;
import views.StudentUI;

public class StudentController {
	private StudentManager studentManager; // models
	private StudentUI studentUI; // views
	
	public StudentController() {
		studentManager = new StudentManager();
		studentUI = new StudentUI();
		
		loadData();
		solveActionListener();
		solveMouseListener();
		
	}
	
	public void loadData() {
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
				loadData();
				studentUI.clearFormData();
				JOptionPane.showMessageDialog(null, "Thêm thành công");
			}
		});
		
		studentUI.getEidtButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = studentUI.getTable().getSelectedRow();
				if (row == -1) {
					JOptionPane.showMessageDialog(null, "Cần chọn dòng cần sửa trong bảng");
					return;
				}
				DefaultTableModel model = (DefaultTableModel) studentUI.getTable().getModel();
				int oldId = (int) model.getValueAt(row, 0);
				
				String masv = studentUI.getMaSvTextField().getText();
				String name = studentUI.getNameTextField().getText();
				int age = (int) studentUI.getTuoiSpinner().getValue();
				String gender = "Nam";
				if (studentUI.getNuRadio().isSelected())
					gender = "Nữ";
				// Tạo 1 đối tượng
				Student student = new Student(0, masv, name, age, gender);
				
				studentManager.update(oldId, student);
				loadData();
				
				JOptionPane.showMessageDialog(null, "Sửa thành công id: " + oldId);
			}
		});
		
		studentUI.getDeleteButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int row = studentUI.getTable().getSelectedRow();
				if (row == -1) {
					JOptionPane.showMessageDialog(null, "Cần chọn dòng cần xoá trong bảng");
					return;
				}
				DefaultTableModel model = (DefaultTableModel) studentUI.getTable().getModel();
				int id = (int) model.getValueAt(row, 0);
				
				
				studentManager.delete(id);
				loadData();
				JOptionPane.showMessageDialog(null, "Xoá thành công id: " + id);
			}
		});
		
		studentUI.getSearchButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Đã bấm tìm kiếm");
				String text = JOptionPane.showInputDialog(null, "Thông tin cần tìm kiếm");
				System.out.println(text);
				
				ArrayList<Student> students = studentManager.search(text);
				Vector vData = studentManager.convertToVector(students);
				studentUI.setDataModelTable(vData);
			}
		});
		
	}
	
	public void solveMouseListener() {
		studentUI.getTable().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = studentUI.getTable().getSelectedRow();
				
				DefaultTableModel model = (DefaultTableModel) studentUI.getTable().getModel();
				int id = (int) model.getValueAt(row, 0);
				String masv = (String) model.getValueAt(row, 1);
				String name = (String) model.getValueAt(row, 2);
				int age = (int) model.getValueAt(row, 3);
				String gender = (String) model.getValueAt(row, 4);
				Student student = new Student(id, masv, name, age, gender);
				studentUI.loadFormData(student);
			}
		});
	}
}
