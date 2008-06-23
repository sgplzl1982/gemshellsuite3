/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gemalto.gemshellsuitev3.ejb.entity.cdcproducts;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author nicolas
 */
@Entity
public class AppTypes implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String comment;
    private AppNames appNames;    
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @ManyToOne
    @JoinColumn(name="AppNamesId")
    public AppNames getAppNames() {
        return appNames;
    }

    public void setAppNames(AppNames appNames) {
        this.appNames = appNames;
    }

}
