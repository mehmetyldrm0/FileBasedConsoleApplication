package com.mehmety.education;
import java.util.Scanner;

public class EducationConsole {
	private static Scanner scanner = new Scanner(System.in);
	private static School school = new School(901,"B�lent Ecevit �niversitesi");
	
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
		System.out.println("3.	G�ncelle");
		System.out.println("4.	Sil");
		System.out.println("5.	G�ster");
		System.out.println("8.	Y�kle");
		System.out.println("9.	Sakla");
		System.out.println("0. 	��k");
		
	}
	
	private static int scanChoice() {
		System.out.println("L�tfen se�iniz...");
		int choice = scanner.nextInt();
		System.out.println("Se�iminiz: " + choice);
	
		
		return choice;
		
	}
	
	private static void handleComment(int choice) {
		
		System.out.println("��lenen se�im: " + choice);
		
		switch (choice)  {
		
			case 1: listStudents(); break;
			case 2: insertStudent(); break;
			case 3: updateStudent(); break;
			case 4: updateStudent(); break;
			case 5: selectStudent(); break;
			case 8: loadStudents(); break;
			case 9: storeStudents(); break;
			case 0: exitConsole(); break;
			default : System.out.println("Ge�ersiz se�im");
		}
		
	}


	private static void listStudents() {
		
		for(Student student: school.getStudentList()) {
			
			System.out.printf(" ��renci No : %d%n ��renci Ad�: %s%n Ortalama: %f%n",student.getStudentId(),student.getStudentName(), student.getAverageMark());
		}
		
		System.out.println("��renci Say�s�: " + school.getStudentList().size());
		System.out.println();
		
	}
	private static void insertStudent() {
		
		System.out.println("Ekleniyor...");
		
		System.out.println("��renci Ad�: ");
		String studentName = scanner.next();
		
		System.out.println("��renci No: ");
		long studentId = Long.parseLong(scanner.next());
		
		System.out.println("Ortalama Not: ");
		double averageMark = Double.parseDouble(scanner.next());
		
		Student student = new Student(studentId, studentName,averageMark);
		school.getStudentList().add(student);
		
	}
	private static void updateStudent() {
		System.out.println("G�ncelleniyor...");

		
	}

	private static void selectStudent() {
		System.out.println("se�iliyor...");

		
	}


	private static void loadStudents() {
		System.out.println("Y�kleniyor...");
		
	}
	
	private static void storeStudents() {
		System.out.println("Saklan�yor...");

		
	}


	private static void exitConsole() {
		System.out.println("��k�l�yor...");
		System.exit(0);
		
	}

	

	
}
