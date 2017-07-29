/**
 * Created by BIC on 7/17/2017.
 */
public class Purchase {


    private String item;
    private int quantity;
    private boolean isEmpty;
    private int price;


    public Purchase(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;

    }

    public Purchase(int price) {
        this.price = price;
    }


    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }


    public void updateQuantity(int newQuantity) {

        this.quantity = newQuantity;


    }

    public boolean isEmpty() {

        if (quantity > 0) {
            return true;
        } else {
            return false;
        }
    }






}
