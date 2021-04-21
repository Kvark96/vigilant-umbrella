package business.entities;

public class Cupcake extends Produkt{
    private Topping topping;
    private Bottom bottom;

    public Cupcake(String name, int quantity, Double totalPrice, Bottom bottom, Topping topping) {
        super(name, quantity, totalPrice);
        this.bottom = bottom;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Cupcake{" +
                "topping=" + topping +
                ", bottom=" + bottom +
                '}';
    }

    public Topping getTopping() {
        return topping;
    }

    public Bottom getBottom() {
        return bottom;
    }

}

