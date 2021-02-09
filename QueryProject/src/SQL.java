
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
		int word = "select".length();
		int start = statement.indexOf("Select");
	    int end = statement.indexOf("from");
		return statement.substring(start+word,end);
	}
	
	public String getTableName() // get emp
	{
		int word = "from".length();
		int start = statement.indexOf("from");
	    int end = statement.indexOf("where");
	    return statement.substring(start+word,end);
	}
	
	public String getConditions() // age > 20, city = New York
	{
		int word = "where".length();
		int start = statement.indexOf("where");
	    int end = statement.indexOf("order");
	    return statement.substring(start+word,end);
	}
	
	public String getLogicalOperator() // words such as and
	{
		if(statement.contains("and")) {
			return " and";
		} else if(statement.contains("or")) {
			return " or";
		}
		return " unknown";
	}
	
	public String getOrder() // order by name
	{
		int start = statement.indexOf("order");
	    int end = statement.length();
	    return statement.substring(start+8,end);
	}
	
	public String getMainQuery()
	{
		int start = statement.indexOf("order");
	    int end = statement.indexOf(getConditions())-5;
	    return statement.substring(0,end);
	}
	
	
	
	
	
}
