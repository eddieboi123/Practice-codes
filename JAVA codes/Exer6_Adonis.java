import java.util.Scanner;

public class Exer6_Adonis {
	public static void main(String[] Args){
		Scanner put = new Scanner(System.in);
		
		System.out.println("(1) Drinks");
		System.out.println("(2) Viands");
		System.out.println("(3) Desserts");
		System.out.print("What's your order? ");
		
		int $order = put.nextInt();
		
		if($order == 1){
			System.out.println("Available: ");
			System.out.println("(1) Water");
			System.out.println("(2) Milktea");
			System.out.println("(3) Buko Juice");
			System.out.print("Your order: ");
			
			int drinks = put.nextInt();
			
			if(drinks == 1){
				System.out.println("You succesfully ordered Water");
			}
			else if(drinks == 2){
				System.out.println("You succesfully ordered Milktea");
			}
			else if(drinks == 3){
				System.out.println("You succesfully ordered Buko Juice");
			}
			else {
				System.out.println("Invalid input, rerun the program");
			}
		}
		else if($order == 2){
			System.out.println("Available: ");
			System.out.println("(1) Viands?");
			System.out.println("(2) Viands?");
			System.out.println("(3) Viands");
			System.out.print("Your order: ");
			
			int drinks = put.nextInt();
			
			if(drinks == 1){
				System.out.println("You succesfully ordered Viands?");
			}
			else if(drinks == 2){
				System.out.println("You succesfully ordered Viands?");
			}
			else if(drinks == 3){
				System.out.println("You succesfully ordered Viands?");
			}
			else {
				System.out.println("Invalid input, rerun the program");
			}
		}
		else if($order == 3){
			System.out.println("Available: ");
			System.out.println("(1) Creampuff");
			System.out.println("(2) Leche Plan");
			System.out.println("(3) Agar agar");
			System.out.print("Your order: ");
			
			int desserts = put.nextInt();
			
			if(desserts == 1){
				System.out.println("You succesfully ordered Creampuff");
			}
			else if(desserts == 2){
				System.out.println("You succesfully ordered Leche Plan");
			}
			else if(desserts == 3){
				System.out.println("You succesfully ordered Agar agar");
			}
			else {
				System.out.println("Invalid input, rerun the program");
			}
		}
		else{
			System.out.println("Wut?");
		}
	}

}