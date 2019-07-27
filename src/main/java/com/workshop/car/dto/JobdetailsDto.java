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
public class JobdetailsDto {
    private int jobid;
    private int sectionid;
    private int employeeid;
    private int servicetype;

    public int getJobid() {
        return jobid;
    }

    public void setJobid(int jobid) {
        this.jobid = jobid;
    }

    public int getSectionid() {
        return sectionid;
    }

    public void setSectionid(int sectionid) {
        this.sectionid = sectionid;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getServicetype() {
        return servicetype;
    }

    public void setServicetype(int servicetype) {
        this.servicetype = servicetype;
    }
    
}
