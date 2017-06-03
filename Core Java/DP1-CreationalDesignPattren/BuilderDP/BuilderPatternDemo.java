package BuilderDP;

import java.util.Scanner;

public class BuilderPatternDemo {

	 public static void main(String[] args) 
	 {
	      MealBuilder mealBuilder = new MealBuilder();

	      Meal vegMeal = mealBuilder.prepareVegMeal();
	      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	      System.out.println("Give me your order: Veg meals or nonVeg meals");
	      Scanner s=new Scanner(System.in);
	      String choice=s.nextLine();
	      if(choice.equalsIgnoreCase("veg meals"))
	      {
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " +vegMeal.getCost());
	      }
	      else
	      {
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.showItems();
	      System.out.println("Total Cost: " +nonVegMeal.getCost());
	      }
	    }
}
