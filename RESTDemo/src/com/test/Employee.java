package com.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
String name;
String city;
String state;
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", city=" + city + ", state=" + state
			+ "]";
}

}
