/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gemalto.gemshellsuitev3.ejb.entity.cdcproducts;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author nicolas
 */
@Entity
public class Peoples implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private Long peoplesId;
    private String name;
    private String password;
    private String firstName;
    private String lastName;
    private String eMail;
    // private Teams teams;

    private Collection<BenchFrameworks> benchFrameworks;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return peoplesId;
    }

    public void setId(Long id) {
        this.peoplesId = id;
    }
    
    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @OneToMany(mappedBy="peoples",cascade={CascadeType.ALL})
    public Collection<BenchFrameworks> getBenchFrameworks() {
        return benchFrameworks;
    }

    public void setBenchFrameworks(Collection<BenchFrameworks> benchFrameworks) {
        this.benchFrameworks = benchFrameworks;
    }
}
