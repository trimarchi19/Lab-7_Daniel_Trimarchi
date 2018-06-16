/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author X
 */
public class adminCreacion extends Thread {

    private JTable tabla;
    private boolean avanzar=true;
    private boolean vive=true;
    private DefaultMutableTreeNode p;
    private ArrayList <DefaultMutableTreeNode> d;
    public adminCreacion() {
    }

    public adminCreacion(JTable tabla) {
        this.tabla = tabla;
    }

   

    public adminCreacion(JTable tabla, ArrayList<DefaultMutableTreeNode> d) {
        this.tabla = tabla;
        this.d = d;
    }
    

    public DefaultMutableTreeNode getP() {
        return p;
    }

    public void setP(DefaultMutableTreeNode p) {
        this.p = p;
    }
    

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            int cont=0;
            if (avanzar) {
             
                
                try {
                    Thread.sleep(1*1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(adminCreacion.class.getName()).log(Level.SEVERE, null, ex);
                }
                Object[]newrow={1,
                    
                };
                
                DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
            }
        }
    }
}
