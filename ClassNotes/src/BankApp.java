
public class BankApp {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		
		
		int choice = 0;
		
		//Input choice from user
		//choice = 1 -> SavingAc
		//choice = 2 -> CurrentAc
		choice = 1;
		if(choice == 1)
		{
			ba = new SavingAc("Harish",20000,.00);
		}
		else
		{
			ba = new CurrentAc();
		}
		
		//ba.getRateofInterest(); Cannot use child class functionalities
		ba.withdraw(2000); //this function execution gets change based on choice data
		ba.getBal();
	}
}

