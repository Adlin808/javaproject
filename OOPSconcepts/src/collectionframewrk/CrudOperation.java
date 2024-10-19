package collectionframewrk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Employee1 {
	private int empno;
	private String ename;
	private int salary;

	public Employee1(int empno, String ename, int salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}

}

public class CrudOperation {

	public static void main(String[] args) {
		List<Employee1> c = new ArrayList<Employee1>();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("6.COUNT");
			System.out.println("7.EXIT");
			System.out.println("Enter your choice:");
			ch = s.nextInt();
			switch (ch) {
			// Insert operation
			case 1:
				// insert();
				System.out.println("Enter Empno:");
				int eno = s.nextInt();
				System.out.println("Enter Empname");
				String ename = s1.nextLine();
				System.out.println("Enter salary");
				int salary = s.nextInt();
				Employee1 e1 = new Employee1(eno, ename, salary);
				c.add(e1);// constructor
				System.out.println("-----------------");
				System.out.println("Record inserted successfully");
				System.out.println("-------------------");
				break;

			// Display opeartion
			case 2:
				System.out.println("-------------");
				Iterator<Employee1> i = c.iterator();
				while (i.hasNext()) {
					Employee1 e = i.next();
					System.out.println(e);// to string method
				}
				System.out.println("-------------");
				break;
			// Search opeartion
			case 3:
				boolean found = false;
				System.out.println("Enter empno to search");
				int empno = s.nextInt();
				System.out.println("--------------------");
				i = c.iterator();
				while (i.hasNext()) {
					Employee1 e = i.next();
					if (e.getEmpno() == empno) {
						System.out.println(e);
						found = true;
					}

				}
				if (!found) {
					System.out.println("Record not found");
				}
				System.out.println("-------------");
				break;
			// Delete operation
			case 4:
				found = false;
				System.out.println("Enter empno to delete");
				empno = s.nextInt();
				System.out.println("--------------");
				i = c.iterator();
				while (i.hasNext()) {
					Employee1 e = i.next();
					if (e.getEmpno() == empno) {
						i.remove();
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record not found");
				} else {
					System.out.println("Record is deleted successfully");
				}
				System.out.println("------------");
				break;
			// Update operation
			case 5:
				found = false;
				System.out.println("Enter Empno to update:");
				empno = s.nextInt();
				ListIterator<Employee1> li = c.listIterator();
				while (li.hasNext()) {
					Employee1 e = li.next();
					if (e.getEmpno() == empno) {
						System.out.println("Enter new name:");
						ename = s1.nextLine();
						System.out.println("Enter new salary:");
						salary = s.nextInt();
						li.set(new Employee1(empno, ename, salary));// update
						found = true;
					}
				}
				System.out.println("--------------");
				if (!found) {
					System.out.println("Record not found");
				} else {
					System.out.println("Record is updated Successfully");
				}
				System.out.println("----------------");
				break;
			case 6:
				System.out.println("Total no of emp:" + c.size());
				break;
			case 7:
				System.exit(0);
				break;
			}

		} while (ch != 0);

	}

}
