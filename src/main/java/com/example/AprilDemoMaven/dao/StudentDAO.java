package com.example.AprilDemoMaven.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.AprilDemoMaven.model.Student;

public interface StudentDAO {

	public void save(Student student) throws ClassNotFoundException, SQLException;

	public List<Student> listofStudents() throws ClassNotFoundException, SQLException;

	public boolean register(Student student);

	public boolean login();

	public boolean removeStudent(int id);

	public List<Student> studentList(int grade);

	public Student studentDetails(int id);

	public Student studentUpgrade(Student student);

	public Student grading();

	public Student topper();

}
