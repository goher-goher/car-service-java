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
@Table(name = "car")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Car.findAll", query = "SELECT c FROM Car c")
    , @NamedQuery(name = "Car.findById", query = "SELECT c FROM Car c WHERE c.id = :id")
    , @NamedQuery(name = "Car.findByCarplateno", query = "SELECT c FROM Car c WHERE c.carplateno = :carplateno")
    , @NamedQuery(name = "Car.findByCarmanufactureyear", query = "SELECT c FROM Car c WHERE c.carmanufactureyear = :carmanufactureyear")})
public class Car implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "carplateno")
    private String carplateno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "carmanufactureyear")
    private int carmanufactureyear;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carid")
    private Collection<Joborder> joborderCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carid")
    private Collection<Invoicemain> invoicemainCollection;
    @JoinColumn(name = "carmodel", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CarModel carmodel;
    @JoinColumn(name = "carowner", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Customer carowner;

    public Car() {
        
    }

    public Car(Integer id) {
        this.id = id;
    }

    public Car(Integer id, String carplateno, int carmanufactureyear) {
        this.id = id;
        this.carplateno = carplateno;
        this.carmanufactureyear = carmanufactureyear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @XmlTransient
    public Collection<Joborder> getJoborderCollection() {
        return joborderCollection;
    }

    public void setJoborderCollection(Collection<Joborder> joborderCollection) {
        this.joborderCollection = joborderCollection;
    }

    @XmlTransient
    public Collection<Invoicemain> getInvoicemainCollection() {
        return invoicemainCollection;
    }

    public void setInvoicemainCollection(Collection<Invoicemain> invoicemainCollection) {
        this.invoicemainCollection = invoicemainCollection;
    }

    public CarModel getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(CarModel carmodel) {
        this.carmodel = carmodel;
    }

    public Customer getCarowner() {
        return carowner;
    }

    public void setCarowner(Customer carowner) {
        this.carowner = carowner;
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
        if (!(object instanceof Car)) {
            return false;
        }
        Car other = (Car) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.Car[ id=" + id + " ]";
    }

    public String getCarplateno() {
        return carplateno;
    }

    public void setCarplateno(String carplateno) {
        this.carplateno = carplateno;
    }

    public int getCarmanufactureyear() {
        return carmanufactureyear;
    }

    public void setCarmanufactureyear(int carmanufactureyear) {
        this.carmanufactureyear = carmanufactureyear;
    }
    
}
