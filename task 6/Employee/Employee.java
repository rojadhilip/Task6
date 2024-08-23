package com.Employee;

  public class Employee{
	  public int id;
	  public String Name;
	  public int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.Name = name;
		this.salary = salary;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
	}
	
	  
  }
