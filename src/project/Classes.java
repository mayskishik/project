/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "CLASSES")
@NamedQueries({
    @NamedQuery(name = "Classes.findAll", query = "SELECT c FROM Classes c"),
    @NamedQuery(name = "Classes.findByIndexC", query = "SELECT c FROM Classes c WHERE c.indexC = :indexC"),
    @NamedQuery(name = "Classes.findByClassName", query = "SELECT c FROM Classes c WHERE c.className = :className")})
public class Classes implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "INDEX_C")
    private BigDecimal indexC;
    @Column(name = "CLASS_NAME")
    private String className;
    @OneToMany(mappedBy = "indexC")
    private Collection<Joinin> joininCollection;

    public Classes() {
    }

    public Classes(BigDecimal indexC) {
        this.indexC = indexC;
    }

    public BigDecimal getIndexC() {
        return indexC;
    }

    public void setIndexC(BigDecimal indexC) {
        this.indexC = indexC;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
        hash += (indexC != null ? indexC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classes)) {
            return false;
        }
        Classes other = (Classes) object;
        if ((this.indexC == null && other.indexC != null) || (this.indexC != null && !this.indexC.equals(other.indexC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdwaikat.Classes[ indexC=" + indexC + " ]";
    }
    
}
