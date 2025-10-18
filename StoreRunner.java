import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {


    // calling the iceCream superclass with parameters
IceCream i = new IceCream("Chocolate", true, 2.50);
System.out.println("----------------------------");
System.out.println(i);

   // calling the scoops subclass with parameters
Scoops s = new Scoops("Vanilla", false, 2.50, false, 2);
System.out.println("----------------------------");
System.out.println(s);

    // calling the cake subclass with parameters
Cake c = new Cake("Strawberry", false, 2.50, true, 1);
System.out.println("----------------------------");
System.out.println(c);
    
  }
}