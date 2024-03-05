import java.util.Scanner;

public class practive{
    public static void main(String[] args){
        Scanner put = new Scanner(System.in);

        System.out.print("How much money you have: ");
        float cash = put.nextFloat();
        float money = cash;

        float ones = cash % 10;

        float tenths = cash % 100 - ones;

        float hundred_peso = cash - tenths - ones;


        System.out.println((int)hundred_peso/100 + " = Hundred-peso bill!");
        cash -= hundred_peso;


        int fifty_peso = 1;
        if (cash >= 50){
            System.out.println(fifty_peso + " = Fifty-peso bill");
            cash -= 50;
        }
        else{
            System.out.println("0 = Fifty-peso bill");
        }




        if(cash >= 20){
            System.out.println((int)cash/20 + " = Twenty-peso coin");
            if(cash / 20 == 1)
                cash -= 20;
            else 
                cash -= 40;
        }
        else{
            System.out.println("0 = Twenty-peso coin");

        }






        if(cash >= 10){
            System.out.println("1 = Ten-peso coin");
            cash -= 10;
        }
        else if( cash < 10){
            System.out.println("0 = Ten-peso coin");
        }

        if(cash >= 5){
            System.out.println("1 = Five-peso coin");
            cash -= 5;
        }
        else{
            System.out.println("0 = Five-peso coin");
        }

        if(cash >= 1){
            if(cash / 4 == 0){
                System.out.println("4 = One-peso bill");
                cash -= 4;
            }
            else if(cash / 3 == 0){
                System.out.println("4 = One-peso bill");
                cash -= 3;
            }
            else if(cash / 2 == 0){
                System.out.println("4 = One-peso bill");
                cash -= 2;
            }
            else if(cash / 1 == 0){
                System.out.println("4 = One-peso bill");
                cash -=1;
            }
        }
        else {
            System.out.println("0 = One-peso coin"); 
        }


       System.out.print(cash);
        


        
    }
}