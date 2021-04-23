package business.entities;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Indkoebskurv {
    HashMap<Integer, Product> productMap;
    float totalPrice;
    AtomicInteger id;

    public Indkoebskurv() {
        this.id = new AtomicInteger();
        this.productMap = new HashMap<>();
    }

    private void calcTotalPrice() {
        totalPrice = 0;
        for (Cupcake : Order.values()) {
            totalPrice += tmp.getTotalPrice();
        }
    }

    public int getNumberOfItems(){
        return productMap.size();
    }

    public void addToProductMap(Product cupcake) {
        productMap.put(id.incrementAndGet(),cupcake);
        calcTotalPrice();
    }

    public void removeFromProductMap(int id){
        productMap.remove(id);
        calcTotalPrice();
    }


    public HashMap<Integer, Product> getProductMap() {
        return productMap;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
}

