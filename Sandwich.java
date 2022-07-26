/**
* Sandwich, subclass of Item, contains methods for
* creating Items of type Sandwich
*
* @author William Ndudirim
*/
public class Sandwich extends Item{

  private int calories;
  /**
  * Constructor
  *
  * @param c calories (in kcal)
  */
  public Sandwich(String d, int p, int w, int c){
    super(d, p, w);
    calories = c;
  }

  /** getter for calories */
  public int getCalories(){
    return calories;
  }

  /** overloads object.toString to return given output */
  public String toString(){
      return "[" + getDescription() + "; Price:" + getPrice() + "p Weight:" + getWeight() + "g Calories:" + getCalories() + "kcal]";
  }
}
