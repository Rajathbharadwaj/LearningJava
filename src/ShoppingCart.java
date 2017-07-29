/**
 * Created by BIC on 7/17/2017.
 */
public class ShoppingCart {

private int DiscountPercentage;
private int DiscountQuantity;
private int totalQuantity;

    public ShoppingCart(int discountPercentage, int discountQuantity, int totalQuantity) {
        this.DiscountPercentage = discountPercentage;
        this.DiscountQuantity = discountQuantity;
        this.totalQuantity = totalQuantity;
    }


    public ShoppingCart() {


    }


    public void add() {
        
    }


    public int getDiscountPercentage() {
        return DiscountPercentage;
    }

    public int getDiscountQuantity() {
        return DiscountQuantity;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

}
