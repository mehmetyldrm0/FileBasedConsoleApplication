package com.mehmety.education;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class StudentStorer {
	private String filePath;
	
	
	public StudentStorer(String filePath) {
		super();
		this.filePath = filePath;
	}

	public void store(List<Student> studentList) throws IOException {
		
		FileWriter fileWriter = new FileWriter(filePath);
		
		try(BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			
			for(Student student : studentList) {
				String line = format(student);
				bufferedWriter.write(line + "\r\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}
	
	private String format(Student student) {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(student.getStudentId()).append("|");
		stringBuilder.append(student.getStudentName()).append("|");
		stringBuilder.append(student.getAverageMark());

		
		return stringBuilder.toString();
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
}
