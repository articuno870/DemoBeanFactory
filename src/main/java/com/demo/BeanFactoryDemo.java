package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryDemo {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Employee emp = (Employee) factory.getBean("employee");
		emp.printEmp();

		Employee emp1 = (Employee) factory.getBean("employee1");
		System.out.println(emp1);
	}

}
