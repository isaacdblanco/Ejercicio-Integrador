package ValidadorDeCorrelativas;

import java.time.LocalDate;

public class Inscripcion {

    private Alumno alumno;
    private Materia materia;

    private LocalDate fecha;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = LocalDate.now();
    }

    public Alumno getAlumno() {
        return alumno;
    }
    public Materia getMateria() {
        return materia;
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public boolean apobada (){
        /**
         * Se puede ver como (true) si la materia NO TIENE CORRELATIVAS O
         * si TAMBIEN (true) TENIENDO CORRELATIVAS  el alumno las TIENE TODAS
         * */
        return !this.materia.tieneCorrelativas() || this.materia.puedeCursar(this.alumno);


    }
}
