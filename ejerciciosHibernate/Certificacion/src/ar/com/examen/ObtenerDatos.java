/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.examen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yo
 */
public class ObtenerDatos {
    private Maestro maestro;
    
    
    public ObtenerDatos() {
       maestro=new Maestro();
    }
    
    public void ingresarMaestro(String nombre,String apellido,List<Materia>materias){
        maestro.setNombre(nombre);
        maestro.setApellido(apellido);
        maestro.setMaterias(materias);
    }
    
    public List<Materia>ingresarMaterias(Materia[]materias){
        List<Materia>lista=new ArrayList<>();
        for (int i = 0; i < materias.length; i++) {
            lista.add(materias[i]);
        }
        return lista;
    }
    
    public void obtenerDatos(){
        System.out.println(maestro.toString());
        for (Materia materia:maestro.getMaterias()) {
            System.out.println(materia.toString());
        }
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }
    
    
    
}
