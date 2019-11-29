
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmnet.farmnetwebservice.resource;

import com.farmnet.farmnetwebservice.model.InventoryItemModel;
import com.farmnet.farmnetwebservice.dao.InventoryItemDao;
import com.farmnet.farmnetwebservice.model.ResponseModel;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author CHILIKWEM
 */

@Path("/InventoryItem")
public class InventoryItemResource {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    
    public Response addInventoryitem(InventoryItemModel[] iims) throws ClassNotFoundException, SQLException{
          
        ResponseModel[] responses = new ResponseModel[iims.length];
        
        System.out.println("Values of " + iims);
        for (int i = 0; i < iims.length; i++) {
            InventoryItemModel iim = iims[i];
            
            iim = new InventoryItemDao().addInventoryItem(iim);
            System.out.println(iim);
            
            ResponseModel r = new ResponseModel();
            r.setBarcodenumber(iim.getBarcodenumber());
            r.setStatus("success");
            r.setDateInserted(new Date());
            r.setComment("record inserted successfuly");
            responses[i]=r;
        }
        
        return Response.status(200).entity(responses).build();
    }
}
