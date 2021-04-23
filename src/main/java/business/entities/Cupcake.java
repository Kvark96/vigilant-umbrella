package business.entities;

public class Cupcake {
    private int topping_id;
    private int bottom_id;
    private int quantity;


    public Cupcake(int  quantity, int bottom_id, int topping_id) {
        this.topping_id = topping_id;
        this.bottom_id = bottom_id;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cupcake{" +
                "topping_id=" + topping_id +
                ", bottom_id=" + bottom_id +
                ", quantity=" + quantity +
                '}';
    }

    public int getTopping_id() {
        return topping_id;
    }

    public int getBottom_id() {
        return bottom_id;
    }

    public int getQuantity() {
        return quantity;
    }
}