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
@Table(name = "GEND_DOMAIN")
@NamedQueries({
    @NamedQuery(name = "GendDomain.findAll", query = "SELECT g FROM GendDomain g"),
    @NamedQuery(name = "GendDomain.findByGender", query = "SELECT g FROM GendDomain g WHERE g.gender = :gender")})
public class GendDomain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GENDER")
    private String gender;
    @OneToMany(mappedBy = "gender")
    private Collection<Members> membersCollection;

    public GendDomain() {
    }

    public GendDomain(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Collection<Members> getMembersCollection() {
        return membersCollection;
    }

    public void setMembersCollection(Collection<Members> membersCollection) {
        this.membersCollection = membersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gender != null ? gender.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GendDomain)) {
            return false;
        }
        GendDomain other = (GendDomain) object;
        if ((this.gender == null && other.gender != null) || (this.gender != null && !this.gender.equals(other.gender))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdwaikat.GendDomain[ gender=" + gender + " ]";
    }
    
}
