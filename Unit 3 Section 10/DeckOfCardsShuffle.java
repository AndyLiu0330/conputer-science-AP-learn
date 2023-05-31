
/**
 * Write a description of class DeckOfCardsShuffle here.
 * 
 * @author (Eric Y. Chou) 
 * @version (11/29/2015)
 */
public class DeckOfCardsShuffle
{
    final static int DECK_SIZE = 52; 
    final static int HAND_SIZE = 5;  // maximum 13
    final static String[] suits = {"spades", "hearts", "diamonds", "clubs"};
    final static String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
    
    static int[] deck = new int[DECK_SIZE];	     
    
    static int[] hands0 = new int[HAND_SIZE];
    static int[] hands1 = new int[HAND_SIZE];
    static int[] hands2 = new int[HAND_SIZE];
    static int[] hands3 = new int[HAND_SIZE];
    
    static int top = 0;  // current card to distribute
    
    public static int getSuit(int cardNumber){
        return cardNumber / 13; 
    }
    
    public static int getRank(int cardNumber){
        return cardNumber % 13; 
    }      
    
    public static void resetDeck(int[] deck){
        top = 0;  // reset to the top of deck for distribution
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
    
    public static void deckShuffleB(int[] deck, int times){
       for (int j=0; j<times; j++){
            System.out.printf("Backward Shuffling %3d times...%n", j+1); 
    		for (int i = deck.length-1; i >=0; i--) {
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
    
    public static void displayDeckShort(int[] deck){ // print the whole deck in a shorter format.
      System.out.print("Deck: ");
      for (int i=0; i<deck.length; i++) System.out.print(deck[i]+" "); System.out.println();  
    }
    public static void reverseDeck(int[] deck){
        int tmp = 0; 
        for (int i=0; i<(deck.length/2-1); i++){
           tmp = deck[i];
           deck[i] = deck[deck.length-1-i];
           deck[deck.length-1-i] = tmp; 
        }
    }
    
    public static void blockShuffle(int[] deck){   // shuffle the card deck in a block by block format. 
        int[] block = {0, 1, 2, 3};  // default block code
        deckShuffle(block, 1); 
        deckShuffleB(block, 2); 
        deckShuffle(block, 1); 
        displayDeckShort(block);   // well shuffled block code 
        int[] olddeck = new int[deck.length];  for (int i=0; i<deck.length; i++) olddeck[i] = deck[i]; 
        
        int count = 0;
        for (int j=0; j<4; j++){  // merging the blocks by the order of block code. 
           for (int i=0; i<deck.length/4; i++){
               deck[j*13+i] = olddeck[block[j]*13+i]; 
           }
        }
    }
    
    public static void splitAndMerge(int[] deck){
     int[] firstHalf  = new int[deck.length/2];
     int[] secondHalf = new int[deck.length/2];
     
     // split the card deck into two halves
     for (int i=0; i< deck.length/2; i++)
       {  firstHalf[i] = deck[i]; secondHalf[i] = deck[deck.length/2 + i]; 
        }
        
     // merge the two halves in a random way. 
     for (int j=0; j<deck.length/2; j++){
        int sel = (int)(Math.random()*2); // randomized merging
        deck[j*2]   = (sel==0) ? firstHalf[j]  : secondHalf[j]; 
        deck[j*2+1] = (sel==0) ? secondHalf[j] : firstHalf[j]; 
     }
    }
    
    public static void distributeHands(int[] h0, int[] h1, int[] h2, int[] h3){ // distribute the first 20 card to four players like poker game
        int count = 0; 
        int top0  = 0; 
        int top1  = 0; 
        int top2  = 0; 
        int top3  = 0;
        while (count<4*HAND_SIZE){
            h0[top0++] = deck[top++]; count++;  top %= DECK_SIZE;  
            h1[top1++] = deck[top++]; count++;  top %= DECK_SIZE;  
            h2[top2++] = deck[top++]; count++;  top %= DECK_SIZE;  
            h3[top3++] = deck[top++]; count++;  top %= DECK_SIZE;  
        }
    }
    
    public static void showHands(int[] hand){
       System.out.println("Display a hand of five cards."); 
        for (int i = 0; i < HAND_SIZE ; i++) {
		      String suit = suits[getSuit(hand[i])];
		      String rank = ranks[getRank(hand[i])];
		      System.out.println("Card number " + hand[i] + ": " +  rank + " of " + suit);
		}
    }
    
    public static void main(String[] args) {
		    // Initialize cards
		    resetDeck(deck); 
		    // Shuffle the cards
		    deckShuffle(deck, 1); 
            // Shuffle the cards
		    deckShuffleB(deck, 1);  
		    // Display the first few cards
		    displayDeck(deck, 2); // displayDeck(deck, DECK_SIZE for whole deck display, 
		    System.out.println(); 
		    
		    reverseDeck(deck);
		    displayDeckShort(deck); 
		    System.out.println(); 
		    
		    // distribute and show hands
		    distributeHands(hands0, hands1, hands2, hands3); 
		    showHands(hands0); 
		    showHands(hands1); 
		    showHands(hands2); 
		    showHands(hands3); 
		    
		    resetDeck(deck); 
		    // Shuffle the cards
		    deckShuffle(deck, 1); 
		    System.out.println("\nBlock Shuffling..."); 
		    displayDeckShort(deck); 
		    blockShuffle(deck); 
		    displayDeckShort(deck); 
		    splitAndMerge(deck); 
		    System.out.println("\nSplit and Merging");
		    displayDeckShort(deck); 
		  }
}
