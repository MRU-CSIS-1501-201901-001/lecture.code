import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);

	System.out.println("*** Welcome to the Karton Kalculation King ***");
	System.out.print("How many hens do you estimate will be laying this week? ");

	int numHens = keyboard.nextInt();

	System.out.println("the num of hens is : " + numHens);

    }

}
