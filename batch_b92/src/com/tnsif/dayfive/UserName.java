package com.tnsif.dayfive;
import java.util.Scanner;
	public class UserName {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			System.out.println("enter your name:");
			String name=input.nextLine();
			System.out.println("hello "+name);
			
			System.out.println("enter your name:");
			char c =input.next().charAt(0);
			System.out.println("first letter:"+c);
		}

}

