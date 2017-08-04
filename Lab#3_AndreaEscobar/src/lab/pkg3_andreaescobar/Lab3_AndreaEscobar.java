package lab.pkg3_andreaescobar;

import java.util.Scanner;

public class Lab3_AndreaEscobar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integrantes llamarInte = new Integrantes();
        System.out.println("MENU");
        System.out.println("1-Creacion Pueblo");
        System.out.println("2-Modificar Pueblo");
        System.out.println("3-Eliminar Pueblo");
        System.out.println("4-Crear Personaje");
        System.out.println("5-Modificar Personaje");
        System.out.println("6-Elminar personaje");
        System.out.println("Ingrese su opcion: ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                llamarInte.getNombreIntegrante();
                break;
        }
    }

}
