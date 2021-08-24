package com.emjl.hr.service;

import com.emjl.hr.model.Dept;
import com.emjl.hr.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.Principal;
import java.util.List;

@Service
@Transactional
public class HrService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Dept> getDeptLevel(int upDeptId){
        String sql = "select DEPTID,DEPTNAME,SUPDEPTID,DeptCode" +
                " from [DEPARTMENTS]" +
                " where SUPDEPTID=? order by DEPTID asc";
        List depts = jdbcTemplate.query(sql, new Object[]{upDeptId}, BeanPropertyRowMapper.newInstance(Dept.class));

        return depts;
    }

    public List<Employee> getEmpByDeptId(int deptId){
        String sql = "select USERID,BADGENUMBER,SSN,NAME,DEFAULTDEPTID" +
                " from [USERINFO]" +
                " where DEFAULTDEPTID=? order by DEFAULTDEPTID asc";
        List emps = jdbcTemplate.query(sql,new Object[]{deptId}, BeanPropertyRowMapper.newInstance(Employee.class));

        return emps;
    }

}
