package com.hedima.modelo;

public class Producto {

    private int id;
    private String nombre;

    public void comprobarId() throws Exception{
        if(id<=0){
            throw new Exception("El id del producto es menor igual a cero ");
        }
    }

    public Producto() {
    }

    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
