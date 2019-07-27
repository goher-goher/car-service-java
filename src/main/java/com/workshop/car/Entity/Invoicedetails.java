/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GOHER
 */
@Entity
@Table(name = "invoicedetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoicedetails.findAll", query = "SELECT i FROM Invoicedetails i")
    , @NamedQuery(name = "Invoicedetails.findById", query = "SELECT i FROM Invoicedetails i WHERE i.id = :id")
    , @NamedQuery(name = "Invoicedetails.findBySparepartqty", query = "SELECT i FROM Invoicedetails i WHERE i.sparepartqty = :sparepartqty")
    , @NamedQuery(name = "Invoicedetails.findBySparepartuprice", query = "SELECT i FROM Invoicedetails i WHERE i.sparepartuprice = :sparepartuprice")
    , @NamedQuery(name = "Invoicedetails.findBySparepartTprice", query = "SELECT i FROM Invoicedetails i WHERE i.sparepartTprice = :sparepartTprice")})
public class Invoicedetails implements Serializable {

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "sparepartqty")
    private BigDecimal sparepartqty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sparepartuprice")
    private BigDecimal sparepartuprice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sparepartTprice")
    private BigDecimal sparepartTprice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "sparepartno")
    private String sparepartno;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "invoiceid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Invoicemain invoiceid;
    @JoinColumn(name = "sparepartid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sparepart sparepartid;
    @JoinColumn(name = "sparepartunit", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Unit sparepartunit;

    public Invoicedetails() {
    }

    public Invoicedetails(Integer id) {
        this.id = id;
    }

    public Invoicedetails(Integer id, BigDecimal sparepartqty, BigDecimal sparepartuprice, BigDecimal sparepartTprice) {
        this.id = id;
        this.sparepartqty = sparepartqty;
        this.sparepartuprice = sparepartuprice;
        this.sparepartTprice = sparepartTprice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Invoicemain getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(Invoicemain invoiceid) {
        this.invoiceid = invoiceid;
    }

    public Sparepart getSparepartid() {
        return sparepartid;
    }

    public void setSparepartid(Sparepart sparepartid) {
        this.sparepartid = sparepartid;
    }

    public Unit getSparepartunit() {
        return sparepartunit;
    }

    public void setSparepartunit(Unit sparepartunit) {
        this.sparepartunit = sparepartunit;
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
        if (!(object instanceof Invoicedetails)) {
            return false;
        }
        Invoicedetails other = (Invoicedetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.Invoicedetails[ id=" + id + " ]";
    }

    public BigDecimal getSparepartqty() {
        return sparepartqty;
    }

    public void setSparepartqty(BigDecimal sparepartqty) {
        this.sparepartqty = sparepartqty;
    }

    public BigDecimal getSparepartuprice() {
        return sparepartuprice;
    }

    public void setSparepartuprice(BigDecimal sparepartuprice) {
        this.sparepartuprice = sparepartuprice;
    }

    public BigDecimal getSparepartTprice() {
        return sparepartTprice;
    }

    public void setSparepartTprice(BigDecimal sparepartTprice) {
        this.sparepartTprice = sparepartTprice;
    }

    public String getSparepartno() {
        return sparepartno;
    }

    public void setSparepartno(String sparepartno) {
        this.sparepartno = sparepartno;
    }
    
}
