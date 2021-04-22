package business.entities;

public class Topping {
    int product_id;
    String name;
    Double price;

    public Topping(int product_id, String name, Double price) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public int getProduct_id() {return product_id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
