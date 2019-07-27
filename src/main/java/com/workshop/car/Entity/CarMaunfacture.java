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
@Table(name = "car_maunfacture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CarMaunfacture.findAll", query = "SELECT c FROM CarMaunfacture c")
    , @NamedQuery(name = "CarMaunfacture.findById", query = "SELECT c FROM CarMaunfacture c WHERE c.id = :id")
    , @NamedQuery(name = "CarMaunfacture.findByCarmanufacture", query = "SELECT c FROM CarMaunfacture c WHERE c.carmanufacture = :carmanufacture")})
public class CarMaunfacture implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "carmanufacture")
    private String carmanufacture;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carmanufactureid")
    private Collection<CarModel> carModelCollection;

    public CarMaunfacture() {
    }

    public CarMaunfacture(Integer id) {
        this.id = id;
    }

    public CarMaunfacture(Integer id, String carmanufacture) {
        this.id = id;
        this.carmanufacture = carmanufacture;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @XmlTransient
    public Collection<CarModel> getCarModelCollection() {
        return carModelCollection;
    }

    public void setCarModelCollection(Collection<CarModel> carModelCollection) {
        this.carModelCollection = carModelCollection;
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
        if (!(object instanceof CarMaunfacture)) {
            return false;
        }
        CarMaunfacture other = (CarMaunfacture) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.CarMaunfacture[ id=" + id + " ]";
    }

    public String getCarmanufacture() {
        return carmanufacture;
    }

    public void setCarmanufacture(String carmanufacture) {
        this.carmanufacture = carmanufacture;
    }
    
}
