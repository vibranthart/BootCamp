class bankAccount{
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

public class Part2A {
	public static void main(String[] args) {
		bankAccount ba = new bankAccount();
		/*
          order:(101/Veena/4000) (104/Maria/2500) (102/John/2000) (103/Mark/1500) (100/Phil/1000)
		 */
		int[] accountnum = new int[5];
		accountnum[0] = 101;
		accountnum[1] = 104;
		accountnum[2] = 102;
		accountnum[3] = 103;
		accountnum[4] = 100;
		
		String[] names = new String[5];
		names[0] = "Veena";
		names[1] = "Maria";
		names[2] = "John";
		names[3] = "Mark";
		names[4] = "Phil";
		
		int[] balance = new int[5];
		balance[0] = 4000;
	    balance[1] = 2500;
	    balance[2] = 2000;
	    balance[3] = 1500;	
	    balance[4] = 1000;
	    	
	    int i;
	    for(i = 0; i<5; i++) {
	    	ba.setAccNo(accountnum[i]);
	    	System.out.print("Account # - " + ba.getAccNo());
		    ba.setName(names[i]);
		    System.out.print(" -> Client Name -> " + ba.getName());
		    ba.setBal(balance[i]);
		    System.out.print(" -> Balance -> " + ba.getBal());
		    System.out.println(" ");
	    	}
	}
}
