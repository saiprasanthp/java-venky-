package com.Department;
import com.Employee.*;

public class Department {
	public String dep;
	public Employee e;

		public Department(String dep,Employee e){
			this.dep=dep;
			this.e=e;
			

	}
		public String toString() {
			return e.rollno+" "+e.name+" "+e.college+" "+dep;
		}

}
