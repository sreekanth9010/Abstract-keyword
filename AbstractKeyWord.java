package in.ineuron.abstraction;

import java.util.Scanner;

abstract class Shapes9
{
	 public float area1;
	
	 abstract void input();
	 abstract void compute();
	 abstract void disp();
}
 
 class Rectangle9 extends Shapes9
 {
	 
	 public float length;
	 public float breadth;
		
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
		 area1 = length*breadth;
	 }
	 public void disp()
	 {
		 System.out.println("The area of the rectangle is:" +area1);
	 }
 }
 
 class Square9 extends Shapes9
 {
	 
	 float length;
	 public void input()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the side of square  :");
			length=sc.nextFloat();
			
		}
		
		public void compute()
		{
			 area1 = length*length;
			
		}
		
		public void disp()
		{
			System.out.println("The area of the square is:" +area1);
		}
 }
 class Circle9 extends Shapes9
 {
 	public float radius;
 	 static float pi=3.143f;
 	 
 	
 	public void input()
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Please enter the radius of circle :");
 		radius=sc.nextFloat();
 		
 	}
 	
 	public void compute()
 	{
 		 area1 = pi*radius*radius;
 		
 	}
 	
 	public void disp()
 	{
 		System.out.println("The area of the circle is:" +area1);
 	}
 	
 	
 }

class Geometry
{
	void permit(Shapes9 s)
	{
		s.input();
		s.compute();
		s.disp();
		
	}
}







public class AbstractKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Rectangle9 rect = new Rectangle9();
			Square9 sq = new Square9();
			Circle9 c = new Circle9();
			Geometry g = new Geometry();
			g.permit(rect);
			g.permit(sq);g.permit(c);
			
	}

}
