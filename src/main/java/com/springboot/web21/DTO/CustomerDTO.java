package com.springboot.web21.DTO;



public class CustomerDTO {

    private Integer id;
    private String name;
    private Integer age;
    private Long accNum;
    private String email;

    public CustomerDTO(Integer id, String name, Integer age, Long accNum, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.accNum = accNum;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getAccNum() {
        return accNum;
    }

    public String getEmail() {
        return email;
    }
}