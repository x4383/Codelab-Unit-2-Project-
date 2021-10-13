import java.util.Scanner;

public class MyBusiness {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    // User will input the type of chips they want to order as a side.
    System.out.print("Enter chip brand/type: ");
    String chips = input.nextLine();

    // User will input the number of portions they want to eat.
    System.out.print("Enter the number of servings: ");
    int servings = input.nextInt();

    // User will input the price for the meal.
    System.out.print("Enter the price: ");
    double price = input.nextDouble();
    
    // Initializes the Lunch item and prints the details of the item ordered. 
    Lunch lunch1 = new Lunch(chips, servings, price);
    System.out.println("\nYour lunch details are printed below:");
    System.out.println(lunch1);
    
  }
}
