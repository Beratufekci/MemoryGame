
public class Card {
	private char value;
	private boolean guess = false;
	
	 public Card(char value) {
		 this.value = value;
	 }
	 
	 public void setValue(char value) {
		 this.value = value;
	 }
	 public char getValue() {
		 return value;
	 }
	 
	 public boolean isTahmin() {
		 return guess;
	 }
	 public void setGuess(boolean guess) {
		 this.guess = guess;
	 }
	  
	 
	 
	 
	 
	 

}
