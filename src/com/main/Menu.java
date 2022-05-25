package com.main;

import java.util.Scanner;

public class Menu {
    public Menu(){
    }
    public void Menu(){
        System.out.println("Seleccione el tipo de localizacion que desea utilizar");
        System.out.println("1. Hogar");
        System.out.println("2. Edificio");
        System.out.println("3. Oficina");
        System.out.println("4. Local");
        System.out.println("5. Deposito");
        System.out.println("6. Salir");
        Scanner scanners = new Scanner(System.in);
        int opcion = scanners.nextInt();

        switch (opcion){
            case 1:
                int numeroAmbientes = scanners.nextInt();
                System.out.println("Cuantos ambientes dispone el hogar");
                int respuestaSensores = scanners.nextInt();
                System.out.println("Todos los ambientes tienen sensores? (1.Si 2.No)");
                String passwordHogar = scanners.nextLine();
                System.out.println("Introduzca un password para ser el administrador del hogar");
                break;
            case 2:
                int numeroPisos = scanners.nextInt();
                System.out.println("Cuantos pisos tiene el edificio?");
                int Sensores2 = scanners.nextInt();
                System.out.println("Calefaccion, Luminaria? (1.Si 2.No)");
                int numeroEmpleados = scanners.nextInt();
                System.out.println("Cuantos empleados hay en el edificio?");
                String passwordAdminEdificio = scanners.nextLine();
                System.out.println("Introduzca un password para ser el administrador del edificio");
                break;
            case 3:
                int numeroEmpleadosOficina = scanners.nextInt();
                System.out.println("Cuantos empleados tiene la oficina?");
                String passwordAdminOficina = scanners.nextLine();
                System.out.println("Introduzca un password para ser el administrador de la oficina");
                break;
            case 4:
                int numeroEmpleadosLocal = scanners.nextInt();
                System.out.println("Cuantos empleados tiene el local?");
                String passwordAdminLocal = scanners.nextLine();
                System.out.println("Introduzca un password para ser el administrador del local");
                break;
            case 5:
                int numeroEmpleadosDeposito = scanners.nextInt();
                System.out.println("Cuantos empleados tiene el deposito?");
                String passwordAdminDeposito = scanners.nextLine();
                System.out.println("Introduzca un password para ser el administrador del deposito");
                break;
            case 6:
                System.out.println("Gracias por utilizar el sistema");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
                
        }
        
    }
}
