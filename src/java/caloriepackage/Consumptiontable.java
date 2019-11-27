/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caloriepackage;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Y500
 */
@Entity
@Table(name = "CONSUMPTIONTABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consumptiontable.findAll", query = "SELECT c FROM Consumptiontable c")
    , @NamedQuery(name = "Consumptiontable.findByConsumptionid", query = "SELECT c FROM Consumptiontable c WHERE c.consumptionid = :consumptionid")
    , @NamedQuery(name = "Consumptiontable.findByDate", query = "SELECT c FROM Consumptiontable c WHERE c.date = :date")
    , @NamedQuery(name = "Consumptiontable.findByUsernameAndFoodname", query = "SELECT c FROM Consumptiontable c WHERE c.userid.name = :uname AND c.foodid.name = :fname")
    , @NamedQuery(name = "Consumptiontable.findByDailyquantity", query = "SELECT c FROM Consumptiontable c WHERE c.dailyquantity = :dailyquantity")})
public class Consumptiontable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CONSUMPTIONID")
    private Integer consumptionid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAILYQUANTITY")
    private int dailyquantity;
    @JoinColumn(name = "FOODID", referencedColumnName = "FOODID")
    @ManyToOne(optional = false)
    private Foodtable foodid;
    @JoinColumn(name = "USERID", referencedColumnName = "USERID")
    @ManyToOne(optional = false)
    private Usertable userid;

    public Consumptiontable() {
    }

    public Consumptiontable(Integer consumptionid) {
        this.consumptionid = consumptionid;
    }

    public Consumptiontable(Integer consumptionid, Date date, int dailyquantity) {
        this.consumptionid = consumptionid;
        this.date = date;
        this.dailyquantity = dailyquantity;
    }

    public Integer getConsumptionid() {
        return consumptionid;
    }

    public void setConsumptionid(Integer consumptionid) {
        this.consumptionid = consumptionid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDailyquantity() {
        return dailyquantity;
    }

    public void setDailyquantity(int dailyquantity) {
        this.dailyquantity = dailyquantity;
    }

    public Foodtable getFoodid() {
        return foodid;
    }

    public void setFoodid(Foodtable foodid) {
        this.foodid = foodid;
    }

    public Usertable getUserid() {
        return userid;
    }

    public void setUserid(Usertable userid) {
        this.userid = userid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consumptionid != null ? consumptionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consumptiontable)) {
            return false;
        }
        Consumptiontable other = (Consumptiontable) object;
        if ((this.consumptionid == null && other.consumptionid != null) || (this.consumptionid != null && !this.consumptionid.equals(other.consumptionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caloriepackage.Consumptiontable[ consumptionid=" + consumptionid + " ]";
    }
    
}
