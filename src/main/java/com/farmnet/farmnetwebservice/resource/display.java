/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmnet.farmnetwebservice.resource;

import com.farmnet.farmnetwebservice.model.InventoryItemModel;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/display")
public class display {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getItem(){
        
        InventoryItemModel mo = new InventoryItemModel();
        mo.setBarcodenumber("678");
        mo.setBatchid("56");
        mo.setName("collins");
        mo.setQuantity(15.7f);
        mo.setQuantitytype("seed");
        mo.setSupplier("mumbi and sons");
        mo.setType("d");
        
        InventoryItemModel[] iims = new InventoryItemModel[3];
        
        iims[0]=(mo);
        iims[1]=(mo);
        iims[2]=(mo);
        
        return Response.status(200).entity(iims).build();
        
    }
    
}
