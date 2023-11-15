package com.hibernate.hibernatedemoonetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Laptop;
import com.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Laptop laptop =new Laptop();
		laptop.setLid(101);
		laptop.setName("DELL");
		
		Student s=new Student();
		s.setName("rahulparimella");
		s.setMarks(123);
		s.setRollno(1);
		s.setLaptop(laptop);
		
Configuration config =new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		
		SessionFactory sf =config.buildSessionFactory();
		Session session= sf.openSession();
		session.beginTransaction();
		session.save(s);
		
		session.save(laptop);
		session.getTransaction().commit();


		
		
		

	
	}
    }

