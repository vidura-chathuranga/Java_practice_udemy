
public class StartingPoint {

	public static void main(String[] args) {
		
		Transport trans1 = new Transport("Van");
		trans1.Driving();
		
		Laptop lap1 = new Laptop();
		lap1.Start();
		
		Infromation info = new Laptop();
		
		info.information();
		
		Infromation info1 = trans1;
		info1.information();
		
		
		getInformation(trans1);
		getInformation(lap1);

	}
	
	public static void getInformation(Infromation info) {
		
		info.information();
	}
}
