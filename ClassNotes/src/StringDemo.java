
public class StringDemo {
	public static void main(String[] args)
	{
		String lastName = "York";
		String firstName = "New";
		
		String cityName = firstName.concat(lastName);
		System.out.println("First Name - " + firstName);
		System.out.println("Last Name - " + lastName);
		System.out.println("City Namee - " + cityName);
		
		
		StringBuffer sblastName = new StringBuffer("York");
		StringBuffer sbfirstName = new StringBuffer("New");
		
		sbfirstName.append(sblastName);
		System.out.println("First Name - " + firstName);
		System.out.println("Last Name - " + lastName);
		System.out.println("City Namee - " + cityName);
	}
}
