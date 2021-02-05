
public class StudentCollegeAcc {
	private int accNo;
	private String name;
	
	public StudentCollegeAcc()
	{
		this(0,"");
	}
	
	public StudentCollegeAcc(int accNo, String name)
	{
		this.accNo = accNo;
		this.name = name;
	}
	
	public int getAccNo()
	{
		return accNo;
	}
	
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentCollegeAcc [accNo=" + accNo + ", name=" + name + "]";
	}
	
	
}
