/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yo
 */
public class Curso {
    private String nombreCurso;
    private int cupo;
    private float notaAprobacion;
    private List<Inscripcion>inscripciones;

    public Curso(int cupo, float notaAprobacion) {
        inscripciones=new ArrayList<>();
        this.cupo = cupo;
        this.notaAprobacion = notaAprobacion;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
    public void agregarInscripcion(Inscripcion inscripcion){
        inscripciones.add(inscripcion);
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public float getNotaAprobacion() {
        return notaAprobacion;
    }
    
    
    
}
