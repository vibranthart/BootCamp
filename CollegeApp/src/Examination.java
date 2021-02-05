
public class Examination extends StudentCollegeAcc{
	private int studentExamScore;
	private double studentGPA;
	
	public Examination()
	{
		this(0,"",0,0.0);
	}
	
	public Examination(int accNo, String name, int examScore, double gpa)
	{
		super(accNo,name);
		studentExamScore = examScore;
		studentGPA = gpa;
	}

	public int getStudentExamScore() {
		return studentExamScore;
	}

	public void setStudentExamScore(int studentExamScore) {
		this.studentExamScore = studentExamScore;
	}

	public double getStudentGPA() {
		return studentGPA;
	}

	public void setStudentGPA(double studentGPA) {
		this.studentGPA = studentGPA;
	}

	@Override
	public String toString() {
		return "Examination [studentExamScore=" + studentExamScore + ", studentGPA=" + studentGPA + "]";
	}
	
	
	
}
