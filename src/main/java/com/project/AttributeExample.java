package com.project;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;

public class AttributeExample {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee name:");
		String name = sc.nextLine();
		System.out.println("RegularEmployee Details");
		System.out.println("Enter Your Salary:");
		float salary = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Your Department:");
		String RegEmpDept = sc.nextLine();
		System.out.println("Enter Your Name:");
		String RegEmpName = sc.nextLine();
		System.out.println("Trainee Details");
		System.out.println("Enter your Name:");
		String TraineeName = sc.nextLine();
		System.out.println("Enter Your PayPerHour:");
		float payperhour = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Your ContractPeriod:");
		String contractperiod = sc.nextLine();
		Transaction tr  = null;
		System.out.println("before ses factory");
		try(Session ses=HbUtil.getSessionFactory().openSession()){
			System.out.println("after ses factory");
			tr=ses.beginTransaction();
			Employee e1=new Employee(name);
			RegEmployee e2 = new RegEmployee(salary,RegEmpDept,RegEmpName);
			Trainee e3 =new Trainee(TraineeName,payperhour,contractperiod);
			
			ses.persist(e1); ses.persist(e2); ses.persist(e3);
			
			tr.commit();
			ses.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
