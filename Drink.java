/**
* Drink, subclass of Item, contains methods for
* creating Items of type Drink
*
* @author William Ndudirim
*/
public class Drink extends Item {

  private int volume;
  /**
  * Constructor
  *
  * @param v volume (in ml)
  */
  public Drink(String d, int p, int w, int v){
    super(d, p, w);
    volume = v;
  }

  /** getter for volume
  * @return Volume
  */
  public int getVolume(){
    return volume;
  }

  /** overloads object.toString to return given output */
  public String toString(){
    return "[" + getDescription() + "; Price:" + getPrice() + "p Weight:" + getWeight() + "g Volume:" + getVolume() + "kcal]";
  }

}
