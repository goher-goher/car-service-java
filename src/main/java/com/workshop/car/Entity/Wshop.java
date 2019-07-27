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
@Table(name = "wshop")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Wshop.findAll", query = "SELECT w FROM Wshop w")
    , @NamedQuery(name = "Wshop.findById", query = "SELECT w FROM Wshop w WHERE w.id = :id")
    , @NamedQuery(name = "Wshop.findByWshopname", query = "SELECT w FROM Wshop w WHERE w.wshopname = :wshopname")
    , @NamedQuery(name = "Wshop.findByWshopline", query = "SELECT w FROM Wshop w WHERE w.wshopline = :wshopline")
    , @NamedQuery(name = "Wshop.findByWshopemail", query = "SELECT w FROM Wshop w WHERE w.wshopemail = :wshopemail")
    , @NamedQuery(name = "Wshop.findByWshopadree", query = "SELECT w FROM Wshop w WHERE w.wshopadree = :wshopadree")
    , @NamedQuery(name = "Wshop.findByWshopmobile", query = "SELECT w FROM Wshop w WHERE w.wshopmobile = :wshopmobile")})
public class Wshop implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "wshopname")
    private String wshopname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "wshopline")
    private String wshopline;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "wshopemail")
    private String wshopemail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "wshopadree")
    private String wshopadree;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "wshopmobile")
    private String wshopmobile;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wshopid")
    private Collection<Invoicemain> invoicemainCollection;

    public Wshop() {
    }

    public Wshop(Integer id) {
        this.id = id;
    }

    public Wshop(Integer id, String wshopname, String wshopline, String wshopemail, String wshopadree, String wshopmobile) {
        this.id = id;
        this.wshopname = wshopname;
        this.wshopline = wshopline;
        this.wshopemail = wshopemail;
        this.wshopadree = wshopadree;
        this.wshopmobile = wshopmobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Wshop)) {
            return false;
        }
        Wshop other = (Wshop) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.Wshop[ id=" + id + " ]";
    }

    public String getWshopname() {
        return wshopname;
    }

    public void setWshopname(String wshopname) {
        this.wshopname = wshopname;
    }

    public String getWshopline() {
        return wshopline;
    }

    public void setWshopline(String wshopline) {
        this.wshopline = wshopline;
    }

    public String getWshopemail() {
        return wshopemail;
    }

    public void setWshopemail(String wshopemail) {
        this.wshopemail = wshopemail;
    }

    public String getWshopadree() {
        return wshopadree;
    }

    public void setWshopadree(String wshopadree) {
        this.wshopadree = wshopadree;
    }

    public String getWshopmobile() {
        return wshopmobile;
    }

    public void setWshopmobile(String wshopmobile) {
        this.wshopmobile = wshopmobile;
    }
    
}
