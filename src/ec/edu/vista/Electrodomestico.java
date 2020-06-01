/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.vista;

/**
 *
 * @author nicol
 */
public class Electrodomestico {
    
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Electrodomestico other = (Electrodomestico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio Base=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    public double obtenerPrecioFinal(){

       if(consumoEnergetico == 'A'){
           precioBase+=100;
       }
       else if(consumoEnergetico == 'B'){
           precioBase+=80;
       }
       else if (consumoEnergetico == 'C'){
           precioBase+=60;
       }
       else if (consumoEnergetico == 'D'){
           precioBase+=50;
       }
       else if (consumoEnergetico == 'E'){
           precioBase+=30;
       }
       
       else if (consumoEnergetico == 'F'){
           precioBase+=10;
       }
       
       if (peso >= 0 && peso <= 19){
           precioBase+=10;
       }
       else if (peso >= 20 && peso <= 49){
           precioBase+=50;
       }
       else if (peso >= 50 && peso <= 79){
           precioBase+=80;
       }
       else if (peso >= 80){
           precioBase+=100;
       }

        return precioBase;
        
    }
    
    public int compareTo(Electrodomestico e){
        
        Lavadora l = new Lavadora();
        Televisor t = new Televisor();
        
        double x = l.getPrecioBase();
        double y = t.getPrecioBase();
        
        String c1 = x+"";
        String c2 = y+"";
        
        c1.compareTo(c2);
        
        return 0;
        
    }
    
}
