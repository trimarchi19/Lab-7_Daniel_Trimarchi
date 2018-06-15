/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7;

import java.util.ArrayList;

/**
 *
 * @author X
 */
public class Carro {
    private String nombre_carro;
    private ArrayList<Piezas> pieza=new ArrayList();

    public Carro() {
    }

    public Carro(String nombre_carro) {
        this.nombre_carro = nombre_carro;
    }

    public String getNombre_carro() {
        return nombre_carro;
    }

    public void setNombre_carro(String nombre_carro) {
        this.nombre_carro = nombre_carro;
    }

    public ArrayList<Piezas> getPieza() {
        return pieza;
    }

    public void setPieza(ArrayList<Piezas> pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return nombre_carro;
    }
    
    
}
