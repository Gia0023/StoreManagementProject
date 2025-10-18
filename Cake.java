public class Cake extends IceCream{

  private boolean isIceCreamCake;
  private int numLayers;

  // sets default values for this class and the superclass information
  public Cake(){
    this("Vanilla", false, 2.50, false, 0);
  }

  public Cake(String flavor, boolean hasToppings, double price, boolean isIceCreamCake, int numLayers){
    super(flavor,hasToppings,price);
  this.isIceCreamCake = isIceCreamCake;
  this.numLayers = numLayers;
  }

  // get methods for each private variable in this class
  public boolean getIsIceCreamCake(){
    return isIceCreamCake;
  }

  public int getNumLayers(){
    return numLayers;
  }

  //set methods for each variable in this class
   public void setIsIceCreamCake(boolean newIsIceCreamCake) {
    isIceCreamCake = newIsIceCreamCake;
  }

   public void setNumLayers(int newNumLayers) {
    numLayers = newNumLayers;
  }


  // toString to print everything plus the superclass
  public String toString(){
   return super.toString() + "\nIce cream cake? " + isIceCreamCake + "\nNumber of layers: " + numLayers;
  }

 
}