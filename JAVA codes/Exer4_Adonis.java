import java.util.Scanner;

public class Exer4_Adonis {
	public static void main(String[] Args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Single character or letter to deteremine if lowercase letter or UPPERCASE LETTER: ");
		char let = in.nextLine().charAt(0);
		/*char low = let.lowerCase();
		char high = let.upperCase();*/
		
		
		if(let >= 'a' && let <= 'z')
			System.out.println("it is a Lowercase letter!");
		else if(let >= 'A' && let <= 'Z')
			System.out.println("it is a Uppercase letter!");
		else
			System.out.println("Try again! , That ain't no letter");
	}
}