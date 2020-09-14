import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
// create a Scanner for user input
 Scanner input = new Scanner(System.in);

 // declare a variable to store Celsius

 // ask the user for celsius
  System.out.println("Please enter the Celsius that you want to change to Fahrenheit:");
  // initialize the celsius that needs to be converted to Fahrenheit


// declare and initialize a variable for Celsius
int Celsius = input.nextInt();

// delcare and initialize a variable for Fahrenheit
int Fahrenheit = ((Celsius*9)/5 +32);
 // tell the user the converted temperature
 System.out.println("The answer is "  + Fahrenheit + "F.");
  }
}
