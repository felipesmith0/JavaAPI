package com.example.demo.dto;

public class UserDTO {

    private Long id;
    private String name;
    private String password;
    private String email;


    public UserDTO( Long id, String name, String password, String email ) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public UserDTO (){

    }

    public Long getId() {
        return this.id;
    }

    public void setId( Long id ){
        this.id = id;

    }
}
