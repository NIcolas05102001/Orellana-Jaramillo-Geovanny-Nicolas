/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.vista;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class VistaElectrodomestico {

    Scanner entrada = new Scanner(System.in);

    public Televisor ingresarTelevisor() {
        Televisor televisor = new Televisor();

        System.out.println("Ingrese el codigo");
        int codigo = entrada.nextInt();
        
        System.out.println("Ingrese el color");
        String color = entrada.next();
        
        System.out.println("Ingrese el consumo de energia");
        String consum = entrada.next();
        char consumo = consum.charAt(0);
        
        System.out.println("Ingrese la descripcion");
        String descripcion = entrada.next();
        
        System.out.println("Ingrese el peso");
        int peso = entrada.nextInt();
        
        System.out.println("Ingrese el preciobase");
        int precio = entrada.nextInt();
        
        System.out.println("¿Tiene puerto HDMI?");
        System.out.println("1: Si" + "\n2: No");
        int c = entrada.nextInt();
        boolean x;
        if (c == 1) {
            x = true;
        } else {
            x = false;
        }
        
        System.out.println("Ingrese la resolucion");
        int resolucion = entrada.nextInt();
        
        televisor.setCodigo(codigo);
        televisor.setColor(color);
        televisor.setConsumoEnergetico(consumo);
        televisor.setDescripcion(descripcion);
        televisor.setPeso(peso);
        televisor.setPrecioBase(precio);
        televisor.setPuertoHDMI(x);
        televisor.setResolucion(resolucion);

        return televisor;
    }

    public Lavadora ingresarLavadora() {
        Lavadora lavadora = new Lavadora();
        
        System.out.println("Ingrese el codigo");
        int codigo = entrada.nextInt();
        
        System.out.println("Ingrese el color");
        String color = entrada.next();
        
        System.out.println("Ingrese el consumo de energia");
        String consum = entrada.next();
        char consumo = consum.charAt(0);
        
        System.out.println("Ingrese la descripcion");
        String descripcion = entrada.next();
        
        System.out.println("Ingrese el peso");
        int peso = entrada.nextInt();
        
        System.out.println("Ingrese el preciobase");
        int precio = entrada.nextInt();
        
        System.out.println("Ingrese la carga");
        int carga = entrada.nextInt();
        
        lavadora.setCodigo(codigo);
        lavadora.setColor(color);
        lavadora.setConsumoEnergetico(consumo);
        lavadora.setDescripcion(descripcion);
        lavadora.setPeso(peso);
        lavadora.setPrecioBase(precio);
        lavadora.setCarga(carga);
        
        return lavadora;
    }

    public void mostrarTelevisores(List<Televisor> lista) {
        for (Televisor televisor : lista) {
            System.out.println(lista);
        }
    }

    public void mostrarTLavadoras(List<Lavadora> lista) {
        for (Lavadora lavadora : lista) {
            System.out.println(lista);
        }
    }
}
