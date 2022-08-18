/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "JOININ")
@NamedQueries({
    @NamedQuery(name = "Joinin.findAll", query = "SELECT j FROM Joinin j"),
    @NamedQuery(name = "Joinin.findByIndexJ", query = "SELECT j FROM Joinin j WHERE j.indexJ = :indexJ")})
public class Joinin implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "INDEX_J")
    private BigDecimal indexJ;
    @JoinColumn(name = "INDEX_C", referencedColumnName = "INDEX_C")
    @ManyToOne
    private Classes indexC;
    @JoinColumn(name = "EMPLOYEE_CODE", referencedColumnName = "EMPLOYEE_CODE")
    @ManyToOne
    private Employees employeeCode;
    @JoinColumn(name = "PATIENT_CODE", referencedColumnName = "PATIENT_CODE")
    @ManyToOne
    private Patients patientCode;
    @JoinColumn(name = "TRAINEES_CODE", referencedColumnName = "TRAINEES_CODE")
    @ManyToOne
    private Trainees traineesCode;

    public Joinin() {
    }

    public Joinin(BigDecimal indexJ) {
        this.indexJ = indexJ;
    }

    public BigDecimal getIndexJ() {
        return indexJ;
    }

    public void setIndexJ(BigDecimal indexJ) {
        this.indexJ = indexJ;
    }

    public Classes getIndexC() {
        return indexC;
    }

    public void setIndexC(Classes indexC) {
        this.indexC = indexC;
    }

    public Employees getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(Employees employeeCode) {
        this.employeeCode = employeeCode;
    }

    public Patients getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(Patients patientCode) {
        this.patientCode = patientCode;
    }

    public Trainees getTraineesCode() {
        return traineesCode;
    }

    public void setTraineesCode(Trainees traineesCode) {
        this.traineesCode = traineesCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indexJ != null ? indexJ.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joinin)) {
            return false;
        }
        Joinin other = (Joinin) object;
        if ((this.indexJ == null && other.indexJ != null) || (this.indexJ != null && !this.indexJ.equals(other.indexJ))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdwaikat.Joinin[ indexJ=" + indexJ + " ]";
    }
    
}
