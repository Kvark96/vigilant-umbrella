package business.entities;

public class Indkøbskurv {
    int priceTopping;
    String nameTopping;
    int idTopping;
    int priceBottom;
    String nameBottom;
    int idBottom;
    int antal;

    public Indkøbskurv(int priceTopping, String nameTopping, int idTopping, int priceBottom, String nameBottom, int idBottom, int antal) {
        this.priceTopping = priceTopping;
        this.nameTopping = nameTopping;
        this.idTopping = idTopping;
        this.priceBottom = priceBottom;
        this.nameBottom = nameBottom;
        this.idBottom = idBottom;
        this.antal = antal;
    }

    public int getPriceTopping() {
        return priceTopping;
    }

    public int getIdTopping() {
        return idTopping;
    }

    public int getPriceBottom() {
        return priceBottom;
    }

    public String getNameBottom() {
        return nameBottom;
    }

    public int getIdBottom() {
        return idBottom;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

}
