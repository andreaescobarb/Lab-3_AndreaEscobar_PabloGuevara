package lab.pkg3_andreaescobar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lab3_AndreaEscobar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp = 's';
        //Integrantes llamarInte = new Integrantes();
        ArrayList<Pueblo> pueblo = new ArrayList();
        ArrayList<Integrantes> integrante = new ArrayList();
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
                case 4:
                    for (int i = 0; i < pueblo.size(); i++) {
                        if (pueblo.get(i) instanceof Pueblo) {

                            System.out.println(pueblo.get(i));
                        }
                        if (pueblo.get(i).getClass().getSimpleName().equals("Integer")) {
                            System.out.println(pueblo.get(i));
                        }
                    }
                    break;
                case 5:
                    char resp2 = 's';
                    while (resp2 == 's' || resp2 == 'S') {
                        System.out.println("Ingrese nombre: ");
                        String nombreint = sc.next();
                        System.out.println("Ingrese apellido: ");
                        String apellido = sc.next();
                        System.out.println("Ingrese altura:");
                        double altura = sc.nextDouble();
                        System.out.println("Fecha año de nacimiento: ");
                        int año = sc.nextInt();
                        System.out.println("Fecha mes de nacimiento: ");
                        int mes = sc.nextInt();
                        System.out.println("Fecha dia de nacimiento: ");
                        int dia = sc.nextInt();
                        Calendar c = new GregorianCalendar(año, mes, dia);
                        Date fecha = c.getTime();
                        System.out.println("Que personaje desea ser: ");
                        System.out.println("1-Elfos");
                        System.out.println("2-Enanos");
                        System.out.println("3-Hobbits");
                        System.out.println("4-Hombres");
                        System.out.println("5-Maimar");
                        System.out.println("Ingrese numero a elegir: ");
                        int opcpers = sc.nextInt();
                        switch (opcpers) {
                            case 1:
                                System.out.println("Eligio Elfo");
                                System.out.println("¿Desea poseer un arma? S/N");
                                char arma = sc.next().charAt(0);
                                int ataque = 443,
                                 defensa = 150,
                                 curacion = 335;
                                if (arma == 's' || arma == 'S') {
                                    ataque = ataque + 10;
                                    defensa = defensa + 10;
                                    curacion = curacion + 10;
                                }
                                break;

                            case 2:
                                System.out.println("Eligio Enano");
                                System.out.println("¿Desea poseer barba? S/N");
                                char barba = sc.next().charAt(0);
                                System.out.println("¿Desea poseer hacha? S/N");
                                char hacha = sc.next().charAt(0);
                                int ataqueEnano = 443,
                                 defensaEnano = 150,
                                 curacionEnano = 335;
                                if (barba == 's' || barba == 'S') {
                                    ataque = ataqueEnano + 10;
                                    defensa = defensaEnano + 10;
                                    curacion = curacionEnano + 10;
                                }
                                if (hacha == 's' || hacha == 'S') {
                                    ataque = ataqueEnano + 10;
                                    defensa = defensaEnano + 10;
                                    curacion = curacionEnano + 10;
                                }
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;

                        }
                        //integrante.add(new Integrantes(nombreint, apellido, altura, fecha));

                    }
                    break;

            }
            System.out.println("Desea continuar [S/N]");
            resp = sc.next().charAt(0);
        }
    }

}
