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
public class Televisor extends Electrodomestico{
    
    private int resolucion;
    private boolean puertoHDMI;

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }
    
    public Televisor() {
        super();
    }

    public Televisor(int codigo) {
        super(codigo);
    }

    @Override
    public double obtenerPrecioFinal() {
        
        if(resolucion > 40){
            double x = super.getPrecioBase()+((super.getPrecioBase()*30)/100);
            super.setPrecioBase(x);
        }
        
        if(puertoHDMI == true){
            double y = super.getPrecioBase()+50;
            super.setPrecioBase(y);
        }
        return super.obtenerPrecioFinal(); 
    }

    @Override
    public String toString() {
        return "Televisor{" + "Codigo= " + super.getCodigo() + ", Peso=" + super.getPeso() + ", Precio base=" + super.getPrecioBase() + ", Color=" + super.getColor() + ", Descripcion=" + super.getDescripcion() + ", Consumo energetico=" + super.getConsumoEnergetico()  + ", resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + ", precio Final"+ super.obtenerPrecioFinal() + '}';
    }
    
    
    
}
