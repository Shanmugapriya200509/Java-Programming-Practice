import java.io.*;
import java.util.Scanner;

class Employee{
	String name;
	int id;
	String position;
	int salary;
	
	Employee(String name,int id,String position,int salary){
		this.name=name;
		this.id=id;
		this.position=position;
		this.salary=salary;
	}
	
	void display(){
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Position : "+position);
		System.out.println("Salary : "+salary);
	}
}
public class Test{
	public static void main(String[] args){
		Employee e=new Employee("priya",23047,"Software developer(Team Lead)",50000000);
		e.display();
	}
}