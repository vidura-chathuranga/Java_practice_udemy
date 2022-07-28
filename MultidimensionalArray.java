
public class MultidimensionalArray {

	public static void main(String[] args) {
		
		//here we are going to create multidimensional arrys
		
		
		//multidimensional array declaration 
		
		int [][] multidimensionalArray = {{1,2,3},{4,5,6,7},{8,9,10}};
		
		//let's print its values
		
		System.out.println("first array 3rd value is: " + multidimensionalArray[0][2]);
		
		//we can define multidimensional arrays also like this
		
		int [][] numbers = new int[4][2];
		
		//print first multimensionalArray using nested for loops
		
		for(int i = 0; i < multidimensionalArray.length; i++) {
			
			for(int j = 0; j < multidimensionalArray[i].length; j++) {
				
				System.out.print(multidimensionalArray[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
