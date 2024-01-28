package asExceptionGame;

public class Guess {
	private int n;
	
	public Guess() {
		n = ( (int) (Math.random ( ) * 7) ) + 1;
	}
	
	public void checkGuess(String sGuess) throws GuessNotWholeNumberException, GuessOutOfRangeException, GuessTooLargeException, GuessTooSmallException {
		int x;
		
		try {
			x = Integer.parseInt(sGuess);
			
		} catch(NumberFormatException e) {
			throw new GuessNotWholeNumberException();
		}
		
	
		if(x <1 || x >7) {
			throw new GuessOutOfRangeException();
			
		}
		
		else if( x > n) {
			throw new GuessTooLargeException();
		}
		
		else if(x<n) {
			throw new GuessTooSmallException();
		} 
		else {
			return;
		}
	

		
		
	}

}
