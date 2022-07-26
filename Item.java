/**
 * Base class for items on sale in our supermarket.
 * Each item has a description, a price and some weight.
 *
 * @author William Ndudirim
 */
public class Item {
    private String description;
    private int price;
    private int weight;

    /**
     * Constructor
     *
     * @param d description
     * @param p price (in pence)
     * @param w weight (in grams)
     */
     public Item(String d, int p, int w){
        description = d;
        price = p;
        weight = w;
    }

    /** overload Object.toString to return a nice string representation
    * String describing item using declared variables
    */
    public String toString(){
        return "[" + getDescription() + "; Price:" + getPrice() + "p Weight:" + getWeight() + "g]";
    }

    /** getter for price
    * @return price
    */
    public int getPrice(){
        return price;
    }

    /** getter for weight
    * @return weight
    */
    public int getWeight(){
        return weight;
    }

    /** getter for description
    * @return description
    */
    public String getDescription(){
        return description;
    }

    /** compute and return the price per 100g (in pence)
    * @return price Per Unit Weight*/
    public int pricePerUnitWeight(){
        return Math.round((price / weight) * 100);
    }
}
