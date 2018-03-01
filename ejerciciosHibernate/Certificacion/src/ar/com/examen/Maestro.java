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
public class Maestro {
    private String nombre;
    private String apellido;
    private List<Materia>materias;

    public Maestro() {
    }

    public Maestro(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Maestro{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
