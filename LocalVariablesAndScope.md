In this practice exercise, you will create two local variables in two separate methods, and display both to the console. 

Start by creating a static void method called printMessage. Within the method declare and initialize a String variable named message that stores the String "I'm from printMessage!". Then use a print statement to display the message variable in the console.

Next, in the main method, use the comments to guide you to create another message variable, print it, and call the printMessage method.

Finally, click run to see the result!

Notice that the two variables are named the same yet you don't run into an error. This is because those two variables are local variables that exist in different scopes. A variable declared inside pair of brackets “{” and “}” in a method has scope within the brackets only. 

**Scope:** the area in which the variable is accessible to the code. Compiler organizes things this way, sectioning the methods into containers

**Variable lifetime:** amount of time a variable exists in memory or when stops existing in memory. bound by method its declared in.
