/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmnet.farmnetwebservice.dao;

import com.farmnet.farmnetwebservice.model.InventoryItemModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InventoryItemDao {

    public InventoryItemModel addInventoryItem(InventoryItemModel itm) throws ClassNotFoundException, SQLException {

        PreparedStatement ps = new DbConnection().getConnection().prepareStatement("insert into fisp_inventoryitem(available, barcodenumber, batchid, name, quantity, quantitytype, supplier, type) values (?,?,?,?,?,?,?,?)");

        ps.setBoolean(1, itm.isAvailable());
        ps.setString(2, itm.getBarcodenumber());
        ps.setString(3, itm.getBatchid());
        ps.setString(4, itm.getName());
        ps.setFloat(5, itm.getQuantity());
        ps.setString(6, itm.getQuantitytype());
        ps.setString(7, itm.getSupplier());
        ps.setString(8, itm.getType());

        ps.execute();

        System.out.println("record added successfully");
        String gen[] = {"id"};

        try {
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                int id = rs.getInt(1);
                itm.setId(id);
            }
        } catch (Exception ex) {

        }finally{
            ps.close();
        }

        return itm;
    }
}
