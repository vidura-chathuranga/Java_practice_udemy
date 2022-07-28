import java.util.Scanner;

public class switchCases {

	public static void main(String[] args) {
		
		//using switch cases we run different commands in here
		
		Scanner input = new Scanner(System.in);
		
		//getting input
		System.out.println("Enter Your instruction: ");
		String ins = input.nextLine();
		
		//checking ins variable value for different instructions
		
		switch(ins) {
		case "run":
			System.out.println("The program is runing....");
			break;
		case "stop":	
			System.out.println("The program stopped!");
			break;
		case "pause":
			System.out.println("The program is paused!");
			break;
		default:
			System.out.println("Your instruction is not recognized !");
		}
		
		//default runs when any given input is not same to the any case.
		//default is not mandatory to use. it works like else statement.
		//you should write 'break' before end of the case, otherwise it(switch-case) will execute all statements until the program finds a break statement.
		
		

	}

}
