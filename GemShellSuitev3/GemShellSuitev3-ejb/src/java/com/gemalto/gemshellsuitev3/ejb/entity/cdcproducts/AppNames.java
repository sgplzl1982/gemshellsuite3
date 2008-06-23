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
import javax.persistence.ManyToOne;

/**
 *
 * @author nicolas
 */
@Entity
public class AppNames implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String comments;

    private AppFamilies appfamilies;
    private AppCategories appCategories;
    
    private Long appNameId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    public Long getAppNameId() {
        return appNameId;
    }

    public void setAppNameId(Long id) {
        this.appNameId = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @ManyToOne
    public AppCategories getAppCategories() {
        return appCategories;
    }

    public void setAppCategories(AppCategories appCategories) {
        this.appCategories = appCategories;
    }

    @ManyToOne
    public AppFamilies getAppfamilies() {
        return appfamilies;
    }

    public void setAppfamilies(AppFamilies appfamilies) {
        this.appfamilies = appfamilies;
    }
}