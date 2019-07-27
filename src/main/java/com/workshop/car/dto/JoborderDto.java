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
public class JoborderDto {
    
   private int carid;
    private int employeeid;
    private int serviceneededid;

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getServiceneededid() {
        return serviceneededid;
    }

    public void setServiceneededid(int serviceneededid) {
        this.serviceneededid = serviceneededid;
    }
    
}
