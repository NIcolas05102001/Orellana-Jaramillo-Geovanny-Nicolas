/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.controlador;

import ec.edu.DAO.IElectrodomesticoDAO;
import ec.edu.vista.Electrodomestico;
import ec.edu.vista.Lavadora;
import ec.edu.vista.Televisor;
import ec.edu.vista.VistaElectrodomestico;
import java.util.List;

/**
 *
 * @author nicol
 */
public class ControladorElectrodomestico {
    private VistaElectrodomestico vista;
    private Electrodomestico modelo;
    private IElectrodomesticoDAO dao;
    
    

    public ControladorElectrodomestico(VistaElectrodomestico vista, Electrodomestico modelo, IElectrodomesticoDAO dao) {
        this.vista = vista;
        this.modelo = modelo;
        this.dao = dao;
    }
    
    public void registrarTelevisor(){
        Televisor televisor = vista.ingresarTelevisor();
        dao.crearTelevisior(televisor);
    }
    
    public void registrarLavadora(){
        Lavadora lavadora = vista.ingresarLavadora();
        dao.crearLavadora(lavadora);
    }
    
    public void verLavadoras(){
        List<Lavadora> lavadoras;
        lavadoras = dao.listarLavadora();
        vista.mostrarTLavadoras(lavadoras);
    }
    
    public void verTelevisores(){
        List<Televisor> televisores;
        televisores = dao.listarTelevisor();
        vista.mostrarTelevisores(televisores);
    }
}
