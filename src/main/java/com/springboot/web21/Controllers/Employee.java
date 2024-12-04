package com.springboot.web21.Controllers;


import com.springboot.web21.DTO.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Vector;

@RestController
@RequestMapping("/empl")
public class Employee {



    @GetMapping(path="/secret")
    String getSecret(){
        return "Encrypted Data";
    }


    @GetMapping("/{emplId}")
    EmployeeDTO employeeById(@PathVariable(name ="emplId") Long id){
        return new EmployeeDTO(id,"Huzaifa Aamir","aamirhuzaifa1@gmail.com",22);
    }

    @GetMapping
    String requePara(@RequestParam(required = false,name ="umar") Integer age,@RequestParam(required = false) String sortby){
        return "The Age is "+age+" sort by "+sortby;
    }


    @PostMapping
    EmployeeDTO post(@RequestBody EmployeeDTO e){
        return e;
    }

    @PutMapping
    String put(){
        return "put Mapping";
    }

    @DeleteMapping
    String delete(){
        return "delete Mapping";
    }




}
