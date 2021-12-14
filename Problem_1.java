//Jackson Kirkpatrick
//main will read in 3 integers and then invoke a method that displays if the sum of the first two integers are equal to the third
import java.util.Scanner;

public class Problem_1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter in 3 integers:");
		int userInputX = input.nextInt();
		int userInputY = input.nextInt();
		int userInputZ = input.nextInt();
		crazySum(userInputX, userInputY, userInputZ);

	}//end main
	public static void crazySum(int x, int y, int z){
		if (x + y >= z){
			System.out.println("The first two integers sum to the third");
		}else{
			System.out.println("The first two integers do not sum to the third");
		}

	}//end crazySum
}//end Problem_1