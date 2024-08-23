package com.oops;

public class Person {
	String name;
	int age;
	
	
	static int numofpersons=0;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		numofpersons++;
		
	}
	public void getPersonDetails() {
		String PersonDetails="Name:"+name+",age:"+age+"";
	  System.out.println(PersonDetails);
	}
	
	

	public static void main(String[] args) {
		Person person1 =new Person("roja",28);
		// TODO Auto-generated method stub
             person1.getPersonDetails();
	}

}
