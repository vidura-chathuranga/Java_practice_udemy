
public class Transport implements Infromation{
	
	private String type;

	public Transport(String type) {
		
		this.type = type;
	}
	
	public void Driving() {
		
		System.out.println( type + " is Driving...");
	}

	@Override
	public void information() {
		
		System.out.println("The vehicle Type is: " + type);
		
	}
	
	
}
