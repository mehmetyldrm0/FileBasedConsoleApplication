package com.mehmety.education;
import java.util.Scanner;

public class EducationConsole {
	private static Scanner scanner = new Scanner(System.in);
	private static School school = new School(901,"Bülent Ecevit Üniversitesi");
	
	public static void main(String[] args) {
	
		while(true) {
			
			printMenu();
			int choice = scanChoice();
			handleComment(choice);
			
		}
	}
	
	private static void printMenu() {
		System.out.println("1.	Listele");
		System.out.println("2.	Ekle");
		System.out.println("3.	Güncelle");
		System.out.println("4.	Sil");
		System.out.println("5.	Göster");
		System.out.println("8.	Yükle");
		System.out.println("9.	Sakla");
		System.out.println("0. 	Çýk");
		
	}
	
	private static int scanChoice() {
		System.out.println("Lütfen seçiniz...");
		int choice = scanner.nextInt();
		System.out.println("Seçiminiz: " + choice);
	
		
		return choice;
		
	}
	
	private static void handleComment(int choice) {
		
		System.out.println("Ýþlenen seçim: " + choice);
		
		switch (choice)  {
		
			case 1: listStudents(); break;
			case 2: insertStudent(); break;
			case 3: updateStudent(); break;
			case 4: updateStudent(); break;
			case 5: selectStudent(); break;
			case 8: loadStudents(); break;
			case 9: storeStudents(); break;
			case 0: exitConsole(); break;
			default : System.out.println("Geçersiz seçim");
		}
		
	}


	private static void listStudents() {
		
		for(Student student: school.getStudentList()) {
			
			System.out.printf(" Öðrenci No : %d%n Öðrenci Adý: %s%n Ortalama: %f%n",student.getStudentId(),student.getStudentName(), student.getAverageMark());
		}
		
		System.out.println("Öðrenci Sayýsý: " + school.getStudentList().size());
		System.out.println();
		
	}
	private static void insertStudent() {
		
		System.out.println("Ekleniyor...");
		
		System.out.println("Öðrenci Adý: ");
		String studentName = scanner.next();
		
		System.out.println("Öðrenci No: ");
		long studentId = Long.parseLong(scanner.next());
		
		System.out.println("Ortalama Not: ");
		double averageMark = Double.parseDouble(scanner.next());
		
		Student student = new Student(studentId, studentName,averageMark);
		school.getStudentList().add(student);
		
	}
	private static void updateStudent() {
		System.out.println("Güncelleniyor...");

		
	}

	private static void selectStudent() {
		System.out.println("seçiliyor...");

		
	}


	private static void loadStudents() {
		System.out.println("Yükleniyor...");
		
	}
	
	private static void storeStudents() {
		System.out.println("Saklanýyor...");

		
	}


	private static void exitConsole() {
		System.out.println("Çýkýlýyor...");
		System.exit(0);
		
	}

	

	
}
