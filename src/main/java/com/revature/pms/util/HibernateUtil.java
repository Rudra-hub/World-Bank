package com.revature.pms.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		return sessionFactory; 

	}
}
