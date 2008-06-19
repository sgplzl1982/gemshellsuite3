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

/**
 *
 * @author nicolas
 */
@Entity
public class AccessConditions implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String comments;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accessConditionsID;

    public Long getAccessConditionsId() {
        return accessConditionsID;
    }

    public void setAccessConditionsId(Long id) {
        this.accessConditionsID = id;
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
