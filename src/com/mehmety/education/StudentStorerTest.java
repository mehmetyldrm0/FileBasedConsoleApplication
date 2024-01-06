package com.mehmety.education;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentStorerTest {
	public static void main(String[] args) throws IOException {
		
		List<Student> studentList = new ArrayList<Student>(); 
		
		Student student0 = new Student(571, "Mehmet Yýldýrým", 2.67);
		studentList.add(student0);
		
		
		Student student1 = new Student(271, "Ýrem Karaduman", 1.67);
		studentList.add(student1);
	
		
		Student student2 = new Student(231, "Elif Yýldýrým", 0.67);
		studentList.add(student2);
	

		StudentStorer storer = new StudentStorer("C:\\Users\\Mehmet\\Desktop\\Yeni klasör (2)\\OGRENCÝ.txt");
		storer.store(studentList);
	
	}
}
