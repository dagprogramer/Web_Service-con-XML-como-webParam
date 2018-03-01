/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.examen;

/**
 *
 * @author yo
 */
public class Materia {
    private String nombreMateria;
    private String turno;

    public Materia() {
    }

    public Materia(String nombreMateria, String turno) {
        this.nombreMateria = nombreMateria;
        this.turno = turno;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombreMateria=" + nombreMateria + ", turno=" + turno + '}';
    }
    
}
