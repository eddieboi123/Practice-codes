import java.util.Scanner;

public class Trial{
    public static void main(String[] args){
        Scanner put = new Scanner(System.in);

        System.out.println("Input 8 number of  ID!");
        System.out.print("Please Enter a valid ID number: ");
        char iD = put.nextLine().charAt(7);

        System.out.print("Guess the number: ");
        char last_Number = put.nextLine().charAt(0);

        String guess = (last_Number == iD) ? "You're Correct" : "Oops that's wrong!";
        System.out.print(guess);

        
    }
}