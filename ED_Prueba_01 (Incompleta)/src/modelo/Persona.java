package modelo;

import java.util.Date;

public class Persona {

    public String nombre;
    public String direccion;
    public String numero;
    public String RUN;
    Date fechaIngreso = new Date();

    public Persona(String nombre, String direccion, String numero, String RUN) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
        this.RUN = RUN;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

}
