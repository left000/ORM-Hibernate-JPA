package net.javaguides.hibernate.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguides.hibernate.model.Student;
import net.javaguides.hibernate.util.HibernateUtil;

public class StudentDao {

	public void saveStudent(Student student) {
		
		// auto close session object
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			 
			//start the transaction
			session.beginTransaction();
			
			//save student object
			session.save(student);
			
			//commit transaction
			
			transaction.commit();
			
		}catch(Exception e) {
			
			if(transaction != null) {
				transaction.rollback();
			}
		}
	}
}
