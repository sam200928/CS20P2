package Skillbuilders;

import java.util.Scanner;

public class RectanglePerimeter 
{

	public static void main(String[] args) 
	{
	//declare variables	
		 Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter the width of the rectangle: ");
	        int width = input.nextInt();
	        
	        System.out.print("Enter the length of the rectangle: ");
	        int length = input.nextInt();
	        int area = width * length;  
	        System.out.println("The surface area of the rectangle is: " + area);
	        int perimeter = 2 * width + 2 * length;
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("Width is: " + width);
        System.out.println("Length is: " + length);
	
        input.close();
	}

}
