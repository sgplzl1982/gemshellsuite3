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
public class States implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private Long stateId;
    private String name;
    private String comments;
    
    private Collection<BenchFrameworks> benchFrameworks;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return stateId;
    }

    public void setId(Long id) {
        this.stateId = id;
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

    @OneToMany(mappedBy="states",cascade={CascadeType.ALL})
    public Collection<BenchFrameworks> getBenchFrameworks() {
        return benchFrameworks;
    }

    public void setBenchFrameworks(Collection<BenchFrameworks> benchFrameworks) {
        this.benchFrameworks = benchFrameworks;
    }
}
