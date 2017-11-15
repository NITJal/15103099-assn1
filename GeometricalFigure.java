 abstract class Shape
{
	public abstract void no_of_sides();
}
class Trapezoid extends Shape
{
	public void no_of_sides()
	{
		System.out.println("Trapezoid has 4 sides");
	}
}
class Triangle extends Shape
{
	public void no_of_sides()
	{
		System.out.println("Triangle has 3 sides");
	}
}
class Hexagon extends Shape
{
	public void no_of_sides()
	{
		System.out.println("Hexagon has 6 sides");
	}
}
public class GeometricalFigure 
{
public static void main(String args[])
{
	Shape s1=new Trapezoid();
	Shape s2=new Triangle();
	Shape s3=new Hexagon();
	s1.no_of_sides();
	s2.no_of_sides();
	s3.no_of_sides();
}
}
