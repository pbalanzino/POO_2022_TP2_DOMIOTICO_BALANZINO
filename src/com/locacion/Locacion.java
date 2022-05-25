package com.locacion;

import java.util.Scanner;

public abstract class Locacion {
    private double calefaccion = 24;
    private boolean isCalefaccion = false;
    private boolean isAlarma = false;
    private boolean admin = false;

    public Locacion(){}
    public void setCalefaccion(boolean estadoCalefaccion, double temperatura) {
        isCalefaccion = estadoCalefaccion;
        Scanner sc = new Scanner(System.in);
        if (!isCalefaccion) {
            System.out.println("¿Quiere calefaccion? (s/n)");
            String calefaccion = sc.nextLine();
            if (calefaccion.equals("s")) {
                this.calefaccion = temperatura;
                return;
            }
        }
        System.out.println("Calefaccion: " + isCalefaccion);
    }



    public void setAlarma(boolean estadoAlarma) {
        isAlarma = estadoAlarma;
        System.out.println("Alarma: " + isAlarma);
    }

    public void setAdmin(boolean estadoAdmin) {
        admin = estadoAdmin;
        System.out.println("Admin: " + admin);
    }

    public boolean getAdmin() {
        return admin;
    }

    public boolean getAlarma() {
        return isAlarma;
    }

    public boolean getCalefaccion() {
        return isCalefaccion;
    }

}
