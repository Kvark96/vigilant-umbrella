package business.entities;

import java.util.ArrayList;
import java.util.List;

public class Orderline {
    private List<Cupcake> orderline = new ArrayList<>();
    private Double calcPrice = 0.0;

    public Orderline() {
    }


   public void addCupcake(Cupcake cupcake){
       orderline.add(cupcake);
       calcPrice = _calcPrice();
   }

   public Double _calcPrice(){
        Double total = 0.0;
        for(Cupcake c : orderline){
            total += c.getCalcPrice();
        }
        return total;
   }

    public List<Cupcake> getOrderline() {
        return orderline;
    }

    public Double getCalcPrice() {
        return calcPrice;
    }
}