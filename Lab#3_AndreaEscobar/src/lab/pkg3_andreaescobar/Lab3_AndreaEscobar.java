package lab.pkg3_andreaescobar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Lab3_AndreaEscobar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp = 's';
        //Integrantes llamarInte = new Integrantes();
        Random r = new Random();
        Bestias beast = new Bestias();
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
                        System.out.println("Ingrese año de nacimiento: ");
                        int año = sc.nextInt();
                        System.out.println("Ingrese mes de nacimiento: ");
                        int mes = sc.nextInt();
                        System.out.println("Ingrese dia de nacimiento: ");
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
                        int poderataque=0;
                        int defensa=0;
                        int curacion=0;
                        String bestia = "";
                        switch (opcpers) {
                            case 1:
                                System.out.println("Eligio Elfo");
                                System.out.println("¿Desea poseer un arma? S/N");
                                char arma = sc.next().charAt(0);
                                int ataque1 = 443,
                                 defensa1 = 150,
                                 curacion1 = 335;
                                if (arma == 's' || arma == 'S') {
                                    ataque1 = ataque1 + 10;
                                    defensa1 = defensa1 + 10;
                                    curacion1 = curacion1 + 10;
                                }
                                poderataque = ataque1;
                                defensa = defensa1;
                                curacion = curacion1;
                                break;

                            case 2:
                                System.out.println("Eligio Enano");
                                System.out.println("¿Desea poseer barba? S/N");
                                char barba = sc.next().charAt(0);
                                System.out.println("¿Desea poseer hacha? S/N");
                                char hacha = sc.next().charAt(0);
                                int ataqueEnano = 300,
                                 defensaEnano = 200,
                                 curacionEnano = 50;
                                if (barba == 's' || barba == 'S') {
                                    ataqueEnano = ataqueEnano + 50;
                                }
                                if (hacha == 's' || hacha == 'S') {
                                    ataqueEnano = ataqueEnano + 50;
                                }
                                poderataque = ataqueEnano;
                                defensa = defensaEnano;
                                curacion = curacionEnano;
                                break;
                            case 3:
                                System.out.println("Eligio Hobbit");
                                int ataqueHobbit = 10,
                                 defensaHobbit = 100,
                                 curacionHobbit = 1;
                                System.out.println("Ingrese cuantos anillos tiene 0-10: ");
                                int anillos = sc.nextInt();
                                if (anillos > 10 || anillos < 0) {
                                    System.out.println("Ingrese un valor entre el rango");
                                } else {
                                    ataqueHobbit = (ataqueHobbit + (40 * anillos));
                                    defensaHobbit = (defensaHobbit + (40 * anillos));
                                    curacionHobbit = (defensaHobbit + (40 * anillos));
                                }
                                poderataque = ataqueHobbit;
                                defensa = defensaHobbit;
                                curacion = curacionHobbit;
                                break;
                            case 4:
                                System.out.println("Eligio Hombre");
                                int ataqueHombre = 150,
                                 defensaHombre = 140,
                                 curacionHombre = 50;
                                System.out.println("Elija un arma: ");
                                System.out.println("1-Espada");
                                System.out.println("2-Lanza");
                                System.out.println("3-Arco");
                                int opcarma = sc.nextInt();
                                switch (opcarma) {
                                    case 1:
                                        ataqueHombre = ataqueHombre + 150;
                                        break;
                                    case 2:
                                        ataqueHombre = ataqueHombre + 100;
                                        break;
                                    case 3:
                                        ataqueHombre = ataqueHombre + 115;
                                        break;
                                }
                                poderataque = ataqueHombre;
                                defensa = defensaHombre;
                                curacion = curacionHombre;
                                break;
                            case 5:
                                System.out.println("Eligio Maiar");
                                System.out.println("Elija un item");
                                System.out.println("1-Sombrero");
                                System.out.println("2-Baston");
                                System.out.println("Elija su opcion: ");
                                char item = sc.next().charAt(0);
                                switch (item) {
                                    case 1:
                                        int ataque5 = 200,
                                         curacion5 = 200;
                                        poderataque = ataque5;
                                        defensa = 0;
                                        curacion = curacion5;
                                        break;
                                    case 2:
                                        ataque5 = 200;
                                        curacion5 = 250;
                                        poderataque = ataque5;
                                        defensa =0;
                                        curacion = curacion5;
                                        break;
                                }
                        }
                        int vida;
                        boolean veneno;
                        System.out.println("Que bestia desea tener");
                        System.out.println("1- Aguilas");
                        System.out.println("2- Arana");
                        System.out.println("3- Balrogs");
                        System.out.println("4- Bestias Aladas");
                        System.out.println("5- Dragones");
                        int opbestia = sc.nextInt();
                        System.out.println("Ingrese numero de garras");
                        int garras = sc.nextInt();
                        System.out.println("Desea veneno [S/N]");
                        char venenoc = sc.next().charAt(0);
                        if (venenoc == 's' || venenoc == 'S') {
                            veneno = true;
                        } else {
                            veneno = false;
                        }
                        switch (opbestia) {
                            case 1:
                                bestia = "Aguila";
                                beast.garras = garras;
                                beast.vida = 50 + r.nextInt(150);
                                break;
                            case 2:
                                bestia = "Arana";
                                beast.garras = garras;
                                beast.veneno = veneno;
                                System.out.println("F/M");
                                char sex = sc.next().charAt(0);
                                if (sex == 'F' || sex == 'f') {
                                    beast.vida = (50 + r.nextInt(150)) + 50;
                                }
                                break;
                            case 3:
                                beast.garras = garras;
                                beast.veneno = veneno;
                                beast.vida = 50 + r.nextInt(150);
                                bestia = "Balrogs";
                                break;
                            case 4:
                                beast.garras = garras;
                                beast.veneno = veneno;
                                beast.vida = 50 + r.nextInt(150);
                                bestia = "Bestias Aladas";
                                break;
                            case 5:
                                beast.garras = garras;
                                beast.veneno = veneno;
                                beast.vida = 50 + r.nextInt(150);
                                bestia = "Dragones";
                                break;
                        }
                        integrante.add(new Integrantes(nombreint, apellido, altura, fecha, poderataque, defensa, curacion, bestia));
                        System.out.println(integrante);
                        System.out.println("Desea agregar otro peronaje [S/N]");
                        resp = sc.next().charAt(0);
                    }

            }
            System.out.println("Desea continuar [S/N]");
            resp = sc.next().charAt(0);
        }
    }

}
