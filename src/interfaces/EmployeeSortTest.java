package interfaces;


import java.util.ArrayList;
import java.util.Collections;



/**
 * This program demonstrates the use of the Comparable interface.
 * @version 1.30 2004-02-27
 * @author Cay Horstmann
 */
public class EmployeeSortTest
{
   public static void main(String[] args)
   {
//      Employee[] staff = new Employee[3];
//
//      staff[0] = new Employee("Harry Hacker", 35000);
//      staff[1] = new Employee("Carl Cracker", 75000);
//      staff[2] = new Employee("Tony Tester", 38000);
//
//      Arrays.sort(staff);
//
//      // print out information about all Employee objects
//      for (Employee e : staff)
//         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
      
	   /**
	    * Wy¿ej jest wykorzystanie sortowania wed³ug imienia 
	    * u¿ywaj¹c tablic a ni¿je jest na listach.  
	    */
	   
      
      ArrayList<Employee> staff = new ArrayList<>();
      staff.add(new Employee("Harry Hacker", 35000));
      staff.add(new Employee("Carl Cracker", 75000));
      staff.add(new Employee("Tony Tester", 38000));
      
      Collections.sort(staff);
      
      for (Employee e : staff)
    	  System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
      
      
      
   }

}