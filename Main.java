// Author : Maya Strickland
//Project Name : MCC Grub & Grill
// Date: 09/27/2022

import java.util.Scanner;

class Main {
  
  // List of variables I will use in the following program for each menu item
    static final double smallPizza = 8.99;
    static final double mediumPizza = 11.99;
    static final double largePizza = 14.99;
    static final double veggieBurger = 5.99;
    static final double grilledChickenSandwich = 6.99;
    static final double hamburgerSandwich = 7.99;
    static final double macAndCheese = 2.49;
    static final double handCutFries = 2.75;
    static final double onionRings = 2.99;
    static final double foodTaxRate = 4.125;
    static double total = 0;


  
  public static void main(String[] args) {
    
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
    // Prompts the customer to enter in their selection from 1-9 or 0 to stop ordering food
    // Code to receive keyboard input from the user
    Scanner input = new Scanner (System.in);
    Scanner moreFood = new Scanner (System.in);
    // Declares the variable menuItem and stores the keyboard input in that variable
    System.out.println("Please enter 1 to order food from our menu or 0 to exit");
    int order = moreFood.nextInt();
    System.out.println("Please enter the menu number of the food you would like to order or 0 to stop ordering");
    int menuItem = input.nextInt();
    
    while (order == 1) 
    { 
      if (menuItem == 0)
    {
      System.out.println(total);
      break;
    }
    else if (menuItem == 1)
    {
        System.out.println("You've chosen small pizza! A perfect size pizza for just one! " + "$" + smallPizza);
      total += smallPizza;
        break;
    } 
    else if (menuItem == 2)
      {
        System.out.println("You've chosen medium pizza! A pizza big enough to share...or not " + "$" + mediumPizza);
        total += mediumPizza;
        break;
      }
    else if (menuItem == 3)
      {
        System.out.println("You've chosen large pizza. A pizza big enough for the whole family! " + "$" + largePizza);
        total += largePizza;
        break;
      } 
    else if (menuItem == 4)
      {
        System.out.println ("You've chosen Veggie Burger! A black bean burger with Tomato, Mayo, Lettuce, and PepperJack Cheese. All grilled on a panini press. " + "$" + veggieBurger);
        total += veggieBurger;
        break;
      }
      else if (menuItem == 5)
      {
        System.out.println("You've chosen Grilled Chicken Sandwich! Grilled Chicken topped with Tomato, Mayo, Lettuce, PepperJack Cheese. All grilled on a panini press " + "$" + grilledChickenSandwich);
        total += grilledChickenSandwich;
        break;
      }  
      else if (menuItem == 6)
      {
        System.out.println("You've chosen a Hamburger! Classic 100% beef patty with Tomato, Mayo, Lettuce and PepperJack Cheese. All grilled on a panini press " + "$" + hamburgerSandwich);
        total += hamburgerSandwich;
        break;
      }
      else if (menuItem == 7)
      {
        System.out.println("You've chosen Mac and Cheese! Not your momma's mac! Spicy 3 Cheese Mac made with Red Pepper Flakes. Beware the spice! " + "$" + macAndCheese);
        total += macAndCheese;
        break;
      }
      else if(menuItem == 8)
      {
       System.out.println("You've chosen Hand Cut Fries! Crisp, golden fries deep fried in peanut oil " + "$" + handCutFries);
        total += handCutFries;
        break;
      }
      else if (menuItem == 9)
      {
        System.out.println("You've chosen Onion Rings! Crisp, golden rings of onion deep fried in peanut oil " + "$" + onionRings);
        total += onionRings;
        break;
      }
      else
      {
        System.out.println("Invalid Choice! Try Again!");
      }
  }// end of while
    } // end of main
  }// end of class