// Author : Maya Strickland
//Project Name : MCC Grub & Grill
// Date: 09/27/2022
import java.util.Scanner;
class FoodOrder {
  public static final double smallPizza = 8.99;
  public static final double mediumPizza = 11.99;
  public static final double largePizza = 14.99;
  public static final double veggieBurger = 5.99;
  public static final double grilledChickenSandwich = 6.99;
  public static final double hamburgerSandwich = 7.99;
  public static final double macAndCheese = 2.49;
  public static final double handCutFries = 2.75;
  public static final double onionRings = 2.99;
  public static final double foodTaxRate = 4.125;
  public static double total = 0;
  int menuItem; 
  int orderAgain;
  
  Scanner input = new Scanner (System.in);
  

  public void myMenu()
  {  
    //Welcome Banner for MCC Grub and Grill
    System.out.println("");
    System.out.println("Welcome to MCC Grub and Grill!");
    System.out.println("");
    // Code to tell the user that the list that is next is our current menu items
    System.out.println("Here is a list of our current menu items: ");
    // List of Entree Menu Items Available 
    System.out.println("");
    System.out.println("Entrees: ");
    System.out.println("1. Small Pizza - Perfect size pizza for just one.....$8.99");
    System.out.println("2. Medium Pizza - A pizza big enough to share, or not.....$11.99");
    System.out.println("3. Large Pizza - A pizza big enough for the whole family!.....$14.99");
    System.out.println("4. Veggie Burger - A black bean burger with Tomato, Mayo, Lettuce, and PepperJack Cheese. All grilled on a panini press.....$5.99");
    System.out.println("5. Grilled Chicken Sandwich - Grilled Chicken topped with Tomato, Mayo, Lettuce, PepperJack Cheese. All grilled on a panini press.....$6.99");
    System.out.println("6. Hamburger- Classic 100% beef patty with Tomato, Mayo, Lettuce and PepperJack Cheese. All grilled on a panini press.....$7.99");
    System.out.println("");

    // List of Sides
    System.out.println("Sides: ");
    System.out.println("7. Mac and Cheese - Not your momma's mac! Spicy 3 Cheese Mac made with Red Pepper Flakes. Beware the spice!.....$2.49");
    System.out.println("8. Hand-Cut Fries - Crisp, golden fries deep fried in peanut oil.....$2.75");
    System.out.println("9. Onion Rings - Crisp, golden rings of onion deep fried in peanut oil.....$2.99");
    // End of Menu
    System.out.println("");
  }
 
public void oneRoundOfOrders()
    {      
  System.out.println("Please enter the menu number of the food you would like to order or 0 to stop ordering");
    // Switch statement to select the menu item based on keyboard input into menuItem
      while(true)
        {
      menuItem = input.nextInt();
      switch(menuItem)
        {
        case 0:
            System.out.println("Thank you for shopping with us!");
            System.out.println(total);
            break;
            
          case 1:
            System.out.println("You've chosen small pizza! Perfect size pizza for just one " + "$" + smallPizza);
            total += smallPizza;
            break;
          case 2:
            System.out.println("You've chosen a medium pizza! A pizza big enough to share...or not " + "$" + mediumPizza);
            total += mediumPizza;
            break;
          case 3:
            System.out.println("You've chosen a large pizza! Pizza for the whole family to enjoy " + "$" + largePizza);
            total += largePizza;
            break;
          case 4:
            System.out.println("You've chosen a veggie burger! A black bean burger with Tomato, Mayo, Lettuce, and PepperJack Cheese. " + "$" + veggieBurger);       
            total += veggieBurger;
            break;
          case 5:
            System.out.println("You've chosen grilled chicken sandwich! Grilled Chicken topped with Tomato, Mayo, Lettuce, PepperJack Cheese. " + "$" + grilledChickenSandwich);
            total += grilledChickenSandwich;
            break;
          case 6:
            System.out.println("You've chosen a hamburger! 100% all beef classic with Tomato, Mayo, Lettuce, and PepperJack Cheese " + "$" + hamburgerSandwich);
            total += hamburgerSandwich;
            break;
          case 7: 
            System.out.println("You've chosen mac and cheese! Not your momma's mac! This mac is spicy! Beware! " + "$" + macAndCheese);
            total += macAndCheese;
            break;
          case 8:
            System.out.println("You've chosen hand cut fries! Crisp, golden fries deep fried in peanut oil " + "$" + handCutFries);
            total += handCutFries;
            break;
          case 9:
            System.out.println("You've chosen onion rings! Crisp, golden rings of onion " + "$" + onionRings);
            total += onionRings;
            break;
          default:
            System.out.println("Invalid Entry! Try Again");
            break;
        } // end of switch statement
          System.out.println ("");
          System.out.println("Press 1 to order more food or 0 to proceed to checkout");
          orderAgain = input.nextInt();
          if (orderAgain == 1)
          {
            oneRoundOfOrders();
          } 
          else if (orderAgain == 0)
          {
           System.out.println(total); 
          }
          else
            System.out.println("Invalid Choice!");
           
    } // end of oneRoundOfOrders Method
  } // end of while loop
} // end of class
