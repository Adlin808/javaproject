package collectionframewrk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	private String name;
	private int Salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		this.Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Salary=" + Salary + "]";
	}

	//public int compareTo(Employee o) {
		//return this.name.compareTo(o.name);
	//}
	public int compareTo(Employee o) {
		return Integer.compare(this.Salary,o.Salary);
	}
	

}

public class SortingComparable {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>(
				Arrays.asList(new Employee("Adlin", 20000), new Employee("Daisy", 15000), new Employee("Cardii", 30000),
						new Employee("Preethi", 25000), new Employee("Ramya", 35000)));
		//Collections.sort(employees);
		//System.out.println("CompareTo using name");
		//for (Employee e : employees) {
			//System.out.println(e);
		//}
		Collections.sort(employees);
		System.out.println("CompareTo using salary");
		for (Employee e : employees) {
			System.out.println(e);
		}

	}

}
