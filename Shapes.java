package in.ineuron.abstraction;

import java.util.Scanner;

class Rectangle
{
	public float length;
	public float breadth;
	public float area;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of rectangle :");
		length=sc.nextFloat();
		System.out.println("Please enter the breadth of rectangle :");
		breadth=sc.nextFloat();
		
	}
	
	public void compute()
	{
		 area = length*breadth;
		
	}
	
	public void disp()
	{
		System.out.println("The area of the rectangle is:" +area);
	}
}

class Square
{
	public float length;
	public float area;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the side of square  :");
		length=sc.nextFloat();
		
	}
	
	public void compute()
	{
		 area = length*length;
		
	}
	
	public void disp()
	{
		System.out.println("The area of the square is:" +area);
	}
	
	
}


class Circle
{
	public float radius;
	 static float pi=3.143f;
	 public float area;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius of circle :");
		radius=sc.nextFloat();
		
	}
	
	public void compute()
	{
		 area = pi*radius*radius;
		
	}
	
	public void disp()
	{
		System.out.println("The area of the circle is:" +area);
	}
	
	
}


//Performing project without using abstraction
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Square squ = new Square();
		Circle circ = new Circle();
		rect.input();
		rect.compute();
		rect.disp();
		
		squ.input();
		squ.compute();
		squ.disp();
		
		circ.input();
		circ.compute();
		circ.disp();

	}

}
