import java.util.Scanner;

public class Exer1_Adonis {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);

        System.out.println("What arithmetic computation we will use? (Choose operation base on Number po) ");

        System.out.println("ADD = 1");
        System.out.println("SUBTRACT = 2");
        System.out.println("MULTIPLY = 3");
        System.out.println("DIVIDE = 4");
        int ope = put.nextInt();

        if (ope == 1) {
            System.out.println("Enter first number: ");
            float num1 = put.nextFloat();
            System.out.println("Enter second number: ");
            float num2 = put.nextFloat();
            float answer = num1 + num2;
            System.out.println("The Addition result is: " + answer);
        }

        else if (ope == 2) {
            System.out.println("Enter first number: ");
            float num1 = put.nextFloat();
            System.out.println("Enter second number: ");
            float num2 = put.nextFloat();
            float answer = num1 - num2;
            System.out.println("The Subtraction result is: " + answer);
        }

        else if (ope == 3) {
            System.out.println("Enter first number: ");
            float num1 = put.nextFloat();
            System.out.println("Enter second number: ");
            float num2 = put.nextFloat();
            float answer = num1 * num2;
            System.out.println("The Multiplication result is: " + answer);
        }

        else if (ope == 4) {
            System.out.println("Enter first number: ");
            float num1 = put.nextFloat();
            System.out.println("Enter second number: ");
            float num2 = put.nextFloat();
            if(num2 == 0){
                System.out.println("Try again, zero as denominator is not valid!");
            }
            float answer = num1 / num2;
            
            System.out.println("The Division result is: " + answer);
        }
    }
}
