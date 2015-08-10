package oop_les6_hw2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Thread[] threadArray = new Thread[11];
		int[] intArray = new int[400];
		Random random = new Random();

		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=random.nextInt(20);			
		}
		
		for (int i = 1; i < threadArray.length; i++) {
			threadArray[i] = new Thread(new ThreadWithArraySum(i, intArray));
			threadArray[i].start();
		}

	}

}
