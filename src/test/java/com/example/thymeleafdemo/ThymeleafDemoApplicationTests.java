package com.example.thymeleafdemo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.thymeleafdemo.dao.EmployeeRepository;
import com.example.thymeleafdemo.entity.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThymeleafDemoApplicationTests {
	
	// load employee data
	//private List <Employee> theEmployees;
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void contextLoads() {
		
		// create employees
		
		//Employee lukasz = new Employee();
		
		//lukasz.setFirstName(" Mike");
		//lukasz.setLastName("Jordan");
		//lukasz.setEmail("Mike@yahoo.com");
		//employeeRepository.saveAndFlush(lukasz);
		
		
		// create the list
		
		//theEmployees = new ArrayList<>();
		
		// add employees to the list
		
		//theEmployees.add(lukasz);

		
		//then
		//assertThat(lukasz.getFirstName())
		//.isEqualTo(lukasz.getFirstName());	
	}

}
