package net.javaguides.hibernate;

import net.javaguides.hibernate.dao.*;
import net.javaguides.hibernate.model.Student;

public class App {
	
	public static void main(String[] args) {
		
		StudentDao studentDao = new StudentDao();
		
		Student student = new Student("Sara", "Giovine", "sarag@gmail.com");
		Student student2 = new Student("Eduardo", "Furio", "eduardofurio22@gmail.com");
		
		studentDao.saveStudent(student);
		studentDao.saveStudent(student2);
		
		System.out.println(student.getId());
		System.out.println(student2.getId());
	}
}
;