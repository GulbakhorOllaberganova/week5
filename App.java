package week5Interface;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger asterisk = new AsteriskLogger();
		asterisk.Log("Good");
		asterisk.Error("Bad");
		SpacedLogger Spaced = new SpacedLogger();
		Spaced.Log("School");
		Spaced.Error("School");
		
		
	}

}
