
public class app {

	public static void main(String[] args) {
		
		//create a vehicle type object
		Vehicle vehicle1 = new Vehicle();
		//create a bus type object
		Bus bus1 = new Bus();
		
		Vehicle vehicle2 = bus1;
		
		
		
		vehicle2.calling();
		bus1.riding();
		
		VehicleDesigning(bus1);

	}
	
	public static void VehicleDesigning(Vehicle vehicle) {
		
		vehicle.calling();
	}
}
