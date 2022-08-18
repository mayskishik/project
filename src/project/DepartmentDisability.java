/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author hp
 */
@Entity
@Table(name = "DEPARTMENT_DISABILITY")
@NamedQueries({
    @NamedQuery(name = "DepartmentDisability.findAll", query = "SELECT d FROM DepartmentDisability d"),
    @NamedQuery(name = "DepartmentDisability.findByIndexD", query = "SELECT d FROM DepartmentDisability d WHERE d.indexD = :indexD"),
    @NamedQuery(name = "DepartmentDisability.findByDisabilityType", query = "SELECT d FROM DepartmentDisability d WHERE d.disabilityType = :disabilityType"),
    @NamedQuery(name = "DepartmentDisability.findByCausesOfDisability", query = "SELECT d FROM DepartmentDisability d WHERE d.causesOfDisability = :causesOfDisability"),
    @NamedQuery(name = "DepartmentDisability.findByDateBegan", query = "SELECT d FROM DepartmentDisability d WHERE d.dateBegan = :dateBegan"),
    @NamedQuery(name = "DepartmentDisability.findByMedicinesTaken", query = "SELECT d FROM DepartmentDisability d WHERE d.medicinesTaken = :medicinesTaken")})
public class DepartmentDisability implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "INDEX_D")
    private BigDecimal indexD;
    @Column(name = "DISABILITY_TYPE")
    private String disabilityType;
    @Column(name = "CAUSES_OF_DISABILITY")
    private String causesOfDisability;
    @Column(name = "DATE_BEGAN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateBegan;
    @Column(name = "MEDICINES_TAKEN")
    private String medicinesTaken;
    @JoinColumn(name = "PATIENT_CODE", referencedColumnName = "PATIENT_CODE")
    @ManyToOne
    private Patients patientCode;

    public DepartmentDisability() {
    }

    public DepartmentDisability(BigDecimal indexD) {
        this.indexD = indexD;
    }

    public BigDecimal getIndexD() {
        return indexD;
    }

    public void setIndexD(BigDecimal indexD) {
        this.indexD = indexD;
    }

    public String getDisabilityType() {
        return disabilityType;
    }

    public void setDisabilityType(String disabilityType) {
        this.disabilityType = disabilityType;
    }

    public String getCausesOfDisability() {
        return causesOfDisability;
    }

    public void setCausesOfDisability(String causesOfDisability) {
        this.causesOfDisability = causesOfDisability;
    }

    public Date getDateBegan() {
        return dateBegan;
    }

    public void setDateBegan(Date dateBegan) {
        this.dateBegan = dateBegan;
    }

    public String getMedicinesTaken() {
        return medicinesTaken;
    }

    public void setMedicinesTaken(String medicinesTaken) {
        this.medicinesTaken = medicinesTaken;
    }

    public Patients getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(Patients patientCode) {
        this.patientCode = patientCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indexD != null ? indexD.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartmentDisability)) {
            return false;
        }
        DepartmentDisability other = (DepartmentDisability) object;
        if ((this.indexD == null && other.indexD != null) || (this.indexD != null && !this.indexD.equals(other.indexD))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.DepartmentDisability[ indexD=" + indexD + " ]";
    }
    
}
