package com.mehmety.education;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
	public static void main(String[] args) throws IOException {
		
		School schoolA = new School(431234, "Sultanbeyli Anadolu Lisesi");
		List<Student> studentList = new ArrayList<Student>();
		schoolA.setStudentList(studentList);
		
		Student student0 = new Student(571, "Mehmet Yýldýrým", 2.67);
		schoolA.getStudentList().add(student0);
		student0.setSchool(schoolA);
		
		Student student1 = new Student(271, "Ýrem Karaduman", 1.67);
		schoolA.getStudentList().add(student1);
		student1.setSchool(schoolA);
		
		Student student2 = new Student(231, "Elif Yýldýrým", 0.67);
		student2.setSchool(schoolA);
		schoolA.getStudentList().add(student2);
		
		System.out.println("Okul no: " + schoolA.getSchoolId());
		System.out.println("Okul Adý: " + schoolA.getSchoolName());
		
		for(Student student: studentList) {
			System.out.println("*************");
			System.out.println(" " + student.getSchool().getSchoolId());
		
			System.out.println(" " +student.getSchool().getSchoolName());
			
			System.out.printf(" Öðrenci No : %d%n Öðrenci Adý: %s%n Ortalama: %f%n",student.getStudentId(),student.getStudentName(), student.getAverageMark());
			System.out.println("*************");
			
		}
		
		StudentStorer storer = new StudentStorer("C:\\Users\\Mehmet\\Desktop\\Yeni klasör (2)\\OGRENCÝ.txt");
		storer.store(studentList);
		
	}
}
