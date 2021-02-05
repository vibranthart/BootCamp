
public class FinanceDepartment extends StudentCollegeAcc{
	private int studentTuition; // tuition price
	private int studentUnsubloans; // unsubsidized loans
	private int studentSubloans; // subsidized loans
	private int studentScholarships; //scholarship values
	
	
	public FinanceDepartment()
	{
		this(0,"",0,0,0,0);
	}
	
	public FinanceDepartment(int accNo, String name,int tuition,int unsubloans, int subloans, int scholarships)
	{
		super(accNo, name);
		studentTuition = tuition;
		studentUnsubloans = unsubloans;
		studentSubloans = subloans;
		studentScholarships = scholarships;
	}
	
	public int getStudentTuition() {
		return studentTuition;
	}

	public void setStudentTuition(int studentTuition) {
		this.studentTuition = studentTuition;
	}

	public int getStudentUnsubloans() {
		return studentUnsubloans;
	}

	public void setStudentUnsubloans(int studentUnsubloans) {
		this.studentUnsubloans = studentUnsubloans;
	}

	public int getStudentSubloans() {
		return studentSubloans;
	}

	public void setStudentSubloans(int studentSubloans) {
		this.studentSubloans = studentSubloans;
	}

	public int getStudentScholarships() {
		return studentScholarships;
	}

	public void setStudentScholarships(int studentScholarships) {
		this.studentScholarships = studentScholarships;
	}
	
	public int finalAmount()
	{
		int finalAmount = studentTuition + studentUnsubloans + studentSubloans - studentScholarships;
		return finalAmount;
	}

	@Override
	public String toString() {
		return "FinanceDepartment [studentTuition=" + studentTuition + ", studentUnsubloans=" + studentUnsubloans
				+ ", studentSubloans=" + studentSubloans + ", studentScholarships=" + studentScholarships + "]";
	}
	
	
}
