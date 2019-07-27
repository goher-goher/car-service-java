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
@Table(name = "employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
    , @NamedQuery(name = "Employee.findById", query = "SELECT e FROM Employee e WHERE e.id = :id")
    , @NamedQuery(name = "Employee.findByEmpname", query = "SELECT e FROM Employee e WHERE e.empname = :empname")
    , @NamedQuery(name = "Employee.findByEmpmobile", query = "SELECT e FROM Employee e WHERE e.empmobile = :empmobile")
    , @NamedQuery(name = "Employee.findByEmpactive", query = "SELECT e FROM Employee e WHERE e.empactive = :empactive")})
public class Employee implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "empname")
    private String empname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "empmobile")
    private String empmobile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empactive")
    private boolean empactive;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeid")
    private Collection<Jobdetails> jobdetailsCollection;
    @JoinColumn(name = "empjob", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Employeejob empjob;
    @JoinColumn(name = "empsection", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Section empsection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeid")
    private Collection<Joborder> joborderCollection;

    public Employee() {
    }

    public Employee(Integer id) {
        this.id = id;
    }

    public Employee(Integer id, String empname, String empmobile, boolean empactive) {
        this.id = id;
        this.empname = empname;
        this.empmobile = empmobile;
        this.empactive = empactive;
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

    public Employeejob getEmpjob() {
        return empjob;
    }

    public void setEmpjob(Employeejob empjob) {
        this.empjob = empjob;
    }

    public Section getEmpsection() {
        return empsection;
    }

    public void setEmpsection(Section empsection) {
        this.empsection = empsection;
    }

    @XmlTransient
    public Collection<Joborder> getJoborderCollection() {
        return joborderCollection;
    }

    public void setJoborderCollection(Collection<Joborder> joborderCollection) {
        this.joborderCollection = joborderCollection;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.workshop.car.Entity.Employee[ id=" + id + " ]";
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpmobile() {
        return empmobile;
    }

    public void setEmpmobile(String empmobile) {
        this.empmobile = empmobile;
    }

    public boolean getEmpactive() {
        return empactive;
    }

    public void setEmpactive(boolean empactive) {
        this.empactive = empactive;
    }
    
}
