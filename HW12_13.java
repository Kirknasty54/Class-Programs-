import java.util.Scanner;

//Inventory manager
//You run a store that has 5 items.
//This program will read in the name of the 5 items, the price for each, and the
//quantity.

//See assignment sheet and comments in code for more details

public class HW12_13{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		//declare the arrays....
		String[] items = new String[5];
		double[] prices = new double[5];
		int[] quantity = new int[5];

		//initialize items
		items = createListOfItems();

		//intitialize prices
		prices = createListOfPrices(items);

		//initialize quantity
		quantity = getQuantities(items);

		//display all items, quantity, and price
		displayListandCost(items, prices, quantity);

		//prompt user and read string for an item to display and
		//invoke findItem.

		System.out.println("Enter an item you wish to find");
		input.nextLine();
		String userSearch = input.nextLine();
		findItem(items, prices, quantity, userSearch);

		//calculate and disply total cost of all inventory

		double results = inventoryCost(prices, quantity);

		//Display the low inventory
		displayLowInventory(items, quantity);

		//Extra credit - prompt user for an item and amount to reduce inventory
		//call reduceInventory and then call displayListandCost

		System.out.println("Please enter in an item");
		String reduceInventoryItem = input.nextLine();

		System.out.println("Now enter an amount to reduce the inventory by");
		int amountReduced = input.nextInt();
		reduceInventory(items, reduceInventoryItem, amountReduced, quantity);
		displayListandCost(items, prices, quantity);

	}//end main

	public static String[] createListOfItems(){
		//returns an array of String populated
		//with 5 items needed from the groceryStore
		System.out.println("Enter item names");
		String[] finalList = new String[5];

		for (int i = 0; i < finalList.length; i++){
			finalList[i] = input.nextLine();
		}//end of for loop

		return finalList;
	}//end createListOfItems

	public static double[] createListOfPrices(String[] list){
		//displays each item of the list and the prompts and reads
		//the price of the item.
		double[] finalPrices = new double[5];

		for (int i = 0; i < list.length; i++){
			System.out.print("Enter price for " + list[i] + ": ");
			finalPrices[i] = input.nextDouble();
		}//end of for loop

		return finalPrices;
	}//end createListOfPrices

	public static int[] getQuantities(String[] list){
		//displays each item in list and ask user to enter the current quantity
		//on hand and stores the value in an array of int
		int[] finalQuantity = new int[5];

		for (int i = 0; i < list.length; i++){
			System.out.print("Enter current inventory for " + list[i] + ": ");
			finalQuantity[i] = input.nextInt();
		}
		return finalQuantity;
	}//end getQuantities

	public static void displayListandCost(String[] list, double[] price, int[] quantities){
		 //displays the inventory by printing
		 //an element from the three arrays on a single line   quantity item cost
		 System.out.printf("%10s%10s%10s\n", "Item", "Price", "Quantity");
		 int[] lastList = new int[5];
		 for (int i = 0; i < lastList.length; i++){
		 	System.out.printf("%10s%10.4f%10d\n", list[i], price[i], quantities[i]);
		}//end of foor loop
	}//end displayListandCost

	public static void findItem(String[] list, double[] price, int[] quantity, String item){
		//searches list for item
		//if item is found in the list, will display  item quantity, and price
		//if item is not in the list, display an appropriate message to the user
		boolean found = false; //will set to true when the item is found
		for (int i = 0; i < list.length; i++){
			if(item.equals(list[i])){
				found = true;
				System.out.println(list[i] + " QTY: " + quantity[i] + " Cost: " + price[i]);
			}//end if statement

		}//end for loop
		if (!found){
			System.out.println("Sorry, I can't seem to find that item. Please try again!");
		}
	}//end findItem

	public static double inventoryCost(double[] prices, int[] qty){
		//sums the quantity * price for each item and returns this value
		double[] inventoryCostList = new double[5];
		double finalCost = 0;
		for (int i = 0; i < inventoryCostList.length; i++){
			//multiplies the prices and quantity of each item
			inventoryCostList[i] = (prices[i] * qty[i]);
			//addes up all the multiplied values to get the total cost
			finalCost += inventoryCostList[i];
		}//end for loop

		System.out.println(finalCost);
		return finalCost;
	}//end inventoryCost

	public static void displayLowInventory(String[] list, int[] qty){
		//displays items in list with quantity on hand of less than 3
		for(int i = 0; i < list.length; i++){
			if (qty[i] < 3){
				System.out.println("Attention, we are VERY low on " + list[i] + ", please consider resupplying");
			}//end if statement
		}//end for loop

	}//end displayLowInventory

	//extra credit
	public static void reduceInventory(String[] list, String item, int amount, int[] qty){
		//finds item in list and reduces qty by amount

		for (int i = 0; i < list.length; i++){
			if(item.equals(list[i])){
				qty[i] = (qty[i] - amount);
				System.out.println("We now have " + qty[i] + " " + list[i]);

			}//end if statment
		}//end of for loop
	}//end reduceInventory

}