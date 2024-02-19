import java.util.Scanner;

public class Exam_Adonis {
	public static void main(String[] args){
		Scanner put = new Scanner(System.in);
		
		System.out.print("First Name: ");
		String F_name = put.nextLine();
		
		System.out.print("Middle Name: ");
		String M_name = put.nextLine();
		
		System.out.print("Last name: ");
		String L_name = put.nextLine();
		
		float Ult_Tour = 1200f;
		float Hopping_Ship = 1500f;
		float Safari_Trip = 1600f;
		
		System.out.println("Welcome " + F_name +" "+ M_name+" "+ L_name);
		System.out.println("What package would you like to recieve: ");
		System.out.println("(1) = Ultimate Tour 1200php");
		System.out.println("(2) = Island Hopping and Shirpwrecks 1500php");
		System.out.println("(3) = Safari and Road Trip 1600php");
		int pack = put.nextInt();
		
		if(pack == 1){
			System.out.println("You chose the Ultimate Tour, That will be: 1200php");
			System.out.println("How would you like to pay?");
			System.out.println("(1) Credit card");
			System.out.println("(2) Cash");
			System.out.print("Input: ");
			int payment = put.nextInt();
			
			if(payment == 1){
				System.out.println("Payment Options: ");
				System.out.println("(1) credit card incurred: 3000php and above");
				System.out.println("(2) credit card incurred: 8000php and above");
				System.out.println("(3) Immediate pay");
				System.out.print("Input: ");
				int credit = put.nextInt();
				
				if(credit == 1){
					System.out.println("Would you like Installment of 3 months? ");
					System.out.println("(1) Yes");
					System.out.println("(2) No");
				int ans = put.nextInt();
				
					if( ans == 1){
						System.out.println("Per month: "  + Ult_Tour/3 +"php");
					}
					else if(ans == 2){
						System.out.println("The transaction is to be paid thorugh credit card, single payment.");
					}
					else
						System.out.println("Invalid Input");
				}
				else if(credit == 2){
					System.out.println("Would you like Installment of 6 months? ");

					System.out.println("(1) Yes");
					System.out.println("(2) No");
				int ans = put.nextInt();
				
					if( ans == 1){
						System.out.println("Per month: "  + Ult_Tour/6 +"php");
					}
					else if(ans == 2){
						System.out.println("The transaction is to be paid thorugh credit card, single payment.");
					}
					else
						System.out.println("Invalid Input");
				}
				else if(credit == 3){
					System.out.println("The transaction is paid through credit card, single payment. paying: " + Ult_Tour +"php");
				}
				else
					System.out.println("Invalid input>");
			}
			
			else if(payment == 2){
				System.out.println("Paid in cash.");
			}
			else{
				System.out.print("Invalid Input");
			}
		}
		/*           Pack 2           */
		else if(pack == 2){
			System.out.println("You chose the Ultimate Tour, That will be: 1500php");
			System.out.println("How would you like to pay?");
			System.out.println("(1) Credit card");
			System.out.println("(2) Cash");
			System.out.print("Input: ");
			int payment = put.nextInt();
			
			if(payment == 1){
				System.out.println("Payment Options: ");
				System.out.println("(1) credit card incurred: 3000php and above");
				System.out.println("(2) credit card incurred: 8000php and above");
				System.out.println("(3) Immediate pay");
				System.out.print("Input: ");
				int credit = put.nextInt();
				
				if(credit == 1){
					System.out.println("Would you like Installment of 3 months? ");
					System.out.println("(1) Yes");
					System.out.println("(2) No");
				int ans = put.nextInt();
				
					if( ans == 1){
						System.out.println("Per month: "  + Hopping_Ship/3 +"php");
					}
					else if(ans == 2){
						System.out.println("The transaction is to be paid thorugh credit card, single payment.");
					}
					else
						System.out.println("Invalid Input");
				}
				else if(credit == 2){
					System.out.println("Would you like Installment of 6 months? ");

					System.out.println("(1) Yes");
					System.out.println("(2) No");
				int ans = put.nextInt();
				
					if( ans == 1){
						System.out.println("Per month: "  + Hopping_Ship/6 +"php");
					}
					else if(ans == 2){
						System.out.println("The transaction is to be paid thorugh credit card, single payment.");
					}
					else
						System.out.println("Invalid Input");
				}
				else if(credit == 3){
					System.out.println("The transaction is paid through credit card, single payment. paying: " + Hopping_Ship +"php");
				}
				else
					System.out.println("Invalid input>");
			}
			
			else if(payment == 2){
				System.out.println("Paid in cash.");
			}
			else{
				System.out.print("Invalid Input");
			}
		}
		
		/*          Pack 3         */
		else if(pack == 3){
			System.out.println("You chose the Ultimate Tour, That will be: 1600php");
			System.out.println("How would you like to pay?");
			System.out.println("(1) Credit card");
			System.out.println("(2) Cash");
			System.out.print("Input: ");
			int payment = put.nextInt();
			
			if(payment == 1){
				System.out.println("Payment Options: ");
				System.out.println("(1) credit card incurred: 3000php and above");
				System.out.println("(2) credit card incurred: 8000php and above");
				System.out.println("(3) Immediate pay");
				System.out.print("Input: ");
				int credit = put.nextInt();
				
				if(credit == 1){
					System.out.println("Would you like Installment of 3 months? ");
					System.out.println("(1) Yes");
					System.out.println("(2) No");
				int ans = put.nextInt();
				
					if( ans == 1){
						System.out.println("Per month: "  + Safari_Trip/3 +"php");
					}
					else if(ans == 2){
						System.out.println("The transaction is to be paid thorugh credit card, single payment.");
					}
					else
						System.out.println("Invalid Input");
				}
				else if(credit == 2){
					System.out.println("Would you like Installment of 6 months? ");

					System.out.println("(1) Yes");
					System.out.println("(2) No");
				int ans = put.nextInt();
				
					if( ans == 1){
						System.out.println("Per month: "  + Safari_Trip/6 +"php");
					}
					else if(ans == 2){
						System.out.println("The transaction is to be paid thorugh credit card, single payment.");
					}
					else
						System.out.println("Invalid Input");
				}
				else if(credit == 3){
					System.out.println("The transaction is paid through credit card, single payment. paying: " + Safari_Trip +"php");
				}
				else
					System.out.println("Invalid input>");
			}
			
			else if(payment == 2){
				System.out.println("Paid in cash.");
			}
			else{
				System.out.print("Invalid Input");
			}
			
		}
	}

}