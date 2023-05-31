
/**
 * Write a description of class DeckOfCards here.
 * 
 * @author (Eric Y. Chou) 
 * @version (11/29/2015)
 */
public class DeckOfCards
{   final static int DECK_SIZE = 52; 
    final static String[] suits = {"spades", "hearts", "diamonds", "clubs"};
    final static String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9",
		      "10", "jack", "queen", "king"};
		      
    public static int getSuit(int cardNumber){
        return cardNumber / 13; 
    }
    
    public static int getRank(int cardNumber){
        return cardNumber % 13; 
    }      
    
    public static void resetDeck(int[] deck){
        for (int i = 0; i < deck.length; i++) deck[i] = i;
    }
    
    public static void deckShuffle(int[] deck, int times){
       for (int j=0; j<times; j++){
            System.out.printf("Shuffling %3d times...%n", j+1); 
    		for (int i = 0; i < deck.length; i++) {
		      // Generate an index randomly
		      int index = (int)(Math.random() * deck.length);
		      int temp = deck[i];
		      deck[i] = deck[index]; 
		      deck[index] = temp;
		    }
	   }
    }
    
    public static void displayDeck(int[] deck, int numOfCards){ // display the first numOfCards cards
        System.out.println("Display first "+numOfCards+" cards."); 
        for (int i = 0; i < numOfCards; i++) {
		      String suit = suits[getSuit(deck[i])];
		      String rank = ranks[getRank(deck[i])];
		      System.out.println("Card number " + deck[i] + ": " +  rank + " of " + suit);
		}
    }
    
    public static void main(String[] args) {
            
		    int[] deck = new int[DECK_SIZE];
		        
		    // Initialize cards
		    resetDeck(deck); 
		    // Shuffle the cards
		    deckShuffle(deck, 1);  // shuffle once
            // Shuffle the cards
		    deckShuffle(deck, 5);  // shuffle once
		    // Display the first few cards
		    displayDeck(deck, 5); // displayDeck(deck, DECK_SIZE for whole deck display, 
		  }
}
