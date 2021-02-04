
public class Circle extends Shape{

	private double radius;
	
	public Circle()
	{
		radius = 0;
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	private void setRadius(double rad)
	{
		radius = rad;
	}
	
	public double getRadius() 
	{
		return radius;
	}
	
	public double calcArea()
	{
		double rad = radius;
		double pi = Math.PI;
		double result =  pi * rad*rad;
		return result;
	}
}
