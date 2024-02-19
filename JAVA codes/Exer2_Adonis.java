import java.util.Scanner;


public class Exer2_Adonis {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.println("Firstname: ");
        String Fname = info.nextLine();

        System.out.println("Middle initial (Character only): ");
        String I = info.nextLine();

        System.out.println("Lastname: " );
        String Lname = info.nextLine();

        System.out.println("Age: ");
        int age = info.nextInt();

        System.out.println("House Number: ");
        int Hnumber = info.nextInt();

        System.out.println("Street: ");
        String Street = info.nextLine();
        
        in.nextLine();
        
        System.out.println("Barangay: ");
        String brgy = info.nextLine();

        System.out.println("City: ");
        String city = info.nextLine();
        
        System.out.println("Province: ");
        String province = info.nextLine();

        System.out.println("Country: ");
        String Ctry = info.nextLine();

        System.out.println("Are you sure about the details? (1) = yes || (2)= no");
        
        int ope = info.nextInt();
        if(ope == 1) {
            System.out.println("Fullname: " + Fname +" "+ I +" " + Lname);
            System.out.println("Age: " + age);
            System.out.println("Address: "+ Hnumber +", "+ Street + ", "+ brgy +", "+ city +", "+ province +", "+ Ctry);
        }
        else if(ope == 2){
            System.out.println("Rerun the program hahah");
        }
    }
}
