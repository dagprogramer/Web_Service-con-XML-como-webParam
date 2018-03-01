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
public class Colegio {
    private List<Curso>cursos;

    public Colegio() {
        cursos=new ArrayList<>();
    }
    
    public int cantidadEstudiantesCurso(String unCurso){
        int cantidadAlumnos=0;
        for (Curso curso : cursos) {
            if(curso.getNombreCurso().trim().equalsIgnoreCase(unCurso)){
                cantidadAlumnos=curso.getInscripciones().size();
            }
        }
        return cantidadAlumnos;
    }
    
    public int cantidadEstudiantesAprobados(String unCuso){
        int cantidadAlumnos=0;
        for (Curso curso : cursos) {
            if(curso.getNombreCurso().trim().equalsIgnoreCase(unCuso)){
                List<Inscripcion>insc=curso.getInscripciones();
            for (Inscripcion insc1 : insc) {
                if(insc1.getNota()>=curso.getNotaAprobacion()){
                    cantidadAlumnos++;
                }
            }
            }
        }
        return cantidadAlumnos;
    }
    
    public void agregarCurso(Curso c){
        cursos.add(c);
    }
}
