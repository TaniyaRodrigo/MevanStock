/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Induwara Jayalath
 */
@Entity
@Table(name = "ordertemp", catalog = "mevanstock", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ordertemp.findAll", query = "SELECT o FROM Ordertemp o"),
    @NamedQuery(name = "Ordertemp.findByItemId", query = "SELECT o FROM Ordertemp o WHERE o.itemId = :itemId"),
    @NamedQuery(name = "Ordertemp.findByItemName", query = "SELECT o FROM Ordertemp o WHERE o.itemName = :itemName"),
    @NamedQuery(name = "Ordertemp.findByItemQuantity", query = "SELECT o FROM Ordertemp o WHERE o.itemQuantity = :itemQuantity")})
public class Ordertemp implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "itemId")
    private Integer itemId;
    @Column(name = "itemName")
    private String itemName;
    @Column(name = "itemQuantity")
    private Integer itemQuantity;

    public Ordertemp() {
    }

    public Ordertemp(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        Integer oldItemId = this.itemId;
        this.itemId = itemId;
        changeSupport.firePropertyChange("itemId", oldItemId, itemId);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        String oldItemName = this.itemName;
        this.itemName = itemName;
        changeSupport.firePropertyChange("itemName", oldItemName, itemName);
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        Integer oldItemQuantity = this.itemQuantity;
        this.itemQuantity = itemQuantity;
        changeSupport.firePropertyChange("itemQuantity", oldItemQuantity, itemQuantity);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordertemp)) {
            return false;
        }
        Ordertemp other = (Ordertemp) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication3.Ordertemp[ itemId=" + itemId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
