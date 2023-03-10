package model;
/**
 * @author akvang - Alexander Vang
 * CIS175 - Spring 2023
 * 01/16/2023
 */
public class Employee {
	private String name;
	private double monthlySalary;
	private int age;
	
	public Employee() {
		this.name = "";
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
