package com.locacion;

import java.util.Scanner;

public class Casa extends Locacion {
    private String descripcion;
    private int ambientes;
    private int usuarios;
    private boolean admin;

    public Casa(){
    super();
    }

    public Casa(String descripcion, int ambientes, int usuarios) {
        this.ambientes = ambientes;
        this.descripcion = descripcion;
        this.usuarios = usuarios;
        this.admin = admin;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void descripcion(){
        System.out.println("Descripcion de la casa " + this.descripcion);
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(int code) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el codigo de administrador");
        int codeAdmin = sc.nextInt();
        if (codeAdmin == code){
            this.admin = true;
        }
    }

    public void riego(){
        System.out.println("Riego");
    }

    public void setRiego(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tiempo de riego");
        int tiempo = sc.nextInt();
        if (tiempo > 0){
            System.out.println("Riego iniciado...");
        }
    }

    public void setLuminaria(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tiempo de luminaria");
        int tiempo = sc.nextInt();
        if (tiempo > 0){
            System.out.println("Luminaria iniciada...");
        }
    }

    public void luminaria(){
        System.out.println("Luminaria");
    }



}
