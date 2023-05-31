import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DeckOfCardsImage extends Application {
    final static int DECK_SIZE = 52; 
    final static String[] suits = {"spades", "hearts", "diamonds", "clubs"};
    final static String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9",
		      "10", "jack", "queen", "king"}; // change to lower case to match the image file name
    public static String[] iFile = new String[DECK_SIZE];
    
    public static int[] deck = new int[DECK_SIZE];
    
    public static void linkImageFiles(){
       int spades = 0; int hearts = 1;  int diamonds = 2; int clubs = 3; 
    
       for (int i=0; i<DECK_SIZE; i++) {
            String suit = suits[getSuit(i)];
            String rank = ranks[getRank(i)];
            iFile[i] = "image/card/"+rank+suit+".gif";   
            //System.out.println(iFile[i]); 
       }
    }
    
    public static int getSuit(int cardNumber){
        return cardNumber / 13; 
    }
    
    public static int getRank(int cardNumber){
        return cardNumber % 13; 
    }      
    
    public static String getImageFile(int cardNumber){
       return iFile[cardNumber]; 
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
      
  public static void mainText(){      
		    // Initialize cards
		    resetDeck(deck); 
		    // Shuffle the cards
		    deckShuffle(deck, 1);  // shuffle once
            // Shuffle the cards
		    deckShuffle(deck, 5);  // shuffle once
		    // Display the first few cards
		    displayDeck(deck, 5); // displayDeck(deck, DECK_SIZE for whole deck display, 
  }
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    mainText();       // run text mode first, the card will be shuffle for 6 times. 
    linkImageFiles(); // link image file names before entering image mode
    // Create a pane to hold the image views
    Pane pane = new HBox(10);
    pane.setPadding(new Insets(5, 5, 5, 5));
    //System.out.println(getImageFile(deck[0])); 
    Image[] image = new Image[5]; // pick first 5 cards
    
    for (int i=0; i<5; i++){
      image[i] = new Image(getImageFile(deck[i])); // binding image file and image handler
      pane.getChildren().add(new ImageView(image[i]));
    }
   
    Scene scene = new Scene(pane);
    primaryStage.setTitle("DeckOfCardsImage"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
