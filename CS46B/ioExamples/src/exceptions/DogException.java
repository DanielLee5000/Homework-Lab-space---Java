package exceptions;

import java.io.File;

public class DogException extends Exception{
	
	public DogException(String err){
		super(err);
	}
	
	public DogException(File day, String err) {
		super("Trouble in day file " + day.getAbsolutePath() + ": " + err);
	}

}
