
public class SQL {

	private String statement;
	
	public SQL()
	{
		
	}
	
	public void setSQLStatement(String state)
	{
		statement = state;
	}
	
	public String getSQLStatement()
	{
		return statement;
	}
	
	public String getProjectedField() // name, city
	{
		statement = statement.toLowerCase();
		String[] start = statement.split("select");
		String[] end = start[1].split("from");
		return end[0];
	}
	
	public String getTableName() // get emp
	{
		statement = statement.toLowerCase();
		String[] start = statement.split("from");
		String[] end = start[1].split("where");
		return end[0];
	}
	
	public String getConditions() // age > 20, city = New York
	{
		statement = statement.toLowerCase();
		String[] start = statement.split("where");
		String[] end = start[1].split("order by");
		return end[0];
	}
	
	public String getLogicalOperator() // words such as and
	{
		if(statement.contains("and"))
		{
			return "and";
		}
		else if(statement.contains("or"))
		{
			return "or";
		}
		else 
		{
			return "unknown";
		}
	}
	
	public String getOrder() // order by name
	{
		statement = statement.toLowerCase();
		String[] start = statement.split("order by");
		String[] end = start[1].split(" ");
		return end[0];
	}
	
	public String getMainQuery()
	{
		statement = statement.toLowerCase();
		String[] start = statement.split("order");
		String[] end = start[1].split(" ");
		return end[0];
	}
	
}
