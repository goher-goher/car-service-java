/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GOHER
 */
@Entity
@Table(name = "invoicemain")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoicemain.findAll", query = "SELECT i FROM Invoicemain i")
    , @NamedQuery(name = "Invoicemain.findById", query = "SELECT i FROM Invoicemain i WHERE i.id = :id")
    , @NamedQuery(name = "Invoicemain.findByInvoiceno", query = "SELECT i FROM Invoicemain i WHERE i.invoiceno = :invoiceno")
    , @NamedQuery(name = "Invoicemain.findByInvoicedate", query = "SELECT i FROM Invoicemain i WHERE i.invoicedate = :invoicedate")
    , @NamedQuery(name = "Invoicemain.findByTotalcost", query = "SELECT i FROM Invoicemain i WHERE i.totalcost = :totalcost")})
public class Invoicemain implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "invoiceno")
    private int invoiceno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "invoicedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date invoicedate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalcost")
    private BigDecimal totalcost;
    @JoinColumn(name = "joborderid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Joborder joborderid;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceid")
    private Collection<Invoicedetails> invoicedetailsCollection;
    @JoinColumn(name = "carid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Car carid;
    @JoinColumn(name = "customerid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Customer customerid;
    @JoinColumn(name = "joborder", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Joborder joborder;
    @JoinColumn(name = "wshopid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Wshop wshopid;

    public Invoicemain() {
    }

    public Invoicemain(Integer id) {
        this.id = id;
    }

    public Invoicemain(Integer id, int invoiceno, Date invoicedate, BigDecimal totalcost) {
        this.id = id;
        this.invoiceno = invoiceno;
        this.invoicedate = invoicedate;
        this.totalcost = totalcost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @XmlTransient
    public Collection<Invoicedetails> getInvoicedetailsCollection() {
        return invoicedetailsCollection;
    }

    public void setInvoicedetailsCollection(Collection<Invoicedetails> invoicedetailsCollection) {
        this.invoicedetailsCollection = invoicedetailsCollection;
    }

    public Car getCarid() {
        return carid;
    }

    public void setCarid(Car carid) {
        this.carid = carid;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

    public Joborder getJoborder() {
        return joborder;
    }

    public void setJoborder(Joborder joborder) {
        this.joborder = joborder;
    }

    public Wshop getWshopid() {
        return wshopid;
    }

    public void setWshopid(Wshop wshopid) {
        this.wshopid = wshopid;
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
        if (!(object instanceof Invoicemain)) {
            return false;
        }
        Invoicemain other = (Invoicemain) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.Invoicemain[ id=" + id + " ]";
    }


    public Joborder getJoborderid() {
        return joborderid;
    }

    public void setJoborderid(Joborder joborderid) {
        this.joborderid = joborderid;
    }

    public int getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(int invoiceno) {
        this.invoiceno = invoiceno;
    }

    public Date getInvoicedate() {
        return invoicedate;
    }

    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }

    public BigDecimal getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(BigDecimal totalcost) {
        this.totalcost = totalcost;
    }
    
}
