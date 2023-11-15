package interfaces;

import java.util.ArrayList;

import models.Student;

public interface IManager {
	ArrayList<Student> getAll();
	boolean add(Student s);
	boolean edit(String masv, Student s);
	boolean delete(String masv);
	ArrayList<Student> findByName(String name);
	ArrayList<Student> findByAddress(String address);
	Student findByMasv(String masv);
}
