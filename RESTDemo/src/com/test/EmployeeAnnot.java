package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/checkEmpAnno")
public class EmployeeAnnot {


@GET
@Produces(MediaType.APPLICATION_XML)
public Employee check(){
	Employee emp=new Employee();
	emp.setName("divyani");
     emp.setCity("bengaluru");
     emp.setState("raj");
	return emp;
}
}
