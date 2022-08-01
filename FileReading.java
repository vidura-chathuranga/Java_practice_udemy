import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws FileNotFoundException {
		
		//assign file path to a variable
		String path = "C:\\Users\\VIDURA\\OneDrive\\Desktop\\test\\text.txt";
		
		//Create a file object
		File file1 = new File(path);
		
		
		Scanner text = new Scanner(file1);
		
		//read only the integer Value
		
		int number = text.nextInt();
		
		System.out.println("Age is: " + number);
		
		//we are looping and read all the data from our file
		
		while(text.hasNextLine()) {
			
			String line = text.nextLine();
			
			System.out.println(line);
			
		}
		
		text.close();
		
		
		

	}

}
