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
public class AppCategories implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String comments;
    private Long appCategoryId;
    
    private Collection<AppNames> appNames;

    private Collection<BenchFamilies> benchFamilies;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    public Long getAppCategoryId() {
        return appCategoryId;
    }

    public void setAppCategoryId(Long id) {
        this.appCategoryId = id;
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
    
   @OneToMany(mappedBy="appCategories",cascade=CascadeType.ALL)
    public Collection<AppNames> getAppNames() {
        return appNames;
    }
    
    public void setAppNames(Collection<AppNames> appNames) {
        this.appNames = appNames;
    }
    
    @OneToMany(mappedBy="appCategories",cascade={CascadeType.ALL})
    public Collection<BenchFamilies> getBenchFamilies() {
        return benchFamilies;
    }

    public void setBenchFamilies(Collection<BenchFamilies> benchFamilies) {
        this.benchFamilies = benchFamilies;
    }
}
