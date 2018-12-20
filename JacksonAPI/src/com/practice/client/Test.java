package com.practice.client;

import com.practice.bean.Employee;
import com.practice.util.JsonUtil;

public class Test 
{
	public static void main(String[] args) 
	{
	 	Employee emp = new Employee();
	 	emp.setEmpNo(201);
	 	emp.setName("honey");
	 	emp.setSalary(10000);
	 	
	 String jsonEmployee =JsonUtil.convertJavaToJson(emp);
        System.out.println(jsonEmployee);
        System.out.println("----------------");
        Employee emp1 = JsonUtil.convertJsonToJava(jsonEmployee, Employee.class);
        System.out.println(emp1.getEmpNo()+" "+ emp1.getName()+" "+ emp1.getSalary());
	}
}
