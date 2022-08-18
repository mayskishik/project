/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;
import java.util.Collection;
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
import project.DepartmentDisability;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "PATIENTS")
@NamedQueries({
    @NamedQuery(name = "Patients.findAll", query = "SELECT p FROM Patients p"),
    @NamedQuery(name = "Patients.findByPatientCode", query = "SELECT p FROM Patients p WHERE p.patientCode = :patientCode"),
    @NamedQuery(name = "Patients.findBySuppliesCardNumber", query = "SELECT p FROM Patients p WHERE p.suppliesCardNumber = :suppliesCardNumber"),
    @NamedQuery(name = "Patients.findByGuardianName", query = "SELECT p FROM Patients p WHERE p.guardianName = :guardianName"),
    @NamedQuery(name = "Patients.findByGuardianSsn", query = "SELECT p FROM Patients p WHERE p.guardianSsn = :guardianSsn"),
    @NamedQuery(name = "Patients.findByAffairsCardNumber", query = "SELECT p FROM Patients p WHERE p.affairsCardNumber = :affairsCardNumber")})
public class Patients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PATIENT_CODE")
    private String patientCode;
    @Column(name = "SUPPLIES_CARD_NUMBER")
    private String suppliesCardNumber;
    @Column(name = "GUARDIAN_NAME")
    private String guardianName;
    @Column(name = "GUARDIAN_SSN")
    private String guardianSsn;
    @Column(name = "AFFAIRS_CARD_NUMBER")
    private String affairsCardNumber;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN")
    @ManyToOne
    private Members ssn;
    @OneToMany(mappedBy = "patientCode")
    private Collection<DepartmentDisability> departmentDisabilityCollection;
    @OneToMany(mappedBy = "patientCode")
    private Collection<Joinin> joininCollection;

    public Patients() {
    }

    public Patients(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getSuppliesCardNumber() {
        return suppliesCardNumber;
    }

    public void setSuppliesCardNumber(String suppliesCardNumber) {
        this.suppliesCardNumber = suppliesCardNumber;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianSsn() {
        return guardianSsn;
    }

    public void setGuardianSsn(String guardianSsn) {
        this.guardianSsn = guardianSsn;
    }

    public String getAffairsCardNumber() {
        return affairsCardNumber;
    }

    public void setAffairsCardNumber(String affairsCardNumber) {
        this.affairsCardNumber = affairsCardNumber;
    }

    public Members getSsn() {
        return ssn;
    }

    public void setSsn(Members ssn) {
        this.ssn = ssn;
    }

    public Collection<DepartmentDisability> getDepartmentDisabilityCollection() {
        return departmentDisabilityCollection;
    }

    public void setDepartmentDisabilityCollection(Collection<DepartmentDisability> departmentDisabilityCollection) {
        this.departmentDisabilityCollection = departmentDisabilityCollection;
    }

    public Collection<Joinin> getJoininCollection() {
        return joininCollection;
    }

    public void setJoininCollection(Collection<Joinin> joininCollection) {
        this.joininCollection = joininCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientCode != null ? patientCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patients)) {
            return false;
        }
        Patients other = (Patients) object;
        if ((this.patientCode == null && other.patientCode != null) || (this.patientCode != null && !this.patientCode.equals(other.patientCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdwaikat.Patients[ patientCode=" + patientCode + " ]";
    }
    
}
