package util.spring.gui.component;

public class ModelSavingException extends Exception {
	
	SaveResult result;
	
	public ModelSavingException(String message, SaveResult result) {
		super(message);
		this.result = result;
		
	}

}
