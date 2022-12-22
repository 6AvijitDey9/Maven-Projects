package com.Vehicle.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static Session activeSession() {
		Configuration config = new Configuration().configure();
		SessionFactory sFactory = config.buildSessionFactory();
		Session session = sFactory.openSession();
		return session;
	}

}
