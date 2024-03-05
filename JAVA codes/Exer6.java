import java.util.*;

public class Exer6{
    public static void main(String[] args){
        Scanner put = new Scanner(System.in);

        try{
            System.out.print("Please Enter your ID number: ");
            int id = put.nextInt();
            int luck_number = id % 10;
            int input;
            int count = 1;

            do{
                System.out.print("Guess the Lucky number: ");
                input = put.nextInt();
                

                if(input != luck_number){
                    System.out.println("Sorry that's not it, try again");
                    ++count;
                }
                else if(input == luck_number){
                    System.out.println("Yes you got it!");
                    System.out.print("it took you "+ count + " guesses to get it right" );
                }
                
            }while(input != luck_number);
        }
        catch(InputMismatchException e){
            System.out.print("Invalid input, Number only!");
        }
    }
}