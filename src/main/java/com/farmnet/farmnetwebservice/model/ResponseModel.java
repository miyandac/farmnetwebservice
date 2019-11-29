/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmnet.farmnetwebservice.model;

import java.util.Date;

/**
 *
 * @author CHILIKWEM
 */
public class ResponseModel {
    
    private String barcodenumber;
    private String status;
    private Date dateInserted;
    private String comment;

    public ResponseModel() {
    }
    
    public String getBarcodenumber() {
        return barcodenumber;
    }

    public void setBarcodenumber(String barcodenumber) {
        this.barcodenumber = barcodenumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateInserted() {
        return dateInserted;
    }

    public void setDateInserted(Date dateInserted) {
        this.dateInserted = dateInserted;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ResponseModel{" + "barcodenumber=" + barcodenumber + ", status=" + status + ", dateInserted=" + dateInserted + ", comment=" + comment + '}';
    }
    
  
}
