/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GOHER
 */
@Entity
@Table(name = "joborder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joborder.findAll", query = "SELECT j FROM Joborder j")
    , @NamedQuery(name = "Joborder.findById", query = "SELECT j FROM Joborder j WHERE j.id = :id")
    , @NamedQuery(name = "Joborder.findByJobdate", query = "SELECT j FROM Joborder j WHERE j.jobdate = :jobdate")
    , @NamedQuery(name = "Joborder.findByJobno", query = "SELECT j FROM Joborder j WHERE j.jobno = :jobno")
    , @NamedQuery(name = "Joborder.findByKmreading", query = "SELECT j FROM Joborder j WHERE j.kmreading = :kmreading")})
public class Joborder implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "jobdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jobno")
    private int jobno;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "jobremark")
    private String jobremark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kmreading")
    private int kmreading;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobid")
    private Collection<Jobdetails> jobdetailsCollection;
    @JoinColumn(name = "carid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Car carid;
    @JoinColumn(name = "employeeid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Employee employeeid;
    @JoinColumn(name = "serviceneededid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Servicetype serviceneededid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "joborder")
    private Collection<Invoicemain> invoicemainCollection;

    public Joborder() {
    }

    public Joborder(Integer id) {
        this.id = id;
    }

    public Joborder(Integer id, Date jobdate, int jobno, String jobremark, int kmreading) {
        this.id = id;
        this.jobdate = jobdate;
        this.jobno = jobno;
        this.jobremark = jobremark;
        this.kmreading = kmreading;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @XmlTransient
    public Collection<Jobdetails> getJobdetailsCollection() {
        return jobdetailsCollection;
    }

    public void setJobdetailsCollection(Collection<Jobdetails> jobdetailsCollection) {
        this.jobdetailsCollection = jobdetailsCollection;
    }

    public Car getCarid() {
        return carid;
    }

    public void setCarid(Car carid) {
        this.carid = carid;
    }

    public Employee getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Employee employeeid) {
        this.employeeid = employeeid;
    }

    public Servicetype getServiceneededid() {
        return serviceneededid;
    }

    public void setServiceneededid(Servicetype serviceneededid) {
        this.serviceneededid = serviceneededid;
    }

    @XmlTransient
    public Collection<Invoicemain> getInvoicemainCollection() {
        return invoicemainCollection;
    }

    public void setInvoicemainCollection(Collection<Invoicemain> invoicemainCollection) {
        this.invoicemainCollection = invoicemainCollection;
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
        if (!(object instanceof Joborder)) {
            return false;
        }
        Joborder other = (Joborder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.Joborder[ id=" + id + " ]";
    }

    public Date getJobdate() {
        return jobdate;
    }

    public void setJobdate(Date jobdate) {
        this.jobdate = jobdate;
    }

    public int getJobno() {
        return jobno;
    }

    public void setJobno(int jobno) {
        this.jobno = jobno;
    }

    public String getJobremark() {
        return jobremark;
    }

    public void setJobremark(String jobremark) {
        this.jobremark = jobremark;
    }

    public int getKmreading() {
        return kmreading;
    }

    public void setKmreading(int kmreading) {
        this.kmreading = kmreading;
    }
    
}
