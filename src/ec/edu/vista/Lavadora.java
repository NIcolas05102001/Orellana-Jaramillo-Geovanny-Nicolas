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
public class Lavadora extends Electrodomestico{
    
    private int carga;
    
    

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Lavadora() {
        super();
    }

    public Lavadora(int codigo) {
        super(codigo);
    }

    @Override
    public double obtenerPrecioFinal() {
        
        if(super.getPeso() > 30){
            super.setPrecioBase(30);
        }
        
        return super.obtenerPrecioFinal();
    } 

    @Override
    public String toString() {
        return "Lavadora{" + "Codigo=" + super.getCodigo() + ", Peso=" + super.getPeso() + ", Precio base=" + super.getPrecioBase() + ", Color=" + super.getColor() + ", Descripcion=" + super.getDescripcion() + ", Consumo energetico=" + super.getConsumoEnergetico() + ", carga=" + carga + ", precio final=" + super.getPrecioBase() + '}';
    }
    
    
}
