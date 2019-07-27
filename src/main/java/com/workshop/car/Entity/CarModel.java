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
@Table(name = "car_model")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CarModel.findAll", query = "SELECT c FROM CarModel c")
    , @NamedQuery(name = "CarModel.findById", query = "SELECT c FROM CarModel c WHERE c.id = :id")
    , @NamedQuery(name = "CarModel.findByCarmodel", query = "SELECT c FROM CarModel c WHERE c.carmodel = :carmodel")})
public class CarModel implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "carmodel")
    private String carmodel;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sparepartcarmodel")
    private Collection<Sparepart> sparepartCollection;
    @JoinColumn(name = "carmanufactureid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CarMaunfacture carmanufactureid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carmodel")
    private Collection<Car> carCollection;

    public CarModel() {
    }

    public CarModel(Integer id) {
        this.id = id;
    }

    public CarModel(Integer id, String carmodel) {
//        this.id = id;
//        this.carmodel = carmodel;
          setId(id);
          setCarmodel(carmodel);
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

    public CarMaunfacture getCarmanufactureid() {
        return carmanufactureid;
    }

    public void setCarmanufactureid(CarMaunfacture carmanufactureid) {
        this.carmanufactureid = carmanufactureid;
    }

    @XmlTransient
    public Collection<Car> getCarCollection() {
        return carCollection;
    }

    public void setCarCollection(Collection<Car> carCollection) {
        this.carCollection = carCollection;
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
        if (!(object instanceof CarModel)) {
            return false;
        }
        CarModel other = (CarModel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.CarModel[ id=" + id + " ]";
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

}
