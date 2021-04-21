package business.entities;

public class Order {
    private int orderId;
    private String usermail;

    public Order(int _orderId, String _usermail){
        orderId = _orderId;
        usermail = _usermail;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getUsermail() {
        return usermail;
    }
}
