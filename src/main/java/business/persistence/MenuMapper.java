package business.persistence;

import business.entities.BottomEntities;
import business.entities.ToppingEntities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuMapper {
    private Database database;

    public MenuMapper(Database database) {
        this.database = database;
    }

    public List<BottomEntities> getBottoomnEntities() {
        List<BottomEntities> bottomEntitiesList = new ArrayList<>();
        try (Connection connection = database.connect()) {

            String sql = "select * from cupcake.bottoms";


            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int product_id = rs.getInt("produc_id");
                    String name = rs.getString("name");
                    Double price = rs.getDouble("price");

                    bottomEntitiesList.add(new BottomEntities(product_id, name, price));


                }
                return bottomEntitiesList;
            } catch (SQLException e) {
                throw new SQLException();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public List<ToppingEntities> getToppingEntities() {
        List<ToppingEntities> toppingEntitiesList = new ArrayList<>();
        try (Connection connection = database.connect()) {

            String sql = "select * from cupcake.Toppings";


            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int product_id = rs.getInt("produc_id");
                    String name = rs.getString("name");
                    Double price = rs.getDouble("price");

                    toppingEntitiesList.add(new ToppingEntities(product_id, name, price));


                }
                return toppingEntitiesList;
            } catch (SQLException e) {
                throw new SQLException();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
















