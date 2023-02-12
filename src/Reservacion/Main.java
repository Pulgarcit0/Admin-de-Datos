/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Reservacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class Datos {
    private boolean bandera=true;
    private String curp;
    private String nom;
    private String ape;
    private int tel;
    public Datos(String nom, String ape, String curp,int tel) {
        this.curp = curp;
        this.nom = nom;
        this.ape = ape;
        this.tel=tel;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
    

}

public class Main {

    public static void main(String[] args) {
        Principal p = new Principal();
        Cuarto1 c1=new Cuarto1();
        Cuarto2 c2=new Cuarto2();
        p.setVisible(true);
        ArrayList<Datos> personas = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            
            String nombre = c1.nombre;
            String apellido = c1.apellido;
            String curp=c1.curp;
            int telefono=c1.tel;
            Datos persona = new Datos(nombre, apellido, curp,telefono);
            personas.add(persona);
            
        }
        for (int i = 0; i < 1; i++) {
            
            String nombre = c2.nombre;
            String apellido = c2.apellido;
            String curp=c2.curp;
            int telefono=c2.tel;
            Datos persona = new Datos(nombre, apellido, curp,telefono);
            personas.add(persona);
            
        }
        
        
    }
}
