package com.example.viewdata_recycleview;

public class Model {
    String name,email,dob,password,Id;

    public Model() {
    }

    public Model(String name, String email, String dob, String password, String id) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.password = password;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
