
public class Laptop implements Infromation{
	
	private int serialNumber = 8012;
	
	public void Start() {
		
		System.out.println("Your Laptop is starting...");
	}
	
	public void information() {
		
		System.out.println( "The computer serial port is: " + serialNumber);
	}
	
}
