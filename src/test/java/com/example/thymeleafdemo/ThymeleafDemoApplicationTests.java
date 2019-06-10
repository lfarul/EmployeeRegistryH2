package com.example.thymeleafdemo;

import static org.junit.Assert.assertEquals;
import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.thymeleafdemo.entity.Employee;
import com.example.thymeleafdemo.service.EmployeeService;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class ThymeleafDemoApplicationTests {
	
	@Autowired
	private EmployeeService employeeService;

	@Test
	public void contextLoads() {
		
		Employee employee = new Employee(1,"Lukasz","Farulewski","85-796","Lukasz@yahoo.com");
		employeeService.save(employee);
		
		Employee employee2 = employeeService.findById(1);

        assertEquals("Lukasz", employee2.getFirstName());	
	}
}
