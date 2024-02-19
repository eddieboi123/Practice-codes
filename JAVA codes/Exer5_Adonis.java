import java.util.Scanner;

public class Exer5_Adonis {
    public static void main(String[] Args){
        Scanner put = new Scanner(System.in);

        System.out.println("How much in total did you purchase? ");
        float $purchase = put.nextFloat();
		put.nextLine();/*in order to not jump, we put a nextLine() for the double not to jump*/
		double $discount_10 = $purchase * 0.1f;/*when declaring a float data type, always put f at the end of the datatype*/
		double $discount_5 = $purchase * 0.05f;

		float $total_10 = $purchase -($purchase * 0.1f);
		float $total_5 = $purchase -($purchase * 0.05f);
		
		if($purchase > 1000){
			System.out.println("Are you a member here? (Yes) or (No) ");
			char membership = put.nextLine().charAt(0);
			
			
			if(membership == 'y' || membership == 'Y'){
				System.out.println("You have a discount of: 10% or in short you saved "+ $discount_10 +" Pesos, Your total payment need to be payed is: " + $total_10);
			}
			else if(membership == 'n' || membership == 'N'){
				System.out.println("You have a discount only of: 5% or in short you saved "+ $discount_10 +" Pesos, your total payment need to be payed is: " + $total_5);
			}
			else{
				System.out.println("Invalid input, Try again.");
			}
		}
		else if($purchase <= 1000){
			System.out.println("Sorry your purchase did not meet the requirement for a discount...");
		}
		else{
			System.out.println("The amount is not sufficient, it is not possible");
		}
    }
}