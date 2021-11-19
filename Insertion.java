package test5; 

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j, k;
		int temp = 0;
		System.out.println("Please enter the number of elements you want to enter : ");
		int[] inputArray = new int[sc.nextInt()];
		System.out.print("Enter the elements in the array ");
		inputArray = acceptArray(sc, inputArray);
		for (k = 0; k < inputArray.length; k++) {
			for (j = 0; j < inputArray.length; j++) {
				while (k != j && inputArray[k] < inputArray[j]) {
					temp = inputArray[k];
					inputArray[k] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}

		for (int insertedNumbers : inputArray) {

			System.out.print(insertedNumbers + " ");

		}

		sc.close();
	}

	private static int[] acceptArray(Scanner sc, int[] inputArray) {
		int i;
		for (i = 0; i < inputArray.length; i++) {
			inputArray[i] = sc.nextInt();

		}
		return inputArray;
	}
}
