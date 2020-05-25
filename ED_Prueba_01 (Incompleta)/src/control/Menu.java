package control;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Validador validador = new Validador();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione la opcion a realizar.");
        System.out.println();
        System.out.println("1.- Registrar Estudiante");
        System.out.println("2.- Registrar Profesor");
        System.out.println("3.- Registrar Personal Administativo");
        System.out.println("4.- Imprimir Estudiantes");
        System.out.println("5.- Imprimir Profesores");
        System.out.println("6.- Imprimir Personal Administrativo");
        System.out.println("7.- Cerrar Programa");

        int opcn = validador.val();
        seleccion(opcn);
    }

    public void seleccion(int opcn) {
        RegistrarInformacion rg = new RegistrarInformacion();

        switch (opcn) {
            case 1:
                rg.registrarEstudiante();
                menu();
                break;
            case 2:
                rg.registrarProfesor();
                menu();
                break;
            case 3:
                rg.registrarPersonalAdministrativo();
                menu();
                break;
            case 4:
                menu();
                break;
            case 5:

                menu();
                break;
            case 6:
                menu();
                break;
            case 7:System.out.println("Usted ha seleccionado salir del programa, hasta pronto.");
                System.exit(0);
                break;

            default: menu();
                break;
        }
    }

}