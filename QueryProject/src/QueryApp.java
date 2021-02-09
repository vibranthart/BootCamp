import java.util.Scanner;

public class QueryApp {
	public QueryApp()
	{
		
	}
	
	public static void main(String[] args)
	{
		SQL SQLObject = new SQL();
		SQLObject.setSQLStatement("Select name, city from Emp where age > 20 and city = 'New York' order By name" );
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("1 | Extract All Words");
		System.out.println("2 | Projected Field");
		System.out.println("3 | Table Name");
		System.out.println("4 | Conditions");
		System.out.println("5 | Logical Operator");
		System.out.println("6 | Order By Name");
		System.out.println("7 | Main Query");
		
		while(true)
		{
			System.out.println("Enter a Choice");
			int choice = myObj.nextInt();
			
			switch(choice)
			{
				case 1 :
					String[] words = SQLObject.getSQLStatement().split(" ");
					for( String list : words)
					{
						System.out.println(list);
					}
					break;
				case 2 :
					System.out.println(SQLObject.getProjectedField());
					break;
				case 3 :
					System.out.println(SQLObject.getTableName());
					break;
				case 4 :
					System.out.println(SQLObject.getConditions());
					break;
				case 5 :
					System.out.println(SQLObject.getLogicalOperator());
					break;
				case 6 :
					System.out.println(SQLObject.getOrder());
					break;
				case 7 :
					System.out.println(SQLObject.getMainQuery());
					break;
				default :
					System.out.println("ERROR: Not a Choice Dummy");
					break;
			}
			System.out.println("=============================================");
			
		}
		
	}
}
