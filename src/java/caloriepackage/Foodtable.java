/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caloriepackage;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * @author Y500
 */
@Entity
@Table(name = "FOODTABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Foodtable.findAll", query = "SELECT f FROM Foodtable f")
    , @NamedQuery(name = "Foodtable.findByFoodid", query = "SELECT f FROM Foodtable f WHERE f.foodid = :foodid")
    , @NamedQuery(name = "Foodtable.findByName", query = "SELECT f FROM Foodtable f WHERE f.name = :name")
    , @NamedQuery(name = "Foodtable.findByCategory", query = "SELECT f FROM Foodtable f WHERE f.category = :category")
    , @NamedQuery(name = "Foodtable.findByCalorieamount", query = "SELECT f FROM Foodtable f WHERE f.calorieamount = :calorieamount")
    , @NamedQuery(name = "Foodtable.findByServingunit", query = "SELECT f FROM Foodtable f WHERE f.servingunit = :servingunit")
    , @NamedQuery(name = "Foodtable.findByServingamount", query = "SELECT f FROM Foodtable f WHERE f.servingamount = :servingamount")
    , @NamedQuery(name = "Foodtable.findByFat", query = "SELECT f FROM Foodtable f WHERE f.fat = :fat")})
public class Foodtable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FOODID")
    private Integer foodid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CATEGORY")
    private String category;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CALORIEAMOUNT")
    private int calorieamount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SERVINGUNIT")
    private String servingunit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SERVINGAMOUNT")
    private int servingamount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FAT")
    private int fat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foodid")
    private Collection<Consumptiontable> consumptiontableCollection;

    public Foodtable() {
    }

    public Foodtable(Integer foodid) {
        this.foodid = foodid;
    }

    public Foodtable(Integer foodid, String name, String category, int calorieamount, String servingunit, int servingamount, int fat) {
        this.foodid = foodid;
        this.name = name;
        this.category = category;
        this.calorieamount = calorieamount;
        this.servingunit = servingunit;
        this.servingamount = servingamount;
        this.fat = fat;
    }

    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCalorieamount() {
        return calorieamount;
    }

    public void setCalorieamount(int calorieamount) {
        this.calorieamount = calorieamount;
    }

    public String getServingunit() {
        return servingunit;
    }

    public void setServingunit(String servingunit) {
        this.servingunit = servingunit;
    }

    public int getServingamount() {
        return servingamount;
    }

    public void setServingamount(int servingamount) {
        this.servingamount = servingamount;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    @XmlTransient
    public Collection<Consumptiontable> getConsumptiontableCollection() {
        return consumptiontableCollection;
    }

    public void setConsumptiontableCollection(Collection<Consumptiontable> consumptiontableCollection) {
        this.consumptiontableCollection = consumptiontableCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foodid != null ? foodid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Foodtable)) {
            return false;
        }
        Foodtable other = (Foodtable) object;
        if ((this.foodid == null && other.foodid != null) || (this.foodid != null && !this.foodid.equals(other.foodid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caloriepackage.Foodtable[ foodid=" + foodid + " ]";
    }
    
}
