package ValidadorDeCorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String Nombre;

    private String Legajo;
    private List <Materia> MateriasAprobadas;

    public Alumno(String nombre, String legajo) {
        this.Nombre = nombre;
        this.Legajo = legajo;
        this.MateriasAprobadas = new ArrayList<Materia>();
    }

    public String getNombre() {
        return Nombre;
    }

    public String getLegajo() {
        return Legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return MateriasAprobadas;
    }
    public void agregarMateriaAprobada(Materia materia){
        this.MateriasAprobadas.add(materia);
    }
    public boolean tenesCorrelativa(Materia materiaCorrelativa) {
    /**Aca vemos que la Clase Alumno tiene una coleccion de Materias Aprobadas,
     * con lo cual queda ver si la materia en cuestien esta dentro de esta coleccion.-
     * para esto podemos usar el metodo CONTAINS
     * */
     return this.MateriasAprobadas.contains(materiaCorrelativa);
    }
}
