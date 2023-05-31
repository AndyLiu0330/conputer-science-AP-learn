
/**
 * Write a description of class RandomCard here.
 * 
 * @author (Eric Y. Chou) 
 * @version (11/29/2015)
 */
public class RandomCard
{
    final static int DECK_SIZE = 52; 
    final static String[] suits = {"spades", "hearts", "diamonds", "clubs"};
    final static String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9",
		      "10", "jack", "queen", "king"};
		      
    public static int getSuit(int cardNumber){
        return cardNumber / 13; 
    }
    
    public static int getRank(int cardNumber){
        return cardNumber % 13; 
    }      
    

    public static void displayCards(int numOfCards){ // display the first numOfCards cards
        System.out.println("Display "+numOfCards+" cards."); 
        for (int i = 0; i < numOfCards; i++) {
              int card = (int) (Math.random()*DECK_SIZE);
		      String suit = suits[getSuit(card)];
		      String rank = ranks[getRank(card)];
		      System.out.println("Card number " + card + ": " +  rank + " of " + suit);
		}
    }
    
    public static void main(String[] args) {
		    // Display the first few cards
		    displayCards(5); // displayDeck(deck, DECK_SIZE for whole deck display, 
		  }
}
