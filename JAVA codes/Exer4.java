import java.util.Scanner;

public class Exer4{
    public static void main(String[] args){
      Scanner put = new Scanner(System.in);

    System.out.print("Enter a amount: ");
    float amount = put.nextFloat();
        

    int hundred_peso = (int) amount/100;
    amount %= 100;

    int fifty_peso = (int) amount/50;
    amount %= 50;

    int twenty_peso = (int) amount/20;
    amount %= 20;

    int ten_peso = (int) amount/10;
    amount %= 10;

    int five_peso = (int) amount/5;
    amount %= 5;

    int one_peso = (int) amount/1;
    amount %= 1;

    int twenty_Five_cents = (int) (amount/0.25);
    amount %= 0.25;


    int five_cents = (int) (amount/0.05);
    amount %= 0.05;

    int one_cents = (int) (amount/0.009);
    amount %= 0.009;


    System.out.println(hundred_peso + " = hundred-peso bill");

    System.out.println(fifty_peso + " = fifty-peso bill");

    System.out.println(twenty_peso + " = twenty-peso coin");

    System.out.println(ten_peso + " = ten-peso coin");

    System.out.println(five_peso + " = five-peso coin");

    System.out.println(one_peso + " = one-peso coin");

    System.out.println(twenty_Five_cents + " twenty five-cent/s coin");

    System.out.println(five_cents + " = five-cent/s coin");

    System.out.println(one_cents + " = one-cent/s coin");


    }
}