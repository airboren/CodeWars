
public class KATA3_CardGame {

	
	  public String winner(String[] deckSteve, String[] deckJosh) {
		    // TODO
		  /*
		   * compare the index characters from 2 arrays with each other
		   * 
		   * assume the hands have the same number of cards
		   */
		  
		  int steveWins=0;
		  int joshWins=0;
		  
		  int [] steve = convertHAND(deckSteve);
		  int [] josh = convertHAND(deckJosh);
		 
		  for (int i=0;i<steve.length;i++){
			  if (steve[i]>josh[i]){
				  steveWins++;
			  }
			  else if(josh[i]>steve[i]){
				  joshWins++;
			  }
		  }
		  
		  if (steveWins > joshWins){
			  return "Steve wins "+steveWins+" to "+ joshWins;
		  }
		  else if(joshWins > steveWins){
			  return "Josh wins "+joshWins+" to "+ steveWins;
		  }
		  else{
			  return "Tie";
		  }
	  }
	  
	  public int[] convertHAND(String[] hand){
		  int[] newHand = new int[hand.length];
		  for (int i=0;i<hand.length;i++){
			  if (hand[i] == "A"){
				  newHand[i] = 14;
			  }
			  else if (hand[i] == "K"){
				  newHand[i] = 13;
			  }
			  else if (hand[i] == "J"){
				  newHand[i] = 12;
			  }
			  else if (hand[i] =="Q"){
				  newHand[i] = 11;
			  }
			  else if (hand[i] =="T"){
				  newHand[i] = 10;
			  }
			  else{
				  newHand[i] = Integer.parseInt(hand[i]);
			  }
		  }
		  
		  return newHand;
	  }
	
	
	
}
