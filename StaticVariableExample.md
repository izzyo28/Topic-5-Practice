***Static variable:*** 
variables declared outside of a method, but inside the class, along with the static keyword. Any method in that class has access to the variable.

Notice we are accessing the myMonthlyBudget static variable in the main method and the calcNewBudget method. Changing the value of the myMonthlyBudget, by subtracting the groceries purchased, changes the value for the entire program!

What if you wanted to prevent changes to the static variable? Check out the line below to see how to use constants. A constant must be defined and initialized in one line, and use the final keyword.
```
public static final int variableName = 42;
```
