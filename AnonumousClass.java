
class Computer {

	public void shutdown() {

		System.out.println("The computer is Shutting down...");
	}
}

interface Phone {

	public void call();
}

public class AnonumousClass {

	public static void main(String[] args) {

		// create a computer class object 1
		Computer computer1 = new Computer();
		computer1.shutdown(); // call to shutdown method in computer class

		// create object of computer class 2
		Computer computer2 = new Computer() {

			@Override
			public void shutdown() { // create another Overriden function call shutdown

				System.out.println("Mac pc is shutting down...");
			}

		};

		// then call call to 2nd object shutdown function
		computer2.shutdown();
		
		// create a phone interface object
		Phone phone =  new Phone() {

			@Override
			public void call() {
				
				System.out.println("calling....");
				
			}
			
		};
		
		//calling to call function
		phone.call();
	}


}
