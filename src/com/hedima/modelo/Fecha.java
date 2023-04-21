package com.hedima.modelo;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public void comprobar() throws Exception {
        //comprobar el mes
        if(mes >=1 && mes<=12){
            switch (mes){
                case 1,3,5,7,8,10,12:
                    if(dia<=0 || dia>31){
                        throw new Exception("Dia invalido");
                    }
                    break;
                case 4,6,9,11:
                    if(dia<=0 || dia>30){
                        throw new Exception("Dia invalido");
                    }
                    break;
                    case 2:
                    if(dia<=0 || dia>28){
                        throw new Exception("Dia invalido");
                    }
                    break;
            }

        }else{
            throw new Exception("Mes invalido");
        }
    }

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
