package com.mehmety.education;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentStorerTest {
	public static void main(String[] args) throws IOException {
		
		List<Student> studentList = new ArrayList<Student>(); 
		
		Student student0 = new Student(571, "Mehmet Y�ld�r�m", 2.67);
		studentList.add(student0);
		
		
		Student student1 = new Student(271, "�rem Karaduman", 1.67);
		studentList.add(student1);
	
		
		Student student2 = new Student(231, "Elif Y�ld�r�m", 0.67);
		studentList.add(student2);
	

		StudentStorer storer = new StudentStorer("C:\\Users\\Mehmet\\Desktop\\Yeni klas�r (2)\\OGRENC�.txt");
		storer.store(studentList);
	
	}
}
