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
public class Prueba {
    public static void main(String[] args) {
        /*
        Materia[]materias=new Materia[2];
        materias[0]=new Materia("analisis", "tarde");
        materias[1]=new Materia("algoritmos", "mañana");
        
        ObtenerDatos obtener=new ObtenerDatos();
        List<Materia>listaMaterias=obtener.ingresarMaterias(materias);
        obtener.ingresarMaestro("diego", "guzman", listaMaterias);
        obtener.obtenerDatos();
        */        
        Maestro diego=new Maestro("diego", "guzman");
        Maestro daniel=new Maestro("daniel", "salgado");
        
        Materia analisis=new Materia("analisis", "tarde");
        Materia algoritmos=new Materia("algoritmos", "mañana");
        Materia fisica=new Materia("fisica", "noche");
        
        Maestro[]maestros=new Maestro[2];
        maestros[0]=diego;
        maestros[1]=daniel;
        
        List<Materia>listaMateriasDiego=new ArrayList<>();
        listaMateriasDiego.add(analisis);
        listaMateriasDiego.add(fisica);
        
        List<Materia>listaMateriasDaniel=new ArrayList<>();
        listaMateriasDaniel.add(algoritmos);
        listaMateriasDaniel.add(analisis);
        
        ObtenerGenericos obtenerGenericos=new ObtenerGenericos(maestros);
        Maestro maestroDiego=obtenerGenericos.seleccionarMaestro(0, listaMateriasDiego);
        Maestro MaestroDaniel=obtenerGenericos.seleccionarMaestro(1, listaMateriasDaniel);
        
        System.out.println("Datos maestro seleccionado");
        obtenerGenericos.imprimirDatos(maestroDiego);
        System.out.println();
        String nombreMateria="analisis";
        String turno="tarde";
        System.out.println("La materia: "+nombreMateria+",turno: "+turno);
        List<Maestro>lsita=obtenerGenericos.obtenerMaestroByMateria(nombreMateria, turno);
        obtenerGenericos.imprimirListaMaestros(lsita);
                
    }
    
    
    
}
