package com.BeanUtils;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

public class Test {

	public static void main(String[] args) {
		
		Student student = new Student() ; 
		MutablePropertyValues value = new MutablePropertyValues() ; 
		value.addPropertyValue("id" , "10") ; 
		value.addPropertyValue("name" , "ahmed") ; 
		
		DataBinder databinder = new DataBinder(student) ; 
		databinder.setAllowedFields(new String[] {"id" });
		
		databinder.bind(value);
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		
		
		

	}

}
