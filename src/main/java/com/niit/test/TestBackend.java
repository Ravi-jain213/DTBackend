package com.niit.test;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.NIITBackEnd.Dao.IProductDAO;
import com.niit.NIITBackEnd.main.TestBackEnd;
import com.niit.test;
import java.util.List;

public class TestBackend {
	private final static Logger logger = LoggerFactory.getLogger(TestBackEnd.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("niit_backend.xml");
		IProductDAO personDAO = context.getBean(IProductDAO.class);
		Person person = new Person();
		person.setName("Prakashaa11");
		person.setCountry("India");
		personDAO.save(person);

		logger.info("Person::" + person);
		List<Person> list = personDAO.list();

		for (Person p : list) {
			logger.info("Person List::" + p);
		}
		// close resources
		context.close();
	}

}

}
