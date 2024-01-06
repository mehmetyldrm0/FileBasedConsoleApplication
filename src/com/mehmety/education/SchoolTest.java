package com.mehmety.education;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
	public static void main(String[] args) throws IOException {
		
		School schoolA = new School(431234, "Sultanbeyli Anadolu Lisesi");
		List<Student> studentList = new ArrayList<Student>();
		schoolA.setStudentList(studentList);
		
		Student student0 = new Student(571, "Mehmet Y�ld�r�m", 2.67);
		schoolA.getStudentList().add(student0);
		student0.setSchool(schoolA);
		
		Student student1 = new Student(271, "�rem Karaduman", 1.67);
		schoolA.getStudentList().add(student1);
		student1.setSchool(schoolA);
		
		Student student2 = new Student(231, "Elif Y�ld�r�m", 0.67);
		student2.setSchool(schoolA);
		schoolA.getStudentList().add(student2);
		
		System.out.println("Okul no: " + schoolA.getSchoolId());
		System.out.println("Okul Ad�: " + schoolA.getSchoolName());
		
		for(Student student: studentList) {
			System.out.println("*************");
			System.out.println(" " + student.getSchool().getSchoolId());
		
			System.out.println(" " +student.getSchool().getSchoolName());
			
			System.out.printf(" ��renci No : %d%n ��renci Ad�: %s%n Ortalama: %f%n",student.getStudentId(),student.getStudentName(), student.getAverageMark());
			System.out.println("*************");
			
		}
		
		StudentStorer storer = new StudentStorer("C:\\Users\\Mehmet\\Desktop\\Yeni klas�r (2)\\OGRENC�.txt");
		storer.store(studentList);
		
	}
}
