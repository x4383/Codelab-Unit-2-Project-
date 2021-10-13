public class Lunch 
{
	// TO DO: Declare instance variables called flavor, quantity, and price.
		String chips;
  	int servings;
  	double price;

  
  	// TO DO: Write the constructor taking parameters newFlavor for flavor
    // newQuantity for quantity, and newPrice for price.

  	// No argument Dessert constructor
 
/**
 * Lunch - A java constructor that initializes the instance variables chips, servings, and price at default values.
 */

// Set the default values of the instance variables
  	public Lunch(){
       chips = "Lays";
       servings = 2;
       price = 3.00;
       
    }
  
/**
 * Lunch - A java constructor that initializes the instance variables chips, servings, and price.
 * @param  chips - the type/flavor of chips the customer would like
 * @param  servings - the amount of servings the customer would like
 * @param  price - the price for the food item selected. 
 */
  	 public Lunch(String newChips, int newServings, double newPrice){
      chips = newChips;
      servings = newServings;
      price = newPrice;
      
    }
// Accessor Methods

/**
 * getChips() - method without parameters that returns the chip type/flavor.
 * @return - String of the chip type/flavor.
 */
  public String getChips(){
    return chips;
    }
  
/**
 * getServings() - method without parameters that returns the number of servings.
 * @return - Int of the number of servings.
 */
  
  public int getServings(){
    return servings;
    }
  
  
/**
 * getPrice() - method without parameters that returns the price of the food item.
 * @return - double representing the total price.
 */
  
  public double getPrice(){
    return price;
    }
  //
  
  // MUTATOR METHODS
  
/**
 * setChips() - method with String parameter that sets the chip type/flavor.
 * @param - newChips, stores the new chip flavor/type as a string. 
 */
  public void setChips(String newChips){
    this.newChips = newChips;
    }
  

/**
 * setServings() - method with int parameter that sets the number of servings.
 * @param - servings, stores the number of servings as an integer. 
 */
  
  public void setServings(int newServings){
    boolean isValid = (newServings >= 0);
    if (!isValid){
      servings = 1;
      }
    else{
      servings = newServings;
      }
    }
/**
 * setPrice() - method with double parameter that sets the total price of the food.
 * @param - price, stores the total price of the meal as a double. 
 */
  public void setPrice(double newPrice){
    boolean isValid = (newPrice >= 0);
    if (!isValid){
      price = 1;
      }
    else{
      // Calculates the price based off of the number of servings the user inputs.
      price = newPrice*servings;
      }
    }
  //
// toString + printInfo methods
  
/**
 * toString() - String that returns the values of all the instance variables. 
 * @return - returns values of instance variables
 */
  public String toString(){
    return " \nchips = \"" + chips + "\" \nservings = " + servings + " \nprice = " + price;
    }
  
/**
 * printInfo() - String that returns the values of all the instance variables. 
 * @System.out.println - calls toString() and prints out the values of the instance variables.
 */
  public void printInfo(){
    System.out.println(toString());
    }
}
