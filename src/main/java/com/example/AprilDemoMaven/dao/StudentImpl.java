package com.example.AprilDemoMaven.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.AprilDemoMaven.model.Student;
@Repository
public class StudentImpl {
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	public void insertStudent(Student student) throws ClassNotFoundException, SQLException {
		String save = "insert into student (name, grade) values (?, ?)";
		// PreparedStatement prepareStatement = connection.prepareStatement(save);
		// int rows = prepareStatement.executeUpdate();
		// System.out.println(rows + "inserted");
		Object[] params = { student.getName(), student.getGrade() };
		int noOfRows = jdbcTemplate.update(save, params);
		System.out.println("in DAO - save"+noOfRows);
	}
/*
	public void save() throws ClassNotFoundException, SQLException {
		Student student = new Student();
	Connection connection = ConnectUtil.getConnection();
		System.out.println(connection);
		String save = "insert into student (name, grade) values ('Prabhuram', 7)";
		PreparedStatement prepareStatement = connection.prepareStatement(save);
		int rows = prepareStatement.executeUpdate();
		System.out.println(rows + "inserted");

	}

//	
//	public void save(Student student) {
//		try {
//			Connection connection = ConnectUtil.getConnection();
//			System.out.println(connection);
//			// String saveStudent = "insert into student(id,name,grade)values(12,'ram',2)";
//			// String saveStudent = "insert into student(id,name,grade)values(?,?,?)";
//			
//			String saveStudent = "insert into student(name,grade)values(?,?)";
//
//			PreparedStatement ps = connection.prepareStatement(saveStudent);
//
//			// ps.setInt(1, student.getId());
//			System.out.println("Getting student details : " + student.getName() + student.getGrade());
//			ps.setString(1, student.getName());
//			ps.setInt(2, student.getGrade());
//
//			int rows = ps.executeUpdate();
//			System.out.println(rows);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public List<Student> listofStudents() throws ClassNotFoundException, SQLException {
//		Connection connection = ConnectUtil.getConnection();
//		String query = "select id,name, grade from student";
//		PreparedStatement ps = connection.prepareStatement(query);
//		ArrayList<Student> list = new ArrayList();
//		ResultSet resultSet = ps.executeQuery();
//		while (resultSet.next()) {
//			int id = resultSet.getInt("id");
//			String name = resultSet.getString("name");
//			int grade = resultSet.getInt(3);
//
//			Student stud1 = new Student();
//			stud1.setId(id);
//			stud1.setName(name);
//			stud1.setGrade(grade);
//			list.add(stud1);
//			// System.out.println(list);
//		}
//		return list;
//	}
	public boolean register(Student student) throws ClassNotFoundException, SQLException {

		// Student student = new Student();
		ArrayList existingList = new ArrayList();
		Connection connection = ConnectUtil.getConnection();

		String query = "select name from student";
		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet resultSet = ps.executeQuery();
		while (resultSet.next()) {
			String name = resultSet.getString("name");
			existingList.add(name);
		}
		if (existingList.contains(student.getName())) {
			System.out.println("name already exist");
			return true;
		} else {
			System.out.println("Name available for Registration");

			// String saveStudent = "insert into student(id,name,grade)values(?,?,?)";

			String registerStudent = "insert into student(name,grade)values(?,?)";
			PreparedStatement ps1 = connection.prepareStatement(registerStudent);

			// ps.setInt(1, student.getId());
			ps1.setString(1, student.getName());
			ps1.setInt(2, student.getGrade());
			System.out.println("Getting student details : " + student.getName() + student.getGrade());

			int rows = ps1.executeUpdate();
			return false;
		}
	}
*/
}
