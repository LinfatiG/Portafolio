package control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validador {

    public boolean validarNombre(String nombre) {

        boolean validacion = false;
        try {
            if (nombre.matches("^[A-Z]{1}[A-zZ-a- ]*$")) {   // expresion regular para validar nombre
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    public boolean validarNumero(String contacto) {
        boolean validacion = false;
        try {
            if (contacto.matches("^[9]{1}[0-9]{8}$")) {   // exprecion regular para validar nombre
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    public boolean validarRut(String rut) {
        boolean validacion = false;

        try {
            if (rut.matches("^[0-9]{1,2}.[0-9]{3}.[0-9]{3}-(k|[0-9]{1})$")) { // exprecion regular para validar el rut
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    public int val () {
        int num = 0;
        boolean error;

        do {
            try {
                error = false;
                Scanner teclado = new Scanner(System.in);
                num = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El caracter ingresado no es numérico, intente de nuevo");
                error = true;
            }
        } while (error);
        return num;
    }

    public boolean validarTexto(String texto) {

        boolean validacion = false;
        try {
            if (texto.matches("^[A-zZ-a-0-9- ]*$")) { // exprecion regular para validar textos
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

}
