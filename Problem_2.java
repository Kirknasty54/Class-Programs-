//Jackson Kirkpatrick
//asks the user total number of monkeys and then displays the pounds of bananas you need to order
import java.util.Scanner;

public class Problem_2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the toal number of monkeys: ");
		int monkeyInput = input.nextInt();
		bananaCalculator(monkeyInput);


	}//end main
	public static void bananaCalculator(int monkeyInput){
		if(monkeyInput == 0){
			System.out.println("You neeed 0 pounds of bananas");
		}else if(monkeyInput >= 1 && monkeyInput <= 9){
			System.out.println("You need 25 pounds of bananas");
		}else if(monkeyInput >= 26 && monkeyInput <= 45){
			System.out.println("You need 50 pounds of bananas");
		}else if(monkeyInput >= 46 && monkeyInput <= 100){
			System.out.println("You need 75 pounds of bananas");
		}
	}//end of bananaCalculator
}//end Problem_2