import java.util.*;

public class Exer3 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a value of hundreds: ");
        int hun_num = obj.nextInt();
        hun_num = hun_num % 10;

        System.out.print("Enter the value of tenths: ");
        int tens_num = obj.nextInt();
        tens_num = tens_num % 10;

        System.out.print("Enter a value of ones: ");
        int ones_num = obj.nextInt();
        ones_num = ones_num % 10;


    switch (hun_num){
        case 1:
            System.out.print("one hundred");
            break;
        case 2:
            System.out.print("two hundred");
            break;
        case 3:
            System.out.print("three hundred");
            break;
        case 4:
            System.out.print("four hundred");
            break;
        case 5:
            System.out.print("five hundred");
            break;
        case 6:
            System.out.print("six hundred");
            break;
        case 7:
            System.out.print("seven hundred");
            break;
        case 8:
            System.out.print("eight hundred");
            break;
        case 9:
            System.out.print("nine hundred");
            break;
        default:
            System.out.print("none");
    }
    switch (tens_num){
        case 0:
            System.out.print(" and ");
            break;
        case 1:
            System.out.print(" teen");
            break;
        case 2:
            System.out.print(" twenty");
            break;
        case 3:
            System.out.print(" thirty");
            break;
        case 4:
            System.out.print(" fourty ");
            break;
        case 5:
            System.out.print(" fifty");
            break;
        case 6:
            System.out.print(" sixty ");
            break;
        case 7:
            System.out.print(" seventy ");
            break;
        case 8:
            System.out.print(" eighty ");
            break;
        case 9:
            System.out.print(" ninety ");
            break;
        
    }

    switch (ones_num){

        case 1:
            System.out.print(" one");
            break;
        case 2:
            System.out.print(" two");
            break;
        case 3:
            System.out.print(" three");
            break;
        case 4:
            System.out.print(" four ");
            break;
        case 5:
            System.out.print(" five");
            break;
        case 6:
            System.out.print(" six ");
            break;
        case 7:
            System.out.print(" seven ");
            break;
        case 8:
            System.out.print(" eight ");
            break;
        case 9:
            System.out.print(" nine ");
            break;
        case 0:
            System.out.print(" ");
            break;
        
    }
}
}