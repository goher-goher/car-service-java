/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "unit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unit.findAll", query = "SELECT u FROM Unit u")
    , @NamedQuery(name = "Unit.findById", query = "SELECT u FROM Unit u WHERE u.id = :id")
    , @NamedQuery(name = "Unit.findByUnitname", query = "SELECT u FROM Unit u WHERE u.unitname = :unitname")})
public class Unit implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "unitname")
    private String unitname;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sparepartunit")
    private Collection<Sparepart> sparepartCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sparepartunit")
    private Collection<Invoicedetails> invoicedetailsCollection;

    public Unit() {
    }

    public Unit(Integer id) {
        this.id = id;
    }

    public Unit(Integer id, String unitname) {
        this.id = id;
        this.unitname = unitname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @XmlTransient
    public Collection<Sparepart> getSparepartCollection() {
        return sparepartCollection;
    }

    public void setSparepartCollection(Collection<Sparepart> sparepartCollection) {
        this.sparepartCollection = sparepartCollection;
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
        if (!(object instanceof Unit)) {
            return false;
        }
        Unit other = (Unit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.Unit[ id=" + id + " ]";
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }
    
}
