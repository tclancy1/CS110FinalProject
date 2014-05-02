import javax.swing.*;

/**
 *Timothy Clancy 
 *This is the card class. It makes a card object. A card consists of a rank suit and and image icon   
 *now lets get to war!!!
 */

public class Card
{     
	
  
  
   // face cards - these cards can be assigned arbitrary numbers. note these are final. They will NOT change once instaniated
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;
   public final static int ACE = 1;


        
// these values hold the suits and again cant change once instantiaed
	public final static int CLUBS = 0;
	public final static int DIAMONDS = 1;
	public final static int HEARTS = 2;
	public final static int SPADES = 3;

	
   
     
   
   //suit and rank variable, private so that these valuea are permanent
	private int suit;
	private int rank;	
   
   
    /**
      This the card constuctor; it makes the card
      @param color assigns the suit
      @param Numorder assigns rank
      @param img will assign a img to this card once it passes through constucter
    */
	public Card(int symbol, int Numorder)
	{
		suit = symbol;
		rank = Numorder;
	}

	
   
   
   /**
      setter returns the value of rank 
	*/
	public int getRank()
	{
		return rank;
	} 

   /**
      this is an accessor, getter method tht returns the suit
      
    */
	public int getSuit()
	{
		return suit;
	}

 
   
   /**
   * Returns a description of the suit of this card.
   * @return the suit value of the card as a string.
   */
    public String getSuitAsString() 
    {
            // Return a String representing the card's suit.
            // (If the card's suit is invalid, "??" is returned.)
        switch ( suit ) {
           case SPADES:   return "Spades";
           case HEARTS:   return "Hearts";
           case DIAMONDS: return "Diamonds";
           case CLUBS:    return "Clubs";
           default:       return "Invalid";
        }
    }
   
    
   /**
   * Compares two cards to determine if they have the same value.
   * @param card the other card
   * @return true if the two cards have the same rank and suitvalues,
   * falseotherwise.
   */
   public boolean equals(Card otherCard ) 
   {
      if ( ( rank != otherCard.rank ) || ( suit != otherCard.suit ) )
         return false;
      else
         return true;
   }
 
   /**
     creates hierarchy for the cards
     @another_card is simply another Card object which with its compared
	*/
	
  
   public int compare(Card anotherCard)
	{
		if(this.getRank() > anotherCard.getRank())
			return 1;
		else if(this.getRank() < anotherCard.getRank())
			return -1;
		else
			return 0;
	}}