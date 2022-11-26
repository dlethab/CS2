
/*
 * This program will go through inheritance and polymorphism
 * showing how superclasses can be extended through subclasses
 * and how their methods are used and accessed
 */

import java.util.*;
public class Person {  //super class
	
	
	String name = "default name";
	String address = "Default Address";
	String phoneNumber = "000-000-0000";
	String emailAddress = "email@website.com";
	
	public static void main(String args[]) {
		Person personObject = new Person("Dlet", "123 W 84th Street", "123-456-7890", "dsh190000@utdallas.edu");
		System.out.println(personObject.toString());
		
		Person StudentObject = new Student("Sophomore");
		System.out.println(StudentObject.toString());
		
		Person EmployeeObject = new Employee("San Diego Office", 95000);
		System.out.println(EmployeeObject.toString());
		
		Person StaffObject = new Staff("Lecturer");
		System.out.println(StaffObject.toString());
		
		Person facultyObject = new Faculty("3-5", "level 3");
		System.out.println(facultyObject.toString());
	}
	
	Person() {
		
	}
	
	//accessors and mutators
	//get
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String emailAddress() {
		return emailAddress;
	}
	
	//set
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress=emailAddress;
	}
	
	//constructor
	Person(String objName, String objAddress, String objPhoneNumber, String objEmailAddress) {
		name = objName;
		address = objAddress;
		phoneNumber = objPhoneNumber;
		emailAddress = objEmailAddress;
		
	}
	
	public String toString() {
		return "Person Class, name: " + name;
	}
	
	
}

class Student extends Person {
	//class status as constant
	String classStatus = "";
	
	Student(String objClassStatus) {
		classStatus = objClassStatus;
	}
	
	//accessor
	String getClassStatus() {
		return classStatus;
	}
	//mutator
	void setClassStatus(String grade) {
		classStatus = grade;
	}
	
	public String toString() {
		return "Student Class, name: " + name;
	}
}




class Employee extends Person {
	//office, salary, date hired
	String office = "";
	int salary;
	private Date startDate;
	
	//constructor needed for subclasses
	Employee() {
		
	}
	
	Employee(String objOffice, int objSalary) {
		office = objOffice;
		salary = objSalary;
	}
	
	public Date getStartDate() {
		startDate = new Date();
		return startDate;
	}
	
	public String toString() {
		return "Employee class, Name: " + name;
	}
	
}


class Faculty extends Employee {
	//office hours, rank
	String officeHours = "";
	String rank = "";
	
	Faculty(String objOfficeHours, String objRank) {
		officeHours = objOfficeHours;
		rank = objRank;
	}
	
	//accessor and mutator
	String getOfficeHours() {
		return officeHours;
	}
	String getRank() {
		return rank;
	}
	
	void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return "Faculty class, name: " + name;
	}
	
	
}

class Staff extends Employee {
	//title
	String title = "";
	
	Staff(String objTitle) {
		title = objTitle;
	}
	
	//accessor and mutator
	String getTitle() {
		return title;
	}
	void getTitle(String title) {
		this.title = title;
	}
	
	
	public String toString() {
		return "Staff class, name: " + name;
	}
}

