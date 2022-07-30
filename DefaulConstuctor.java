
class class1{
	
	//define integer variable called value
	int age;
	String name;
	
//	define class 1 constructor and it has no return type
	public class1() {
		
		this(5);//calling to second constructor and this must be the first statement in a constructor
		
		age = 12;
		System.out.println("class 1 Constructor is runing....");
		
	};
	
	//define overload constructor with one parameter
	public class1(int age) {
		
		this.age = age; //this.age refers the class variable age and age refers the local variable(in the parameter) age
		System.out.println("The second Construct is runing...");
	};
	
	//define overload constructor with 2 parameters
	public class1(int age, String name) {
		
		this.age = age;
		this.name = name;
		System.out.println("The third constructor is runing...");
	}
	
}

public class DefaulConstuctor {
	public static void main(String[] args) {
		//creating a class for obj1
		class1 obj1 = new class1();
		
		//calling to second constructor
		class1 obj2 = new class1(5);
		
		//calling to third constructor
		class1 obj3 = new class1(21, "Vidura chathuranga");
		
		System.out.println(obj3.age +  obj3.name);
		
		
	}

	

}
