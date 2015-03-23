package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class EmployeeTest {
@GET
@Produces(MediaType.APPLICATION_ATOM_XML)
public Employee check(){
	Employee employee=new Employee();
	employee.setName("divyani");
	employee.setCity("jaipur");
	employee.setState("rajasthan");
	return employee;
}
}
