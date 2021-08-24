package com.emjl.hr.restController;


import com.emjl.hr.model.Dept;
import com.emjl.hr.model.Employee;
import com.emjl.hr.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/api/hr")
@CrossOrigin(origins = "localhost:9090")
public class HrApiController {

    @Autowired
    private HrService hrService;

    @RequestMapping("")
    public String helloWorld(){
        return "Hello world";
    }

    @RequestMapping(value ="/dept/{upDeptId}", method = RequestMethod.GET,produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Dept>> getDept(@PathVariable int upDeptId){
        try {
            ResponseEntity<List<Dept>> responseEntity =
                    new ResponseEntity<List<Dept>>(hrService.getDeptLevel(upDeptId), HttpStatus.OK);

            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<List<Dept>>(HttpStatus.BAD_REQUEST);
        }
    }


    @RequestMapping(value ="/emp/{deptId}", method = RequestMethod.GET,produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Employee>> getEmpByDeptId(@PathVariable int deptId){
        try {
            ResponseEntity<List<Employee>> responseEntity =
                    new ResponseEntity<List<Employee>>(
                            hrService.getEmpByDeptId(deptId), HttpStatus.OK);

            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<List<Employee>>(HttpStatus.BAD_REQUEST);
        }
    }
}
