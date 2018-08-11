//program displays a card rank and suit

public class Pick_a_Card extends PickaCard {

	public static void main(String[] args) {
		int card, suit, rank;
		card =(int) (Math.random()*52);
		suit = card%4;
		rank= card/4;
		//apparently when initializing a string you have to set it to an empty string
		String strSuit="", strRank="";
		switch (rank) {
		  case 0:
		   strRank = "Ace";
		   break;
		  case 10:
		   strRank = "Jack";
		   break;
		  case 11:
		   strRank = "Queen";
		   break;
		  case 12:
		   strRank = "King";
		   break;
		  default:
		   strRank = "" + (rank + 1);
		   break;
		  }
		 
		  switch (suit) {
		  case 0:
		   strSuit = "Clubs";
		   break;
		  case 1:
		   strSuit = "Diamonds";
		   break;
		  case 2:
		   strSuit = "Hearts";
		   break;
		  case 3:
		   strSuit = "Spades";
		   break;
		  }
		   
		  System.out.print("The card you picked is " + strRank +" of " + strSuit );

	}

}
