package ArraysList;

public class PokerHand {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Create an empty array called pokerHand
		String[] pokerHand = new String[5];
		
		//add data to the array
		pokerHand[0] = "Queen of hearts";
		pokerHand[1] = "3 of Spades";
		pokerHand[2] = "3 of diamonds";
		pokerHand[3] = "9 of hearts";
		pokerHand[4] = "6 of clubs";
		
		//print out the array
		System.out.println(pokerHand[0]);
		
		//print out the whole array
		for(String element: pokerHand) {
			System.out.println(pokerHand);
		}
		
		//print out the whole array
		System.out.println(Arrays.toString(pokerHand));



	}

}
