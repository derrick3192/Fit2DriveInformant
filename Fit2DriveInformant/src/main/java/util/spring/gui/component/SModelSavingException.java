package util.spring.gui.component;

public class SModelSavingException extends Exception {
	
	SaveResult result;
	
	public SModelSavingException(String message, SaveResult result) {
		super(message);
		this.result = result;
		
	}

}
