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
@Table(name = "items", catalog = "mevanstock", schema = "")
@NamedQueries({
    @NamedQuery(name = "Items.findAll", query = "SELECT i FROM Items i"),
    @NamedQuery(name = "Items.findByItemID", query = "SELECT i FROM Items i WHERE i.itemID = :itemID"),
    @NamedQuery(name = "Items.findByItemName", query = "SELECT i FROM Items i WHERE i.itemName = :itemName"),
    @NamedQuery(name = "Items.findByItemQuantity", query = "SELECT i FROM Items i WHERE i.itemQuantity = :itemQuantity"),
    @NamedQuery(name = "Items.findByItemWarrentyEndDate", query = "SELECT i FROM Items i WHERE i.itemWarrentyEndDate = :itemWarrentyEndDate"),
    @NamedQuery(name = "Items.findByItemDescription", query = "SELECT i FROM Items i WHERE i.itemDescription = :itemDescription"),
    @NamedQuery(name = "Items.findByItemStatus", query = "SELECT i FROM Items i WHERE i.itemStatus = :itemStatus"),
    @NamedQuery(name = "Items.findByItemAddedBy", query = "SELECT i FROM Items i WHERE i.itemAddedBy = :itemAddedBy"),
    @NamedQuery(name = "Items.findByItemAddedDate", query = "SELECT i FROM Items i WHERE i.itemAddedDate = :itemAddedDate")})
public class Items implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "itemID")
    private Integer itemID;
    @Column(name = "itemName")
    private String itemName;
    @Basic(optional = false)
    @Column(name = "itemQuantity")
    private int itemQuantity;
    @Column(name = "itemWarrentyEndDate")
    @Temporal(TemporalType.DATE)
    private Date itemWarrentyEndDate;
    @Column(name = "itemDescription")
    private String itemDescription;
    @Basic(optional = false)
    @Column(name = "itemStatus")
    private String itemStatus;
    @Column(name = "itemAddedBy")
    private Integer itemAddedBy;
    @Column(name = "itemAddedDate")
    @Temporal(TemporalType.DATE)
    private Date itemAddedDate;

    public Items() {
    }

    public Items(Integer itemID) {
        this.itemID = itemID;
    }

    public Items(Integer itemID, int itemQuantity, String itemStatus) {
        this.itemID = itemID;
        this.itemQuantity = itemQuantity;
        this.itemStatus = itemStatus;
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        Integer oldItemID = this.itemID;
        this.itemID = itemID;
        changeSupport.firePropertyChange("itemID", oldItemID, itemID);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        String oldItemName = this.itemName;
        this.itemName = itemName;
        changeSupport.firePropertyChange("itemName", oldItemName, itemName);
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        int oldItemQuantity = this.itemQuantity;
        this.itemQuantity = itemQuantity;
        changeSupport.firePropertyChange("itemQuantity", oldItemQuantity, itemQuantity);
    }

    public Date getItemWarrentyEndDate() {
        return itemWarrentyEndDate;
    }

    public void setItemWarrentyEndDate(Date itemWarrentyEndDate) {
        Date oldItemWarrentyEndDate = this.itemWarrentyEndDate;
        this.itemWarrentyEndDate = itemWarrentyEndDate;
        changeSupport.firePropertyChange("itemWarrentyEndDate", oldItemWarrentyEndDate, itemWarrentyEndDate);
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        String oldItemDescription = this.itemDescription;
        this.itemDescription = itemDescription;
        changeSupport.firePropertyChange("itemDescription", oldItemDescription, itemDescription);
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        String oldItemStatus = this.itemStatus;
        this.itemStatus = itemStatus;
        changeSupport.firePropertyChange("itemStatus", oldItemStatus, itemStatus);
    }

    public Integer getItemAddedBy() {
        return itemAddedBy;
    }

    public void setItemAddedBy(Integer itemAddedBy) {
        Integer oldItemAddedBy = this.itemAddedBy;
        this.itemAddedBy = itemAddedBy;
        changeSupport.firePropertyChange("itemAddedBy", oldItemAddedBy, itemAddedBy);
    }

    public Date getItemAddedDate() {
        return itemAddedDate;
    }

    public void setItemAddedDate(Date itemAddedDate) {
        Date oldItemAddedDate = this.itemAddedDate;
        this.itemAddedDate = itemAddedDate;
        changeSupport.firePropertyChange("itemAddedDate", oldItemAddedDate, itemAddedDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemID != null ? itemID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Items)) {
            return false;
        }
        Items other = (Items) object;
        if ((this.itemID == null && other.itemID != null) || (this.itemID != null && !this.itemID.equals(other.itemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication3.Items[ itemID=" + itemID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
