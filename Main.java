// Author : Maya Strickland
//Project Name : MCC Grub & Grill
// Date: 09/27/2022

import java.util.Scanner;

// Declares the class Main
class Main {
  // List of variables and scanners used in my program
  public static final double SMALL_PIZZA = 8.99;
  public static final double MEDIUM_PIZZA = 11.99;
  public static final double LARGE_PIZZA = 14.99;
  public static final double VEGGIE_BURGER = 5.99;
  public static final double GRILLED_CHICKEN_SANDWICH = 6.99;
  public static final double HAMBURGER_SANDWICH = 7.99;
  public static final double MAC_AND_CHEESE = 2.49;
  public static final double HAND_CUT_FRIES = 2.75;
  public static final double ONION_RINGS = 2.99;
  public static final double FOOD_TAX_RATES = 4.125;
  public static double TOTAL = 0;
  public static final double FIVE_PERCENT_TIP_RATE = .05;
  public static final double TEN_PERCENT_TIP_RATE = .10;
  public static final double FIFTEEN_PERCENT_TIP_RATE = .15;
  public static final double TWENTY_PERCENT_TIP_RATE = .20;
  public static double foodTax;

  // Scanner List
  public static Scanner input = new Scanner(System.in);
  public static int menuItem;
  public static int orderAgain;
  public static int tipInput;

  // Method to display the menu to the customer
  public static void myMenu() {
    // Welcome Banner for MCC Grub and Grill
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
    System.out.println(
        "4. Veggie Burger - A black bean burger with Tomato, Mayo, Lettuce, and PepperJack Cheese. All grilled on a panini press.....$5.99");
    System.out.println(
        "5. Grilled Chicken Sandwich - Grilled Chicken topped with Tomato, Mayo, Lettuce, PepperJack Cheese. All grilled on a panini press.....$6.99");
    System.out.println(
        "6. Hamburger- Classic 100% beef patty with Tomato, Mayo, Lettuce and PepperJack Cheese. All grilled on a panini press.....$7.99");
    System.out.println("");

    // List of Sides
    System.out.println("Sides: ");
    System.out.println(
        "7. Mac and Cheese - Not your momma's mac! Spicy 3 Cheese Mac made with Red Pepper Flakes. Beware the spice!.....$2.49");
    System.out.println("8. Hand-Cut Fries - Crisp, golden fries deep fried in peanut oil.....$2.75");
    System.out.println("9. Onion Rings - Crisp, golden rings of onion deep fried in peanut oil.....$2.99");
    // End of Menu
    System.out.println("");
  }

  // Method that displays one round of orders that a customer may want
  public static void oneRoundOfOrders() {
    // Prompts the user to enter in the number of the food item they would like or 0
    System.out.println("Please enter the menu number of the food you would like to order or 0 to stop ordering");
    System.out.println("");
    // While loop to continuously order more food for the customer
    while (true) {
      menuItem = input.nextInt();
      // Switch statement to select the menu item based on keyboard input into
      // menuItem
      switch (menuItem) {
        case 0:
          createBill();
          break;

        case 1:
          System.out.println("You've chosen small pizza! Perfect size pizza for just one " + "$" + SMALL_PIZZA);
          System.out.println("");
          TOTAL += SMALL_PIZZA;
          break;

        case 2:
          System.out
              .println("You've chosen a medium pizza! A pizza big enough to share...or not " + "$" + MEDIUM_PIZZA);
          System.out.println("");
          TOTAL += MEDIUM_PIZZA;
          break;

        case 3:
          System.out.println("You've chosen a large pizza! Pizza for the whole family to enjoy " + "$" + LARGE_PIZZA);
          System.out.println("");
          TOTAL += LARGE_PIZZA;
          break;

        case 4:
          System.out.println(
              "You've chosen a veggie burger! A black bean burger with Tomato, Mayo, Lettuce, and PepperJack Cheese. "
                  + "$" + VEGGIE_BURGER);
          System.out.println("");
          TOTAL += VEGGIE_BURGER;
          break;

        case 5:
          System.out.println(
              "You've chosen grilled chicken sandwich! Grilled Chicken topped with Tomato, Mayo, Lettuce, PepperJack Cheese. "
                  + "$" + GRILLED_CHICKEN_SANDWICH);
          System.out.println("");
          TOTAL += GRILLED_CHICKEN_SANDWICH;
          break;
        case 6:
          System.out.println(
              "You've chosen a hamburger! 100% all beef classic with Tomato, Mayo, Lettuce, and PepperJack Cheese "
                  + "$" + HAMBURGER_SANDWICH);
          System.out.println("");
          TOTAL += HAMBURGER_SANDWICH;
          break;

        case 7:
          System.out.println(
              "You've chosen mac and cheese! Not your momma's mac! This mac is spicy! Beware! " + "$" + MAC_AND_CHEESE);
          TOTAL += MAC_AND_CHEESE;
          System.out.println("");
          break;

        case 8:
          System.out.println(
              "You've chosen hand cut fries! Crisp, golden fries deep fried in peanut oil " + "$" + HAND_CUT_FRIES);
          TOTAL += HAND_CUT_FRIES;
          System.out.println("");
          break;

        case 9:
          System.out.println("You've chosen onion rings! Crisp, golden rings of onion " + "$" + ONION_RINGS);
          System.out.println("");
          TOTAL += ONION_RINGS;
          break;

        default:
          System.out.println("Invalid Entry! Try Again");
          oneRoundOfOrders();
          break;
          
      } // end of switch statement
      System.out.println("Press 1 to order more food or 0 to proceed to checkout");
      // Code that reads keyboard input from the user
      orderAgain = input.nextInt();
      if (orderAgain == 1) {
        myMenu();
        oneRoundOfOrders();
      } 
      else if (orderAgain == 0) 
      {
        foodTax = TOTAL * (FOOD_TAX_RATES / 100);
        System.out.println("Your tax on the total is this: " + "$" + foodTax);
        createBill();
      }
      else
      {
      System.out.println("");
      System.out.println("Invalid Choice!");
      System.out.println("");
      myMenu();
      oneRoundOfOrders();
      }
    } // end of while loop
  } // end of oneRoundOfOrders Method

  // Method to generate the bill based off of what the user ordered
  public static void createBill() {
    TOTAL = TOTAL + (TOTAL * (FOOD_TAX_RATES / 100));
    System.out.println("");
    System.out.println("Your current total without a tip is: " + "$" + TOTAL);
    System.out.println("");
    System.out.println(
        "Please enter 0 to add no tip, 1 to add a 5% tip, 2 to add a 10% tip, 3 to add a 15% tip, or 4 to add a 20% tip");
    System.out.println("");
    tipInput = input.nextInt();
    switch (tipInput) {
      case 0:
        System.out.println("No tip will be added to your bill! Shame on you!");
        System.out.println("Your final total is: " + "$" + TOTAL);
        break;

      case 1:
        System.out.println("Thank you for the tip!");
        TOTAL *= FIVE_PERCENT_TIP_RATE;
        System.out.println("Your final total is: " + "$" + TOTAL);
        break;

      case 2:
        System.out.println("Thank you for the tip!");
        TOTAL = TOTAL + (TOTAL * TEN_PERCENT_TIP_RATE);
        System.out.println("Your final total is: " + "$" + TOTAL);
        break;

      case 3:
        System.out.println("Thank you for the tip!");
        TOTAL *= TWENTY_PERCENT_TIP_RATE;
        System.out.println("Your final total is: " + "$" + TOTAL);
        break;
        
    } // end of switch for tip
  } // end of method createBill

  public static void main(String[] args) {
    myMenu();
    oneRoundOfOrders();
    createBill();
  }
} // end of class
