/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GOHER
 */
@Entity
@Table(name = "sparepart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sparepart.findAll", query = "SELECT s FROM Sparepart s")
    , @NamedQuery(name = "Sparepart.findById", query = "SELECT s FROM Sparepart s WHERE s.id = :id")
    , @NamedQuery(name = "Sparepart.findBySparepartname", query = "SELECT s FROM Sparepart s WHERE s.sparepartname = :sparepartname")
    , @NamedQuery(name = "Sparepart.findBySaprepartno", query = "SELECT s FROM Sparepart s WHERE s.saprepartno = :saprepartno")
    , @NamedQuery(name = "Sparepart.findBySparepartcost", query = "SELECT s FROM Sparepart s WHERE s.sparepartcost = :sparepartcost")
    , @NamedQuery(name = "Sparepart.findBySparepartopenbalance", query = "SELECT s FROM Sparepart s WHERE s.sparepartopenbalance = :sparepartopenbalance")
    , @NamedQuery(name = "Sparepart.findBySparepartbalance", query = "SELECT s FROM Sparepart s WHERE s.sparepartbalance = :sparepartbalance")
    , @NamedQuery(name = "Sparepart.findBySparepartminlevel", query = "SELECT s FROM Sparepart s WHERE s.sparepartminlevel = :sparepartminlevel")
    , @NamedQuery(name = "Sparepart.findBySparepartreorderlevel", query = "SELECT s FROM Sparepart s WHERE s.sparepartreorderlevel = :sparepartreorderlevel")
    , @NamedQuery(name = "Sparepart.findBySparepartmodelyear", query = "SELECT s FROM Sparepart s WHERE s.sparepartmodelyear = :sparepartmodelyear")})
public class Sparepart implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "sparepartname")
    private String sparepartname;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 255)
    @Column(name = "saprepartno")
    private String saprepartno;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "sparepartcost")
    private BigDecimal sparepartcost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sparepartopenbalance")
    private long sparepartopenbalance;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "sparepartbalance")
    private long sparepartbalance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sparepartminlevel")
    private long sparepartminlevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sparepartreorderlevel")
    private long sparepartreorderlevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sparepartmodelyear")
    private int sparepartmodelyear;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "sparepartcarmodel", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CarModel sparepartcarmodel;
    @JoinColumn(name = "sparepartsupplier", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Supplier sparepartsupplier;
    @JoinColumn(name = "sparepartunit", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Unit sparepartunit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sparepartid")
    private Collection<Invoicedetails> invoicedetailsCollection;

    public Sparepart() {
    }

    public Sparepart(Integer id) {
        this.id = id;
    }

    public Sparepart(Integer id, String sparepartname, String saprepartno, BigDecimal sparepartcost, long sparepartopenbalance, long sparepartbalance, long sparepartminlevel, long sparepartreorderlevel, int sparepartmodelyear) {
        this.id = id;
        this.sparepartname = sparepartname;
        this.saprepartno = saprepartno;
        this.sparepartcost = sparepartcost;
        this.sparepartopenbalance = sparepartopenbalance;
        this.sparepartbalance = sparepartbalance;
        this.sparepartminlevel = sparepartminlevel;
        this.sparepartreorderlevel = sparepartreorderlevel;
        this.sparepartmodelyear = sparepartmodelyear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public CarModel getSparepartcarmodel() {
        return sparepartcarmodel;
    }

    public void setSparepartcarmodel(CarModel sparepartcarmodel) {
        this.sparepartcarmodel = sparepartcarmodel;
    }

    public Supplier getSparepartsupplier() {
        return sparepartsupplier;
    }

    public void setSparepartsupplier(Supplier sparepartsupplier) {
        this.sparepartsupplier = sparepartsupplier;
    }

    public Unit getSparepartunit() {
        return sparepartunit;
    }

    public void setSparepartunit(Unit sparepartunit) {
        this.sparepartunit = sparepartunit;
    }

    @XmlTransient
    public Collection<Invoicedetails> getInvoicedetailsCollection() {
        return invoicedetailsCollection;
    }

    public void setInvoicedetailsCollection(Collection<Invoicedetails> invoicedetailsCollection) {
        this.invoicedetailsCollection = invoicedetailsCollection;
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
        if (!(object instanceof Sparepart)) {
            return false;
        }
        Sparepart other = (Sparepart) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.Sparepart[ id=" + id + " ]";
    }

    public String getSparepartname() {
        return sparepartname;
    }

    public void setSparepartname(String sparepartname) {
        this.sparepartname = sparepartname;
    }

    public String getSaprepartno() {
        return saprepartno;
    }

    public void setSaprepartno(String saprepartno) {
        this.saprepartno = saprepartno;
    }

    public BigDecimal getSparepartcost() {
        return sparepartcost;
    }

    public void setSparepartcost(BigDecimal sparepartcost) {
        this.sparepartcost = sparepartcost;
    }

    public long getSparepartopenbalance() {
        return sparepartopenbalance;
    }

    public void setSparepartopenbalance(long sparepartopenbalance) {
        this.sparepartopenbalance = sparepartopenbalance;
    }

    public long getSparepartbalance() {
        return sparepartbalance;
    }

    public void setSparepartbalance(long sparepartbalance) {
        this.sparepartbalance = sparepartbalance;
    }

    public long getSparepartminlevel() {
        return sparepartminlevel;
    }

    public void setSparepartminlevel(long sparepartminlevel) {
        this.sparepartminlevel = sparepartminlevel;
    }

    public long getSparepartreorderlevel() {
        return sparepartreorderlevel;
    }

    public void setSparepartreorderlevel(long sparepartreorderlevel) {
        this.sparepartreorderlevel = sparepartreorderlevel;
    }

    public int getSparepartmodelyear() {
        return sparepartmodelyear;
    }

    public void setSparepartmodelyear(int sparepartmodelyear) {
        this.sparepartmodelyear = sparepartmodelyear;
    }
    
}
