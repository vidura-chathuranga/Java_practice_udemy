
class mySelf{
	
	String name;
	int age;
	
	void print() {
		
		System.out.println("program is running....");
		System.out.println("My name is " + name + " and " + age + " years old.");
	}
}


public class application {

	public static void main(String[] args) {
		//java application has only one public class and only one main function 
		
		//creating a dynamic object for mySelf class
		
		mySelf obj1 = new mySelf();
		
		//assigning values for obj1 object
		
		obj1.name = "Vidura Chathuranga";
		obj1.age = 21;
		
		//call print function of the obj1
		
		obj1.print();

	}

}
