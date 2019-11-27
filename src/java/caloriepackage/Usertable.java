/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caloriepackage;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Y500
 */
@Entity
@Table(name = "USERTABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usertable.findAll", query = "SELECT u FROM Usertable u")
    , @NamedQuery(name = "Usertable.findByUserid", query = "SELECT u FROM Usertable u WHERE u.userid = :userid")
    , @NamedQuery(name = "Usertable.findByName", query = "SELECT u FROM Usertable u WHERE u.name = :name")
    , @NamedQuery(name = "Usertable.findBySurname", query = "SELECT u FROM Usertable u WHERE u.surname = :surname")
    , @NamedQuery(name = "Usertable.findByEmail", query = "SELECT u FROM Usertable u WHERE u.email = :email")
    , @NamedQuery(name = "Usertable.findByDateofbirth", query = "SELECT u FROM Usertable u WHERE u.dateofbirth = :dateofbirth")
    , @NamedQuery(name = "Usertable.findByHeight", query = "SELECT u FROM Usertable u WHERE u.height = :height")
    , @NamedQuery(name = "Usertable.findByWeight", query = "SELECT u FROM Usertable u WHERE u.weight = :weight")
    , @NamedQuery(name = "Usertable.findByGender", query = "SELECT u FROM Usertable u WHERE u.gender = :gender")
    , @NamedQuery(name = "Usertable.findByAddress", query = "SELECT u FROM Usertable u WHERE u.address = :address")
    , @NamedQuery(name = "Usertable.findByPostcode", query = "SELECT u FROM Usertable u WHERE u.postcode = :postcode")
    , @NamedQuery(name = "Usertable.findByLevelofactivity", query = "SELECT u FROM Usertable u WHERE u.levelofactivity = :levelofactivity")
    , @NamedQuery(name = "Usertable.findByStepspermile", query = "SELECT u FROM Usertable u WHERE u.stepspermile = :stepspermile")})
public class Usertable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "USERID")
    private Integer userid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SURNAME")
    private String surname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEOFBIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateofbirth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HEIGHT")
    private int height;
    @Basic(optional = false)
    @NotNull
    @Column(name = "WEIGHT")
    private int weight;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "GENDER")
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ADDRESS")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "POSTCODE")
    private String postcode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LEVELOFACTIVITY")
    private int levelofactivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STEPSPERMILE")
    private int stepspermile;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private Collection<Consumptiontable> consumptiontableCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private Collection<Reporttable> reporttableCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private Collection<Credentialtable> credentialtableCollection;

    public Usertable() {
    }

    public Usertable(Integer userid) {
        this.userid = userid;
    }

    public Usertable(Integer userid, String name, String surname, String email, Date dateofbirth, int height, int weight, String gender, String address, String postcode, int levelofactivity, int stepspermile) {
        this.userid = userid;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateofbirth = dateofbirth;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.address = address;
        this.postcode = postcode;
        this.levelofactivity = levelofactivity;
        this.stepspermile = stepspermile;
    }
    

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateofbirth() throws ParseException { 
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getLevelofactivity() {
        return levelofactivity;
    }

    public void setLevelofactivity(int levelofactivity) {
        this.levelofactivity = levelofactivity;
    }

    public int getStepspermile() {
        return stepspermile;
    }

    public void setStepspermile(int stepspermile) {
        this.stepspermile = stepspermile;
    }

    @XmlTransient
    public Collection<Consumptiontable> getConsumptiontableCollection() {
        return consumptiontableCollection;
    }

    public void setConsumptiontableCollection(Collection<Consumptiontable> consumptiontableCollection) {
        this.consumptiontableCollection = consumptiontableCollection;
    }

    @XmlTransient
    public Collection<Reporttable> getReporttableCollection() {
        return reporttableCollection;
    }

    public void setReporttableCollection(Collection<Reporttable> reporttableCollection) {
        this.reporttableCollection = reporttableCollection;
    }

    @XmlTransient
    public Collection<Credentialtable> getCredentialtableCollection() {
        return credentialtableCollection;
    }

    public void setCredentialtableCollection(Collection<Credentialtable> credentialtableCollection) {
        this.credentialtableCollection = credentialtableCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usertable)) {
            return false;
        }
        Usertable other = (Usertable) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caloriepackage.Usertable[ userid=" + userid + " ]";
    }
    
}
