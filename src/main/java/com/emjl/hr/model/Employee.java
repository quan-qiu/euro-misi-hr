package com.emjl.hr.model;

import javax.persistence.*;

@Entity
@Table(name="USERINFO")
public class Employee {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="USERID")
    protected int userId;
    @Column(name="BADGENUMBER")
    protected String badgeNumber;

    @Column(name="SSN")
    protected String ssn;

    @Column(name="name")
    protected String name;

    @Column(name="DEFAULTDEPTID")
    protected int deptId;

    @Column(name="cardno")
    protected String cardNo;

    @Column(name="EmpID")
    protected String empId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "userId=" + userId +
                ", badgeNumber='" + badgeNumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", deptId='" + deptId + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }
}
