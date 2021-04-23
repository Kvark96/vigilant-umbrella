package business.entities;

import java.util.ArrayList;
import java.util.List;

public class Orderline {
    public Orderline() {
        this.orderline = orderline;
    }

    public List<Cupcake> orderline = new ArrayList<>();

   public void addCupcake(Cupcake cupcake){

       orderline.add(cupcake);
   }
}
