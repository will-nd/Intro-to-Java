/**
* Drink, subclass of Item, contains methods for
* creating Items of type Drink
*
* @author William Ndudirim
*/
public class Snack extends Item {

  private boolean healthy;
  /**
  * Constructor
  *
  * @param h healthy
  */
  public Snack(String d, int p, int w, boolean h){
    super(d, p, w);
    healthy = h;
  }

  /** getter for Healthy
  * @return healthy
  */
  public boolean getHealthy(){
    return healthy;
  }

  public String toString(){
    if(!getHealthy()){
      return "[" + getDescription() + "; Price:" + getPrice() + "p Weight:" + getWeight() + "g Healthy: No]";
    } else{
      return "[" + getDescription() + "; Price:" + getPrice() + "p Weight:" + getWeight() + "g Healthy: Yes]";
    }
  }
}
