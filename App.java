
public class App {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		
		asteriskLogger.Log("Recorded");
		asteriskLogger.Error("I am error");
		
		System.out.println("");
		
		Logger spacedLogger = new SpacedLogger();
		
		spacedLogger.Log("Hello");
		spacedLogger.Error("This is error!");

	}

}
