package asExpection;

public class NotSpecifiedException extends RuntimeException {
	
	public NotSpecifiedException() {
		super("Cannot be an empty name");
	}

}
