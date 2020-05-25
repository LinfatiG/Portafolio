package control;

import java.util.Date;
import java.util.Scanner;

public class RegistrarInformacion {
    Validador validador = new Validador();
    GuardarInformacion gIformacion = new GuardarInformacion();
    Scanner teclado = new Scanner(System.in);
    Date fecha = new Date();

    public void registrarEstudiante() {
        String nombre, direccion, numero, RUN;
        System.out.println("Ingrese nombre");
        nombre = teclado.nextLine();
        if (!validador.validarNombre(nombre)){
            System.out.println("Asegúrese de ingresar el nombre de forma correcta. (Primera letra en mayúscula)");
        }
        System.out.println("Ingrese dirección");
        direccion = teclado.nextLine();
        if (!validador.validarTexto(direccion)) {
            System.out.println("Asegúrese de estar ingresando una dirección correcta. (Sin caracteres no alfanuméricos)");
        }
        System.out.println("Ingrese número celular");
        numero = teclado.nextLine();
        if (!validador.validarNumero(numero)){
            System.out.println("Asegúrese de ingresar un número correcto. (912345678)");
        }
        System.out.println("Ingrese RUN");
        RUN = teclado.nextLine();
        if (!validador.validarRut(RUN)){
            System.out.println("Asegúrese de estar ingresando un rut correcto. (Con punto y guión)");
        }

        if (!validador.validarNombre(nombre) || !validador.validarTexto(direccion) || !validador.validarNumero(numero) || !validador.validarRut(RUN)) {
            System.out.println("No se a registrado el estudiante.");
        } else {
            gIformacion.guardarAlumno(nombre, direccion, numero, RUN);
            System.out.println("El estudiante se ha registrado correctamente");
        }
    }

    public void registrarProfesor() {
        GuardarInformacion gIformacion = new GuardarInformacion();
        String nombre, direccion, numero, RUN;
        System.out.println("Ingrese nombre");
        nombre = teclado.nextLine();
        if (!validador.validarNombre(nombre)){
            System.out.println("Asegúrese de ingresar el nombre de forma correcta. (Primera letra en mayúscula)");
        }
        System.out.println("Ingrese dirección");
        direccion = teclado.nextLine();
        if (!validador.validarTexto(direccion)) {
            System.out.println("Asegúrese de estar ingresando una dirección correcta. (Sin caracteres no alfanuméricos)");
        }
        System.out.println("Ingrese número celular");
        numero = teclado.nextLine();
        if (!validador.validarNumero(numero)){
            System.out.println("Asegúrese de ingresar un número correcto. (912345678)");
        }
        System.out.println("Ingrese RUN");
        RUN = teclado.nextLine();
        if (!validador.validarRut(RUN)){
            System.out.println("Asegúrese de estar ingresando un rut correcto");
        }

        if (!validador.validarNombre(nombre) || !validador.validarTexto(direccion) || !validador.validarNumero(numero) || !validador.validarRut(RUN)) {
            System.out.println("No se a registrado el estudiante.");
        } else {
            gIformacion.guardarAlumno(nombre, direccion, numero, RUN);
            System.out.println("Asegúrese de estar ingresando un rut correcto. (Con punto y guión)");
        }
    }

    public void registrarPersonalAdministrativo() {
        GuardarInformacion gIformacion = new GuardarInformacion();
        String nombre, direccion, numero, RUN;
        System.out.println("Ingrese nombre");
        nombre = teclado.nextLine();
        if (!validador.validarNombre(nombre)){
            System.out.println("Asegúrese de ingresar el nombre de forma correcta. (Primera letra en mayúscula)");
        }
        System.out.println("Ingrese dirección");
        direccion = teclado.nextLine();
        if (!validador.validarTexto(direccion)) {
            System.out.println("Asegúrese de estar ingresando una dirección correcta. (Sin caracteres no alfanuméricos)");
        }
        System.out.println("Ingrese númweo celular");
        numero = teclado.nextLine();
        if (!validador.validarNumero(numero)){
            System.out.println("Asegúrese de ingresar un número correcto. (912345678)");
        }
        System.out.println("Ingrese RUN");
        RUN = teclado.nextLine();
        if (!validador.validarRut(RUN)){
            System.out.println("Asegúrese de estar ingresando un rut correcto. (Con punto y guión)");
        }

        if (!validador.validarNombre(nombre) || !validador.validarTexto(direccion) || !validador.validarNumero(numero) || !validador.validarRut(RUN)) {
            System.out.println("No se a registrado el estudiante.");
        } else {
            gIformacion.guardarAlumno(nombre, direccion, numero, RUN);
            System.out.println("El personal administrativo se ha registrado correctamente");
        }
    }

}
