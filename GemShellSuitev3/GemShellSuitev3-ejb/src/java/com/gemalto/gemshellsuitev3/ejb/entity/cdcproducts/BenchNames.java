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
public class BenchNames implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String name;
    private BenchFamilies benchFamilies;
    private String comments;
    // private States states;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @ManyToOne
    public BenchFamilies getBenchFamilies() {
        return benchFamilies;
    }

    public void setBenchFamilies(BenchFamilies benchFamilies) {
        this.benchFamilies = benchFamilies;
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
}
