package modelo;

public class Estudiante extends Persona {

    double promedio;

    public Estudiante(String nombre, String direccion, String numero, String RUN, double promedio) {
        super(nombre, direccion, numero, RUN);
        this.promedio = promedio;
    }

    public Estudiante() {

    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}
