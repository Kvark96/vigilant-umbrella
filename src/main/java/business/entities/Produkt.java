package business.entities;

public abstract class Produkt {
    private String name;
    private int quantity;
    private float totalPrice;

    public Produkt(String name, int quantity, float totalPrice) {
        this.name = name;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
}
