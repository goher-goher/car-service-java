/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GOHER
 */
@Entity
@Table(name = "jobdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jobdetails.findAll", query = "SELECT j FROM Jobdetails j")
    , @NamedQuery(name = "Jobdetails.findById", query = "SELECT j FROM Jobdetails j WHERE j.id = :id")
    , @NamedQuery(name = "Jobdetails.findByDatestart", query = "SELECT j FROM Jobdetails j WHERE j.datestart = :datestart")
    , @NamedQuery(name = "Jobdetails.findByDateend", query = "SELECT j FROM Jobdetails j WHERE j.dateend = :dateend")})
public class Jobdetails implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "datestart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datestart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateend")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateend;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "service")
    private String service;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "employeeid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Employee employeeid;
    @JoinColumn(name = "jobid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Joborder jobid;
    @JoinColumn(name = "sectionid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Section sectionid;
    @JoinColumn(name = "servicetype", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Servicetype servicetype;

    public Jobdetails() {
    }

    public Jobdetails(Integer id) {
        this.id = id;
    }

    public Jobdetails(Integer id, Date datestart, Date dateend, String service) {
        this.id = id;
        this.datestart = datestart;
        this.dateend = dateend;
        this.service = service;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Employee getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Employee employeeid) {
        this.employeeid = employeeid;
    }

    public Joborder getJobid() {
        return jobid;
    }

    public void setJobid(Joborder jobid) {
        this.jobid = jobid;
    }

    public Section getSectionid() {
        return sectionid;
    }

    public void setSectionid(Section sectionid) {
        this.sectionid = sectionid;
    }

    public Servicetype getServicetype() {
        return servicetype;
    }

    public void setServicetype(Servicetype servicetype) {
        this.servicetype = servicetype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jobdetails)) {
            return false;
        }
        Jobdetails other = (Jobdetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.Jobdetails[ id=" + id + " ]";
    }

    public Date getDatestart() {
        return datestart;
    }

    public void setDatestart(Date datestart) {
        this.datestart = datestart;
    }

    public Date getDateend() {
        return dateend;
    }

    public void setDateend(Date dateend) {
        this.dateend = dateend;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    
}
