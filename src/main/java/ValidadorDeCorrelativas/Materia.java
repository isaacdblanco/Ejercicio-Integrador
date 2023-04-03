package ValidadorDeCorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String Nombre;
    private List <Materia> correlativas;
    public Materia (String Nombre){
        this.Nombre = Nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public String getNombre() {
        return Nombre;
    }
    public void agregarCorrelativa (Materia Correlativa){
        this.correlativas.add(Correlativa);

    }
    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public boolean puedeCursar (Alumno alumno){
       /** El alumno puede cursar solamente si tiene TODAS (ya suena como un allMatch)
        *  las correlativas necesarias aprobadas.-
       **/
        return this.correlativas.stream().allMatch(materiaCorrelativa -> alumno.tenesCorrelativa(materiaCorrelativa));
    }

    public boolean tieneCorrelativas() {
        return !this.correlativas.isEmpty();
        /** Acá en éste método lo que tenemos que ver es que la coleccion de Correlativas
         * esté Vacia!!!!
         * Esto un poco mas artesanal tambien puede hacerse de la siguiente manera:
         * return this.correlativas.size() > 0;
        * */

    }
}
