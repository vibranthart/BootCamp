
public class Square extends Shape {
	
	private double side;
	
	public Square()
	{
		side = 0;
	}
	
	public Square(double side)
	{
		this.side = side;
	}
	
	private void setSide(double si)
	{
		side = si;
	}
	
	public double getSide()
	{
		return side;
	}
	
	public double calcArea()
	{
		double result =  side*side;
		return result;
	}
}
