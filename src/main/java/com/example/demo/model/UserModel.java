package com.example.demo.model;



public class UserModel {
    private Long id;
    private String name;
    private String password;
    private String email;


    public UserModel( Long id, String name, String password, String email ) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public UserModel() {

    }

    public Long getId() {
        return this.id;
    }

    public void setId( Long id ){
        this.id = id;

    }

    public String getName() {
        return this.name;
    }

    public void setName( String name ){
        this.name = name;

    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword( String password ){
        this.password = password;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail( String email ){
        this.email = email;
    }
}
