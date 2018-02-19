package by.htp.students;

public class Student {
	
	private String name;
	private int age;
	private int year;
	
	public Student(){
		
	}
	public Student (String name, int age, int year) {
		this.name = name; // имя студента 
		this.age = age; // возрост студента
		this.year = year; // год поступления
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
