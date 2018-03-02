/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dao;

import ar.com.modelo.ProductoDeportivo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author yo
 */
public class ProductoDeportivoDao {
    private SessionFactory factory;

    public ProductoDeportivoDao(SessionFactory factory) {
        if(factory==null){
            throw new RuntimeException("Session cerrada");
        }
        this.factory = factory;
    }

    public SessionFactory getFactory() {
        return factory;
    }

    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }
    
    public void save(ProductoDeportivo p){
        Session session=null;
        Transaction tx=null;
        try {
            session=factory.openSession();
            tx=session.beginTransaction();
            session.save(p);
            tx.commit();
        } catch (HibernateException e) {
            if(tx!=null){
                tx.rollback();
            }
            throw e;
        }finally{
            if(session!=null){
                session.close();
            }
        }
    }
    
    public String getById(Integer id){
        Session session=factory.openSession();
        ProductoDeportivo p=(ProductoDeportivo) session.get(ProductoDeportivo.class, id);
        session.close();
        if(p!=null){
            return "Producto[codigo:"+p.getId()+",nombre:"+p.getNombre()+",precio:"+p.getPrecio()+",stock:"+p.getStock()+",descripcion:"+p.getDescripcion()+"]";
        }else{
            return "El producto de codigo:"+id+",no existe en la base de datos";
        }
    }
    
    public List<ProductoDeportivo>getLista(){
        Session session=factory.openSession();
        String query="from ProductoDeportivo";
        Query q=session.createQuery(query);
        List<ProductoDeportivo>lista=q.list();
        session.close();
        return lista;
    }
    
}
