In this exercise, you will create and invoke (call) a static method. The method you will create needs to return the message below to the main method to be displayed in the console:
```
"Computer Science is no more about computers than astronomy is about telescopes. -Edsger W. Dijkstra"
```
Name your method displayQuote. Use the hints below to create your static method and call it in the main method.

Recall the general structure for static methods looks like (example follows below):
```
accessSpecifier static returnType methodIdentifier()
{
//any legal java code can go in here
//EXCEPT another method definition
// if non-void return type, must have return statement
}
```
For calling/invoking static methods, the syntax is:
```
ClassName.identifier();
```
For calling/invoking a non-void static method encase the method call in a print line: 
```
System.out.println(ClassName.identifier());
```
*Make sure your quote matches exactly to the one above! I recommend you copy/paste the quote into your method.
