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
@Table(name = "REPORTTABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reporttable.findAll", query = "SELECT r FROM Reporttable r")
    , @NamedQuery(name = "Reporttable.findByReportid", query = "SELECT r FROM Reporttable r WHERE r.reportid = :reportid")
    , @NamedQuery(name = "Reporttable.findByDate", query = "SELECT r FROM Reporttable r WHERE r.date = :date")
    , @NamedQuery(name = "Reporttable.findByTotalcaloriesconsumed", query = "SELECT r FROM Reporttable r WHERE r.totalcaloriesconsumed = :totalcaloriesconsumed")
    , @NamedQuery(name = "Reporttable.findByTotalcaloriesburned", query = "SELECT r FROM Reporttable r WHERE r.totalcaloriesburned = :totalcaloriesburned")
    , @NamedQuery(name = "Reporttable.findByTotalstepstaken", query = "SELECT r FROM Reporttable r WHERE r.totalstepstaken = :totalstepstaken")
    , @NamedQuery(name = "Reporttable.findByDailycaloriegoal", query = "SELECT r FROM Reporttable r WHERE r.dailycaloriegoal = :dailycaloriegoal")})
public class Reporttable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "REPORTID")
    private Integer reportid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTALCALORIESCONSUMED")
    private int totalcaloriesconsumed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTALCALORIESBURNED")
    private int totalcaloriesburned;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTALSTEPSTAKEN")
    private int totalstepstaken;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAILYCALORIEGOAL")
    private int dailycaloriegoal;
    @JoinColumn(name = "USERID", referencedColumnName = "USERID")
    @ManyToOne(optional = false)
    private Usertable userid;

    public Reporttable() {
    }

    public Reporttable(Integer reportid) {
        this.reportid = reportid;
    }

    public Reporttable(Integer reportid, Date date, int totalcaloriesconsumed, int totalcaloriesburned, int totalstepstaken, int dailycaloriegoal) {
        this.reportid = reportid;
        this.date = date;
        this.totalcaloriesconsumed = totalcaloriesconsumed;
        this.totalcaloriesburned = totalcaloriesburned;
        this.totalstepstaken = totalstepstaken;
        this.dailycaloriegoal = dailycaloriegoal;
    }

    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalcaloriesconsumed() {
        return totalcaloriesconsumed;
    }

    public void setTotalcaloriesconsumed(int totalcaloriesconsumed) {
        this.totalcaloriesconsumed = totalcaloriesconsumed;
    }

    public int getTotalcaloriesburned() {
        return totalcaloriesburned;
    }

    public void setTotalcaloriesburned(int totalcaloriesburned) {
        this.totalcaloriesburned = totalcaloriesburned;
    }

    public int getTotalstepstaken() {
        return totalstepstaken;
    }

    public void setTotalstepstaken(int totalstepstaken) {
        this.totalstepstaken = totalstepstaken;
    }

    public int getDailycaloriegoal() {
        return dailycaloriegoal;
    }

    public void setDailycaloriegoal(int dailycaloriegoal) {
        this.dailycaloriegoal = dailycaloriegoal;
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
        hash += (reportid != null ? reportid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reporttable)) {
            return false;
        }
        Reporttable other = (Reporttable) object;
        if ((this.reportid == null && other.reportid != null) || (this.reportid != null && !this.reportid.equals(other.reportid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caloriepackage.Reporttable[ reportid=" + reportid + " ]";
    }
    
}
