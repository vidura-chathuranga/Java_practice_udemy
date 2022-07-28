import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		//here we are going to get inputs from the user to an array
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("how much integers do you want: ");
		int n = input.nextInt();
		
		//declare an array
		int [] numbers = new int[n];
		
		//getting user input for array
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.println("Enter Your integer: ");
			numbers[i] = input.nextInt();
			
		}
		
		//print all the entered integers
		for(int i=0; i< numbers.length; i++) {
			
			System.out.println("You have entered : " + numbers[i]);
		}
		

	}

}
