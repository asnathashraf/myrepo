package com.tnsif.dayfive;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		
		Person p1=new Person();
		
		Scanner sc=new Scanner(System.in);
		
		String name,city;
		int age;
		System.out.println("enter the details:name,age,city");
		name=sc.nextLine();
		age=sc.nextInt();
		city=sc.next();
		
		p1.setPersonName(name);
		p1.setPersonCity(city);
		p1.setPersonAge(age);
		
		System.out.println("person details:"+p1.getPersonName()+"\t"+p1.getPersonAge()+"\t"+p1.getPersonCity());
	}

}
