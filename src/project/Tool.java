/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "TOOL")
@NamedQueries({
    @NamedQuery(name = "Tool.findAll", query = "SELECT t FROM Tool t"),
    @NamedQuery(name = "Tool.findByToolId", query = "SELECT t FROM Tool t WHERE t.toolId = :toolId"),
    @NamedQuery(name = "Tool.findByToolName", query = "SELECT t FROM Tool t WHERE t.toolName = :toolName"),
    @NamedQuery(name = "Tool.findByCountTools", query = "SELECT t FROM Tool t WHERE t.countTools = :countTools")})
public class Tool implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TOOL_ID")
    private BigDecimal toolId;
    @Column(name = "TOOL_NAME")
    private String toolName;
    @Column(name = "COUNT_TOOLS")
    private BigInteger countTools;
    @OneToMany(mappedBy = "toolId")
    private Collection<Needs> needsCollection;

    public Tool() {
    }

    public Tool(BigDecimal toolId) {
        this.toolId = toolId;
    }

    public BigDecimal getToolId() {
        return toolId;
    }

    public void setToolId(BigDecimal toolId) {
        this.toolId = toolId;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public BigInteger getCountTools() {
        return countTools;
    }

    public void setCountTools(BigInteger countTools) {
        this.countTools = countTools;
    }

    public Collection<Needs> getNeedsCollection() {
        return needsCollection;
    }

    public void setNeedsCollection(Collection<Needs> needsCollection) {
        this.needsCollection = needsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (toolId != null ? toolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tool)) {
            return false;
        }
        Tool other = (Tool) object;
        if ((this.toolId == null && other.toolId != null) || (this.toolId != null && !this.toolId.equals(other.toolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdwaikat.Tool[ toolId=" + toolId + " ]";
    }
    
}
