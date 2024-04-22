package com.chainsys.abs;
abstract class Student {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract void getDetails();

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
	public abstract void displayDetails();
}

class HighSchoolStudent extends Student {
	int gradeLevel;

	public HighSchoolStudent(String name, int age, int gradeLevel) {
		super(name, age);
		this.gradeLevel = gradeLevel;
	}

	@Override
	public void getDetails() {
		System.out.println("High School Student:");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Grade Level: " + gradeLevel);
	}

	@Override
	public void displayDetails() {
	System.out.println("Name: "+ name + "Age: "+ age );
		
	}
}

class CollegeStudent extends Student {
	String major;

	public CollegeStudent(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	@Override
	public void getDetails() {
		System.out.println("College Student:");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Major: " + major);
	}
	@Override
	public void displayDetails() {
		System.out.println("Name: "+ name + "\nAge: "+ age );	
	}
}
public class StudentDetail {
	public static void main(String[] args) {
		Student highSchoolStudent = new HighSchoolStudent("Harish", 22, 9);
		Student collegeStudent = new CollegeStudent("Balaji", 20, "Computer Science");

		highSchoolStudent.getDetails();
		System.out.println();
		collegeStudent.getDetails();
		System.out.println();
		System.out.println("StudentDetails: ");
		collegeStudent.displayDetails();
		
	}
}
