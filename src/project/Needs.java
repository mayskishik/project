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
@Table(name = "NEEDS")
@NamedQueries({
    @NamedQuery(name = "Needs.findAll", query = "SELECT n FROM Needs n"),
    @NamedQuery(name = "Needs.findByNeedsId", query = "SELECT n FROM Needs n WHERE n.needsId = :needsId"),
    @NamedQuery(name = "Needs.findByPatientCode", query = "SELECT n FROM Needs n WHERE n.patientCode = :patientCode"),
    @NamedQuery(name = "Needs.findByPeriodTime", query = "SELECT n FROM Needs n WHERE n.periodTime = :periodTime"),
    @NamedQuery(name = "Needs.findByGivenDate", query = "SELECT n FROM Needs n WHERE n.givenDate = :givenDate"),
    @NamedQuery(name = "Needs.findByReceiptDate", query = "SELECT n FROM Needs n WHERE n.receiptDate = :receiptDate")})
public class Needs implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "NEEDS_ID")
    private BigDecimal needsId;
    @Column(name = "PATIENT_CODE")
    private String patientCode;
    @Column(name = "PERIOD_TIME")
    private String periodTime;
    @Column(name = "GIVEN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date givenDate;
    @Column(name = "RECEIPT_DATE")
    private String receiptDate;
    @JoinColumn(name = "TOOL_ID", referencedColumnName = "TOOL_ID")
    @ManyToOne
    private Tool toolId;

    public Needs() {
    }

    public Needs(BigDecimal needsId) {
        this.needsId = needsId;
    }

    public BigDecimal getNeedsId() {
        return needsId;
    }

    public void setNeedsId(BigDecimal needsId) {
        this.needsId = needsId;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPeriodTime() {
        return periodTime;
    }

    public void setPeriodTime(String periodTime) {
        this.periodTime = periodTime;
    }

    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Tool getToolId() {
        return toolId;
    }

    public void setToolId(Tool toolId) {
        this.toolId = toolId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (needsId != null ? needsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Needs)) {
            return false;
        }
        Needs other = (Needs) object;
        if ((this.needsId == null && other.needsId != null) || (this.needsId != null && !this.needsId.equals(other.needsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdwaikat.Needs[ needsId=" + needsId + " ]";
    }
    
}
