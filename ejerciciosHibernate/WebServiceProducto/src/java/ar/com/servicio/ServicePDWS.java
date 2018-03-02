/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.servicio;

import ar.com.dao.ProductoDeportivoDao;
import ar.com.manager.SessionManager;
import ar.com.modelo.ProductoDeportivo;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.hibernate.SessionFactory;

/**
 *
 * @author yo
 */
@WebService(serviceName = "ServicePDWS")
public class ServicePDWS {
private SessionFactory factory=SessionManager.getSession();
    
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ingrearProducto")
    public String ingrearProducto(@WebParam(name = "parametros")Parametros parametros) {
        ProductoDeportivo productoDeportivo=new ProductoDeportivo(parametros.getNombre(), parametros.getPrecio(), parametros.getStock(), parametros.getDescripcion());
        
        ProductoDeportivoDao dao=new ProductoDeportivoDao(factory);
        dao.save(productoDeportivo);
        return "El producto ha sido ingresado en la base de datos";
    }
    
    @WebMethod(operationName = "obtenerProducto")
    public String obtenerProducto(@WebParam(name = "id")Integer id){
        ProductoDeportivoDao dao=new ProductoDeportivoDao(factory);
        return dao.getById(id);
    }
    
}
