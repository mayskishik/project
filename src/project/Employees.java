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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "EMPLOYEES")
@NamedQueries({
    @NamedQuery(name = "Employees.findAll", query = "SELECT e FROM Employees e"),
    @NamedQuery(name = "Employees.findByEmployeeCode", query = "SELECT e FROM Employees e WHERE e.employeeCode = :employeeCode"),
    @NamedQuery(name = "Employees.findByUniversityName", query = "SELECT e FROM Employees e WHERE e.universityName = :universityName"),
    @NamedQuery(name = "Employees.findByUniversityMajor", query = "SELECT e FROM Employees e WHERE e.universityMajor = :universityMajor"),
    @NamedQuery(name = "Employees.findByYearOfGraduate", query = "SELECT e FROM Employees e WHERE e.yearOfGraduate = :yearOfGraduate"),
    @NamedQuery(name = "Employees.findByEMail", query = "SELECT e FROM Employees e WHERE e.eMail = :eMail"),
    @NamedQuery(name = "Employees.findBySalary", query = "SELECT e FROM Employees e WHERE e.salary = :salary"),
    @NamedQuery(name = "Employees.findByWorkInDepartment", query = "SELECT e FROM Employees e WHERE e.workInDepartment = :workInDepartment")})
public class Employees implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_CODE")
    private String employeeCode;
    @Column(name = "UNIVERSITY_NAME")
    private String universityName;
    @Column(name = "UNIVERSITY_MAJOR")
    private String universityMajor;
    @Column(name = "YEAR_OF_GRADUATE")
    private Short yearOfGraduate;
    @Column(name = "E_MAIL")
    private String eMail;
    @Column(name = "SALARY")
    private Integer salary;
    @Column(name = "WORK_IN_DEPARTMENT")
    private String workInDepartment;
    @JoinColumn(name = "SSN", referencedColumnName = "SSN")
    @ManyToOne
    private Members ssn;
    @OneToMany(mappedBy = "employeeCode")
    private Collection<Joinin> joininCollection;
    @OneToMany(mappedBy = "employeeSupervising")
    private Collection<Trainees> traineesCollection;

    public Employees() {
    }

    public Employees(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getWorkInDepartment() {
        return workInDepartment;
    }

    public void setWorkInDepartment(String workInDepartment) {
        this.workInDepartment = workInDepartment;
    }

    public Members getSsn() {
        return ssn;
    }

    public void setSsn(Members ssn) {
        this.ssn = ssn;
    }

    public Collection<Joinin> getJoininCollection() {
        return joininCollection;
    }

    public void setJoininCollection(Collection<Joinin> joininCollection) {
        this.joininCollection = joininCollection;
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
        hash += (employeeCode != null ? employeeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        if ((this.employeeCode == null && other.employeeCode != null) || (this.employeeCode != null && !this.employeeCode.equals(other.employeeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdwaikat.Employees[ employeeCode=" + employeeCode + " ]";
    }
    
}
