public class Scoops extends IceCream{

// private instance variables to this subclass
  private boolean isSeasonal;
  private int numScoops;

  // sets default values even to the superclass
public Scoops(){
  this("Vanilla", false, 2.50, false, 0);
}

  
public Scoops(String flavor, boolean hasToppings, double price, boolean isSeasonal, int numScoops){
  super(flavor,hasToppings,price);
  this.isSeasonal = isSeasonal;
  this.numScoops = numScoops;
}

  // return methods for each one
  public boolean getIsSeasonal(){
    return isSeasonal;
  }
  
  public int getNumScoops(){
    return numScoops;
  }

  //set methods for each variable that is in THIS class
   public void setIsSeasonal(boolean newIsSeasonal) {
    isSeasonal = newIsSeasonal;
  }

   public void setNumScoops(int newNumScoops) {
    numScoops = newNumScoops;
  }

  // toString method that prints
  public String toString(){
   return super.toString() + "\nSeasonal flavor? " + isSeasonal + "\nNumber of scoops: " + numScoops;
  }
 
}