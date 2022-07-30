
class Student {

	public int age;
	public String name;
	public static String campus; // create a static variable
	public static int count = 0;
	
	//we can create unchangeable variables
	public static final float gpa = 50.2f;

	// create constructor to check how many objects are we creating
	public Student() {

		count++;

	}

	// create a method
	public void student() {

		System.out.println("The object name is: " + name);
	}

	// create static method
	public static void staticClass() {

		System.out.println(campus);
//		System.out.println(name); //static method cannot access non static values
	}

}

public class StaticVariablesAndMethods {

	public static void main(String[] args) {

		// checking object count before creating objects
		System.out.println("Before creating objects: " + Student.count);

		// create objects

		Student student1 = new Student();
		Student student2 = new Student();

		// checking object count After creating objects
		System.out.println("After creating objects: " + Student.count);

		// assigning values for objects
		student1.name = "Vidura";
		student2.name = "Vidath";
		student1.age = 21;
		student2.age = 22;

		// static variables have their one copy. so we cannot access that by using
		// objects
		// if you want to access, then call for class name
		Student.campus = "SLIIT";

		// prompt student name, age and Campus
//		System.out.println(student1.name);
//		System.out.println(student1.age);
//		System.out.println(student2.name);
//		System.out.println(student2.age);
//		System.out.println(Student.campus);

		// call for student method
		student1.student();
		Student.staticClass();// calling static method also do the way of static variable using
		student2.student();
		
		//if we want to create a variable like its value cannot changeable like math library values
		System.out.println(Math.E);
//		Math.E = 25; this gives an error because we cannot assign for this
		//also these variables can call like this
		
		System.out.println("My name is " + student1.name + " . I'm " + student1.age
				+ " years old. Also my campus is " + Student.campus + " and my total "
						+ "GPA Mark is " + Student.gpa + ".");
		
//		Student.gpa = 20;gives an error because this value cannot be changeable
		//that quality is given by the 'final' keyword
		

	}

}
