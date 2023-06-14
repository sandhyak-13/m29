package org.tnsif.servies;

import java.util.List;

import org.tnsif.entitites.Student;


public interface StudentServies {
	public Student getStudent(int rollno);//retrive with specific id
	public List<Student>getAll();//reteive all the data
	public Student updateStudent(Student student);//update
	public boolean deleteStudent(int rollno);//delete
	boolean addStudent(Student student);

}
