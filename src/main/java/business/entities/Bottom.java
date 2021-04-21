package business.entities;

public class Bottom {
    int product_id;
    String name;
    Double price;

    public Bottom(int product_id, String name, Double price) {
        this.product_id = product_id;
        this.name = name;
      this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getName() {
        return name;
    }
}
