package business.entities;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Indkøbskurv {
    HashMap<Integer,Produkt> productMap;
    float totalPrice;
    AtomicInteger id;

    public Indkøbskurv() {
        this.id = new AtomicInteger();
        this.productMap = new HashMap<>();
    }

    private void calcTotalPrice() {
        totalPrice = 0;
        for (Produkt tmp : productMap.values()) {
            totalPrice += tmp.getTotalPrice();
        }
    }

    public int getNumberOfItems(){
        return productMap.size();
    }

    public void addToProductMap(Produkt cupcake) {
        productMap.put(id.incrementAndGet(),cupcake);
        calcTotalPrice();
    }

    public void removeFromProductMap(int id){
        productMap.remove(id);
        calcTotalPrice();
    }


    public HashMap<Integer, Produkt> getProductMap() {
        return productMap;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
}

