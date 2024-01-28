package asExceptionGame;

public class GuessOutOfRangeException extends Exception{
	
	public GuessOutOfRangeException() {
		super("Guess is out of range. Needs to be between 1 & 7");
		
	}

}
