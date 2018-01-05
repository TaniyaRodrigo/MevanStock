/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Induwara Jayalath
 */
@Entity
@Table(name = "people", catalog = "mevanstock", schema = "")
@NamedQueries({
    @NamedQuery(name = "People.findAll", query = "SELECT p FROM People p"),
    @NamedQuery(name = "People.findByIdpeople", query = "SELECT p FROM People p WHERE p.idpeople = :idpeople"),
    @NamedQuery(name = "People.findByPeopleName", query = "SELECT p FROM People p WHERE p.peopleName = :peopleName"),
    @NamedQuery(name = "People.findByPeopleNIC", query = "SELECT p FROM People p WHERE p.peopleNIC = :peopleNIC"),
    @NamedQuery(name = "People.findByPeopleTP", query = "SELECT p FROM People p WHERE p.peopleTP = :peopleTP"),
    @NamedQuery(name = "People.findByDateRemoved", query = "SELECT p FROM People p WHERE p.dateRemoved = :dateRemoved"),
    @NamedQuery(name = "People.findByDateAdded", query = "SELECT p FROM People p WHERE p.dateAdded = :dateAdded")})
public class People implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpeople")
    private Integer idpeople;
    @Basic(optional = false)
    @Column(name = "peopleName")
    private String peopleName;
    @Column(name = "peopleNIC")
    private String peopleNIC;
    @Column(name = "peopleTP")
    private Integer peopleTP;
    @Column(name = "dateRemoved")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRemoved;
    @Column(name = "dateAdded")
    @Temporal(TemporalType.DATE)
    private Date dateAdded;

    public People() {
    }

    public People(Integer idpeople) {
        this.idpeople = idpeople;
    }

    public People(Integer idpeople, String peopleName) {
        this.idpeople = idpeople;
        this.peopleName = peopleName;
    }

    public Integer getIdpeople() {
        return idpeople;
    }

    public void setIdpeople(Integer idpeople) {
        Integer oldIdpeople = this.idpeople;
        this.idpeople = idpeople;
        changeSupport.firePropertyChange("idpeople", oldIdpeople, idpeople);
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        String oldPeopleName = this.peopleName;
        this.peopleName = peopleName;
        changeSupport.firePropertyChange("peopleName", oldPeopleName, peopleName);
    }

    public String getPeopleNIC() {
        return peopleNIC;
    }

    public void setPeopleNIC(String peopleNIC) {
        String oldPeopleNIC = this.peopleNIC;
        this.peopleNIC = peopleNIC;
        changeSupport.firePropertyChange("peopleNIC", oldPeopleNIC, peopleNIC);
    }

    public Integer getPeopleTP() {
        return peopleTP;
    }

    public void setPeopleTP(Integer peopleTP) {
        Integer oldPeopleTP = this.peopleTP;
        this.peopleTP = peopleTP;
        changeSupport.firePropertyChange("peopleTP", oldPeopleTP, peopleTP);
    }

    public Date getDateRemoved() {
        return dateRemoved;
    }

    public void setDateRemoved(Date dateRemoved) {
        Date oldDateRemoved = this.dateRemoved;
        this.dateRemoved = dateRemoved;
        changeSupport.firePropertyChange("dateRemoved", oldDateRemoved, dateRemoved);
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        Date oldDateAdded = this.dateAdded;
        this.dateAdded = dateAdded;
        changeSupport.firePropertyChange("dateAdded", oldDateAdded, dateAdded);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpeople != null ? idpeople.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof People)) {
            return false;
        }
        People other = (People) object;
        if ((this.idpeople == null && other.idpeople != null) || (this.idpeople != null && !this.idpeople.equals(other.idpeople))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return peopleName;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
