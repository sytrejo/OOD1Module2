package ArraysList;

public class Arrays {
	
	public static void main(String[] args) {
		
		//Display the number of friends in the array
		String[] friends = {"Sandy", "Racheal", "Owen", "Chris","Ana"};
		
		//Display the number of friends in the array
		System.out.println(friends.length);
		
		//Display each name in the array on a separate line
		System.out.println(friends[0]);
		System.out.println(friends[1]);
		System.out.println(friends[2]);
		System.out.println(friends[3]);
		System.out.println(friends[4]);
		
		//Remove the fifth person in the array and replace with a new name
		friends[4] = "Tony";
		
		//Sort the array
//		Arrays.sort(friends);
		
		//Display the first person in the array.
		System.out.println(friends[0]);
		
		//Display the last person in the array.
		System.out.println(friends[4]);
		
		//replace the second name with null
		friends[1] = null;
		
		//Display the number of fiends in the array again
		System.out.println(friends.length);
		
	}

//	private static void sort(String[] friends) {
//		
//	}



}
