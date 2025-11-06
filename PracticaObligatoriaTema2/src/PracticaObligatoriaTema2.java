package proyecto;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class PracticaObligatoriaTema2 {
    public static void main(String[] args) {
        //Definir variables
        Scanner s = new Scanner(System.in);
        String user, password, selecMenu , selecMenu2 = " ",selecHabitacion ;//Las variables se pasan a minúsculas una vez las has pedido
        final String ADMIN_USER = "admin", ADMIN_PASSWORD = "admin";
        boolean selecValida,habitacion1Doble = false,habitacion2Doble = false,habitacion3Doble = false,habitacion4Doble = false,habitacion5Doble = false,habitacion6Doble = false,habitacion7Doble = false,habitacion8Doble = false,reservaHecha = false;
        boolean habitacion1Ind = false,habitacion2Ind = false, checkoutHecho = false;
        LocalDate inicioHabitacion101,inicioHabitacion102,inicioHabitacion201,inicioHabitacion202,inicioHabitacion203,inicioHabitacion204,inicioHabitacion205,inicioHabitacion206,inicioHabitacion207,inicioHabitacion208, fechaSalida;
        int numeroReserva101,numeroReserva102,numeroReserva201,numeroReserva202,numeroReserva203,numeroReserva204,numeroReserva205,numeroReserva206,numeroReserva207,numeroReserva208,numeroReservaActual = 1,caracterValido = 0;
        String nombreCheck, nombre101 = "",nombre102 = "",nombre201 = "",nombre202 = "",nombre203 = "",nombre204 = "",nombre205 = "",nombre206 = "",nombre207 = "",nombre208 = "";

        //He metido las variables fechaSalida para introducir la fecha de salida y checkoutHecho para registrar el checkout (esta luego esta abajo para que se ponga siempre en false)
        //Tambien he tenido que inicializar los nombres por que me daba error

        //Creamos el bucle del menu
        do{
            //Pintar el menu
            System.out.print("""
                    \\ Hotel Ciudad de Martos //
                     a. Ver el estado de ocupación de las habitaciones
                     b. Reservar una habitación
                     c. Realizar el checkout de una habitación
                     d. Menú de Administrador
                     Elige una opción:\s""");
            selecMenu = s.nextLine();
            selecMenu = selecMenu.toLowerCase();


            //Programación del menu
            switch (selecMenu){
                case "a":

                    //Muestra si cada habitación está libre
                    System.out.println("Has escogido la opción: Ver el estado de ocupación de las habitaciones");
                    System.out.println("Las habitaciones libres son :");
                    if (!habitacion1Ind) System.out.println("Habitación 101");
                    if (!habitacion2Ind) System.out.println("Habitación 102");
                    if (!habitacion1Doble) System.out.println("Habitación 201");
                    if (!habitacion2Doble) System.out.println("Habitación 202");
                    if (!habitacion3Doble) System.out.println("Habitación 203");
                    if (!habitacion4Doble) System.out.println("Habitación 204");
                    if (!habitacion5Doble) System.out.println("Habitación 205");
                    if (!habitacion6Doble) System.out.println("Habitación 206");
                    if (!habitacion7Doble) System.out.println("Habitación 207");
                    if (!habitacion8Doble) System.out.println("Habitación 208");

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
                        System.out.print("De que habitación quieres realizar el checkout: ");
                        selecHabitacion = s.nextLine();

                        checkoutHecho = false;

                        switch (selecHabitacion){
                            case "101":
                                //Introducir el nombre de la reserva
                                if (habitacion1Ind){
                                    System.out.print("Introduce tu nombre para verificar la reserva: ");
                                    nombreCheck = s.nextLine();
                                    //Comprueba si el nombre es correcto
                                    if (nombreCheck.equals(nombre101)){
//                                        System.out.print("Introduce la fecha de salida (YYYY-MM-DD): ");
//                                        fechaSalida = LocalDate.parse(s.nextLine());
                                        System.out.println("Checkout realizado con éxito para " + nombre101);
                                        //Vacia las variables del nombre y de la habitación
                                        habitacion1Ind = false;
                                        nombre101 = null;
                                        checkoutHecho = true;
                                    } else {
                                        System.out.println("El nombre no coincide con la reserva");
                                    }
                                }else {
                                    System.out.println("La habitación 101 no esta ocupada");
                                }
                                break;
                            case "102":
                                //Introducir el nombre de la reserva
                                if (habitacion2Ind){
                                    System.out.print("Introduce tu nombre para verificar la reserva: ");
                                    nombreCheck = s.nextLine();
                                    //Comprueba si el nombre es correcto
                                    if (nombreCheck.equals(nombre102)){
//                                        System.out.print("Introduce la fecha de salida (YYYY-MM-DD): ");
//                                        fechaSalida = LocalDate.parse(s.nextLine());
                                        System.out.println("Checkout realizado con éxito para " + nombre102);
                                        //Vacia las variables del nombre y de la habitación
                                        habitacion2Ind = false;
                                        nombre102 = null;
                                        checkoutHecho = true;
                                    } else {
                                        System.out.println("El nombre no coincide con la reserva");
                                    }
                                }else {
                                    System.out.println("La habitación 102 no esta ocupada");
                                }
                                break;
                            case "201":
                                //Introducir el nombre de la reserva
                                if (habitacion1Doble){
                                    System.out.print("Introduce tu nombre para verificar la reserva: ");
                                    nombreCheck = s.nextLine();
                                    //Comprueba si el nombre es correcto
                                    if (nombreCheck.equals(nombre201)){
//                                        System.out.print("Introduce la fecha de salida (YYYY-MM-DD): ");
//                                        fechaSalida = LocalDate.parse(s.nextLine());
                                        System.out.println("Checkout realizado con éxito para " + nombre201);
                                        //Vacia las variables del nombre y de la habitación
                                        habitacion1Doble = false;
                                        nombre201 = null;
                                        checkoutHecho = true;
                                    } else {
                                        System.out.println("El nombre no coincide con la reserva");
                                    }
                                }else {
                                    System.out.println("La habitación 201 no esta ocupada");
                                }
                                break;
                            case "202":
                                //Introducir el nombre de la reserva
                                if (habitacion2Doble){
                                    System.out.print("Introduce tu nombre para verificar la reserva: ");
                                    nombreCheck = s.nextLine();
                                    //Comprueba si el nombre es correcto
                                    if (nombreCheck.equals(nombre202)){
//                                        System.out.print("Introduce la fecha de salida (YYYY-MM-DD): ");
//                                        fechaSalida = LocalDate.parse(s.nextLine());
                                        System.out.println("Checkout realizado con éxito para " + nombre202);
                                        //Vacia las variables del nombre y de la habitación
                                        habitacion1Ind = false;
                                        nombre202 = null;
                                        checkoutHecho = true;
                                    } else {
                                        System.out.println("El nombre no coincide con la reserva");
                                    }
                                }else {
                                    System.out.println("La habitación 202 no esta ocupada");
                                }
                                break;
                            case "203":
                                //Introducir el nombre de la reserva
                                if (habitacion3Doble){
                                    System.out.print("Introduce tu nombre para verificar la reserva: ");
                                    nombreCheck = s.nextLine();
                                    //Comprueba si el nombre es correcto
                                    if (nombreCheck.equals(nombre203)){
//                                        System.out.print("Introduce la fecha de salida (YYYY-MM-DD): ");
//                                        fechaSalida = LocalDate.parse(s.nextLine());
                                        System.out.println("Checkout realizado con éxito para " + nombre203);
                                        //Vacia las variables del nombre y de la habitación
                                        habitacion1Ind = false;
                                        nombre203 = null;
                                        checkoutHecho = true;
                                    } else {
                                        System.out.println("El nombre no coincide con la reserva");
                                    }
                                }else {
                                    System.out.println("La habitación 203 no esta ocupada");
                                }
                                break;
                            case "204":
                                //Introducir el nombre de la reserva
                                if (habitacion4Doble){
                                    System.out.print("Introduce tu nombre para verificar la reserva: ");
                                    nombreCheck = s.nextLine();
                                    //Comprueba si el nombre es correcto
                                    if (nombreCheck.equals(nombre204)){
//                                        System.out.print("Introduce la fecha de salida (YYYY-MM-DD): ");
//                                        fechaSalida = LocalDate.parse(s.nextLine());
                                        System.out.println("Checkout realizado con éxito para " + nombre204);
                                        //Vacia las variables del nombre y de la habitación
                                        habitacion1Ind = false;
                                        nombre204 = null;
                                        checkoutHecho = true;
                                    } else {
                                        System.out.println("El nombre no coincide con la reserva");
                                    }
                                }else {
                                    System.out.println("La habitación 204 no esta ocupada");
                                }
                                break;
                            case "205":
                                //Introducir el nombre de la reserva
                                if (habitacion5Doble){
                                    System.out.print("Introduce tu nombre para verificar la reserva: ");
                                    nombreCheck = s.nextLine();
                                    //Comprueba si el nombre es correcto
                                    if (nombreCheck.equals(nombre205)){
//                                        System.out.print("Introduce la fecha de salida (YYYY-MM-DD): ");
//                                        fechaSalida = LocalDate.parse(s.nextLine());
                                        System.out.println("Checkout realizado con éxito para " + nombre205);
                                        //Vacia las variables del nombre y de la habitación
                                        habitacion1Ind = false;
                                        nombre205 = null;
                                        checkoutHecho = true;
                                    } else {
                                        System.out.println("El nombre no coincide con la reserva");
                                    }
                                }else {
                                    System.out.println("La habitación 101 no esta ocupada");
                                }
                                break;
                            case "206":
                                //Introducir el nombre de la reserva
                                if (habitacion6Doble){
                                    System.out.print("Introduce tu nombre para verificar la reserva: ");
                                    nombreCheck = s.nextLine();
                                    //Comprueba si el nombre es correcto
                                    if (nombreCheck.equals(nombre206)){
//                                        System.out.print("Introduce la fecha de salida (YYYY-MM-DD): ");
//                                        fechaSalida = LocalDate.parse(s.nextLine());
                                        System.out.println("Checkout realizado con éxito para " + nombre206);
                                        //Vacia las variables del nombre y de la habitación
                                        habitacion1Ind = false;
                                        nombre206 = null;
                                        checkoutHecho = true;
                                    } else {
                                        System.out.println("El nombre no coincide con la reserva");
                                    }
                                }else {
                                    System.out.println("La habitación 206 no esta ocupada");
                                }
                                break;
                            case "207":
                                //Introducir el nombre de la reserva
                                if (habitacion7Doble){
                                    System.out.print("Introduce tu nombre para verificar la reserva: ");
                                    nombreCheck = s.nextLine();
                                    //Comprueba si el nombre es correcto
                                    if (nombreCheck.equals(nombre207)){
//                                        System.out.print("Introduce la fecha de salida (YYYY-MM-DD): ");
//                                        fechaSalida = LocalDate.parse(s.nextLine());
                                        System.out.println("Checkout realizado con éxito para " + nombre207);
                                        //Vacia las variables del nombre y de la habitación
                                        habitacion1Ind = false;
                                        nombre207 = null;
                                        checkoutHecho = true;
                                    } else {
                                        System.out.println("El nombre no coincide con la reserva");
                                    }
                                }else {
                                    System.out.println("La habitación 207 no esta ocupada");
                                }
                                break;
                            case "208":
                                //Introducir el nombre de la reserva
                                if (habitacion8Doble){
                                    System.out.print("Introduce tu nombre para verificar la reserva: ");
                                    nombreCheck = s.nextLine();
                                    //Comprueba si el nombre es correcto
                                    if (nombreCheck.equals(nombre208)){
//                                        System.out.print("Introduce la fecha de salida (YYYY-MM-DD): ");
//                                        fechaSalida = LocalDate.parse(s.nextLine());
                                        System.out.println("Checkout realizado con éxito para " + nombre208);
                                        //Vacia las variables del nombre y de la habitación
                                        habitacion1Ind = false;
                                        nombre208 = null;
                                        checkoutHecho = true;
                                    } else {
                                        System.out.println("El nombre no coincide con la reserva");
                                    }
                                }else {
                                    System.out.println("La habitación 208 no esta ocupada");
                                }
                                break;
                                
                        }
                        //Si el checkout esta realizado mandamos mensaje y salimos
                        if (checkoutHecho) System.out.println("Checkout realizado con exito");
                        System.out.println("Pulsa una tecla para continuar");
                        s.nextLine();
                        for (int i = 0; i < 100; i++) System.out.println();
                    }while (!checkoutHecho);
                        break;
                case "d":
                    System.out.println("Has escogido la opción: Menú de Administrador");
                    System.out.println("Introduce el usuario");
                    user = s.nextLine();
                    System.out.println("Introduce la contraseña");
                    password = s.nextLine();

                    //Programar la entrada del usuario
                    if (user.equals(ADMIN_USER) && password.equals(ADMIN_PASSWORD)){
                        do {
                            System.out.print("""
                                    \\ Hotel Ciudad de Martos //
                                       i. Consultar los ingresos totales y el número de reservas finalizadas.
                                      ii. Consultar las monedas restantes para el cambio.
                                     iii. Apagar el software
                                     Elige una opción:\s""");
                            selecMenu2 = s.nextLine();
                            selecMenu2 = selecMenu2.toLowerCase();

                            switch (selecMenu2) {
                                case "i":
                                    System.out.println("Has escogido la opción: Consultar los ingresos totales y el número de reservas finalizadas.");
                                    selecValida = true;
                                    break;
                                case "ii":
                                    System.out.println("Has escogido la opción: Consultar las monedas restantes para el cambio.");
                                    selecValida = true;
                                    break;
                                case "iii":
                                    System.out.println("Has escogido la opción: Apagar el software");
                                    selecValida = true;
                                    break;
                                default:
                                    System.out.println("Introduce una opción valida");
                                    selecValida = false;
                                    break;
                            }
                        }while(!selecValida);
                    }else{
                        System.out.println("Usuario o contraseña incorrectos");
                    }
                    break;
                default:
                    System.out.println("Introduce una opción valida");
            }
        } while (!selecMenu2.equals("iii"));
    }
}
