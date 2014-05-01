import javax.swing.*;

/**
 *Timothy Clancy 
 * This is the card class. It makes a card object. A card consists of a rank suit and and image icon   
 *now lets get to war!!!
 */

public class Card 
{     
	
  
  
   // face cards - these cards can be assigned arbitrary numbers
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;
   public final static int ACE = 14;


        
// this value hold the suits
	public final static int CLUBS = 0;
	public final static int DIAMONDS = 1;
	public final static int HEARTS = 2;
	public final static int SPADES = 3;

	
   
   // hold the card image
	private ImageIcon card_img;
   //suit and rank holders
	private int suit;
	private int rank;	
   
   }

   
  