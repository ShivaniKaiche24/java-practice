package java_core_practice.day1.inheritance;

public class Employee {
	
	protected int id;
	protected String name;
	protected double salary;
	
	public Employee () {
		
	}
	public Employee( int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	public void work() {
		System.out.println( " Employee is Working");
	}

	
}
