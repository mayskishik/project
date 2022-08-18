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
@Table(name = "REQUISTT")
@NamedQueries({
    @NamedQuery(name = "Requistt.findAll", query = "SELECT r FROM Requistt r"),
    @NamedQuery(name = "Requistt.findByIndexRt", query = "SELECT r FROM Requistt r WHERE r.indexRt = :indexRt"),
    @NamedQuery(name = "Requistt.findByUniversityName", query = "SELECT r FROM Requistt r WHERE r.universityName = :universityName"),
    @NamedQuery(name = "Requistt.findByMajor", query = "SELECT r FROM Requistt r WHERE r.major = :major"),
    @NamedQuery(name = "Requistt.findByTrainingHours", query = "SELECT r FROM Requistt r WHERE r.trainingHours = :trainingHours")})
public class Requistt implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "INDEX_RT")
    private BigDecimal indexRt;
    @Column(name = "UNIVERSITY_NAME")
    private String universityName;
    @Column(name = "MAJOR")
    private String major;
    @Column(name = "TRAINING_HOURS")
    private Short trainingHours;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN")
    @ManyToOne
    private Members ssn;

    public Requistt() {
    }

    public Requistt(BigDecimal indexRt) {
        this.indexRt = indexRt;
    }

    public BigDecimal getIndexRt() {
        return indexRt;
    }

    public void setIndexRt(BigDecimal indexRt) {
        this.indexRt = indexRt;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
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

    public Members getSsn() {
        return ssn;
    }

    public void setSsn(Members ssn) {
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indexRt != null ? indexRt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requistt)) {
            return false;
        }
        Requistt other = (Requistt) object;
        if ((this.indexRt == null && other.indexRt != null) || (this.indexRt != null && !this.indexRt.equals(other.indexRt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.Requistt[ indexRt=" + indexRt + " ]";
    }
    
}
