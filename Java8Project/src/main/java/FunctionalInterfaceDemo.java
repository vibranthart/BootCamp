@FunctionalInterface //interface MUST contain ONLY one abstract method
interface Calc {
	int no = 99;
	public int add(int a, int b);
	public default int subtract(int a, int b) { return a-b; }
	public static int multiply(int a, int b) { return a*b; } 
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Anonymous class = class without name
		//Only use once
		Calc calcObj = new Calc() {
			public int add(int x, int y) 
			{
				return x+y;
			}
		};
		
		//Lambda Expression
		Calc newObj = (x, y) -> x+y;
		System.out.println("Result = " + newObj.add(3, 4));
		System.out.println("Multiply - " + Calc.multiply(3, 4));
	}

}
