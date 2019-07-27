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
public class InvoicedetailsDto {
     private int invoiceid;
     private int sparepartid;
     private int sparepartunit;
     private String sparepartno;
     private double sparepartuprice;

    public int getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(int invoiceid) {
        this.invoiceid = invoiceid;
    }

    public int getSparepartid() {
        return sparepartid;
    }

    public void setSparepartid(int sparepartid) {
        this.sparepartid = sparepartid;
    }

    public int getSparepartunit() {
        return sparepartunit;
    }

    public void setSparepartunit(int sparepartunit) {
        this.sparepartunit = sparepartunit;
    }

    public String getSparepartno() {
        return sparepartno;
    }

    public void setSparepartno(String sparepartno) {
        this.sparepartno = sparepartno;
    }

    public double getSparepartuprice() {
        return sparepartuprice;
    }

    public void setSparepartuprice(double sparepartuprice) {
        this.sparepartuprice = sparepartuprice;
    }
     
}
