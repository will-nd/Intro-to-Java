/**
* Basket is a Application class uses Item to
*create a basket of items and provide its total
* weightt and price
*
* @author William Ndudirim
*/
import java.util.*;
import java.util.ArrayList;

public class Basket{

  private List<Item> groceries;
  /**
  * Constructor
  *
  * instantiates ArrayList groceries of type Item
  */
  public Basket(){
    groceries = new ArrayList<Item>();
  }

  /** adds new item to groceries */
  public void add(Item i){
    groceries.add(i);
  }

  /** gets total weight of all items basket
  * and basket itself by adding weight of each
  *item to
  * @return totalWeight + 200 */
  public int getWeight(){
    int totalWeight = 0;
    for(Item i : groceries){ //adds weight of each item to totalWeight
      totalWeight += i.getWeight();
    }
    return totalWeight + 200; // totalWeight of items + weight of basket
  }

  /** gets total price of all items in basket
  * @return totalPrice         price of all items in basket
  */
  public int getPrice(){
    int totalPrice = 0;
    for(Item i : groceries){//adds price of each item to totalPrice
      totalPrice += i.getPrice();
    }
    return totalPrice;
  }

  /** toString method that returns String str of all items
  * in basket, their total weight and total price
  * @return str
  */
  public String toString(){
    String str = "---";
    for(Item i : groceries){
      str+=("\n" + i.toString());
    }
    str += ("\n---" + "\nTotal weight: " + this.getWeight()
           + "g" + "\nTotal price: " + this.getPrice() + "p" );
    return str;
  }

  public static void main(String[] args) {

    Basket basket = new Basket();

    Drink cola = new Drink("Cola", 100, 400, 330);
    Drink oj = new Drink("OJ", 100, 300, 200);
    Sandwich blt = new Sandwich("BLT", 200, 200, 450);
    Snack grape = new Snack("Grapes", 50, 200, true);

    basket.add(cola); basket.add(oj); basket.add(blt);basket.add(grape);

    System.out.println(basket.toString());
  }
}
