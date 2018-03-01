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
public class ObtenerGenericos {
    private Maestro[]maestros;

    public ObtenerGenericos() {
    }

    public ObtenerGenericos(Maestro[] maestros) {
        this.maestros = maestros;
    }
    
    private List<Maestro>agregarMaestros(){
        List<Maestro>lista=new ArrayList<>();
        for (int i = 0; i < maestros.length; i++) {
            lista.add(maestros[i]);
        }
        return lista;
    }
   
    private List<Materia>agregarMateriaAlProfesor(List<Materia>materias){
        List<Materia>listaMateriasProfesor=new ArrayList<>();
        for (int i = 0; i < materias.size(); i++) {
            listaMateriasProfesor.add(materias.get(i));
        }
        return listaMateriasProfesor;
    }
    
    public Maestro seleccionarMaestro(int indiceProfesor,List<Materia>listaMateriasProfesor){
        List<Maestro>listaMaestro=agregarMaestros();
        Maestro maestroSeleccionado=listaMaestro.get(indiceProfesor);
        maestroSeleccionado.setMaterias(agregarMateriaAlProfesor(listaMateriasProfesor));
        return maestroSeleccionado;
    }
    
    public void imprimirDatos(Maestro maestro){
        int contador=1;
        System.out.println(maestro.toString()+",dicta las materias: ");
        for(Materia materia:maestro.getMaterias()){
            System.out.println(contador+": "+materia.toString());
            contador++;
        }
    }
    
    public List<Maestro>obtenerMaestroByMateria(String nombreMateria,String turno){
        List<Maestro>nuevaLista=new ArrayList<>();
        List<Maestro>listaCompleta=agregarMaestros();
        for(Maestro maestro:listaCompleta){
            List<Materia>listaMateria=maestro.getMaterias();
            for(Materia materia:listaMateria){
                if(materia.getNombreMateria().trim().equalsIgnoreCase(nombreMateria) && materia.getTurno().trim().equalsIgnoreCase(turno)){
                    nuevaLista.add(maestro);
                }
            }
        }
        return nuevaLista;
    }
    
    public void imprimirListaMaestros(List<Maestro>lista){
        int contador=0;
        for (Maestro lista1 : lista) {
            System.out.println(contador+": "+lista1.toString());
            contador++;
        }
    }
    
    public Maestro[] getMaestros() {
        return maestros;
    }

    public void setMaestros(Maestro[] maestros) {
        this.maestros = maestros;
    }
    
    
}
