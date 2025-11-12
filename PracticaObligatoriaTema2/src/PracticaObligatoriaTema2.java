import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class PracticaObligatoriaTema2 {
    static void main() {
        //Definir variables
        Scanner s = new Scanner(System.in);
        String user, password, selecMenu , selecMenu2 = " ",selecHabitacion ;
        final String ADMIN_USER = "admin", ADMIN_PASSWORD = "admin";
        boolean selecValida,habitacion1Doble = false,habitacion2Doble = false,habitacion3Doble = false,habitacion4Doble = false,habitacion5Doble = false,habitacion6Doble = false,habitacion7Doble = false,habitacion8Doble = false,reservaHecha = false;
        boolean habitacion1Ind = false,habitacion2Ind = false,diaValido = false;
        LocalDate inicioHabitacion101,inicioHabitacion102,inicioHabitacion201,inicioHabitacion202,inicioHabitacion203,inicioHabitacion204,inicioHabitacion205,inicioHabitacion206,inicioHabitacion207,inicioHabitacion208,fechaSalida,inicioOcupacion;
        int numeroReserva101 = 0,numeroReserva102 = 0,numeroReserva201 = 0,numeroReserva202 = 0,numeroReserva203 = 0,numeroReserva204 = 0,numeroReserva205 = 0,numeroReserva206 = 0,numeroReserva207 = 0,numeroReserva208 = 0,numeroReservaActual = 1,caracterValido,numMultiplicamos = 1,diaSalida,mesSalida,anioSalida,numeroReserva = 0,pax = 1,tarifa = 0,billete50E = 300,billete20E = 25,billete10E = 25,billete5E = 15,moneda2E = 23,moneda1E = 80,moneda50Cent = 23,moneda20Cent = 22,moneda10Cent = 15,moneda5Cent = 9,moneda2Cent = 41,moneda1Cent = 73;
        int billete50ED,billete20ED,billete10ED,billete5ED,moneda2ED,moneda1ED,moneda50CentD,moneda20CentD,moneda10CentD,moneda5CentD,moneda2CentD,moneda1CentD;
        final int ANIO_ACTUAL = 2025,MES_MAX = 12,TARIFA_IND = 45,TARIFA_DOBLE = 60;
        final double IBA = 0.21;
        double precioFinal,ibaAPagar,dineroIntroducido,cambio,ingresos = 0;
        long noches,monto;
        String nombre101 ="",nombre102 ="",nombre201 ="",nombre202 ="",nombre203 = "",nombre204 = "",nombre205 = "",nombre206 = "",nombre207 = "",nombre208 = "",nombre = "";

        //Iniciamos variables porque Intelli se pone nerviosa
        inicioHabitacion101 = null;
        inicioHabitacion102 = null;
        inicioHabitacion201 = null;
        inicioHabitacion202 = null;
        inicioHabitacion203 = null;
        inicioHabitacion204 = null;
        inicioHabitacion205 = null;
        inicioHabitacion206 = null;
        inicioHabitacion207 = null;
        inicioHabitacion208 = null;
        inicioOcupacion = null;

        //Creamos el bucle del menu
        do{
            //Pintar el menu
            System.out.print("""
                    ╔══════════════════════════════════════════════════╗
                    ║                                                  ║
                    ║              HOTEL CIUDAD DE MARTOS              ║
                    ║                                                  ║
                    ╠══════════════════════════════════════════════════╣
                    ║ a. Ver el estado de ocupación de las habitaciones║
                    ║ b. Reservar una habitación                       ║
                    ║ c. Realizar el checkout de una habitación        ║
                    ║ d. Menú de Administrador                         ║
                    ╚══════════════════════════════════════════════════╝
                     Elige una opción:\s""");
            selecMenu = s.nextLine();
            selecMenu = selecMenu.toLowerCase();


            //Programación del menu
            switch (selecMenu){
                case "a":

                    //Muestra si cada habitación está libre o ocupada junto con el nombre de la persona que ha reservado
                    System.out.println("Has escogido la opción: Ver el estado de ocupación de las habitaciones");
                    System.out.println("\\ Ocupación del hotel //");
                    System.out.println((habitacion1Ind ? "La habitación 101 está ocupada por " + nombre101 : "La habitación 101 está libre"));
                    System.out.println((habitacion2Ind ? "La habitación 102 está ocupada por " + nombre102 : "La habitación 102 está libre"));
                    System.out.println((habitacion1Doble ? "La habitación 201 está ocupada por " + nombre201 : "La habitación 201 está libre"));
                    System.out.println((habitacion2Doble ? "La habitación 202 está ocupada por " + nombre202 : "La habitación 202 está libre"));
                    System.out.println((habitacion3Doble ? "La habitación 203 está ocupada por " + nombre203 : "La habitación 203 está libre"));
                    System.out.println((habitacion4Doble ? "La habitación 204 está ocupada por " + nombre204 : "La habitación 204 está libre"));
                    System.out.println((habitacion5Doble ? "La habitación 205 está ocupada por " + nombre205 : "La habitación 205 está libre"));
                    System.out.println((habitacion6Doble ? "La habitación 206 está ocupada por " + nombre206 : "La habitación 206 está libre"));
                    System.out.println((habitacion7Doble ? "La habitación 207 está ocupada por " + nombre207 : "La habitación 207 está libre"));
                    System.out.println((habitacion8Doble ? "La habitación 208 está ocupada por " + nombre208 : "La habitación 208 está libre"));

                    //Limpia la pantalla
                    System.out.println("Pulsa cualquier botón para salir... ");
                    s.nextLine();
                    for (int i = 0; i < 100; i++) {
                        System.out.println();
                    }
                    break;
                case "b":
                    //Reserva de una habitación
                    System.out.println("Has escogido la opción: Reservar una habitación");
                    do {

                        //Selección de la habitación
                        System.out.print("Selecciona una habitación (Introduce solo el número): ");
                        selecHabitacion = s.nextLine();

                        //Comprobación y reserva de la habitación seleccionada
                        switch (selecHabitacion) {
                            case "101"://Habitación 101
                                selecValida = true;
                                if (!habitacion1Ind) {
                                    //Si la habitación está libre
                                    System.out.println("Has seleccionado la habitación 101");
                                    //Pedimos nombre de quien está a cargo
                                    do {
                                        caracterValido = 0;
                                    System.out.print("Introduce el nombre de la persona a cargo de la reserva: ");
                                    nombre101 = s.nextLine();
                                    //Validamos el nombre
                                        for (int i = 0; i < nombre101.length(); i++) {
                                            if (Character.isLetter(nombre101.charAt(i)) || Character.isWhitespace(nombre101.charAt(i)))
                                                caracterValido++;
                                        }
                                        if (caracterValido != nombre101.length() || nombre101.length() < 3) System.out.println("Nombre no válido");
                                    }while(caracterValido != nombre101.length() || nombre101.length() < 3);
                                    //Guardamos la fecha y marcamos la habitación como ocupada
                                    inicioHabitacion101 = LocalDate.now();
                                    habitacion1Ind = true;
                                    numeroReserva101 = numeroReservaActual;
                                    reservaHecha = true;//Sirve para activar la animación de reserva finalizada
                                } else {
                                    //Si la habitación está ocupada
                                    System.out.println("La habitación esta ocupada");
                                    System.out.println("Pulsa cualquier botón para salir... ");
                                    s.nextLine();
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                }
                                break;
                            case "102":
                                selecValida = true;
                                if (!habitacion2Ind) {
                                    //Si la habitación está libre
                                    System.out.println("Has seleccionado la habitación 102");
                                    //Pedimos nombre de quien está a cargo
                                    do {
                                        caracterValido = 0;

                                        System.out.print("Introduce el nombre de la persona a cargo de la reserva: ");
                                        nombre102 = s.nextLine();
                                        //Validamos el nombre
                                        for (int i = 0; i < nombre102.length(); i++) {
                                            if (Character.isLetter(nombre102.charAt(i)) || Character.isWhitespace(nombre102.charAt(i)))
                                                caracterValido++;
                                        }
                                        if (caracterValido != nombre102.length() || nombre102.length() < 3) System.out.println("Nombre no válido");
                                    }while(caracterValido != nombre102.length() || nombre102.length() < 3);

                                    //Guardamos la fecha y marcamos la habitación como ocupada
                                    inicioHabitacion102 = LocalDate.now();
                                    habitacion2Ind = true;
                                    numeroReserva102 = numeroReservaActual;
                                    reservaHecha = true;
                                } else {
                                    //Si la habitación está ocupada
                                    System.out.println("La habitación esta ocupada");
                                    System.out.println("Pulsa cualquier botón para salir... ");
                                    s.nextLine();
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                }
                                break;
                            case "201":
                                selecValida = true;
                                if (!habitacion1Doble) {
                                    //Si la habitación está libre
                                    System.out.println("Has seleccionado la habitación 201");
                                    //Pedimos nombre de quien está a cargo
                                    do {
                                        caracterValido = 0;

                                        System.out.print("Introduce el nombre de la persona a cargo de la reserva: ");
                                        nombre201 = s.nextLine();
                                        //Validamos el nombre
                                        for (int i = 0; i < nombre201.length(); i++) {
                                            if (Character.isLetter(nombre201.charAt(i)) || Character.isWhitespace(nombre201.charAt(i)))
                                                caracterValido++;
                                        }
                                        if (caracterValido != nombre201.length() || nombre201.length() < 3) System.out.println("Nombre no válido");
                                    }while(caracterValido != nombre201.length() || nombre201.length() < 3);

                                    //Guardamos la fecha y marcamos la habitación como ocupada
                                    inicioHabitacion201 = LocalDate.now();
                                    habitacion1Doble = true;
                                    numeroReserva201 = numeroReservaActual;
                                    reservaHecha = true;
                                } else {
                                    //Si la habitación está ocupada
                                    System.out.println("La habitación esta ocupada");
                                    System.out.println("Pulsa cualquier botón para salir... ");
                                    s.nextLine();
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                }
                                break;
                            case "202":
                                selecValida = true;
                                if (!habitacion2Doble) {
                                    //Si la habitación está libre
                                    System.out.println("Has seleccionado la habitación 202");
                                    //Pedimos nombre de quien está a cargo
                                    do {
                                        caracterValido = 0;

                                        System.out.print("Introduce el nombre de la persona a cargo de la reserva: ");
                                        nombre202 = s.nextLine();
                                        //Validamos el nombre
                                        for (int i = 0; i < nombre202.length(); i++) {
                                            if (Character.isLetter(nombre202.charAt(i)) || Character.isWhitespace(nombre202.charAt(i)))
                                                caracterValido++;
                                        }
                                        if (caracterValido != nombre202.length() || nombre202.length() < 3) System.out.println("Nombre no válido");
                                    }while(caracterValido != nombre202.length() || nombre202.length() < 3);

                                    //Guardamos la fecha y marcamos la habitación como ocupada
                                    inicioHabitacion202 = LocalDate.now();
                                    habitacion2Doble = true;
                                    numeroReserva202 = numeroReservaActual;
                                    reservaHecha = true;
                                } else {
                                    //Si la habitación está ocupada
                                    System.out.println("La habitación esta ocupada");
                                    System.out.println("Pulsa cualquier botón para salir... ");
                                    s.nextLine();
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                }
                                break;
                            case "203":
                                selecValida = true;
                                if (!habitacion3Doble) {
                                    //Si la habitación está libre
                                    System.out.println("Has seleccionado la habitación 203");
                                    //Pedimos nombre de quien está a cargo
                                    do {
                                        caracterValido = 0;

                                        System.out.print("Introduce el nombre de la persona a cargo de la reserva: ");
                                        nombre203 = s.nextLine();
                                        //Validamos el nombre
                                        for (int i = 0; i < nombre203.length(); i++) {
                                            if (Character.isLetter(nombre203.charAt(i)) || Character.isWhitespace(nombre203.charAt(i)))
                                                caracterValido++;
                                        }
                                        if (caracterValido != nombre203.length() || nombre203.length() < 3) System.out.println("Nombre no válido");
                                    }while(caracterValido != nombre203.length() || nombre203.length() < 3);

                                    //Guardamos la fecha y marcamos la habitación como ocupada
                                    inicioHabitacion203 = LocalDate.now();
                                    numeroReserva203 = numeroReservaActual;
                                    reservaHecha = true;
                                    habitacion3Doble = true;

                                } else {
                                    //Si la habitación está ocupada
                                    System.out.println("La habitación esta ocupada");
                                    System.out.println("Pulsa cualquier botón para salir... ");
                                    s.nextLine();
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                }
                                break;
                            case "204":
                                selecValida = true;
                                if (!habitacion4Doble) {
                                    //Si la habitación está libre
                                    System.out.println("Has seleccionado la habitación 204");
                                    //Pedimos nombre de quien está a cargo
                                    do {
                                        caracterValido = 0;

                                        System.out.print("Introduce el nombre de la persona a cargo de la reserva: ");
                                        nombre204 = s.nextLine();
                                        //Validamos el nombre
                                        for (int i = 0; i < nombre204.length(); i++) {
                                            if (Character.isLetter(nombre204.charAt(i)) || Character.isWhitespace(nombre204.charAt(i)))
                                                caracterValido++;
                                        }
                                        if (caracterValido != nombre204.length() || nombre204.length() < 3) System.out.println("Nombre no válido");
                                    }while(caracterValido != nombre204.length() || nombre204.length() < 3);

                                    //Guardamos la fecha y marcamos la habitación como ocupada
                                    inicioHabitacion204 = LocalDate.now();
                                    numeroReserva204 = numeroReservaActual;
                                    reservaHecha = true;
                                    habitacion4Doble = true;
                                } else {
                                    //Si la habitación está ocupada
                                    System.out.println("La habitación esta ocupada");
                                    System.out.println("Pulsa cualquier botón para salir... ");
                                    s.nextLine();
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                }
                                break;
                            case "205":
                                selecValida = true;
                                if (!habitacion5Doble) {
                                    //Si la habitación está libre
                                    System.out.println("Has seleccionado la habitación 205");
                                    //Pedimos nombre de quien está a cargo
                                    do {
                                        caracterValido = 0;

                                        System.out.print("Introduce el nombre de la persona a cargo de la reserva: ");
                                        nombre205 = s.nextLine();
                                        //Validamos el nombre
                                        for (int i = 0; i < nombre205.length(); i++) {
                                            if (Character.isLetter(nombre205.charAt(i)) || Character.isWhitespace(nombre205.charAt(i)))
                                                caracterValido++;
                                        }
                                        if (caracterValido != nombre205.length() || nombre205.length() < 3) System.out.println("Nombre no válido");
                                    }while(caracterValido != nombre205.length() || nombre205.length() < 3);

                                    //Guardamos la fecha y marcamos la habitación como ocupada
                                    inicioHabitacion205 = LocalDate.now();
                                    numeroReserva205 = numeroReservaActual;
                                    reservaHecha = true;
                                    habitacion5Doble = true;
                                } else {
                                    //Si la habitación está ocupada
                                    System.out.println("La habitación esta ocupada");
                                    System.out.println("Pulsa cualquier botón para salir... ");
                                    s.nextLine();
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                }
                                break;
                            case "206":
                                selecValida = true;
                                if (!habitacion6Doble) {
                                    //Si la habitación está libre
                                    System.out.println("Has seleccionado la habitación 206");
                                    //Pedimos nombre de quien está a cargo
                                    do {
                                        caracterValido = 0;

                                        System.out.print("Introduce el nombre de la persona a cargo de la reserva: ");
                                        nombre206 = s.nextLine();
                                        //Validamos el nombre
                                        for (int i = 0; i < nombre206.length(); i++) {
                                            if (Character.isLetter(nombre206.charAt(i)) || Character.isWhitespace(nombre206.charAt(i)))
                                                caracterValido++;
                                        }
                                        if (caracterValido != nombre206.length() || nombre206.length() < 3) System.out.println("Nombre no válido");
                                    }while(caracterValido != nombre206.length() || nombre206.length() < 3);

                                    //Guardamos la fecha y marcamos la habitación como ocupada
                                    inicioHabitacion206 = LocalDate.now();
                                    numeroReserva206 = numeroReservaActual;
                                    reservaHecha = true;
                                    habitacion6Doble = true;
                                } else {
                                    //Si la habitación está ocupada
                                    System.out.println("La habitación esta ocupada");
                                    System.out.println("Pulsa cualquier botón para salir... ");
                                    s.nextLine();
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                }
                                break;
                            case "207":
                                selecValida = true;
                                if (!habitacion7Doble) {
                                    //Si la habitación está libre
                                    System.out.println("Has seleccionado la habitación 207");
                                    //Pedimos nombre de quien está a cargo
                                    do {
                                        caracterValido = 0;

                                        System.out.print("Introduce el nombre de la persona a cargo de la reserva: ");
                                        nombre207 = s.nextLine();
                                        //Validamos el nombre
                                        for (int i = 0; i < nombre207.length(); i++) {
                                            if (Character.isLetter(nombre207.charAt(i)) || Character.isWhitespace(nombre207.charAt(i)))
                                                caracterValido++;
                                        }
                                        if (caracterValido != nombre207.length() || nombre207.length() < 3) System.out.println("Nombre no válido");
                                    }while(caracterValido != nombre207.length() || nombre207.length() < 3);

                                    //Guardamos la fecha y marcamos la habitación como ocupada
                                    inicioHabitacion207 = LocalDate.now();
                                    numeroReserva207 = numeroReservaActual;
                                    habitacion7Doble = true;
                                    reservaHecha = true;
                                } else {
                                    //Si la habitación está ocupada
                                    System.out.println("La habitación esta ocupada");
                                    System.out.println("Pulsa cualquier botón para salir... ");
                                    s.nextLine();
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                }
                                break;
                            case "208":
                                selecValida = true;
                                if (!habitacion8Doble) {
                                    //Si la habitación está libre
                                    System.out.println("Has seleccionado la habitación 208");
                                    //Pedimos nombre de quien está a cargo
                                    do {
                                        caracterValido = 0;

                                        System.out.print("Introduce el nombre de la persona a cargo de la reserva: ");
                                        nombre208 = s.nextLine();
                                        //Validamos el nombre
                                        for (int i = 0; i < nombre208.length(); i++) {
                                            if (Character.isLetter(nombre208.charAt(i)) || Character.isWhitespace(nombre208.charAt(i)))
                                                caracterValido++;
                                        }
                                        if (caracterValido != nombre208.length() || nombre208.length() < 3) System.out.println("Nombre no válido");
                                    }while(caracterValido != nombre208.length() || nombre208.length() < 3);

                                    //Guardamos la fecha y marcamos la habitación como ocupada
                                    inicioHabitacion208 = LocalDate.now();
                                    numeroReserva208 = numeroReservaActual;
                                    habitacion8Doble = true;
                                    reservaHecha = true;

                                } else {
                                    //Si la habitación está ocupada
                                    System.out.println("La habitación esta ocupada");
                                    System.out.println("Pulsa cualquier botón para salir... ");
                                    s.nextLine();
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                }
                                break;
                            case "salir":
                                selecValida = true;
                                for (int i = 0; i < 100; i++) {
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("La habitación seleccionada no existe");
                                selecValida = false;

                        }
                        if (reservaHecha) {
                            //Animación de reserva finalizada (solo es estético)
                            System.out.print("Cargando");
                            for (int i = 0; i < 3; i++) {
                                System.out.print(". ");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            for (int i = 0; i < 100; i++) {
                                System.out.println();

                            }
                            numeroReservaActual += 1;
                            System.out.println("Habitación reservada con éxito");
                            System.out.println("Pulsa cualquier botón para salir... ");
                            s.nextLine();
                            for (int i = 0; i < 100; i++) {
                                System.out.println();
                            }
                            reservaHecha = false;
                        }
                    }while (!(selecHabitacion.equals("salir")) && !selecValida );
                    break;
                case "c":
                    System.out.println("Has escogido la opción: Realizar el checkout de una habitación");
                    do {
                        do {
                            //Pedimos los datos para el checkout
                            System.out.println("Que dia quieres simular el checkout");
                            do {
                                System.out.println("Introduce el año: ");
                                anioSalida = Integer.parseInt(s.nextLine());
                                if (anioSalida < ANIO_ACTUAL) System.out.println("Año no válido");
                            } while (anioSalida < ANIO_ACTUAL);
                            do {
                                System.out.print("Introduce el mes: ");
                                mesSalida = Integer.parseInt(s.nextLine());
                                if (mesSalida > MES_MAX) System.out.println("Mes no existente");
                            } while (mesSalida > MES_MAX || mesSalida <= 0);
                            do {
                                System.out.print("Introduce el dia: ");
                                diaSalida = Integer.parseInt(s.nextLine());
                                switch (mesSalida) {
                                    case 1, 3, 5, 7, 8, 10, 12:
                                        diaValido = diaSalida <= 31;
                                        break;
                                    case 4, 6, 9, 11:
                                        diaValido = diaSalida <= 30;
                                        break;
                                    case 2:
                                        diaValido = false;
                                        if (anioSalida % 4 == 0 && anioSalida % 100 != 0 || anioSalida % 400 == 0 && diaSalida <= 29)
                                            diaValido = true;
                                        else {
                                            if (diaSalida <= 28) diaValido = true;
                                        }
                                        if (!diaValido) System.out.println("Dia no válido");
                                }
                            } while (diaSalida <= 0 || !diaValido);
                            fechaSalida = LocalDate.of(anioSalida, mesSalida, diaSalida);
                            for (int i = 0; i < 100; i++) {
                                System.out.println();
                            }

                            //Mostramos habitaciones ocupadas
                            System.out.println("Las habitaciónes ocupadas son: ");
                            if (habitacion1Ind) System.out.println("Habitación 101");
                            if (habitacion2Ind) System.out.println("Habitación 102");
                            if (habitacion1Doble) System.out.println("Habitación 201");
                            if (habitacion2Doble) System.out.println("Habitación 202");
                            if (habitacion3Doble) System.out.println("Habitación 203");
                            if (habitacion4Doble) System.out.println("Habitación 204");
                            if (habitacion5Doble) System.out.println("Habitación 205");
                            if (habitacion6Doble) System.out.println("Habitación 206");
                            if (habitacion7Doble) System.out.println("Habitación 207");
                            if (habitacion8Doble) System.out.println("Habitación 208");

                            do {
                                //Preguntamos cuál quiere hacer el checkout
                                System.out.print("De que habitación quieres realizar el checkout: ");
                                selecHabitacion = s.nextLine();
                                switch (selecHabitacion) {
                                    case "101":
                                        //Si está libre guardamos los datos específicos en otras variables generales para generar más tarde la factura y no repetir el código 10 veces
                                        if (habitacion1Ind) {
                                            inicioOcupacion = inicioHabitacion101;
                                            numeroReserva = numeroReserva101;
                                            //Calculamos los dígitos que tiene la reserva para poner 2025X siendo x el número de reserva
                                            while (numeroReserva101 > 0) {
                                                numMultiplicamos *= 10;
                                                numeroReserva101 /= 10;
                                            }
                                            numeroReserva += 2025 * numMultiplicamos;
                                            nombre = nombre101;
                                            selecValida = true;
                                            pax = 1;
                                            tarifa = TARIFA_IND;

                                        } else {
                                            //Si esta ocupada
                                            System.out.println("La habitación esta libre");
                                            selecValida = false;
                                        }
                                        break;
                                        //El código del resto es igual cambiando el nombre de las variables específicas
                                    case "102":
                                        if (habitacion2Ind) {
                                            inicioOcupacion = inicioHabitacion102;
                                            numeroReserva = numeroReserva102;
                                            while (numeroReserva102 > 0) {
                                                numMultiplicamos *= 10;
                                                numeroReserva102 /= 10;
                                            }
                                            numeroReserva += 2025 * numMultiplicamos;
                                            nombre = nombre102;
                                            selecValida = true;
                                            pax = 1;
                                            tarifa = TARIFA_IND;

                                        } else {
                                            System.out.println("La habitación esta libre");
                                            selecValida = false;
                                        }
                                        break;
                                    case "201":
                                        if (habitacion1Doble) {
                                            inicioOcupacion = inicioHabitacion201;
                                            numeroReserva = numeroReserva201;
                                            while (numeroReserva201 > 0) {
                                                numMultiplicamos *= 10;
                                                numeroReserva201 /= 10;
                                            }
                                            numeroReserva += 2025 * numMultiplicamos;
                                            nombre = nombre201;
                                            selecValida = true;
                                            pax = 2;
                                            tarifa = TARIFA_DOBLE;

                                        } else {
                                            System.out.println("La habitación esta libre");
                                            selecValida = false;
                                        }
                                        break;
                                    case "202":
                                        if (habitacion2Doble) {
                                            inicioOcupacion = inicioHabitacion202;
                                            numeroReserva = numeroReserva202;
                                            while (numeroReserva202 > 0) {
                                                numMultiplicamos *= 10;
                                                numeroReserva202 /= 10;
                                            }
                                            numeroReserva += 2025 * numMultiplicamos;
                                            nombre = nombre202;
                                            selecValida = true;
                                            pax = 2;
                                            tarifa = TARIFA_DOBLE;

                                        } else {
                                            System.out.println("La habitación esta libre");
                                            selecValida = false;
                                        }
                                        break;
                                    case "203":
                                        if (habitacion3Doble) {
                                            inicioOcupacion = inicioHabitacion203;
                                            numeroReserva = numeroReserva203;
                                            while (numeroReserva203 > 0) {
                                                numMultiplicamos *= 10;
                                                numeroReserva203 /= 10;
                                            }
                                            numeroReserva += 2025 * numMultiplicamos;
                                            nombre = nombre203;
                                            selecValida = true;
                                            pax = 2;
                                            tarifa = TARIFA_DOBLE;

                                        } else {
                                            System.out.println("La habitación esta libre");
                                            selecValida = false;
                                        }
                                        break;
                                    case "204":
                                        if (habitacion4Doble) {
                                            inicioOcupacion = inicioHabitacion204;
                                            numeroReserva = numeroReserva204;
                                            while (numeroReserva204 > 0) {
                                                numMultiplicamos *= 10;
                                                numeroReserva204 /= 10;
                                            }
                                            numeroReserva += 2025 * numMultiplicamos;
                                            nombre = nombre204;
                                            selecValida = true;
                                            pax = 2;
                                            tarifa = TARIFA_DOBLE;

                                        } else {
                                            System.out.println("La habitación esta libre");
                                            selecValida = false;
                                        }
                                        break;
                                    case "205":
                                        if (habitacion5Doble) {
                                            inicioOcupacion = inicioHabitacion205;
                                            numeroReserva = numeroReserva205;
                                            while (numeroReserva205 > 0) {
                                                numMultiplicamos *= 10;
                                                numeroReserva205 /= 10;
                                            }
                                            numeroReserva += 2025 * numMultiplicamos;
                                            nombre = nombre205;
                                            selecValida = true;
                                            pax = 2;
                                            tarifa = TARIFA_DOBLE;

                                        } else {
                                            System.out.println("La habitación esta libre");
                                            selecValida = false;
                                        }
                                        break;
                                    case "206":
                                        if (habitacion6Doble) {
                                            inicioOcupacion = inicioHabitacion206;
                                            numeroReserva = numeroReserva206;
                                            while (numeroReserva206 > 0) {
                                                numMultiplicamos *= 10;
                                                numeroReserva206 /= 10;
                                            }
                                            numeroReserva += 2025 * numMultiplicamos;
                                            nombre = nombre206;
                                            selecValida = true;
                                            pax = 2;
                                            tarifa = TARIFA_DOBLE;

                                        } else {
                                            System.out.println("La habitación esta libre");
                                            selecValida = false;
                                        }
                                        break;
                                    case "207":
                                        if (habitacion7Doble) {
                                            inicioOcupacion = inicioHabitacion207;
                                            numeroReserva = numeroReserva207;
                                            while (numeroReserva207 > 0) {
                                                numMultiplicamos *= 10;
                                                numeroReserva207 /= 10;
                                            }
                                            numeroReserva += 2025 * numMultiplicamos;
                                            nombre = nombre207;
                                            selecValida = true;
                                            pax = 2;
                                            tarifa = TARIFA_DOBLE;

                                        } else {
                                            System.out.println("La habitación esta libre");
                                            selecValida = false;
                                        }
                                        break;
                                    case "208":
                                        if (habitacion8Doble) {
                                            inicioOcupacion = inicioHabitacion208;
                                            numeroReserva = numeroReserva208;
                                            while (numeroReserva208 > 0) {
                                                numMultiplicamos *= 10;
                                                numeroReserva208 /= 10;
                                            }
                                            numeroReserva += 2025 * numMultiplicamos;
                                            nombre = nombre208;
                                            selecValida = true;
                                            pax = 2;
                                            tarifa = TARIFA_DOBLE;

                                        } else {
                                            System.out.println("La habitación esta libre");
                                            selecValida = false;
                                        }
                                        break;
                                    case "salir":
                                        //Opción salir pensada por si el usuario se equivoca de botón
                                        selecValida = true;
                                        System.out.println("Has seleccionado salir");
                                        inicioOcupacion = fechaSalida;
                                        System.out.println("Pulsa cualquier botón para salir... ");
                                        s.nextLine();
                                        for (int i = 0; i < 100; i++) {
                                            System.out.println();
                                        }
                                        break;
                                    default:
                                        //En caso de error
                                        System.out.println("Habitación no existente");
                                        selecValida = false;
                                }
                            } while (!selecValida);

                            numMultiplicamos = 1;
                            noches = ChronoUnit.DAYS.between(inicioOcupacion, fechaSalida);
                            if (noches < 0) System.out.println("Error la fecha de salida es más antigua que la fecha de entrada");
                        }while(noches < 0);


                        //Calculamos el precio final si la selección es válida y no es salir
                        if (selecValida && !selecHabitacion.equals("salir") && noches > 0) {
                            monto = tarifa * noches;
                            ibaAPagar = monto * IBA;
                            precioFinal = monto + ibaAPagar;
                            for (int i = 0; i < 100; i++) {
                                System.out.println();
                            }


                            //Generamos la factura
                            System.out.printf("""
                                   \\ Factura //
                                    Companía: Hotel ciudad de Martos
                                    Teléfono: 673 35 35 08
                                    Dirección: Calle Molino Medel Nº 93
                                    Descripción: %s
                                    Factura: %d""",nombre,numeroReserva);
                            System.out.println("\nEntrada: "+ inicioOcupacion);
                            System.out.println("Salida: "+ fechaSalida);
                            System.out.printf("""
                                    Pax: %d
                                    Noches: %d
                                    Tarifa: %d
                                    Monto: %d
                                    IBA: %.2f
                                    Precio final: %.2f""",pax,noches,tarifa,monto,ibaAPagar,precioFinal);

                            //Preguntamos cuanto va a introducir para pagar
                            do {
                                System.out.print("\n¿Cuanto dinero vas a introducir para pagar?(Solo se acepta efectivo): ");
                                dineroIntroducido = Double.parseDouble(s.nextLine());

                                //Validamos que sea al menos lo que vale la factura
                                if (dineroIntroducido < precioFinal) {
                                    System.out.println("Error el dinero es insuficiente para pagar la factura");
                                } else {
                                    //Ponemos a cero las monedas que se dan de cambio
                                    billete50ED = 0;
                                    billete20ED = 0;
                                    billete10ED = 0;
                                    billete5ED = 0;
                                    moneda1ED = 0;
                                    moneda2ED = 0;
                                    moneda50CentD = 0;
                                    moneda20CentD = 0;
                                    moneda10CentD = 0;
                                    moneda5CentD = 0;
                                    moneda2CentD = 0;
                                    moneda1CentD = 0;
                                        cambio = dineroIntroducido - precioFinal;

                                        //No sé que pasa pero si no se ponen las siguientes 2 líneas el cambio puede quedar muy poco por debajo y descuadrar las monedas que hay que dar
                                        cambio = Math.round(cambio * 100);
                                        cambio /= 100;
                                        // mientras el cambio sea mayor que 50 se le da un billete de 50
                                        while(cambio >= 50 && billete50E > 0){
                                            billete50ED++;
                                            cambio -= 50;
                                            billete50E--;
                                        }
                                    System.out.print("El cambio es: ");
                                        // si es solo un billete se pone en singular y si no en plural
                                    if (billete50ED == 1) System.out.print( billete50ED + " billete de 50 € "+ (cambio > 0.01 ? ",":""));
                                    if (billete50ED > 1) System.out.print( billete50ED + " billetes de 50 € "+ (cambio > 0.01 ? ",":""));
                                    cambio = Math.round(cambio * 100);
                                    cambio /= 100;
                                    while(cambio >= 20 && billete20E > 0){
                                        billete20ED++;
                                        cambio -= 20;
                                        billete20E--;
                                    }
                                    cambio = Math.round(cambio * 100);
                                    cambio /= 100;
                                    if (billete20ED == 1) System.out.print( billete20ED + " billete de 20 € "+ (cambio > 0.01 ? ",":""));
                                    if (billete20ED > 1) System.out.print( billete20ED + " billetes de 20 € "+ (cambio > 0.01 ? ",":""));
                                    while(cambio >= 10 && billete10E > 0){
                                        billete10ED++;
                                        cambio -= 10;
                                        billete10E--;
                                    }
                                    cambio = Math.round(cambio * 100);
                                    cambio /= 100;
                                    if (billete10ED == 1) System.out.print( billete10ED + " billete de 10 € "+ (cambio > 0.01 ? ",":""));
                                    if (billete10ED > 1) System.out.print( billete10ED + " billetes de 10 € "+ (cambio > 0.01 ? ",":""));
                                    while(cambio >= 5 && billete5E > 0){
                                        billete5ED++;
                                        cambio -= 5;
                                        billete5E--;
                                    }
                                    cambio = Math.round(cambio * 100);
                                    cambio /= 100;
                                    if (billete5ED == 1) System.out.print( billete5ED + " billete de 5 € "+ (cambio > 0.01 ? ",":""));
                                    if (billete5ED > 1) System.out.print( billete5ED + " billetes de 5 € "+ (cambio > 0.01 ? ",":""));
                                    while(cambio >= 2 && moneda2E > 0){
                                        moneda2ED++;
                                        cambio -= 2;
                                        moneda2E--;
                                    }
                                    cambio = Math.round(cambio * 100);
                                    cambio /= 100;
                                    if (moneda2ED == 1) System.out.print( moneda2ED + " moneda de 2 € "+ (cambio > 0.01 ? ",":""));
                                    if (moneda2ED > 1) System.out.print( moneda2ED + " monedas de 2 € "+ (cambio > 0.01 ? ",":""));
                                    while(cambio >= 1 && moneda1E > 0){
                                        moneda1ED++;
                                        cambio -= 1;
                                        moneda1E--;
                                    }
                                    cambio = Math.round(cambio * 100);
                                    cambio /= 100;
                                    if (moneda1ED == 1) System.out.print( moneda1ED + " moneda de 1 € "+ (cambio > 0.01 ? ",":""));
                                    if (moneda1ED > 1) System.out.print( moneda1ED + " monedas de 1 € "+ (cambio > 0.01 ? ",":""));
                                    while(cambio >= 0.5 && moneda50Cent > 0){
                                        moneda50CentD++;
                                        cambio -= 0.5;
                                        moneda50Cent--;
                                    }
                                    cambio = Math.round(cambio * 100);
                                    cambio /= 100;
                                    if (moneda50CentD == 1) System.out.print( moneda50CentD + " moneda de 50 céntimos "+ (cambio > 0.01 ? ",":""));
                                    if (moneda50CentD > 1) System.out.print( moneda50CentD + " monedas de 50 céntimos "+ (cambio > 0.01 ? ",":""));
                                    while(cambio >= 0.2 && moneda20Cent > 0){
                                        moneda20CentD++;
                                        cambio -= 0.2;
                                        moneda20Cent--;
                                    }
                                    cambio = Math.round(cambio * 100);
                                    cambio /= 100;
                                    if (moneda20CentD == 1) System.out.print( moneda20CentD + " moneda de 20 céntimos "+ (cambio > 0.01 ? ",":""));
                                    if (moneda20CentD > 1) System.out.print( moneda20CentD + " monedas de 20 céntimos "+ (cambio > 0.01 ? ",":""));
                                    while(cambio >= 0.1 && moneda10Cent > 0){
                                        moneda10CentD++;
                                        cambio -= 0.1;
                                        moneda10Cent--;
                                    }
                                    cambio = Math.round(cambio * 100);
                                    cambio /= 100;
                                    if (moneda10CentD == 1) System.out.print( moneda10CentD + " moneda de 10 céntimos "+ (cambio > 0.01 ? ",":""));
                                    if (moneda10CentD > 1) System.out.print( moneda10CentD + " monedas de 10 céntimos "+ (cambio > 0.01 ? ",":""));
                                    while(cambio >= 0.05 && moneda5Cent > 0){
                                        moneda5CentD++;
                                        cambio -= 0.05;
                                        moneda5Cent--;
                                    }
                                    cambio = Math.round(cambio * 100);
                                    cambio /= 100;
                                    if (moneda5CentD == 1) System.out.print( moneda5CentD + " moneda de 5 céntimos "+ (cambio > 0.01 ? ",":""));
                                    if (moneda5CentD > 1) System.out.print( moneda5CentD + " monedas de 5 céntimos "+ (cambio > 0.01 ? ",":""));
                                    while(cambio >= 0.02 && moneda2Cent > 0){
                                        moneda2CentD++;
                                        cambio -= 0.02;
                                        moneda2Cent--;
                                    }
                                    cambio = Math.round(cambio * 100);
                                    cambio /= 100;
                                    if (moneda2CentD == 1) System.out.print( moneda2CentD + " moneda de 2 céntimos "+ (cambio >= 0.01 ? ",":""));
                                    if (moneda2CentD > 1) System.out.print( moneda2CentD + " monedas de 2 céntimos "+ (cambio >= 0.01 ? ",":""));
                                    while(cambio >= 0.01 && moneda1Cent > 0){
                                        moneda1CentD++;
                                        cambio -= 0.01;
                                        moneda1Cent--;
                                    }
                                    if (moneda1CentD == 1) System.out.print( moneda1CentD + " moneda de 1 céntimos "+ (cambio > 0.01 ? ",":""));
                                    if (moneda1CentD > 1) System.out.print( moneda1CentD + " monedas de 1 céntimos "+ (cambio > 0.01 ? ",":""));
                                    if (cambio >= 0.01) System.out.println("falta cambio pero no tenemos mil disculpas");
                                    System.out.println("\nPulsa cualquier botón para salir... ");
                                    s.nextLine();
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                    //Sumamos los ingresos de esta factura
                                    ingresos += precioFinal;

                                    //Ponemos la habitación como libre
                                    if (selecHabitacion.equals("101")) habitacion1Ind = false;
                                    if (selecHabitacion.equals("102")) habitacion2Ind = false;
                                    if (selecHabitacion.equals("201")) habitacion1Doble = false;
                                    if (selecHabitacion.equals("202")) habitacion2Doble = false;
                                    if (selecHabitacion.equals("203")) habitacion3Doble = false;
                                    if (selecHabitacion.equals("204")) habitacion4Doble = false;
                                    if (selecHabitacion.equals("205")) habitacion5Doble = false;
                                    if (selecHabitacion.equals("206")) habitacion6Doble = false;
                                    if (selecHabitacion.equals("207")) habitacion7Doble = false;
                                    if (selecHabitacion.equals("208")) habitacion8Doble = false;


                                }
                            }while(dineroIntroducido < precioFinal);

                        }


                        selecValida = true;
                    }while(!selecValida);
                    if (noches == 0 && !selecHabitacion.equals("salir")) {
                        System.out.println("No se puede hacer una factura de 0 dias de estancia");
                        System.out.println("Pulsa cualquier botón para continuar...");
                        s.nextLine();
                        for (int i = 0; i < 100; i++) {
                            System.out.println();
                        }
                    }
                    break;
                case "d"://Opción menú de administrador
                    //Pedimos el usuario y la contraseña
                    do {
                        System.out.println("Has escogido la opción: Menú de Administrador");
                        System.out.print("Introduce el usuario: ");
                        user = s.nextLine();
                        System.out.print("Introduce la contraseña: ");
                        password = s.nextLine();

                        //Si el usuario probado y la contraseña son correctas se abre el menu de administrador
                        if (user.equals(ADMIN_USER) && password.equals(ADMIN_PASSWORD)) {
                            do {
                                do {
                                    System.out.print("""
                                            ╔══════════════════════════════════════════════════════════════════════╗
                                            ║                                                                      ║
                                            ║                         MENÚ DE ADMINISTRADOR                        ║
                                            ║                                                                      ║
                                            ╠══════════════════════════════════════════════════════════════════════╣
                                            ║i. Consultar los ingresos totales y el número de reservas finalizadas ║
                                            ║ii. Consultar las monedas restantes para el cambio                    ║
                                            ║iii. Apagar el software                                               ║
                                            ╚══════════════════════════════════════════════════════════════════════╝
                                            Elige una opción:\s""");
                                    selecMenu2 = s.nextLine();
                                    selecMenu2 = selecMenu2.toLowerCase();

                                    switch (selecMenu2) {
                                        case "i"://Opción ver ingresos y reservas hechas en total
                                            System.out.println("Has escogido la opción: Consultar los ingresos totales y el número de reservas finalizadas.");
                                            System.out.println("Los ingresos totales son: " + ingresos + "€");
                                            System.out.println("En total hemos hecho " + (numeroReservaActual - 1) + " reservas");
                                            System.out.println("Pulsa 1 para volver al menu de administrador o cualquier botón para salir...");
                                            selecMenu = s.nextLine();
                                            for (int i = 0; i < 100; i++) {
                                                System.out.println();
                                            }
                                            selecValida = true;
                                            break;
                                        case "ii"://Opción consultar monedas restantes
                                            System.out.println("Has escogido la opción: Consultar las monedas restantes para el cambio.");
                                            System.out.printf("""
                                                    Billetes 50 € restantes: %d
                                                    Billetes 20 € restantes: %d
                                                    Billetes 10 € restantes: %d
                                                    Billetes 5 € restantes: %d
                                                    Monedas 2 € restantes: %d
                                                    Monedas 1 € restantes: %d
                                                    Monedas 50 céntimos restantes: %d
                                                    Monedas 20 céntimos restantes: %d
                                                    Monedas 10 céntimos restantes: %d
                                                    Monedas 5 céntimos restantes: %d
                                                    Monedas 2 céntimos restantes: %d
                                                    Monedas 1 céntimos restantes: %d""", billete50E, billete20E, billete10E, billete5E, moneda2E, moneda1E, moneda50Cent, moneda20Cent, moneda10Cent, moneda5Cent, moneda2Cent, moneda1Cent);
                                            System.out.println("\nPulsa 1 para volver al menu de administrador o una tecla para continuar...");
                                            selecMenu =s.nextLine();
                                            for (int i = 0; i < 100; i++) {
                                                System.out.println();
                                            }
                                            selecValida = true;
                                            break;
                                        case "iii"://Opción apagar el software
                                            System.out.println("Has escogido la opción: Apagar el software");
                                            selecValida = true;
                                            break;
                                        default:
                                            System.out.println("Error opción no válida");
                                            selecValida = false;
                                            break;
                                    }
                                } while (!selecValida);
                            }while(selecMenu.equals("1") && !selecMenu2.equals("iii"));
                        } else {
                            System.out.println("Usuario o contraseña incorrectos");
                            System.out.println("Pulsa 1 para reintentar y cualquier otro botón para volver al menú...");
                            selecMenu = s.nextLine();
                        }

                    }while(selecMenu.equals("1") && !user.equals(ADMIN_USER) || !password.equals(ADMIN_PASSWORD));
                        break;
                        default:
                            System.out.println("Error opción no válida");
                            System.out.println("Pulsa cualquier botón para volver al menú");
                            s.nextLine();
                            for (int i = 0; i < 100; i++) {
                                System.out.println();
                            }

            }
        } while (!selecMenu2.equals("iii"));
    }
}
