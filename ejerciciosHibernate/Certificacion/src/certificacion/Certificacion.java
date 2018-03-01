/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;

/**
 *
 * @author yo
 */
public class Certificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Alumno alumno=new Alumno(26001344, "diego", "guzman", 39);
        Alumno alumno2=new Alumno(26001344, "diego", "guzman", 39);
        Alumno alumno3=new Alumno(23001344, "pablo", "guzman", 38);
        boolean info=alumno.equals(alumno3);
        System.out.println("El alumno ya existe? "+info);
        */
        Inscripcion inscripcion1=new Inscripcion();
        inscripcion1.setNota(9);
        
        Inscripcion inscripcion2=new Inscripcion();
        inscripcion2.setNota(2);
        
        Inscripcion inscripcion3=new Inscripcion();
        inscripcion3.setNota(10);
        
        Inscripcion inscripcion4=new Inscripcion();
        inscripcion4.setNota(6);
        
        Colegio colegio=new Colegio();
        Curso curso1=new Curso(12, 8);
        curso1.setNombreCurso("Cocina Mediterranea");
        curso1.agregarInscripcion(inscripcion1);
        curso1.agregarInscripcion(inscripcion2);
        curso1.agregarInscripcion(inscripcion3);
        curso1.agregarInscripcion(inscripcion4);
        
        Curso curso2=new Curso(20, 4);
        curso2.setNombreCurso("Pasteleria Francesa");
        
        Curso curso3=new Curso(10, 6);
        curso3.setNombreCurso("Cocina Asiatica");
        
        Curso curso4=new Curso(21, 7);
        curso4.setNombreCurso("Pastas Italianas");
        
        colegio.agregarCurso(curso1);
        colegio.agregarCurso(curso2);
        colegio.agregarCurso(curso3);
        colegio.agregarCurso(curso4);
        
        int cantidad=colegio.cantidadEstudiantesCurso("Cocina Mediterranea");
        System.out.println("La cantidad es de "+cantidad);
        
        int aprobados=colegio.cantidadEstudiantesAprobados("Cocina Mediterranea");
        System.out.println("La cantidad de aprobados es de: "+aprobados);
    }
    
}
