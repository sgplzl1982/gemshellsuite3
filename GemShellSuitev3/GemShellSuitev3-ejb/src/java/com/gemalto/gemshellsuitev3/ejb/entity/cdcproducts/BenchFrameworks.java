/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gemalto.gemshellsuitev3.ejb.entity.cdcproducts;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nicolas
 */
@Entity
public class BenchFrameworks implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long BenchFrameworksId;
    private String name;
    private BenchNames benchNames;
    private int version;
    private int release;
    // private Uses uses;
    // private Consumption consumption
    // private States states
    // private Peoples peoples
    private Date created;
    private String comments;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return BenchFrameworksId;
    }

    public void setId(Long id) {
        this.BenchFrameworksId = id;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Temporal(TemporalType.DATE)
    public Date getCreated() {
        return created;  
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    
    @ManyToOne
    @JoinColumn(name="BenchNamesId")
    public BenchNames getBenchNames() {
        return benchNames;
    }

    public void setBenchNames(BenchNames benchNames) {
        this.benchNames = benchNames;
    }
}