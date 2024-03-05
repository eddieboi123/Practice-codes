import java.util.*;

public class Exer5{
    public static void main(String[] args){
        Scanner put = new Scanner(System.in);
    try{
        System.out.print("Do you wanna run the program? (y) or (n) ");
        char task = put.nextLine().charAt(0);

        boolean proceed = task == 'y' || task == 'Y' ? true: false; 

            while(proceed){            
                System.out.print("Enter a number: ");
                int month = put.nextInt();

                switch(month){
                    case 1:
                        System.out.println("JANUARY");
                        break;
                    case 2:
                        System.out.println("FEBRUARY");
                        break;
                    case 3:
                        System.out.println("MARCH");
                        break;
                    case 4:
                        System.out.println("APRIL");
                        break;
                    case 5:
                        System.out.println("MAY");
                        break;
                    case 6:
                        System.out.println("JUNE");
                        break;
                    case 7:
                        System.out.println("JULY");
                        break;
                    case 8:
                        System.out.println("AUGUST");
                        break;
                    case 9:
                        System.out.println("SEPTEMBER");
                        break;
                    case 10:
                        System.out.println("OCTOBER");
                        break;
                    case 11:
                        System.out.println("NOVEMBER");
                        break;
                    case 12:
                        System.out.println("DECEMBER");
                        break;
                    default:
                        System.out.println("1 to 12 numbers only.");
                }
        
            }
                if(task == 'n' || task == 'N'){
                    System.out.print("OKI");
           
                }
                else{
                    System.out.print("Invalid input, letter y and n only");
                }

    }
    catch(InputMismatchException e){
        System.out.println("Numbers only!");
    }
    }       
}
