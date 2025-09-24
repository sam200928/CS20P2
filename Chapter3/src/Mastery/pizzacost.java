package Mastery;



	import java.util.Scanner; 
	public class pizzacost {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter the diameter of the pizza in inches: ");
	        double diameter = input.nextDouble();  
	        
	        
	        double labor = 0.75;
	        double rent = 1.00;
	        double materials = 0.05 * diameter * diameter;
	        double totalCost = labor + rent + materials;
	        
	        System.out.printf("The cost of making the pizza is $%.2f%n", totalCost);
	        
	        input.close();
	   
	    }
	}


