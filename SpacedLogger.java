package week5Interface;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
		StringBuilder space = new StringBuilder();
		for(int i=0; i<Log.length(); i++) {
			space.append(" ");
			space.append(Log.charAt(i));
			
		}
		System.out.println(space.toString());
	}

	@Override
	
	public void Error(String Error) {
		
		StringBuilder errorSpace = new StringBuilder();
		for(int a=0; a<Error.length(); a++) {
			errorSpace.append(" ");
			errorSpace.append(Error.charAt(a));
		}
		System.out.println("ERROR:" + errorSpace.toString());
	}

}
