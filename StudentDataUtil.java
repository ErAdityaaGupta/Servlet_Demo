package com.demo.mvcdemo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
		public static List<Student> getStudents(){
			
			// create an empty list
			List<Student> students = new ArrayList<>();
			
			// add sample data
			students.add(new Student("Aditya","Gupta","abc@gmail.com"));
			students.add(new Student("Arun","Kumar","pqr@gmail.com"));
			students.add(new Student("Aruna","Gupta","xyz@gmail.com"));
			
			// return the list
			return students;
		}
}
