
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 0;
		System.out.println(no);
		
		//When data is stored in Heap memory then JVM initialize
		String[] names = new String[5];
		names[3] = "Mary";
		names[0] = "Harish";
		names[1] = "Hart";
		names[4] = "Mike";
		
		for(String name : names )
		{
			System.out.println("New Data - "+name);
		}
	}

}
