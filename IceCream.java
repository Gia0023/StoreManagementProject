public class IceCream{

// the private attributes
private String flavor;
private boolean hasToppings;
private double price;

  // setting default values
public IceCream () {
    this("Vanilla", false, 2.50);
      }

  
  public IceCream(String flavor, boolean hasToppings, double price){
    this.flavor = flavor;
    this.hasToppings = hasToppings;
    this.price = price;
  }

// get methods for each one
public String getFlavor(){
  return flavor;
}

public boolean getHasToppings(){
  return hasToppings;
}

public double getPrice(){
  return price;
}

  // set mutator methods for each one
  public void setPrice(double newPrice) {
    price = newPrice;
  }

   public void setFlavor(String newFlavor) {
    flavor = newFlavor;
  }

   public void setHasToppings(boolean newHasToppings) {
    hasToppings = newHasToppings;
  }

  // toString that allows everything to be printed
  public String toString(){
    return "Flavor: " + flavor + "\nAny toppings? " + hasToppings + "\nCost: $" + price;
  }


      
    }