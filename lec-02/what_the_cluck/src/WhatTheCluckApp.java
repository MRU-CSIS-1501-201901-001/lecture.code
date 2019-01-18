public class WhatTheCluckApp {

    private static int LOWEST_NUM_EGGS_PER_HEN = 7;
    private static int HIGHEST_NUM_EGGS_PER_HEN = 14;
    private static double NUM_EGGS_PER_CARTON = 12.0;


    public int lowestNumEggs(int numHens) {
	return LOWEST_NUM_EGGS_PER_HEN * numHens;
    }

    public int highestNumEggs(int numHens) {
	return HIGHEST_NUM_EGGS_PER_HEN * numHens;
    }

    public int lowestNumCartons(int numEggs) {
	return (int)(Math.ceil(numEggs / NUM_EGGS_PER_CARTON));
    }

    public int highestNumCartons(int numEggs) {
	return (int)(Math.ceil(numEggs / NUM_EGGS_PER_CARTON));
    }

}
