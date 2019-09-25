/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Arquivo.NewHibernateUtil;
import Model.Operador;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Edson Nhancale
 */
public class TodosDao<T> {
   public boolean salvar(T t){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        try {
            s.saveOrUpdate( t);
            tx.commit();
            return true;
                    
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        }
      finally {
            s.close();
            sf.close();
        }
    }
   
   public static List Listar(){
       SessionFactory sf = NewHibernateUtil.getSessionFactory();
       Session s = sf.openSession(); 
       List<Operador> lista =null;
       try {
           lista =  s.createQuery("from Funcionario").list();
       } catch (Exception e) {
       }finally{
s.close();
       }
       return lista;
   }
}
