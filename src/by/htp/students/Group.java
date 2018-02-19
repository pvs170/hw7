package by.htp.students;

import java.util.Scanner;

public class Group {

	private String title;
	private Student[] students;
	private int studentCounter;

	public Group(String title) {
		this.title = title;
	}

	public void setStudents(Student[] students) {
		if (students != null) {
			this.students = students;
		}
	}

	public Student[] getStudents() {
		return this.students;
	}

	public void setTitle() {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public int[] getStudentsAge() {
		int[] age = new int[this.getStudents().length];
		for (int i = 0; i < this.getStudents().length; i++) {
			age[i] = this.getStudents()[i].getAge();
		}
		return age;
	}

	public void setStudentAge(int[] age) {
		for (int i = 0; i < this.getStudents().length; i++) {
			this.getStudentsAge()[i] = age[i];
		}
	}

	public boolean groupStatus(Student[] students) {
		boolean status = false;
		for (int i = 0; i < 5; i++) {
			if (students[i] == null) {
				status = false;
			} else {
				status = true;
			}
		}
		if (status == false) {
			System.out.println("В группе меньше пяти студентов");
		} else {
			System.out.println("Ок!");
		}
		return status;
	}

	public void addStudent(Student student) {
		if (this.students != null) {
			if (students.length == 15) {
				System.out.println("кол-во студентов в группе не должно быть больше пятнадцати");
			} else {
				if (this.groupStatus(students) == true) {
					if (studentCounter < students.length) {
						students[studentCounter] = student;
						studentCounter++;
					} else {
						Student[] students = new Student[this.students.length + 1];
						for (int i = 0; i < this.students.length; i++) {
							students[i] = this.students[i];
						}
						this.students = students;
						this.students[studentCounter] = student;
						studentCounter++;
					}
				} else {
					this.students[studentCounter] = student;
					studentCounter++;
				}
			}
		}
	}

	public void avgCount(Student[] students) {
		int ageSum = 0;
		for (int i = 0; i < students.length; i++) {
			ageSum += students[i].getAge();
		}
		System.out.println((double) (ageSum / students.length));

	}

	public void stdCount(Student[] students) {
		int stdSum = 0;
		for (int i = 0; i < students.length; i++) {
			if (2015 == students[i].getYear()) {
				stdSum++;
			}
		}
		System.out.println(stdSum);
	}
		
	public int[] getYearCount() {
		int[] yearCount = new int[this.students.length];
		for (int i = 0; i < this.getStudents().length; i++) {
			for (int j = 0; j < this.getStudents().length; j++) {
				if (this.getStudents()[i].getYear() == this.getStudents()[j].getYear()) {
					yearCount[i]++;
				}
			}
		}
		return yearCount;
	}
	
	public int getNumberStudentsMaxYear() {
		int[] yearCount = this.getYearCount();
		int number = 0;
		for (int x : yearCount) {
			if (number <= x) {
				number = x;
			}
		}
		return number;
	}
	
	public int getYearMaxStudents() {
		int year = 0;
		int counter = 0;
		int[] studCount = this.getYearCount();
		int num = this.getNumberStudentsMaxYear();
		for (int i = 0; i < this.getStudents().length; i++) {
			if (num == studCount[i]) {
				year = this.getStudents()[i].getYear();
			}
		}
		return year;
	}
	
}