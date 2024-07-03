public class StaticVariableExample
{
  //This is the static variable
  public static double myMonthlyBudget = 1000.0;
  
  public static void main(String[] args) 
  {
    System.out.printf("\nThis is your monthly budget: $%8.2f", myMonthlyBudget);
    System.out.print("\nAfter your trip to the grocery store, where you bought 54 lemons, your budget is now $");
    calcNewBudget();
    System.out.print(myMonthlyBudget);
    
  }
  
  //Method subtracts grocery purchase from initial monthly budget.
  public static void calcNewBudget()
  {
    int amountOfLemons = 54;
    double pricePerLemon = 0.58;
    double totalLemonPrice = amountOfLemons * pricePerLemon;
    myMonthlyBudget = myMonthlyBudget - totalLemonPrice;
    
  }
  
}
