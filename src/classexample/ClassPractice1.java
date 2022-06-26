package classexample;

import java.util.Scanner;

public class ClassPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person person1 = new Person();
		
		System.out.println("input your name");
		String name = sc.nextLine();
		person1.setName(name);
		
		System.out.println("saved your name. \nAnd input your age");
		int age = sc.nextInt();
		person1.setAge(age);
		
		sc.nextLine();
		
		System.out.println("And you married? (plz say yes or no)");
		String married = sc.nextLine();
		person1.setMarried(married);
		
		if(married.equals("yes")) {
		System.out.println("saved your answer. \nLastly input how many kids you have");
		int kids = sc.nextInt();
		person1.setKids(kids);
		}
		
		System.out.println("<your profile>");
		System.out.println("your name is " + person1.getName());
		System.out.println("your age is " + person1.getAge());
		if(person1.getMarried() == true) {
			System.out.println("you married");
			System.out.println("you have " + person1.getKids() + " kids");
		}
		else if(person1.getMarried() == false) {
			System.out.println("you are a single");
		}
	}

}
