package java_core_practice.day1.encpasulation;

public class MainEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		
		user.setName("Shivani Kaiche");
		user.setEmail("shivani@gmail.com");
		user.setAge(24);
		
		System.out.println(user.getName());
		
		System.out.println(user.getEmail());
		
		System.out.println(user.getAge());
	}

}
