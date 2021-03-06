
public class Triangle extends Shape{

	private double base;
	private double height;
	
	public Triangle()
	{
		base = 0;
		height = 0;
	}
	
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	private void setBase(double ba)
	{
		base = ba;
	}
	
	public double getBase()
	{
		return base;
	}
	
	private void setHeight(double hei)
	{
		height = hei;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double calcArea()
	{
		double result =  0.5 * base * height;
		return result;
	}
}
