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
@Table(name = "REQUISTE")
@NamedQueries({
    @NamedQuery(name = "Requiste.findAll", query = "SELECT r FROM Requiste r"),
    @NamedQuery(name = "Requiste.findByIndexRe", query = "SELECT r FROM Requiste r WHERE r.indexRe = :indexRe"),
    @NamedQuery(name = "Requiste.findByUniversityName", query = "SELECT r FROM Requiste r WHERE r.universityName = :universityName"),
    @NamedQuery(name = "Requiste.findByUniversityMajor", query = "SELECT r FROM Requiste r WHERE r.universityMajor = :universityMajor"),
    @NamedQuery(name = "Requiste.findByYearOfGraduate", query = "SELECT r FROM Requiste r WHERE r.yearOfGraduate = :yearOfGraduate"),
    @NamedQuery(name = "Requiste.findByEMail", query = "SELECT r FROM Requiste r WHERE r.eMail = :eMail")})
public class Requiste implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "INDEX_RE")
    private BigDecimal indexRe;
    @Column(name = "UNIVERSITY_NAME")
    private String universityName;
    @Column(name = "UNIVERSITY_MAJOR")
    private String universityMajor;
    @Column(name = "YEAR_OF_GRADUATE")
    private Short yearOfGraduate;
    @Column(name = "E_MAIL")
    private String eMail;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN")
    @ManyToOne
    private Members ssn;

    public Requiste() {
    }

    public Requiste(BigDecimal indexRe) {
        this.indexRe = indexRe;
    }

    public BigDecimal getIndexRe() {
        return indexRe;
    }

    public void setIndexRe(BigDecimal indexRe) {
        this.indexRe = indexRe;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityMajor() {
        return universityMajor;
    }

    public void setUniversityMajor(String universityMajor) {
        this.universityMajor = universityMajor;
    }

    public Short getYearOfGraduate() {
        return yearOfGraduate;
    }

    public void setYearOfGraduate(Short yearOfGraduate) {
        this.yearOfGraduate = yearOfGraduate;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
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
        hash += (indexRe != null ? indexRe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requiste)) {
            return false;
        }
        Requiste other = (Requiste) object;
        if ((this.indexRe == null && other.indexRe != null) || (this.indexRe != null && !this.indexRe.equals(other.indexRe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.Requiste[ indexRe=" + indexRe + " ]";
    }

    void setSsn(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
