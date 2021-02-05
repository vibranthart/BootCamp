import java.util.Scanner;

public class App {
	public static void main(String[] args)
	{
		StudentCollegeAcc sc = null;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Select a shape:");
		System.out.println("1 | Administration");
		System.out.println("2 | Finance");
		System.out.println("3 | Exam");
			
		while(true)
		{
			System.out.println("Enter Choice");
			int choice = myObj.nextInt();
			
			switch(choice)
			{
			case 1 : 
				sc = new Administration(101,"Matthieu Boi","123 Yo ln", "Native-American","N/A");
				String str = sc.toString();
				System.out.println(str);
				break;
			case 2 : 
				sc = new FinanceDepartment(101,"Matthieu Boi", 10000,2000,2000,5000);
				String str1 = sc.toString();
				System.out.println(str1);
				break;
			case 3 : 
				sc = new Examination(101,"Matthieu Boi",85,3.84);
				String str2 = sc.toString();
				System.out.println(str2);
				break;
			default :
				System.out.println("ERROR: You done goofed");
				break;
				
			}
			
			System.out.println(""); //Provides space between each loop of the run
		}
		
		
	}
}
