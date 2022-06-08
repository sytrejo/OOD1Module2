package ArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class Salaries {

	public static void main(String[] args) {
		
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		
		salaries.add(75000);
		salaries.add(25000);
		salaries.add(42000);
		salaries.add(30000);
		salaries.add(55000);
		salaries.add(42000);
		salaries.add(39000);
		
		//the highest salary
		System.out.println(Collections.max(salaries));
		
		//the lowest salary
		System.out.println(Collections.min(salaries));
		
		//the number of people earning 42000
		System.out.println(Collections.frequency(salaries, 42000));
		
		//sort the salaries
		Collections.sort(salaries);
		System.out.println(salaries.get(0));
		System.out.println(salaries.get(6));		

	}

}
