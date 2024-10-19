package collectionframewrk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeData {
	String ename;
	int eSalary;
	LocalDate eDateOfJoining;
	String eDesignation;

	public EmployeeData(String ename, int eSalary, LocalDate eDateOfJoining, String eDesignation) {
		super();
		this.ename = ename;
		this.eSalary = eSalary;
		this.eDateOfJoining = eDateOfJoining;
		this.eDesignation = eDesignation;
	}

	@Override
	public String toString() {
		return "EmployeeData [ename=" + ename + ", eSalary=" + eSalary + ", eDateOfJoining=" + eDateOfJoining
				+ ", eDesignation=" + eDesignation + "]";
	}
}

class SortByName implements Comparator<EmployeeData> {
	public int compare(EmployeeData o1, EmployeeData o2) {
		return o1.ename.compareTo(o2.ename);

	}
}
class SortBySalary implements Comparator<EmployeeData>{

	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {
		// TODO Auto-generated method stub
		if(o1.eSalary<o2.eSalary) {
			return -1;
			
		}
		else if(o1.eSalary>o2.eSalary) {
			return 1;
		}
		return 0;
	}
	
}

public class EmployeeComparatorEx {
	public static void main(String[] args) {
		ArrayList<EmployeeData> alist = new ArrayList<>();
		alist.add(new EmployeeData("Adlin", 20202, LocalDate.of(2023, 05, 20), "Developer"));
		alist.add(new EmployeeData("Daisy", 10202, LocalDate.of(2021, 05, 20), "Developer"));
		alist.add(new EmployeeData("Cardii", 30202, LocalDate.of(2013, 05, 20), "Developer"));
		alist.add(new EmployeeData("Preethi", 57402, LocalDate.of(2022, 05, 20), "Developer"));
		alist.add(new EmployeeData("Mirthu", 98202, LocalDate.of(2017, 05, 20), "Developer"));
		alist.add(new EmployeeData("Ramya", 24502, LocalDate.of(2011, 05, 20), "Developer"));
		System.out.println("Employee data:" + alist);

		Collections.sort(alist, new SortByName());
		System.out.println("Sort by Name");
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		Collections.sort(alist, new SortBySalary());
		System.out.println("Sort by Salary");
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));

		}
		

	}

}
