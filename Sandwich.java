// To Do: Write the class header for your subclass.
// Rename the file to match the name of your subclass.
public class Sandwich extends Lunch{
  


// To Do: Declare the instance variables for your subclass.
	private String sandwichCut;
  private int numPickles;

// To Do: Write your first constructor.
// Describe your constructor here.
  
/**
 * Sandwich - A java constructor that initializes the super variables chips, servings, and price. Initializes the instance variables soupType and numCrackers.
 * @param  sandwichCut - the way you would like your sandwich cut.
 * @param  numPickles - the number of pickles the customer would like inside their sandwich.
 */
  public Sandwich(String chips, int servings, double price, String sandwichCut, int numPickles){
    super(chips,servings,price);
    this.sandwichCut = sandwichCut;
    this.numPickles = numPickles;
  }

// To Do: Write your second constructor.
// Describe your constructor here.

/**
 * Sandwich - A java constructor that initializes the instance variables sandwichCut and numPickles at a default value.
 */
  public Sandwich(){
    sandwichCut = "triangle";
    numPickles = 3;
  }

// To Do: Write your accessor methods.
// Describe each accessor method in a comment.

/**
 * getSandwichCut() - method without parameters that returns the cut of the sandwich.
 * @return - String representing the sandwich cut.
 */
  public String getSandwichCut(){
    return sandwichCut;
  }
  
/**
 * getNumPickles() - method without parameters that returns the requested number of pickles.
 * @return - int representing the number of pickles.
 */
  public int getNumPickles(){
    return numPickles;
  }
  

// To Do: Write your mutator methods.
// Describe each mutator method in a comment.

/**
 * setSandwichCut() - method with String parameter that sets the cut of the sandwich.
 * @param - sandwichCut, stores the type of cut. 
 */
  public void setSandwichCut(String sandwichCut){
    this.sandwichCut = sandwichCut;
  
  }

/**
 * setNumPickles() - method with int parameter that sets number of pickles.
 * @param - numPickles, stores the number of pickles. 
 */
  
	public void setNumPickles(int newNumPickles){
   	boolean isValid = (newNumPickles >= 0);
    if (!isValid){
      numPickles = 1;
    }
    else{
      numPickles = newNumPickles;
  }

// To Do: Write a toString() method.

// To string method
/**
 * toString() - String that returns the values of all the instance variables. 
 * @return - returns values of instance variables
 */
    
	public String toString(){
    return super.toString() + " \nSandwich cut = \"" + sandwichCut + "\" \nnumber of pickles in sandwich = " + numPickles;
  }
}
