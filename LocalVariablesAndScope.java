public class LocalVariablesAndScope 
{
  public static void main(String[] args)
  {
    //Declare and initialize a String variable named 
    //message that stores the String "I'm from main!".
    String message = "I'm from main!";

    //Use a print statement to display the message variable in the console.
    System.out.println(message);
    
    //Call printMessage method.
    LocalVariablesAndScope.printMessage();

    System.out.println(message);
    
  }
  
  //Create printMessage method here.
  public static void printMessage () {
    String message = "I'm from printMessage!";
    System.out.println(message);
  }
  
}
