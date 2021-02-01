// Java Bean / POJO Plain Old Java Object 
//Complete class
public class BankAccount {
	private int accNo;
	private String name;
	private double bal;
	
	//Add, Modify, remove
	//Setter / Mutator methods
	public void setAccNo(int no) 
	{
		accNo = no;
	}
	
	//Fetch data
	//Getter / Accessor methods
	public int getAccNo() 
	{
		return accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	
}
