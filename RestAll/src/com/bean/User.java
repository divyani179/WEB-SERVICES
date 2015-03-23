package com.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	String name, city;

	public String getName() {
		return name;
	}
    @XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}
   @XmlElement
	public void setCity(String city) {
		this.city = city;
	}
@Override
public String toString() {
	return "User [name=" + name + ", city=" + city + "]";
}
	
	

}
