
public class Square extends Shape {
	
	private double side;
	
	private void setSide(double si)
	{
		side = si;
	}
	
	public double getSide()
	{
		return side;
	}
	
	public double calcArea(double side)
	{
		double result =  side*side;
		return result;
	}
}
