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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Y500
 */
@Entity
@Table(name = "CREDENTIALTABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Credentialtable.findAll", query = "SELECT c FROM Credentialtable c")
    , @NamedQuery(name = "Credentialtable.findByCredentialid", query = "SELECT c FROM Credentialtable c WHERE c.credentialid = :credentialid")
    , @NamedQuery(name = "Credentialtable.findByUsername", query = "SELECT c FROM Credentialtable c WHERE c.username = :username")
    , @NamedQuery(name = "Credentialtable.findByPasswordhash", query = "SELECT c FROM Credentialtable c WHERE c.passwordhash = :passwordhash")
    , @NamedQuery(name = "Credentialtable.findBySignupdate", query = "SELECT c FROM Credentialtable c WHERE c.signupdate = :signupdate")})
public class Credentialtable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREDENTIALID")
    private Integer credentialid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PASSWORDHASH")
    private String passwordhash;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SIGNUPDATE")
    @Temporal(TemporalType.DATE)
    private Date signupdate;
    @JoinColumn(name = "USERID", referencedColumnName = "USERID")
    @ManyToOne(optional = false)
    private Usertable userid;

    public Credentialtable() {
    }

    public Credentialtable(Integer credentialid) {
        this.credentialid = credentialid;
    }

    public Credentialtable(Integer credentialid, String username, String passwordhash, Date signupdate) {
        this.credentialid = credentialid;
        this.username = username;
        this.passwordhash = passwordhash;
        this.signupdate = signupdate;
    }

    public Integer getCredentialid() {
        return credentialid;
    }

    public void setCredentialid(Integer credentialid) {
        this.credentialid = credentialid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordhash() {
        return passwordhash;
    }

    public void setPasswordhash(String passwordhash) {
        this.passwordhash = passwordhash;
    }

    public Date getSignupdate() {
        return signupdate;
    }

    public void setSignupdate(Date signupdate) {
        this.signupdate = signupdate;
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
        hash += (credentialid != null ? credentialid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Credentialtable)) {
            return false;
        }
        Credentialtable other = (Credentialtable) object;
        if ((this.credentialid == null && other.credentialid != null) || (this.credentialid != null && !this.credentialid.equals(other.credentialid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caloriepackage.Credentialtable[ credentialid=" + credentialid + " ]";
    }
    
}
