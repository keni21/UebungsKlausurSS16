package Uebungsblatt6Bsp2;

public class errorMessage {
	
	String errorLevel;
	String errorMessage;
	String errorTime;
	
	public errorMessage(String errorLevel, String errorMessage, String errorTime) {
		super();
		this.errorLevel = errorLevel;
		this.errorMessage = errorMessage;
		this.errorTime = errorTime;
	}

	public String getErrorLevel() {
		return errorLevel;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getErrorTime() {
		return errorTime;
	}

	
	public String toLine() {
		return errorTime+": "+errorLevel + " - "+errorMessage ;
				
	}
	
	
	

}
