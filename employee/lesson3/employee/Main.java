package lesson3.employee;

import java.util.Date;

public class Main {

	
	public static void main(String[] args) {
//		create an e object with Employee class and intialized it with ("Bob", "Bob", 100000, 1999, 5, 5) by its constructor
		Employee e = new Employee("Bob", "Bob", 100000, 1999, 5, 5);
		System.out.printf("%TD", e.getHireDay());
		Date d = e.getHireDay();
		
		d.setTime(10L);
		
//		print date in different format
		
//		print the hired date 01 only using \n%td  in two digit by invoking getHireDay method from Employee class
		System.out.printf("\n%td", e.getHireDay()); 
		
//		print the hired month 01 only using \n%tY  in two digit by invoking getHireDay method from Employee class
		System.out.printf("\n%tm", e.getHireDay()); 
		

//		print the hired year 70 only using \n%ty  in two digit by invoking getHireDay method from Employee class
		System.out.printf("\n%ty", e.getHireDay()); 
		
//		print the hired year 1970 only using \n%tY  in four digit by invoking getHireDay method from Employee class
		System.out.printf("\n%tY", e.getHireDay()); 
		
		
//		print the hired date /month/ year 05/05/99   using \n%TD    by invoking getHireDay method from Employee class
		System.out.printf("\n%TD", e.getHireDay()); 
	}

}
