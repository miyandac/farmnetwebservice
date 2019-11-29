/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmnet.farmnetwebservice.resource;

import java.io.Serializable;

/**
 *
 * @author CHILIKWEM
 */
public class InventoryItem implements Serializable{
    
    Boolean available;
    String barcodenum;

    public InventoryItem() {
    }
    
    

    public InventoryItem(Boolean available, String barcodenum) {
        this.available = available;
        this.barcodenum = barcodenum;
    }
    

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getBarcodenum() {
        return barcodenum;
    }

    public void setBarcodenum(String barcodenum) {
        this.barcodenum = barcodenum;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "available=" + available + ", barcodenum=" + barcodenum + '}';
    }
    
}
