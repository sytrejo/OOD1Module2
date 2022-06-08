package ArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
	
		ArrayList<String> shoppingBasket = new ArrayList<String>();
		
		shoppingBasket.add("milk");
		shoppingBasket.add("cereals");
		shoppingBasket.add("apples");
		shoppingBasket.add("oranges");
		shoppingBasket.add("bread");
		
		//Display the number of items in the shopping basket
		System.out.println(shoppingBasket.size());
		
		//Display the first item in the shopping basket
		System.out.println(shoppingBasket.get(0));
		
		//Display the 5th item in the shopping Basket
		System.out.println(shoppingBasket.get(4));
		
		//remove bread from the basket
		shoppingBasket.remove("bread");
		System.out.println(shoppingBasket.size());
		
		//remove the 3d item from the shopping basket
		shoppingBasket.remove(2);
		System.out.println(shoppingBasket.get(0));
		System.out.println(shoppingBasket.get(1));
		System.out.println(shoppingBasket.get(2));
		
		//add the more items
		shoppingBasket.add("potatoes");
		shoppingBasket.add("olive oil");
		shoppingBasket.add("chicken");
		
		
		Collections.sort(shoppingBasket);
		
		System.out.println(shoppingBasket.get(0));
		System.out.println(shoppingBasket.get(5));
		
		
		

	}

}
