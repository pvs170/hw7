package by.htp.students;


import by.htp.*;

public class MainApp {

	public static void main(String[] args) {
		
		Student stud1 = new Student("name",15,2015);
		Student stud2 = new Student("name",17,2011);
		Student stud3 = new Student("name",16,2012);
		Student stud4 = new Student("name",15,2013);
		Student stud5 = new Student("name",18,2015);
		Student stud6 = new Student("name",15,2015);
		Student stud7 = new Student("name",15,2015);
		Student stud8 = new Student("name",15,2015);
		Student stud9 = new Student("name",15,2015);
		Student stud10 = new Student("name",15,2015);
		Student stud11 = new Student("name",15,2015);
		Student stud12 = new Student("name",15,2015);
		Student stud13 = new Student("name",15,2015);
		Student stud14 = new Student("name",15,2015);
		Student stud15 = new Student("name",15,2015);
		Student stud16 = new Student("name",15,2015);
		Student stud17 = new Student("name",15,2015);
		Student stud18 = new Student("name",15,2015);
		
	
		Group gr1 = new Group("Group");
		
		gr1.addStudent(stud1);
		gr1.addStudent(stud2);
		gr1.addStudent(stud3);
		gr1.addStudent(stud4);
		gr1.addStudent(stud5);
		gr1.addStudent(stud6);
		gr1.addStudent(stud7);
		gr1.addStudent(stud8);
		gr1.addStudent(stud9);
		gr1.addStudent(stud10);
		gr1.addStudent(stud12);
		gr1.addStudent(stud11);
		gr1.addStudent(stud13);
		gr1.addStudent(stud14);
		gr1.addStudent(stud15);
		
		
		
	
		System.out.println("Кол-во студентов  = " + gr1.getStudents().length);
	
		System.out.println("Средний возраст студентов в группе = " + gr1.getStudentsAge());
	
		
	
	}

}
