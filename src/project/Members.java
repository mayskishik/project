/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "MEMBERS")
@NamedQueries({
    @NamedQuery(name = "Members.findAll", query = "SELECT m FROM Members m"),
    @NamedQuery(name = "Members.findBySsn", query = "SELECT m FROM Members m WHERE m.ssn = :ssn"),
    @NamedQuery(name = "Members.findByFirstName", query = "SELECT m FROM Members m WHERE m.firstName = :firstName"),
    @NamedQuery(name = "Members.findByMinitName", query = "SELECT m FROM Members m WHERE m.minitName = :minitName"),
    @NamedQuery(name = "Members.findByLastName", query = "SELECT m FROM Members m WHERE m.lastName = :lastName"),
    @NamedQuery(name = "Members.findByBithdate", query = "SELECT m FROM Members m WHERE m.bithdate = :bithdate"),
    @NamedQuery(name = "Members.findByPhone", query = "SELECT m FROM Members m WHERE m.phone = :phone"),
    @NamedQuery(name = "Members.findByCity", query = "SELECT m FROM Members m WHERE m.city = :city"),
    @NamedQuery(name = "Members.findByStreet", query = "SELECT m FROM Members m WHERE m.street = :street"),
    @NamedQuery(name = "Members.findByMaritalStatus", query = "SELECT m FROM Members m WHERE m.maritalStatus = :maritalStatus")})
public class Members implements Serializable {

    @OneToMany(mappedBy = "ssn")
    private Collection<Requistt> requisttCollection;
    @OneToMany(mappedBy = "ssn")
    private Collection<Requistp> requistpCollection;

    @OneToMany(mappedBy = "ssn")
    private Collection<Requiste> requisteCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SSN")
    private String ssn;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MINIT_NAME")
    private String minitName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "BITHDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bithdate;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STREET")
    private String street;
    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;
    @OneToMany(mappedBy = "ssn")
    private Collection<Patients> patientsCollection;
    @JoinColumn(name = "GENDER", referencedColumnName = "GENDER")
    @ManyToOne
    private GendDomain gender;
    @OneToMany(mappedBy = "ssn")
    private Collection<Employees> employeesCollection;
    @OneToMany(mappedBy = "ssn")
    private Collection<Trainees> traineesCollection;

    public Members() {
    }

    public Members(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMinitName() {
        return minitName;
    }

    public void setMinitName(String minitName) {
        this.minitName = minitName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBithdate() {
        return bithdate;
    }

    public void setBithdate(Date bithdate) {
        this.bithdate = bithdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Collection<Patients> getPatientsCollection() {
        return patientsCollection;
    }

    public void setPatientsCollection(Collection<Patients> patientsCollection) {
        this.patientsCollection = patientsCollection;
    }

    public GendDomain getGender() {
        return gender;
    }

    public void setGender(GendDomain gender) {
        this.gender = gender;
    }

    public Collection<Employees> getEmployeesCollection() {
        return employeesCollection;
    }

    public void setEmployeesCollection(Collection<Employees> employeesCollection) {
        this.employeesCollection = employeesCollection;
    }

    public Collection<Trainees> getTraineesCollection() {
        return traineesCollection;
    }

    public void setTraineesCollection(Collection<Trainees> traineesCollection) {
        this.traineesCollection = traineesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ssn != null ? ssn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Members)) {
            return false;
        }
        Members other = (Members) object;
        if ((this.ssn == null && other.ssn != null) || (this.ssn != null && !this.ssn.equals(other.ssn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdwaikat.Members[ ssn=" + ssn + " ]";
    }

    public Collection<Requiste> getRequisteCollection() {
        return requisteCollection;
    }

    public void setRequisteCollection(Collection<Requiste> requisteCollection) {
        this.requisteCollection = requisteCollection;
    }

    public Collection<Requistt> getRequisttCollection() {
        return requisttCollection;
    }

    public void setRequisttCollection(Collection<Requistt> requisttCollection) {
        this.requisttCollection = requisttCollection;
    }

    public Collection<Requistp> getRequistpCollection() {
        return requistpCollection;
    }

    public void setRequistpCollection(Collection<Requistp> requistpCollection) {
        this.requistpCollection = requistpCollection;
    }

    void setGender(String male) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
