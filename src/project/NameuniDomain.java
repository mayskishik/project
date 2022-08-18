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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "NAMEUNI_DOMAIN")
@NamedQueries({
    @NamedQuery(name = "NameuniDomain.findAll", query = "SELECT n FROM NameuniDomain n"),
    @NamedQuery(name = "NameuniDomain.findByUniversityName", query = "SELECT n FROM NameuniDomain n WHERE n.universityName = :universityName")})
public class NameuniDomain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UNIVERSITY_NAME")
    private String universityName;
    @OneToMany(mappedBy = "universityName")
    private Collection<Trainees> traineesCollection;

    public NameuniDomain() {
    }

    public NameuniDomain(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
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
        hash += (universityName != null ? universityName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NameuniDomain)) {
            return false;
        }
        NameuniDomain other = (NameuniDomain) object;
        if ((this.universityName == null && other.universityName != null) || (this.universityName != null && !this.universityName.equals(other.universityName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdwaikat.NameuniDomain[ universityName=" + universityName + " ]";
    }
    
}
