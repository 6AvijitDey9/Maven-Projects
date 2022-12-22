package com.maven.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class employeeMain 
{
    public static void main( String[] args )
    {
    	//Configuration - activates hibernate framework
    	//configure - read both cfg files and mapping details
    	//buildSessionFactory - from cfg object it takes jdbc information and create a jdbc connection
        SessionFactory s = new Configuration().configure().buildSessionFactory();
        Session ses = s.openSession(); //Opens an connection with db and session object perform CRUD
        Transaction t = ses.beginTransaction(); //Operation performed in db, save permanent
        employee e = new employee(); //Create object of persistence class
        e.setEmpid(101);
        e.setEmpname("Bhuban_Bam");
        e.setEmpemail("Bhuban@gmail.com");
        e.setEmpphone(625018926);
        e.setEmpadd("Delhi");
        e.setEmpsalary(25000.25);
        ses.save(e); //Session object is used to save persistence object
        System.out.println("Emp details updated Sucessfully......");
        t.commit(); //Transaction object to commit changes
        ses.close(); //Closing Session
    }
}
