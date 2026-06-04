package java_core_practice.day1.inheritance;

public class Manager extends Employee{

	private String projects; // manager's own filed
	
	public Manager() {
		
	}
	
	public Manager (int id ,String name ,double salary, String projects) {
		super(id,name,salary); // calls  parent class Employee Ctor
		this.projects=projects;
			
	}
	// Manager's own behaviour
	public void startProjects() {
		System.out.println("Manager is working on this "+projects);
	}
	
	// Manager changes Employee behaviuor (this is Polymorpish )
	
	public void work() {
		System.out.print("Manager :-" + id+ name+salary);
		System.out.println("Manager is Working on " + projects);
	}
}
