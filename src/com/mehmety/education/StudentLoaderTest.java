package com.mehmety.education;

import java.io.IOException;
import java.util.List;

public class StudentLoaderTest {
	public static void main(String[] args) throws IOException {
		
		StudentLoader studentLoader = new StudentLoader("C:\\Users\\Mehmet\\Desktop\\Yeni klas�r (2)\\OGRENC�.txt");

		List<Student> studentList = studentLoader.loader();
		
		School schoolA = new School(4234, "Sultanbeyli Anadolu lisesi");
		
		schoolA.setStudentList(studentList);
		
		
		for(Student student: studentList) {
			
			System.out.println("*************");

			
			System.out.printf(" ��renci No : %d%n ��renci Ad�: %s%n Ortalama: %f%n",student.getStudentId(),student.getStudentName(), student.getAverageMark());
			System.out.println("*************");
			
		}
		
		
	}
}
