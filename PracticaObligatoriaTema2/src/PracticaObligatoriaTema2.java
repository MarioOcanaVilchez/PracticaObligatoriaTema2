package proyecto;

import java.util.Scanner;

public class PracticaObligatoriaTema2 {
    public static void main(String[] args) {
        //Definir variables
        Scanner s = new Scanner(System.in);
        String user, password, selecMenu = " ", selecMenuMin = selecMenu.toLowerCase(), selecMenu2 = " ", selecMenuMin2 = selecMenu.toLowerCase();//Se puede reducir el codigo?
        final String ADMIN_USER = "admin", ADMIN_PASSWORD = "admin";

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
            selecMenuMin = s.nextLine();

            //Programación del menu
            switch (selecMenuMin){
                case "a":
                    System.out.println("Has escogido la opción: Ver el estado de ocupación de las habitaciones");
                    break;
                case "b":
                    System.out.println("Has escogido la opción: Reservar una habitación");
                    break;
                case "c":
                    System.out.println("Has escogido la opción: Realizar el checkout de una habitación");
                    break;
                case "d":
                    System.out.println("Has escogido la opción: Menú de Administrador");
                    System.out.println("Introduce el usuario");
                    user = s.nextLine();
                    System.out.println("Introduce la contraseña");
                    password = s.nextLine();

                    //Programar la entrada del usuario
                    if (user.equals(ADMIN_USER) && password.equals(ADMIN_PASSWORD)){
                        System.out.print("""
                    \\ Hotel Ciudad de Martos //
                       i. Consultar los ingresos totales y el número de reservas finalizadas.
                      ii. Consultar las monedas restantes para el cambio.
                     iii. Apagar el software
                     Elige una opción:\s""");
                        selecMenuMin2 = s.nextLine();

                        switch (selecMenuMin2){
                            case "i":
                                System.out.println("Has escogido la opción: Consultar los ingresos totales y el número de reservas finalizadas.");
                                break;
                            case "ii":
                                System.out.println("Has escogido la opción: Consultar las monedas restantes para el cambio.");
                                break;
                            case "iii":
                                System.out.println("Has escogido la opción: Apagar el software");
                                break;
                            default:
                                System.out.println("Introduce una opción valida");
                        }
                    }else{
                        System.out.println("Usuario o contraseña incorrectos");
                    }
                    break;
                default:
                    System.out.println("Introduce una opción valida");
            }
        } while (!selecMenuMin2.equals("iii"));
    }
}
