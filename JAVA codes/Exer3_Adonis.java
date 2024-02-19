import java.util.Scanner;

public class Exer3_Adonis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number to determine wether it is positve, negative or zero: ");
        int num1 = in.nextInt();

        if(num1 > 0)
            System.out.println("It is a postive Number!");
		else if(num1 < 0)
			System.out.println("It is a negative Number!");
		else
			System.out.println("It is a zero!");

    }
}
