package com.training.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "accountId")
    private Long accountId;

    public User(){

    }

    public User(String firstname, String lastname, long accountId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.accountId = accountId;
    }

    public int getId() { return id; }
    public void setId() { this.id = id; }

    public String getFirstname(){ return firstname; }
    public void setFirstname() { this.firstname = firstname; }

    public String getLastname(){ return lastname; }
    public void setLastname(){ this.lastname = lastname; }

    public Long getAccountId(){ return accountId; }
    public void setAccountId(){ this.accountId = accountId; }


}
