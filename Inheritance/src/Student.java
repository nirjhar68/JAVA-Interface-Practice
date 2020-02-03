//Here we're creating the subclass/child class to the super class/parent class/base class Human
public class Student extends Human{
	//Now we have to construct the Student class instances variables the same way we constructed the Human class instance variables
	public Student(String nm, int ag, String jb, double slry) {
		super(nm, ag, jb, slry);
	}
	
	public void read() {
		System.out.println("I am studying.\n");
	}

	
}
