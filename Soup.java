// To Do: Write the class header for your subclass.
// Rename the file to match the name of your subclass.
public class Soup extends Lunch{
  


// To Do: Declare the instance variables for your subclass.
	private String soupType;
  private int numCrackers;

// To Do: Write your first constructor.
// Describe your constructor here.

/**
 * Soup - A java constructor that initializes the super variables chips, servings, and price. Initializes the instance variables soupType and numCrackers.
 * @param  soupType - the type of soup the customer would like to order.
 * @param  numCrackers - the number of crackers the customer would like.
 */
  
  public Soup(String chips, int servings, double price, String soupType, int numCrackers){
    super(chips,servings,price);
    this.soupType = soupType;
    this.numCrackers = numCrackers;
  }

// To Do: Write your second constructor.
// Describe your constructor here.

/**
 * Soup - A java constructor that initializes the instance variables soupType and numCrackers at a default value.
 */
  public Soup(){
    soupType = "tomato";
    numCrackers = 6;
  }

// To Do: Write your accessor methods.
// Describe each accessor method in a comment.
  
/**
 * getSoupType() - method without parameters that returns the type of soup.
 * @return - String of the soup type.
 */
  public String getSoupType(){
    return soupType;
  }
  
/**
 * getNumCrackers() - method without parameters that returns the number of crackers.
 * @return - Integer of the number of crackers.
 */
  public int getNumCrackers(){
    return numCrackers;
  }
  

// To Do: Write your mutator methods.
// Describe each mutator method in a comment.

/**
 * setSoupType() - method with String parameter that sets the soup type.
 * @param - soupType, stores the soup type as a string. 
 */
  public void setSoupType(String soupType){
    this.soupType = soupType;
  
  }

/**
 * setNumCrackers() - method with int parameter that sets the soup type.
 * @param - setNumCrackers, stores the number of crackers as a int. 
 */
	public void setNumCrackers(int newNumCrackers){
   	boolean isValid = (newNumCrackers >= 0);
    if (!isValid){
      numCrackers = 1;
    }
    else{
      numCrackers = newNumCrackers;
  }

// To Do: Write a toString() method.
    
/**
 * toString() - String that returns the values of all the instance variables. 
 * @return - returns values of instance variables
 */
	public String toString(){
    return super.toString() + " \nsoupType = \"" + soupType + "\" \nnumber of crackers =  = " + numCrackers;
  }
}
