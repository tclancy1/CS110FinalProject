import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Deck
{
   /
   private final static int ALL_CARDS=52
   //create array
   static ArrayList<Card> deck = new ArrayList<Card>();
   
   
   
   //add to deck
   public Deck(Card card)
   {
      deck.add(card);
   }
   //size
   public static ArrayList<Card> getDeck()
   {
      return deck;
   }
   //shuffle
   public ArrayList<Card> shuffle()
   {
       Collections.shuffle(deck);
       
       return deck;
   } 
   
   // assigns images to the deck
   public ArrayList<Card> getImages()
      
      for (i=0; i < CARDS; i++)
      {
      
      
      if (suit == 0)
      {
         switch ( rank)
         {
           
           case 1:   return "aces.jpg";
           case 2:   return "2s.jpg";
           case 3:   return "3s.jpg";
           case 4:   return "4s.jpg";
           case 5:   return "5s.jpg";
           case 6:   return "6s.jpg";
           case 7:   return "7s.jpg";
           case 8:   return "8s.jpg";
           case 9:   return "9s.jpg";
           case 10:  return "10s.jpg";
           case 11:  return "jacks.jpg";
           case 12:  return "queens.jpg";
           case 13:  return "kings.jpg";
           default:  return "??";
         }
      }
      else if (suit == 1)
      {
         switch (rank)
         {
           case 1:   return "aceh.jpg";
           case 2:   return "2h.jpg";
           case 3:   return "3h.jpg";
           case 4:   return "4h.jpg";
           case 5:   return "5h.jpg";
           case 6:   return "6h.jpg";
           case 7:   return "7h.jpg";
           case 8:   return "8h.jpg";
           case 9:   return "9h.jpg";
           case 10:  return "10h.jpg";
           case 11:  return "jackh.jpg";
           case 12:  return "queenh.jpg";
           case 13:  return "kingh.jpg";
           default:  return "??";
         }
      } 
      else if (suit == 2)
      {
         switch (rank)
         {
           case 1:   return "aced.jpg";
           case 2:   return "2d.jpg";
           case 3:   return "3d.jpg";
           case 4:   return "4d.jpg";
           case 5:   return "5d.jpg";
           case 6:   return "6d.jpg";
           case 7:   return "7d.jpg";
           case 8:   return "8d.jpg";
           case 9:   return "9d.jpg";
           case 10:  return "10d.jpg";
           case 11:  return "jackd.jpg";
           case 12:  return "queend.jpg";
           case 13:  return "kingd.jpg";
           default:  return "??";
         }
      }
      else
      {
         switch (rank)
         {
           case 1:   return "acec.jpg";
           case 2:   return "2c.jpg";
           case 3:   return "3c.jpg";
           case 4:   return "4c.jpg";
           case 5:   return "5c.jpg";
           case 6:   return "6c.jpg";
           case 7:   return "7c.jpg";
           case 8:   return "8c.jpg";
           case 9:   return "9c.jpg";
           case 10:  return "10c.jpg";
           case 11:  return "jackc.jpg";
           case 12:  return "queenc.jpg";
           case 13:  return "kingc.jpg";
           default:  return "??";
         }
      } 
             
   }         

   
   
   public String toString()
    {
        return deck.toString();
    }
 
   
}
   
   