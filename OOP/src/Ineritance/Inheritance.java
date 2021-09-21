package Ineritance;
import java.util.Scanner;

class person{
	protected String name;
	int age;
	
	person(){
		System.out.println("Person constructor");
	}
	
	void setName(String name) {
		this.name=name;
		
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	
}

class Student extends person{
	int ID;
	
	Student(){
		System.out.println("Student constructor");
	}
	
	void setId(int id) {
		ID = id;
	}
	
	void getNameAndAge() {
		System.out.println("My name is "+name+" and age is "+age+"\nMy ID is "+ID);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Akshay kumar");
		s.setAge(19);
		s.setId(05);
		s.getNameAndAge();

	}

}
