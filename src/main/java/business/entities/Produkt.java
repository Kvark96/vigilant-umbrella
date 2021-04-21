package business.entities;

public abstract class Produkt {
    private String name;
    private int quantity;
    private Double totalPrice;

    public Produkt(String name, int quantity, Double totalPrice) {
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

    public Double getTotalPrice() {
        return totalPrice;
    }
}
