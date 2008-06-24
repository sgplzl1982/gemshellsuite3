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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author nicolas
 */
@Entity
public class BenchFamilies implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long BenchFamiliesId;
    private String name;
    private String comments;    
    
    private Collection<BenchNames> benchNames;
    
    private AppCategories appCategories;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    public Long getId() {
        return BenchFamiliesId;
    }

    public void setId(Long id) {
        this.BenchFamiliesId = id;
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
    @JoinColumn(name="AppCategoriesId")
    public AppCategories getAppCategories() {
        return appCategories;
    }

    public void setAppCategories(AppCategories appCategories) {
        this.appCategories = appCategories;
    }
    
    @OneToMany(mappedBy="benchFamilies",cascade={CascadeType.ALL})
    public Collection<BenchNames> getBenchNames() {
        return benchNames;
    }

    public void setBenchNames(Collection<BenchNames> benchNames) {
        this.benchNames = benchNames;
    }
}
