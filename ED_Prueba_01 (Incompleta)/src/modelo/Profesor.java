package modelo;

public class Profesor extends Persona{

    int anioExperiencia;

    public Profesor(String nombre, String direccion, String numero, String RUN, int anioExperiencia) {
        super(nombre, direccion, numero, RUN);
        this.anioExperiencia = anioExperiencia;
    }

    public Profesor() {

    }

    public int getAnioExperiencia() {
        return anioExperiencia;
    }

    public void setAnioExperiencia(int anioExperiencia) {
        this.anioExperiencia = anioExperiencia;
    }

}
