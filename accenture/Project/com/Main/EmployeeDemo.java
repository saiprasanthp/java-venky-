package com.Main;
import com.Employee.*;
import com.Department.*;
import java.util.*;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee g=new Employee(101,"sai","gist");
		Department j=new Department("ece",g);
		ArrayList<Department> al=new ArrayList<Department>();
		al.add(j);
		System.out.println(al);	
	}

}
