/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gemalto.gemshellsuitev3.ejb.session.stateless.factory;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nicolas
 */
@Stateless(name="CdcProductsTestFactory",mappedName="CdcProductsTestFactory")
public class CdcProductsTestFactoryBean implements CdcProductsTestFactoryLocal,
                                                   CdcProductsTestFactoryRemote
{
    @PersistenceContext
    public EntityManager m_EntityManager;
    
    public void persistObject(Object object) 
    {
        m_EntityManager.persist(object);
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "EJB Methods > Add Business Method" or "Web Service > Add Operation")
    
    
}
