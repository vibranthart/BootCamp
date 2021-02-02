
public class BankUtils {
	private BankAccount[] arr;
	
	public BankUtils(int size) {
		arr = new BankAccount[size];
	}
	
	public boolean newCustomer(BankAccount ba)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == null)
			{
				arr[i] = ba;
				return true;
			}
		}
		return false;
	}
	
	public boolean modifyCustomer(int accNO, BankAccount acc) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == null)
			{
				arr[i] = acc;
				return true;
			}
		}
		return false;
	}
	
}
