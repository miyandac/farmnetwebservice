<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmnet.farmnetwebservice.resource;

//import com.google.gson.Gson;
//import com.google.gson.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class hello {
    
     @GET
     @Produces(MediaType.APPLICATION_JSON)
    public String hello(){
        
        InventoryItem itm = new InventoryItem();
        itm.setAvailable(Boolean.FALSE);
        itm.setBarcodenum("345");
        
        //Gson g= new Gson();
         
         //return g.toJson(itm);
         return itm.toString();
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmnet.farmnetwebservice.resource;

//import com.google.gson.Gson;
//import com.google.gson.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class hello {
    
     @GET
     @Produces(MediaType.APPLICATION_JSON)
    public String hello(){
        
        InventoryItem itm = new InventoryItem();
        itm.setAvailable(Boolean.FALSE);
        itm.setBarcodenum("345");
        
        //Gson g= new Gson();
         
         //return g.toJson(itm);
         return itm.toString();
    }
    
}
>>>>>>> Farment rest web service
