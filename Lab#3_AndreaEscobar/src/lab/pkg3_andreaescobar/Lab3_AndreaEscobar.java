package lab.pkg3_andreaescobar;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_AndreaEscobar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp = 's';
        Integrantes llamarInte = new Integrantes();
        ArrayList<Pueblo> pueblo = new ArrayList();
        while (resp == 's' || resp == 'S') {
            System.out.println("MENU");
            System.out.println("1-Creacion Pueblo");
            System.out.println("2-Modificar Pueblo");
            System.out.println("3-Eliminar Pueblo");
            System.out.println("4-Mostrar Pueblos");
            System.out.println("5-Crear Personaje");
            System.out.println("6-Modificar Personaje");
            System.out.println("7-Elminar personaje");
            System.out.println("8-Motrar Personajes");
            System.out.println("Ingrese su opcion: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    resp = 's';
                    while (resp == 's' || resp == 'S') {
                        System.out.println("Ingrese nombre de pueblo");
                        String pueb = sc.next();
                        pueblo.add(new Pueblo(pueb));
                        System.out.println("Desea agregar otro pueblo [S/N]");
                        resp = sc.next().charAt(0);
                    }
                   // System.out.println(pueblo);
                    break;

                case 2:
                    resp = 's';
                    while (resp == 's' || resp == 'S') {
                        System.out.println(pueblo);
                        System.out.println("Ingrese la posicion del pueblo que desea modificar");
                        int pos = sc.nextInt();
                        System.out.println("Ingrese nuevo nombre");
                        String modify = sc.next();
                        pueblo.set(pos, new Pueblo(modify));
                        System.out.println("Desea modificar otro pueblo [S/N]");
                        resp = sc.next().charAt(0);
                    }
                   
                    break;
                    
                case 3:
                    resp = 's';
                    while (resp == 's' || resp == 'S') {
                        System.out.println(pueblo);
                        System.out.println("Ingrese posicion de pueblo que desea eliminar");
                        int pos = sc.nextInt();
                        pueblo.remove(pos);
                        System.out.println(pueblo);
                        System.out.println("Desea eliminar otro pueblo [S/N]");
                        resp = sc.next().charAt(0);
                    }
                    
                    break;
                    
            }
            System.out.println("Desea continuar [S/N]");
            resp = sc.next().charAt(0);
        }
    }

}
