package com.mehmety.education;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StudentLoader {
	private String filePath;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public StudentLoader(String filePath) {
		super();
		this.filePath = filePath;
	}
	
	public List<Student> loader() throws IOException {
		
		List<Student> studentList = new ArrayList<Student>();
		FileReader fileReader = new FileReader(filePath);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line;
		
		while((line = bufferedReader.readLine()) != null) {
			Student student = parse(line);
			studentList.add(student);
		}
		
		return studentList;
		
	}
	
	private Student parse(String str) {
	
		StringTokenizer stringTokenizer = new StringTokenizer(str,"|");
		long studentId = Long.parseLong(stringTokenizer.nextToken());
		String studentName = stringTokenizer.nextToken();
		double studentAverageMark = Double.parseDouble(stringTokenizer.nextToken());
		
		return new Student(studentId, studentName, studentAverageMark);
	
	}
	
	public void toString(StringBuilder str) {
		System.out.println(str.toString());
	}
}
