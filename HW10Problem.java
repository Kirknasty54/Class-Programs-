//program models a vacation price calculator
//application keeps a running total for all amenitites and displays total cost at the end of the program
//import scanner
import java.util.Scanner;
public class HW10Problem{
	public static void main(String[] args){

		//create scanner
		Scanner input = new Scanner(System.in);
		//welcomes the user and prompts them to enter # of guests and # of nights staying
		//stores guests and nights stayed numbers into integer variables
		System.out.println("Welcome to Kirknasty Resort & Inn! \n Please enter the number of guests staying: ");
		int guestInput = input.nextInt();
		System.out.println("Now how many nights will you be staying with us? ");
		int nightsInput = input.nextInt();
		double roomCosts;
		double totalRoomCosts;
		double mealCosts;
		double finalActivityCosts;
		double totalAllCosts = 0;
		System.out.println("Start entering details for this guest!");
		for (int totalGuests = 0; totalGuests < guestInput; totalGuests++){
			roomCosts = calculateRoomCost(guestInput);
			totalRoomCosts = (roomCosts * nightsInput);
			mealCosts = calculateMealPlan(guestInput);
			finalActivityCosts = getActivitiesCost();
			totalAllCosts = totalAllCosts + (totalRoomCosts + mealCosts + finalActivityCosts);
		}//end of for loop
		System.out.println(totalAllCosts);
	}//end of main method

	public static double calculateRoomCost(int nights){
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter in what room type you would like for this guest");
		System.out.println("1 : Standard Room no view $100/night");
		System.out.println("2 : Luxury Room with view $200/night");
		System.out.println("3 : Luxury Room with Balcony $300/night \n Please enter your choice : ");
		int roomChoice = input.nextInt();
		int roomCost = 0;

		switch(roomChoice){
			case 1: roomCost = 100;
				break;
			case 2: roomCost = 200;
				break;
			case 3: roomCost = 300;
				break;
			default: System.out.println("You have entered in an invalid value please try again");
		}//end of switch statement


		return roomCost;
	}//end of calculateRoomCost

	public static double calculateMealPlan(int nights){
		Scanner input = new Scanner(System.in);

		System.out.println("Please choose from the meal plans listed below for this guest: ");
		System.out.println("1 : Lunch & Dinner only. $65");
		System.out.println("2: 3-Meals a day $150");
		System.out.println("3: 3-Meals a day with drinks $225");
		System.out.println("4: No meal plan $0 \n Please enter your choice: " );
		int mealChoice = input.nextInt();
		int mealCost = 0;

		switch(mealChoice){
			case 1: mealCost = 65;
				break;
			case 2: mealCost = 150;
				break;
			case 3: mealCost = 225;
				break;
			default: System.out.println("Sorry but you have entered in an invalid value, please try again!");
		}//end of switch

		return mealCost;
	}//end of calculateMealPlan

	public static double getActivitiesCost(){
		Scanner input = new Scanner(System.in);

		System.out.println("Choose from these activities");
		System.out.println("1 : Scuba Adventure $300");
		System.out.println("2 : Island Shopping Hop $100");
		System.out.println("3 : Paddle Boarding $125");
		System.out.println("4 : Deep Sea Fishing $500");
		System.out.println("5 : Beach Sitting $0");
		System.out.println("6 : That's all--Done!");
		int activityChoice = input.nextInt();
		double activitySum = 0;

			while(activityChoice != 6){
				switch(activityChoice){
					case 1: activitySum += 300;
						break;
					case 2: activitySum += 100;
						break;
					case 3: activitySum += 125;
						break;
					case 4: activitySum += 500;
						break;
					case 5: activitySum += 0;
						break;
					case 6: System.out.println(activitySum);
					default: System.out.println("Sorry but you have entered an invalid number! Please try again!");
				}//end of switch
				activityChoice = input.nextInt();
			}//end of while

		System.out.println(activitySum);
		return activitySum;
	}//end of getActivitiesCost
}//end of HW10Problem