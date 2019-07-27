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
@Table(name = "supplier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Supplier.findAll", query = "SELECT s FROM Supplier s")
    , @NamedQuery(name = "Supplier.findById", query = "SELECT s FROM Supplier s WHERE s.id = :id")
    , @NamedQuery(name = "Supplier.findBySuppliername", query = "SELECT s FROM Supplier s WHERE s.suppliername = :suppliername")
    , @NamedQuery(name = "Supplier.findBySuppliermobile", query = "SELECT s FROM Supplier s WHERE s.suppliermobile = :suppliermobile")
    , @NamedQuery(name = "Supplier.findBySupplieradress", query = "SELECT s FROM Supplier s WHERE s.supplieradress = :supplieradress")})
public class Supplier implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "suppliername")
    private String suppliername;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "suppliermobile")
    private String suppliermobile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "supplieradress")
    private String supplieradress;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sparepartsupplier")
    private Collection<Sparepart> sparepartCollection;

    public Supplier() {
    }

    public Supplier(Integer id) {
        this.id = id;
    }

    public Supplier(Integer id, String suppliername, String suppliermobile, String supplieradress) {
        this.id = id;
        this.suppliername = suppliername;
        this.suppliermobile = suppliermobile;
        this.supplieradress = supplieradress;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.Supplier[ id=" + id + " ]";
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getSuppliermobile() {
        return suppliermobile;
    }

    public void setSuppliermobile(String suppliermobile) {
        this.suppliermobile = suppliermobile;
    }

    public String getSupplieradress() {
        return supplieradress;
    }

    public void setSupplieradress(String supplieradress) {
        this.supplieradress = supplieradress;
    }
    
}
