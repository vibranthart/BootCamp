
public class BankApp {
	public static void main(String[] args) {
		SavingAc sa = new SavingAc(100,"Veena",1.0,1);
		
		BankUtils util = new BankUtils(5);
		
		util.newCustomer(new BankAccount(101, "Veena",1000));
		util.newCustomer(new BankAccount(102, "Smith",2000));
		
		BankAccount modifiedCustomer = new BankAccount(102,"Ram",5000);
		util.modifyCustomer(102,modifiedCustomer);
		
		/*
		BankAccount ba = new BankAccount();
		
		ba.setAccNo(100);
		ba.setName("Veena");
		ba.setBal(1000);
		
		System.out.println("Customer - " + ba.toString());
		
		
		BankAccount ba = new BankAccount(100,"Veena",1000);
		System.out.println("Customer - " + ba);
		
		BankAccount[] arr = new BankAccount[4];
		arr[0] = new BankAccount();
		arr[2] = new BankAccount(101,"Smith",2000);
		
		for(BankAccount customer : arr) {
			System.out.println("Customer - " + customer);
		}
		*/
	}
}
/*
 * store following 5 bank customer data
 * AccNo - 100, 101, 102, 103, 104
 * name - Phil, Veena, John, Mark, Maria
 * bal - 1000, 4000, 2000, 1500, 2500
 * 
 *  Arrange the above customers by their balance and show all customer.
 *  
 * Store following in different arrays
 * 
 * StudentID - 100, 101, 102, 103, 104
 * name - Phil, Veena, John, Mark, Maria
 * bal - 1000, 4000, 2000, 1500, 2500
 * Arrange the students by their marks and show
 */


/*
 * Exercise
 * Remove a customer -> implement
 * get a customer
 * get all customers
 * 
 * 
 * */
