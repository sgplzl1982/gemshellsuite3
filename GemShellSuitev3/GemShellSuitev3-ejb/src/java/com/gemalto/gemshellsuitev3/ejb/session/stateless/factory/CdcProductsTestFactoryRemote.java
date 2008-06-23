/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gemalto.gemshellsuitev3.ejb.session.stateless.factory;

import javax.ejb.Remote;

/**
 *
 * @author nicolas
 */
@Remote
public interface CdcProductsTestFactoryRemote {
    
     void persistObject(Object object);

}
