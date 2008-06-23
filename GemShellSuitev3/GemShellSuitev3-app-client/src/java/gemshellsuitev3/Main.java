/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gemshellsuitev3;

import com.gemalto.gemshellsuitev3.ejb.entity.cdcproducts.AccessConditions;
import com.gemalto.gemshellsuitev3.ejb.entity.cdcproducts.AppFamilies;
import com.gemalto.gemshellsuitev3.ejb.session.stateless.factory.CdcProductsTestFactoryRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author nicolas
 */
public class Main 
{
    static CdcProductsTestFactoryRemote m_CdcProductsTestFactoryLocal;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try 
        {
            // TODO code application logic here
            InitialContext ic = new InitialContext();
            m_CdcProductsTestFactoryLocal = (CdcProductsTestFactoryRemote) ic.lookup("CdcProductsTestFactory");

            createAccessConditions();
        } 
        catch (NamingException ex) 
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void createAccessConditions() 
    {
        AccessConditions access1 = new AccessConditions();
        access1.setName("NOACCES");
        access1.setComments("No Access");
        m_CdcProductsTestFactoryLocal.persistObject(access1);
        
        AccessConditions access2 = new AccessConditions();
        access2.setName("SCAN");
        access2.setComments("SCAN List but no results");
        m_CdcProductsTestFactoryLocal.persistObject(access2);
        
        AccessConditions access3 = new AccessConditions();
        access3.setName("RESTRICTED");
        access3.setComments("SCAN + READ GEMPLUS");
        m_CdcProductsTestFactoryLocal.persistObject(access3);
        
        AccessConditions access4 = new AccessConditions();
        access4.setName("ALL");
        access4.setComments("RESTRICTED + COMPETITION");
        m_CdcProductsTestFactoryLocal.persistObject(access4);
        
        AccessConditions access5 = new AccessConditions();
        access5.setName("ADMIN");
        access5.setComments("ALL + ADMIN");
        m_CdcProductsTestFactoryLocal.persistObject(access5);
    }

}
