//Jackson Kirkpatrick
//declares an array of integers that can hold 5 integers
//read in 5 integer values from the console and store them in the array
//change the value at index 2 by adding 10 to the value
//change the value at index 4 to the sum of the values at index 1 and index 3
//call a method public static void displayArray(int[] number) that will display the contents of the array
//must use a loop to display the values
import java.util.Scanner;

public class Problem_3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] arrayOFive = new int[5];
		System.out.println("Enter in 5 integers");
		for(int i = 0; i < arrayOFive.length; i++){
			int userInput = input.nextInt();
			arrayOFive[i] = userInput;
		}//end for loop
		System.out.println("The contents of the array are:");
		displayArray(arrayOFive);
	}//end main

	public static void displayArray(int[] number){
		number[2] += 10;
		number[4] = (number[1] + number[3]);
		System.out.printf("%5s%12s", "Index", "Content\n");
		for (int i = 0; i < number.length; i ++){
			System.out.printf("%5d%12d\n", i, number[i]);
		}//end for loop
	}//end displayArray
}//end of Problem_3