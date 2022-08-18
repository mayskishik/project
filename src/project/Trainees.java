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

/**
 *
 * @author hp
 */
@Entity
@Table(name = "TRAINEES")
@NamedQueries({
    @NamedQuery(name = "Trainees.findAll", query = "SELECT t FROM Trainees t"),
    @NamedQuery(name = "Trainees.findByTraineesCode", query = "SELECT t FROM Trainees t WHERE t.traineesCode = :traineesCode"),
    @NamedQuery(name = "Trainees.findByMajor", query = "SELECT t FROM Trainees t WHERE t.major = :major"),
    @NamedQuery(name = "Trainees.findByTrainingHours", query = "SELECT t FROM Trainees t WHERE t.trainingHours = :trainingHours")})
public class Trainees implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRAINEES_CODE")
    private String traineesCode;
    @Column(name = "MAJOR")
    private String major;
    @Column(name = "TRAINING_HOURS")
    private Short trainingHours;
    @OneToMany(mappedBy = "traineesCode")
    private Collection<Joinin> joininCollection;
    @JoinColumn(name = "EMPLOYEE_SUPERVISING", referencedColumnName = "EMPLOYEE_CODE")
    @ManyToOne
    private Employees employeeSupervising;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN")
    @ManyToOne
    private Members ssn;
    @JoinColumn(name = "UNIVERSITY_NAME", referencedColumnName = "UNIVERSITY_NAME")
    @ManyToOne
    private NameuniDomain universityName;

    public Trainees() {
    }

    public Trainees(String traineesCode) {
        this.traineesCode = traineesCode;
    }

    public String getTraineesCode() {
        return traineesCode;
    }

    public void setTraineesCode(String traineesCode) {
        this.traineesCode = traineesCode;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Short getTrainingHours() {
        return trainingHours;
    }

    public void setTrainingHours(Short trainingHours) {
        this.trainingHours = trainingHours;
    }

    public Collection<Joinin> getJoininCollection() {
        return joininCollection;
    }

    public void setJoininCollection(Collection<Joinin> joininCollection) {
        this.joininCollection = joininCollection;
    }

    public Employees getEmployeeSupervising() {
        return employeeSupervising;
    }

    public void setEmployeeSupervising(Employees employeeSupervising) {
        this.employeeSupervising = employeeSupervising;
    }

    public Members getSsn() {
        return ssn;
    }

    public void setSsn(Members ssn) {
        this.ssn = ssn;
    }

    public NameuniDomain getUniversityName() {
        return universityName;
    }

    public void setUniversityName(NameuniDomain universityName) {
        this.universityName = universityName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (traineesCode != null ? traineesCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainees)) {
            return false;
        }
        Trainees other = (Trainees) object;
        if ((this.traineesCode == null && other.traineesCode != null) || (this.traineesCode != null && !this.traineesCode.equals(other.traineesCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdwaikat.Trainees[ traineesCode=" + traineesCode + " ]";
    }
    
}
