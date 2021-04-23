package business.entities;

public interface  Product {
    private String name;
    private int quantity;
    private Double totalPrice;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

}
