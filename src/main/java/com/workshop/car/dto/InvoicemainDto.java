/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.dto;

/**
 *
 * @author GOHER
 */
public class InvoicemainDto {
    
   private int customerid;
    private int carid;
    private int joborder;
    private int wshopid;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public int getJoborder() {
        return joborder;
    }

    public void setJoborder(int joborder) {
        this.joborder = joborder;
    }

    public int getWshopid() {
        return wshopid;
    }

    public void setWshopid(int wshopid) {
        this.wshopid = wshopid;
    }
    
}
