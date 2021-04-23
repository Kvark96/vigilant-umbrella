package business.entities;

import web.FrontController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cupcake {
    private int quantity;
    private Topping topping;
    private Bottom bottom;
    private Double calcPrice;


    public Cupcake(int  quantity, int bottom_id, int topping_id) {
        this.quantity = quantity;
        this.bottom = idToBottom(bottom_id);
        this.topping = idToTopping(topping_id);
        calcPrice = _calcPrice();
    }

    public Topping idToTopping(int id){
        String name = "";
        Double price = 0.0;
        try(Connection connection = FrontController.database.connect()){
            String sql = "SELECT name, price FROM toppings WHERE product_id = " + id;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                name = rs.getString("name");
                price = rs.getDouble("price");
            }
            if (price == 0.0 || name.equals("")) throw new SQLException();
        } catch (SQLException ex){
            System.out.println("Failed to connect to SQL in idToTopping");
        }
        return new Topping(id, name, price);
    }

    public Bottom idToBottom(int id){
        String name = "";
        Double price = 0.0;
        try(Connection connection = FrontController.database.connect()){
            String sql = "SELECT name, price FROM bottoms WHERE product_id = " + id;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                name = rs.getString("name");
                price = rs.getDouble("price");
            }
            if (price == 0.0 || name.equals("")) throw new SQLException();
        } catch (SQLException ex){
            System.out.println("Failed to connect to SQL in idToBottom");
        }
        return new Bottom(id, name, price);
    }

    public Double _calcPrice(){
        return (bottom.getPrice() + topping.getPrice()) * quantity;
    }

    @Override
    public String toString() {
        return "Cupcake{" +
                "topping = " + topping +
                ", bottom = " + bottom +
                ", quantity = " + quantity +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public Topping getTopping() {
        return topping;
    }

    public Bottom getBottom() {
        return bottom;
    }

    public Double getCalcPrice() {
        return calcPrice;
    }
}