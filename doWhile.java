import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		
		
		//loop is terminated when user inputs -1
		
		
		//create scanner object for getting inputs
		Scanner scn = new Scanner(System.in);
		
		//declare a integer variable for storing values
		int number = 0;
		
		//getting values in the doWhile loop
		do {
			System.out.println("Enter your number: ");
			number = scn.nextInt();
			
		}while(number != -1); //checking whether the number is equal to -1 or not.
		
		//if user input -1 this statement will be printed
		System.out.println("Loop is terminated Because you entered -1 !"); 

	}

}
