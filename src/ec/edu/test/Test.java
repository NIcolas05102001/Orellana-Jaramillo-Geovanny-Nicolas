/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.test;

import ec.edu.DAO.ElectrodomesticoDAO;
import ec.edu.controlador.ControladorElectrodomestico;
import ec.edu.vista.Electrodomestico;
import ec.edu.vista.Lavadora;
import ec.edu.vista.Televisor;
import ec.edu.vista.VistaElectrodomestico;

/**
 *
 * @author nicol
 */
public class Test {
    public static void main(String[] args) {
        VistaElectrodomestico ve = new VistaElectrodomestico();
        
        ElectrodomesticoDAO edao = new ElectrodomesticoDAO();
        
        Televisor t = new Televisor();
        
        Lavadora l = new Lavadora();
        
        ControladorElectrodomestico ct = new ControladorElectrodomestico(ve, t, edao);
        
        ControladorElectrodomestico cl = new ControladorElectrodomestico(ve, l, edao);
        
        System.out.println("Ingrese los televisores");
        
        ct.registrarTelevisor();
        ct.registrarTelevisor();
        ct.registrarTelevisor();
        
        System.out.println("Ingrese las Lavadoras");
        
        cl.registrarLavadora();
        cl.registrarLavadora();
        cl.registrarLavadora();
        
        ct.verTelevisores();
        
        cl.verLavadoras();
        
        
        
    }
}
