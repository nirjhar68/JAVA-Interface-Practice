
public class Human {
	String name;
	int age;
	String job;
	double salary;
	
	//defining the constructor
	public Human(String n, int a, String j, double s) {
		this.name = n;
		this.age = a;
		this.job = j;
		this.salary = s;
	}
	
	//Define some methods local to this class
	
	public void intro() {
		System.out.println("Hello! My name is " + name + "\nAge is " + age + "\nMy job is " + job + "\nMy salary is $" + salary);
	}
	
	//Entry point of the application
	public static void main(String[] args) {
		
		//Creating the instance of the Human class
		Human human = new Human("Abdul", 33, "Computer Programmer", 60000);
		human.intro();//Here the base class Human has the access to its own methods
		System.out.println("\n");
		
		//Creating the instance of the child class Student
		Student stdnt1 = new Student("Sam", 21, "Policeman", 30000.00);
		//Trying to access the child class method by the parent class instance gives error
		//human.read();
		
		//But the child class instance has access to both its parent's and own methods
		//Because the child class inherits the super class/ base class/ parent class Human
		stdnt1.intro();
		stdnt1.read();
	}
}
