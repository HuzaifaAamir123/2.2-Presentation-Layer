package com.springboot.web21.Controllers;



import com.springboot.web21.DTO.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class Customer {




    @GetMapping("/just")
    String justCustomer(){
        return "This is Just Customer Request";
    }

    @GetMapping("/custObj")
    CustomerDTO customerObj(){
        return new CustomerDTO(1,"Huzaifa Aamir",22,1234L,"aamir@gmail.com");
    }

    @GetMapping("/{custId}")
    CustomerDTO customerById(@PathVariable(name = "custId") Integer id){

        return new CustomerDTO(id,"Maaz Omair",21,5678L,"maaz@gmail.com");
    }

    @GetMapping
    String paramReq(@RequestParam(name = "umar",required = false) Integer age){
        return "Age is "+age+" Sort By is ";
    }

    @PostMapping
    CustomerDTO Post(@RequestBody CustomerDTO inputCustomer){
        System.out.println("Post Method is Called");
        return inputCustomer;
    }

}
