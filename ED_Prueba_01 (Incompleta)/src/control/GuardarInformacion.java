package control;

import modelo.Apoderado;
import modelo.Estudiante;
import modelo.PersonalAdministrativo;
import modelo.Profesor;

import java.util.ArrayList;
import java.util.Date;

public class GuardarInformacion {
    Date fecha = new Date();
    public String mostrar;

    public ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();
    public ArrayList<Profesor> profesor = new ArrayList<Profesor>();
    public ArrayList<Apoderado> apoderado = new ArrayList<Apoderado>();
    public ArrayList<PersonalAdministrativo> pAdministrativo = new ArrayList<PersonalAdministrativo>();


    public void setMostrar(String mostrar) {
        this.mostrar = mostrar;
    }

    public String getMostrar() {
        return mostrar;
    }

    public void guardarAlumno(String nombre, String direccion, String numero, String RUN) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setDireccion(direccion);
        estudiante.setNumero(numero);
        estudiante.setRUN(RUN);

        this.estudiante.add(estudiante);
    }

    public void guardarProfesor(String nombre, String direccion, String numero, String RUN) {
        Profesor profesor = new Profesor();
        profesor.setNombre(nombre);
        profesor.setDireccion(direccion);
        profesor.setNumero(numero);
        profesor.setRUN(RUN);
        this.profesor.add(profesor);
    }

    public void guardarApoderado(String nombre, String direccion, String numero, String RUN) {
        Apoderado apoderado = new Apoderado();
        apoderado.setNombre(nombre);
        apoderado.setDireccion(direccion);
        apoderado.setNumero(numero);
        apoderado.setRUN(RUN);
    }

    public void guardarPersonalAdministrativo(String nombre, String direccion, String numero, String RUN) {
        PersonalAdministrativo pAdministrativo = new PersonalAdministrativo();
        pAdministrativo.setNombre(nombre);
        pAdministrativo.setDireccion(direccion);
        pAdministrativo.setNumero(numero);
        pAdministrativo.setRUN(RUN);
    }
}
