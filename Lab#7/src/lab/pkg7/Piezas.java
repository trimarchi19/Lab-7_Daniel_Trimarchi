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
public class Piezas  {
    private String nombre;
    private String material;
    private String size;
    private String tiempo;
    private ArrayList<Piezas> piezas=new ArrayList<>();

    public Piezas() {
        
    }

    public Piezas(String nombre, String material, String size, String tiempo) {
        this.nombre = nombre;
        this.material = material;
        this.size = size;
        this.tiempo = tiempo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public ArrayList<Piezas> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Piezas> piezas) {
        this.piezas = piezas;
    }
    
    
}
