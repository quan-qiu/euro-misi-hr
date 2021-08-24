package com.emjl.hr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;

@Entity
@Table(name="DEPARTMENTS")
public class Dept {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="DEPTID")
    protected int deptId;
    @Column(name="DEPTNAME")
    protected String deptName;
    @Column(name="SUPDEPTID")
    protected int supDeptID;
    @Column(name="DeptCode")
    protected String deptCode;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getSupDeptID() {
        return supDeptID;
    }

    public void setSupDeptID(int supDeptID) {
        this.supDeptID = supDeptID;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", supDeptID='" + supDeptID + '\'' +
                ", deptCode='" + deptCode + '\'' +
                '}';
    }
}
