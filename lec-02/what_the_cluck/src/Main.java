import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);

	System.out.println("*** Welcome to the Karton Kalculation King ***");
	System.out.print("How many hens do you estimate will be laying this week? ");

	int numHens = keyboard.nextInt();

	WhatTheCluckApp app = new WhatTheCluckApp();

	int lowestNumEggs = app.lowestNumEggs(numHens);
	int highestNumEggs = app.highestNumEggs(numHens);

	System.out.printf("%,d hens will likely produce between %,d and %,d eggs.%n",
			  numHens, lowestNumEggs, highestNumEggs);

	int lowestNumCartons = app.lowestNumCartons(lowestNumEggs);
	int highestNumCartons = app.highestNumCartons(highestNumEggs);

	System.out.printf("This will require between %,d and %,d cartons.%n",
			  lowestNumCartons, highestNumCartons);

    }

}
