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
 * @author msys
 */
@Entity
@Table(name = "REQUISTP")
@NamedQueries({
    @NamedQuery(name = "Requistp.findAll", query = "SELECT r FROM Requistp r"),
    @NamedQuery(name = "Requistp.findByIndexRp", query = "SELECT r FROM Requistp r WHERE r.indexRp = :indexRp"),
    @NamedQuery(name = "Requistp.findBySuppliesCardNumber", query = "SELECT r FROM Requistp r WHERE r.suppliesCardNumber = :suppliesCardNumber"),
    @NamedQuery(name = "Requistp.findByGuardianName", query = "SELECT r FROM Requistp r WHERE r.guardianName = :guardianName"),
    @NamedQuery(name = "Requistp.findByGuardianSsn", query = "SELECT r FROM Requistp r WHERE r.guardianSsn = :guardianSsn"),
    @NamedQuery(name = "Requistp.findByAffairsCodeNumber", query = "SELECT r FROM Requistp r WHERE r.affairsCodeNumber = :affairsCodeNumber")})
public class Requistp implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "INDEX_RP")
    private BigDecimal indexRp;
    @Column(name = "SUPPLIES_CARD_NUMBER")
    private String suppliesCardNumber;
    @Column(name = "GUARDIAN_NAME")
    private String guardianName;
    @Column(name = "GUARDIAN_SSN")
    private String guardianSsn;
    @Column(name = "AFFAIRS_CODE_NUMBER")
    private String affairsCodeNumber;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN")
    @ManyToOne
    private Members ssn;

    public Requistp() {
    }

    public Requistp(BigDecimal indexRp) {
        this.indexRp = indexRp;
    }

    public BigDecimal getIndexRp() {
        return indexRp;
    }

    public void setIndexRp(BigDecimal indexRp) {
        this.indexRp = indexRp;
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

    public String getAffairsCodeNumber() {
        return affairsCodeNumber;
    }

    public void setAffairsCodeNumber(String affairsCodeNumber) {
        this.affairsCodeNumber = affairsCodeNumber;
    }

    public Members getSsn() {
        return ssn;
    }

    public void setSsn(Members ssn) {
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indexRp != null ? indexRp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requistp)) {
            return false;
        }
        Requistp other = (Requistp) object;
        if ((this.indexRp == null && other.indexRp != null) || (this.indexRp != null && !this.indexRp.equals(other.indexRp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.Requistp[ indexRp=" + indexRp + " ]";
    }
    
}
