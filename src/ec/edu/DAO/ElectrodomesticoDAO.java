/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.DAO;

import ec.edu.vista.Electrodomestico;
import ec.edu.vista.Lavadora;
import ec.edu.vista.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 *
 * @author nicol
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO{
    
    private SortedSet<Electrodomestico> lista;
    
    private List<Televisor> listat;
    
    private List<Lavadora> listal;
    
    public ElectrodomesticoDAO(){
        listat = new ArrayList<>();
        listal = new ArrayList<>();
        lista = new TreeSet<>();
    }

    @Override
    public void crearTelevisior(Televisor televisor) {
        listat.add(televisor);
    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
         listal.add(lavadora);
    }

    @Override
    public List<Lavadora> listarLavadora() {
        return listal;
    }

    @Override
    public List<Televisor> listarTelevisor() {
        return listat;
    }
    
    

    
    
}
