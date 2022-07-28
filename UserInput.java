
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		// create scanner object
		Scanner scn = new Scanner(System.in);
		
		//getting string Input
		System.out.println("Enter your name: "); 
		String name = scn.nextLine();
		
		//getting int Input
		System.out.println("Enter your age: ");
		int age = scn.nextInt();
		
		//getting double value
		System.out.println("Enter your GPA Score: ");
		double gpa = scn.nextDouble();
		
		//getting float value
		System.out.println("How much tall you: ");
		float height = scn.nextFloat();
		
		//prompt output of the inputs
		System.out.println("Your name is: " + name + "\n" + "Your age is: " + age + "\n" + "Your GPA Score is: " + gpa + "\n" + "Your height is: " + height);

	}

}
