package business.entities;

public class ToppingEntities {

    private int product_id;
    private String name;
    private Double price;

    public ToppingEntities(int product_id, String name, Double price) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
