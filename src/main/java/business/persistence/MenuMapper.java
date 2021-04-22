package business.persistence;



import business.entities.Bottom;
import business.entities.Topping;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MenuMapper {
    private Database database;


    public MenuMapper(Database database) {
        this.database = database;
    }

    public List<Bottom> getBottomEntities() {
        List<Bottom> bottomProductList = new ArrayList<>();
        try (Connection connection = database.connect()) {

            String sql = "select * from cupcake.bottoms";


            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {

                   int  product_id = rs.getInt("product_id");
                  String name = rs.getString("name");
                   Double price = rs.getDouble("price");

                    bottomProductList.add(new Bottom(product_id, name, price));

                }
                System.out.println(bottomProductList.toString());
                return bottomProductList;
            } catch (SQLException e) {
                throw new SQLException();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return bottomProductList;
    }


    public List<Topping> getToppingEntities() {
        List<Topping> toppingEntitiesList = new ArrayList<>();
        try (Connection connection = database.connect()) {

            String sql = "select * from cupcake.Toppings";


            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int  product_id = rs.getInt("product_id");
                     String name = rs.getString("name");

                    Double  price = rs.getDouble("price");

                    toppingEntitiesList.add(new Topping(product_id, name, price));


                }
                System.out.println(toppingEntitiesList);
                return toppingEntitiesList;
            } catch (SQLException e) {
                throw new SQLException();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return toppingEntitiesList;

    }


}













