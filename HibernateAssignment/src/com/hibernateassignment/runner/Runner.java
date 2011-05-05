package com.hibernateassignment.runner;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.hibernateassignment.domain.EmployeeType;
import com.hibernateassignment.domain.Manager;
import com.hibernateassignment.domain.QA;
import com.hibernateassignment.domain.SoftwareDeveloper;
import com.hibernateassignment.domain.Team;

public class Runner {
	
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory(); 
		
		Session session = sessionFactory.getCurrentSession();
		Transaction trans = session.beginTransaction();
		Team t1 = new Team();
		Team t2 = new Team();
		
		SoftwareDeveloper sd1 = new SoftwareDeveloper();
		sd1.setFirstName("Hansel");
		sd1.setLastName("Lastima");
		sd1.setTeam(t1);
		sd1.setEmployeeType(EmployeeType.USER);
		sd1.setLanguages(new ArrayList<String>(Arrays.asList("Java","Cobol","C++")));
		
		
		
		QA qa1 = new QA();
		qa1.setFirstName("John");
		qa1.setLastName("Barrios");
		qa1.setTeam(t1);
		qa1.setEmployeeType(EmployeeType.USER);
		
		
		
		
		Manager manager1 = new Manager();
		manager1.setFirstName("Calen");
		manager1.setLastName("Legaspi");
		// FIXME: cat set 2 managers at 1 team
	//	manager1.setTeam(t2); 
		manager1.setTeam(t1);
		manager1.setEmployeeType(EmployeeType.ADMIN);
		
	//	manager1.setListOfTeams(new ArrayList<Team>(Arrays.asList(t1,t2)));
		
		t1.setTeamManager(manager1);
		//t1.setTeamMembers(new ArrayList<Employee>(Arrays.asList(sd1,qa1)));
		t2.setTeamManager(manager1);
		
		
		session.save(t1);
		session.save (t2);
		session.save(sd1);
		session.save(manager1);
		session.save(qa1);
		
		
		trans.commit();
		sessionFactory.close();
		
		
	}

}
