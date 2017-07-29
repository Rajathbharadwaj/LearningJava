/**
 * Created by BIC on 7/17/2017.
 */
public class DiscountedItem {

private String name;
private int price;
private int bulkQuantity;
private int bulkPrice;


    public DiscountedItem(String name, int price, int bulkQuantity, int bulkPrice) {
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }


    public int priceFor(int itemQuantity) {
        return bulkPrice;
    }


    @Override
    public String toString() {
        return super.toString();
    }




}
