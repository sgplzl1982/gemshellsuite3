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
public class BenchNames implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long BenchNamesId;
    private String name;
    private BenchFamilies benchFamilies;
    private String comments;
    private States states;
    
    private Collection<BenchFrameworks> benchFrameworks;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return BenchNamesId;
    }
    
    public void setId(Long id) {
        this.BenchNamesId = id;
    }
    
    @ManyToOne(cascade={CascadeType.REMOVE,CascadeType.PERSIST})
    @JoinColumn(name="BenchFamiliesId")
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
    
     @OneToMany(mappedBy="benchNames",cascade={CascadeType.ALL})
    public Collection<BenchFrameworks> getBenchFrameworks() {
        return benchFrameworks;
    }

    public void setBenchFrameworks(Collection<BenchFrameworks> benchFrameworks) {
        this.benchFrameworks = benchFrameworks;
    }
    
    @ManyToOne
    @JoinColumn(name="StatesId")
    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }
}
